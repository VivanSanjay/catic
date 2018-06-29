package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionJTotalClosingCosts extends PageObject {
	// Other Costs - J. Total Closing Costs (Borrower - Paid)
	@FindBy(xpath = "//label[text()='J. Total Closing Costs (Borrower - Paid)']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade totalClosingCostsBorrowerPaidCollapsibleSection;
	
	@FindBy(id = "LenderCreditToleranceCureText")
	private WebElementFacade lenderCreditInputField;
	
	@FindBy(id = "LenderCreditBorrowerPaidAtClosing")
	private WebElementFacade lenderCreditBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@title='ClosingCostsBorrowerPaidAtClosingDPlusI']")
	private WebElementFacade closingCostsBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@title='ClosingCostsBorrowerPaidBeforeClosing']")
	private WebElementFacade closingCostsBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@title='ClosingCostsSellerPaidAtClosing']")
	private WebElementFacade closingCostsSellerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@title='ClosingCostsSellerPaidBeforeClosing']")
	private WebElementFacade closingCostsSellerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@title='TotalPaidByOtherClosingCosts']")
	private WebElementFacade totalPaidByOtherClosingCostsField;
	
	@FindBy(id = "SectionJBpTotal")
	private WebElementFacade totalClosingCostsField;
}
