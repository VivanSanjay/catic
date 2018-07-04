package com.catic.test.prepexpress.pages.reports;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl(DefaultUrls.CLOSINGS_BY_LENDER)
public class ClosingsByLenderPage extends PageObject {

	@FindBy(id = "ReportYr")
	private WebElementFacade calenderYearDropdown;

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade formatDropDown;

	@FindBy(xpath = "//input[contains(@value, 'Create Report')]")
	private WebElementFacade createReportButton;

	public void calenderYearDropdown(String years) {
		this.selectMultipleItemsFromDropdown(calenderYearDropdown, years);
	}

	public void formatDropDown(String formatType) {
		this.selectFromDropdown(formatDropDown, formatType);

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