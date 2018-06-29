package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CostsAtClosingSection extends PageObject {
	// 1. Costs At Closing
	@FindBy(xpath = "//label[text()='1. Costs at Closing']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade costsAtClosingSectionSection;
	
	@FindBy(xpath = "//input[@title='TotalBorrowerClosingCosts']")
	private WebElementFacade totalBorrowerClosingCostsField;
	
	@FindBy(xpath = "//input[@title='TotalLoanCostsBorrowerPaid']")
	private WebElementFacade totalLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='OtherLoanCostsBorrowerPaid']")
	private WebElementFacade otherLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='LenderCreditBorrowerPaidAtClosing']")
	private WebElementFacade lenderCreditBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TotalBorrowerCashToCloseAbs']")
	private WebElementFacade totalBorrowerCashToCloseField;
}
