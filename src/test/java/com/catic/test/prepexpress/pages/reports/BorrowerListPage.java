package com.catic.test.prepexpress.pages.reports;

import org.openqa.selenium.support.FindBy;
import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(DefaultUrls.BORROWER_LIST)
public class BorrowerListPage extends PageObject {

	@FindBy(id = "ReportYr")
	private WebElementFacade calenderYearDropdown;

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade fileFormatDropdown;

	@FindBy(xpath = "//input[contains(@value, 'Create Report')]")
	private WebElementFacade createReportButton;

	public void selectYearDropDown(String years) {
		this.selectMultipleItemsFromDropdown(calenderYearDropdown, years);
	}

	public void fileFormatDropdown(String formatType) {
		this.selectFromDropdown(fileFormatDropdown, formatType);
	}

	public HomePage returnToHome() {
		return returnNavigationBar().returnToHome();
	}

	private ReturnNavBarFragment returnNavigationBar() {
		return ReturnNavBarFragment.from(this);
	}

	public ReportsNavBarFragment reports() {
		return ReportsNavBarFragment.from(this);
	}

}
