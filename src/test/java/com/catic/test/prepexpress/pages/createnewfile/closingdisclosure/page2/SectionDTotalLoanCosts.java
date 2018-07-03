package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.common.CollapsibleSection;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

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
	
	/**
	 * Returns the value of the Loan Costs Subtotals (A + B + C) at closing
	 * @return the loan costs subtotal
	 */
	public Money getLoanCostsSubtotalsAtClosing() {
		openSection();
		return MoneyUtil.fromString(totalLoanCostsBorrowerPaidAtClosingField.getValue());
	}
	
	/**
	 * Returns the value of the Loan Costs Subtotal (A + B + C) before closing
	 * @return the loan costs subtotal
	 */
	public Money getLoanCostsSubtotalsBeforeClosing() {
		openSection();
		return MoneyUtil.fromString(totalLoanCostsBorrowerPaidBeforeClosingField.getValue());
	}
	
	/**
	 * Returns the total loan costs the borrower paid
	 * @return the total loan costs
	 */
	public Money getTotalLoanCosts() {
		openSection();
		return MoneyUtil.fromString(totalLoanCostsBorrowerPaidField.getValue());
	}
	
	/**
	 * Opens this collapsible section, if it is closed
	 */
	private void openSection() {
		new CollapsibleSection(totalLoanCostsBorrowerPaidCollapsibleSection).openSection();
	}
}
