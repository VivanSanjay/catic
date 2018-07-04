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

@DefaultUrl(DefaultUrls.JACKET_HISTORY)
public class JacketHistoryPage extends PageObject {

	@FindBy(xpath = "//input[@id='StartDate']")
	private WebElementFacade startDateEditBox;

	@FindBy(xpath = "//input[@id='EndDate']")
	private WebElementFacade endDateEditbox;

	@FindBy(id = "JacketType")
	private WebElementFacade jacketTypeDropDown;

	@FindBy(xpath = "//select[@id='format']")
	private WebElementFacade fileFormatDropDown;

	@FindBy(xpath = "//input[contains(@value, 'Create Report')]")
	private WebElementFacade createReportButton;

	public void jacketTypeDropDown(String type) {
		this.selectMultipleItemsFromDropdown(jacketTypeDropDown, type);
	}

	public void FieFormatDropDown(String formatType) {
		this.selectFromDropdown(fileFormatDropDown, formatType);

	}

	public void EnterStartDate(LocalDate startDate) {
		String localDate = startDate.toString();
		this.typeInto(startDateEditBox, localDate);
	}

	public void EnterEndDate(LocalDate endDate) {
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