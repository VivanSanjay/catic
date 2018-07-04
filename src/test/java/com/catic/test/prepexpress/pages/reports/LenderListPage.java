package com.catic.test.prepexpress.pages.reports;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(DefaultUrls.LENDER_LIST)
public class LenderListPage extends PageObject {

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade fileFormatDropDown;

	@FindBy(xpath = "//input[contains(@value, 'Create Report')]")
	private WebElementFacade createReportButton;

	public void FileFormatDropDown(String fileFormat) {
		this.selectFromDropdown(fileFormatDropDown, fileFormat);
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
