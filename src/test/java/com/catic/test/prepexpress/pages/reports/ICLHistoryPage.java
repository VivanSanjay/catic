package com.catic.test.prepexpress.pages.reports;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;
import java.time.LocalDate;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl(DefaultUrls.ICL_HISTORY)
public class ICLHistoryPage extends PageObject {

	@FindBy(xpath = "//input[@id='StartDate']")
	private WebElementFacade startDateEditBox;

	@FindBy(xpath = "//input[@id='EndDate']")
	private WebElementFacade endDateEditbox;

	@FindBy(id = "ICLType")
	private WebElementFacade iclTypeDropDown;

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade formatDropDown;

	@FindBy(xpath = "//input[contains(@value, 'Create Report')]")
	private WebElementFacade createReportButton;

	public void iclTypeDropdown(String iclType) {
		this.selectMultipleItemsFromDropdown(iclTypeDropDown, iclType);
	}

	public void fileTypeDropdown(String fileType) {
		this.selectFromDropdown(formatDropDown, fileType);
	}

	public void enterStartDate(LocalDate startDate) {
		String localDate = startDate.toString();
		this.typeInto(startDateEditBox, localDate);
	}

	public void enterEndDate(LocalDate endDate) {
		String localDate = endDate.toString();
		this.typeInto(endDateEditbox, localDate);
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
