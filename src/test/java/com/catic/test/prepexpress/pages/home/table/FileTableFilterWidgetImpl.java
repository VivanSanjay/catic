package com.catic.test.prepexpress.pages.home.table;

import java.time.LocalDate;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.pages.common.DatePickerWidget;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class FileTableFilterWidgetImpl extends WidgetObjectImpl implements FileTableFilterWidget {
	@FindBy(id = "searchInput")
	private WebElementFacade searchInput;
	
	@FindBy(id = "showActiveOnly")
	private WebElementFacade activeFilesOnlyRadioButton;
	
	@FindBy(id = "showAll")
	private WebElementFacade allFilesRadioButton;
	
	@FindBy(id = "showInactiveOnly")
	private WebElementFacade inactiveFilesOnlyRadioButton;
	
	@FindBy(id = "startDate")
	private WebElementFacade startDateField;
	
	@FindBy(id = "endDate")
	private WebElementFacade endDateField;
	
	@FindBy(xpath = "//div[contains(@class, 'datepicker-dropdown')]")
	private DatePickerWidget datePickerWidget;
	
	@FindBy(id = "btnClear")
	private WebElementFacade clearButton;
	
	public FileTableFilterWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public FileTableFilterWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public FileTableFilterWidget setSearchTerm(String searchTerm) {
		searchInput.type(searchTerm);
		return this;
	}

	@Override
	public String getSearchTerm() {
		return searchInput.getValue();
	}

	@Override
	public FileTableFilterWidget setActiveFilesOnly() {
		activeFilesOnlyRadioButton.click();
		return this;
	}

	@Override
	public boolean activeFilesOnly() {
		return activeFilesOnlyRadioButton.isSelected();
	}

	@Override
	public FileTableFilterWidget setAllFiles() {
		allFilesRadioButton.click();
		return this;
	}

	@Override
	public boolean allFiles() {
		return allFilesRadioButton.isSelected();
	}

	@Override
	public FileTableFilterWidget setInactiveFilesOnly() {
		inactiveFilesOnlyRadioButton.click();
		return this;
	}

	@Override
	public boolean inactiveFilesOnly() {
		return inactiveFilesOnlyRadioButton.isSelected();
	}

	@Override
	public FileTableFilterWidget setCreatedBetween(LocalDate from, LocalDate to) {
		setStartDate(from);
		setEndDate(to);
		return this;
	}

	@Override
	public FileTableFilterWidget setStartDate(LocalDate start) {
		selectDate(startDateField, start);
		return this;
	}
	
	@Override
	public String getStartDate() {
		return startDateField.getValue();
	}

	@Override
	public FileTableFilterWidget setEndDate(LocalDate end) {
		selectDate(endDateField, end);
		return this;
	}
	
	@Override
	public String getEndDate() {
		return endDateField.getValue();
	}

	@Override
	public FileTableFilterWidget clickClear() {
		clearButton.click();
		return this;
	}
	
	private void selectDate(WebElementFacade dateField, LocalDate date) {
		dateField.click();
		datePickerWidget.waitUntilVisible();
		datePickerWidget.pickDate(date);
		datePickerWidget.waitUntilNotVisible();
	}
}
