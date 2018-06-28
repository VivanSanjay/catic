package com.catic.test.prepexpress.pages.home.table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class FileTableRowWidgetImpl extends WidgetObjectImpl implements FileTableRowWidget {
	@FindBy(xpath = ".//a[@class='dropdown-toggle']")
	private WebElementFacade actionLink;
	
	@FindBy(xpath = ".//span[@class='dropdown open']/ul[@class='dropdown-menu']")
	private FileTableActionMenu actionMenu;
	
	private final FileTableWidget myTable;
	
	public FileTableRowWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds, FileTableWidget table) {
		super(page, locator, timeoutInMilliseconds);
		myTable = table;
	}

	public FileTableRowWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds, FileTableWidget table) {
		super(page, locator, webElement, timeoutInMilliseconds);
		myTable = table;
	}

	@Override
	public Map<Object, String> getData() {
		List<String> columnNames = myTable.getColumnNames();
		List<WebElement> cells = cells();
		Map<Object, String> rowData = new HashMap<>();
		int column = 0;
		
		for (String columnName : columnNames) {
			String cellValue = cellValueAt(column, cells);
			if (!StringUtils.isEmpty(columnName)) {
				rowData.put(columnName, cellValue);
			}
			else {
				rowData.put(column, cellValue);
			}
			column++;
		}
		
		return rowData;
	}

	@Override
	public String getCellValueAt(String columnName) {
		Map<Object, String> rowData = getData();
		return rowData.get(columnName);
	}

	@Override
	public GenInfoPage open() {
		WebElementFacade fileNameCell = getPage().element(getCellElementFor("File Name"));
		WebElementFacade fileNameLink = fileNameCell.find(By.tagName("a"));
		
		fileNameLink.click();
		
		GenInfoPage page = getPage().switchToPage(GenInfoPage.class);
		AjaxLoader.waitForAjaxLoaderToDisappearOn(page);
		
		return page;
	}

	@Override
	public FileTableActionMenu actionMenu() {
		if (!actionMenu.isVisible()) {
			actionLink.click();
			actionMenu.waitUntilVisible();
		}
		
		return actionMenu;
	}
	
	/**
	 * Similar to {@link #getData()} but instead returns the {@link WebElement} associated with the given
	 * column name
	 * @param columnName
	 * @return the {@link WebElement} associated with the given column name
	 */
	private WebElement getCellElementFor(String columnName) {
		List<String> columnNames = myTable.getColumnNames();
		List<WebElement> cells = cells();
		
		if (!columnNames.contains(columnName)) {
			throw new IllegalArgumentException("This row does not contain a column named " + columnName);
		}
		
		int index = 0;
		for (String column : columnNames) {
			if (StringUtils.equals(column, columnName)) {
				break;
			}
			
			index++;
		}
		
		return cellElementAt(index, cells);
	}
	
	/**
	 * Returns the list of cells for this row
	 * @return the list of cells for this row
	 */
	private List<WebElement> cells() {
		return getWrappedElement().findElements(By.xpath("./td"));
	}
	
	/**
	 * Gets the value from the cell element for the given column
	 * @param column
	 * @param cells
	 * @return the text value from the cell element
	 */
	private String cellValueAt(int column, List<WebElement> cells) {
		return cellElementAt(column, cells).getText();
	}
	
	/**
	 * Gets the actual <code>&lt;td&gt;</code> {@link WebElement} instance for the given column 
	 * @param column
	 * @param cells
	 * @return the actual {@link WebElement} representing the cell
	 */
	private WebElement cellElementAt(int column, List<WebElement> cells) {
		return cells.get(column);
	}
}
