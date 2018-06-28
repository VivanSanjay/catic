package com.catic.test.prepexpress.pages;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.common.DatePickerWidget;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(DefaultUrls.TITLE_SEARCH_IMPORT)
public class TitleSearchImportPage extends PageObject {
	@FindBy(id = "startDate")
	private WebElementFacade startDateField;
	
	@FindBy(id = "endDate")
	private WebElementFacade endDateField;
	
	@FindBy(xpath = "//div[contains(@class, 'datepicker-dropdown')]")
	private DatePickerWidget datePickerWidget;
	
	@FindBy(xpath = "//div[@id='titleSearchTable_filter']/label/input")
	private WebElementFacade searchInputField;
	
	@FindBy(id = "ImportBtn")
	private WebElementFacade importTitleSearchButton;
	
	@FindBy(id = "PreviewBtn")
	private WebElementFacade previewTitleSearchButton;
	
	public HomePage returnToHome() {
		return returnNavigationBar().returnToHome();
	}
	
	private ReturnNavBarFragment returnNavigationBar() {
		return ReturnNavBarFragment.from(this);
	}
}
