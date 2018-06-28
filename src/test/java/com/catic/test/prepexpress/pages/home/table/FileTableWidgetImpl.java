package com.catic.test.prepexpress.pages.home.table;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import net.thucydides.core.matchers.BeanMatcher;
import net.thucydides.core.matchers.BeanMatchers;
import net.thucydides.core.pages.components.HtmlTable;

public class FileTableWidgetImpl extends WidgetObjectImpl implements FileTableWidget {
	private static final Pattern TABLE_INFO_PATTERN = Pattern.compile("Showing (\\d+) to (\\d+) of (\\d+) entries");
	
	private static final String TABLE_INFO_ID = "theTable_info";
	
	private static final By PREV_PAGE_LOCATOR = By.xpath(".//li[contains(@class, 'prev')]");
	private static final By CUR_PAGE_LOCATOR = By.xpath(".//li[@class='active']/a");
	private static final By NEXT_PAGE_LOCATOR = By.xpath(".//li[contains(@class, 'next')]");
	private static final By TABLE_INFO_LOCATOR = By.id(TABLE_INFO_ID);
	
	@FindBy(id = "filterOptions")
	private FileTableFilterWidget filterOptions;
	
	@FindBy(id = "theTable")
	private WebElementFacade table;
	
	@FindBy(id = TABLE_INFO_ID)
	private WebElementFacade tableInfo;
	
	@FindBy(id = "theTable_paginate")
	private WebElementFacade pager;
	
	public FileTableWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public FileTableWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public List<String> getColumnNames() {
		return table().getHeadings();
	}

	@Override
	public boolean hasColumn(String columnName) {
		return getColumnNames().contains(columnName);
	}
	
	@Override
	public List<FileTableRowWidget> getRowElementsFor(List<String> columnNames) {
		List<WebElement> elements = table().getRowElementsFor(columnNames);
		return wrapElementsAsRows(elements);
	}

	@Override
	public List<FileTableRowWidget> getRowElements() {
		List<WebElement> elements = table().getRowElements();
		return wrapElementsAsRows(elements);
	}

	@Override
	public List<FileTableRowWidget> getRowElementsWhere(BeanMatcher... matchers) {
		List<WebElement> elements = table().getRowElementsWhere(matchers);
		return wrapElementsAsRows(elements);
	}

	@Override
	public List<Map<Object, String>> getRows() {
		return table().getRows();
	}

	@Override
	public FileTableRowWidget findFirstRowElementWhere(BeanMatcher... matchers) {
		WebElement element = table().findFirstRowWhere(matchers);
		return wrapElementAsRow(element);
	}

	@Override
	public FileTableRowWidget findFirstRowElementByFileName(String fileName) {
		BeanMatcher matcher = BeanMatchers.the("File Name", Matchers.equalTo(fileName));
		return findFirstRowElementWhere(matcher);
	}

	@Override
	public boolean containsRowElementsWhere(BeanMatcher... matchers) {
		return table().containsRowElementsWhere(matchers);
	}

	@Override
	public FileTableFilterWidget filterOptions() {
		return filterOptions;
	}

	@Override
	public FileTableWidget sortAscendingFor(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("sortAscendingFor(String columnName) not ready");
		//return this;
	}

	@Override
	public FileTableWidget sortDescendingFor(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("sortDescendingFor(String columnName) not ready");
		//return this;
	}

	@Override
	public boolean isSortedAscendingBy(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("isSortedAscendingBy(String columnName) not ready");
		//return false;
	}

	@Override
	public boolean isSortedDescendingBy(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("isSortedDescendingBy(String columnName) not ready");
		//return false;
	}

	@Override
	public FileTableWidget addColumn(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("addColumn(String columnName) not ready");
		//return this;
	}

	@Override
	public FileTableWidget removeColumn(String columnName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("removeColumn(String columnName) not ready");
		//return this;
	}

	@Override
	public int totalEntries() {
		getPage().waitFor(ExpectedConditions.textMatches(TABLE_INFO_LOCATOR, TABLE_INFO_PATTERN));
		
		String info = tableInfo.getText();
		int totalEntries = -1;
		
		try {
			Matcher m = TABLE_INFO_PATTERN.matcher(info);
			m.find();
			totalEntries = Integer.valueOf(m.group(2));
		} catch (IllegalStateException | IndexOutOfBoundsException | NumberFormatException e) {
			throw new AssertionError("Unable to determine total entries value", e);
		}
		
		return totalEntries;
	}

	@Override
	public int currentPage() {
		String info = current().getText();
		int currentPage = -1;
		
		try {
			currentPage = Integer.valueOf(info);
		} catch (NumberFormatException e) {
			throw new AssertionError("Unable to determine current page value", e);
		}
		
		return currentPage;
	}

	@Override
	public FileTableWidget previousPage() {
		prev().click();
		return this;
	}

	@Override
	public boolean hasPreviousPage() {
		return !prev().hasClass("disabled");
	}
	
	@Override
	public FileTableWidget nextPage() {
		next().click();
		return this;
	}
	
	@Override
	public boolean hasNextPage() {
		return !next().hasClass("disabled");
	}
	
	/**
	 * Converts the {@link WebElementFacade} object into an {@link HtmlTable} object
	 * @return the html table
	 */
	private HtmlTable table() {
		return HtmlTable.inTable(table);
	}
	
	/**
	 * Converts the given {@link WebElement} into a {@link FileTableRowWidget}
	 * @param element
	 * @return the file table row widget
	 */
	private FileTableRowWidget wrapElementAsRow(WebElement element) {
		WebElementFacade facade = getPage().element(element);
		return new FileTableRowWidgetImpl(getPage(), null, element, facade.getImplicitTimeoutInMilliseconds(), this);
	}
	
	/**
	 * Converts the given list of {@link WebElement} to a corresponding list of {@link FileTableRowWidget}
	 * @param elements
	 * @return the file table row widgets
	 */
	private List<FileTableRowWidget> wrapElementsAsRows(List<WebElement> elements) {
		return elements.stream().map(rowElement -> wrapElementAsRow(rowElement)).collect(Collectors.toList());
	}
	
	/**
	 * Convenience method for finding the previous page element
	 * @return the previous page element
	 */
	private WebElementFacade prev() {
		return pager.find(PREV_PAGE_LOCATOR);
	}
	
	/**
	 * Convenience method for finding the current page element
	 * @return the current page element
	 */
	private WebElementFacade current() {
		return pager.find(CUR_PAGE_LOCATOR);
	}
	
	/**
	 * Convenience method for findingthe next page element
	 * @return the next page element
	 */
	private WebElementFacade next() {
		return pager.find(NEXT_PAGE_LOCATOR);
	}
}
