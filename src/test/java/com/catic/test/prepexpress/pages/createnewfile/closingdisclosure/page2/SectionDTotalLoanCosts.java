package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionDTotalLoanCosts extends PageObject {
	// Loan Costs - D. Total Loan Costs (Borrower - Paid)
	
	@FindBy(xpath = "//label[text()='D. Total Loan Costs (Borrower - Paid)']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade totalLoanCostsBorrowerPaidCollapsibleSection;
	
	@FindBy(xpath = "//input[@title='TotalLoanCostsBpAtClosing']")
	private WebElementFacade totalLoanCostsBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@title='TotalLoanCostsBpBeforeClosing']")
	private WebElementFacade totalLoanCostsBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TotalLoanCostsBorrowerPaid']")
	private WebElementFacade totalLoanCostsBorrowerPaidField;
}
