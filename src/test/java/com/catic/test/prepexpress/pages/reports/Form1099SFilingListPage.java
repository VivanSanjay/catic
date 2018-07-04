package com.catic.test.prepexpress.pages.reports;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl(DefaultUrls.FILING_LIST_1099S)
public class Form1099SFilingListPage extends PageObject {

	@FindBy(id = "ReportYr")
	private WebElementFacade calenderyearDropdown;

	@FindBy(id = "FilingRequired")
	private WebElementFacade filingrequiredDropdown;

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade formatDropdown;

	@FindBy(xpath = "//input[@value='Create Report']")
	private WebElementFacade createreportbutton;

	public void calenderDropdown(String years) {
		this.selectMultipleItemsFromDropdown(calenderyearDropdown, years);
	}

	public void fillingRequired(String required) {
		this.selectMultipleItemsFromDropdown(filingrequiredDropdown, required);
	}

	public void formatDropdown(String filetype) {
		this.selectFromDropdown(formatDropdown, filetype);
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
