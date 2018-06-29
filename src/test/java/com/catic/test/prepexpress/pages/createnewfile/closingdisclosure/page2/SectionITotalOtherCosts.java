package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionITotalOtherCosts extends PageObject {
	// Other Costs - I. Total Other Costs (Borrower - Paid)
	@FindBy(xpath = "//label[text()='I. Total Other Costs (Borrower - Paid)']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade totalOtherCostsBorrowerPaidCollapsibleSection;
	
	@FindBy(xpath = "//input[@tile='OtherLoanCostsBpAtClosing']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@tile='OtherLoanCostsBpBeforeClosing']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidClosingField;
	
	@FindBy(xpath = "//input[@data-id='OtherLoanCostsBorrowerPaid']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidField;
}
