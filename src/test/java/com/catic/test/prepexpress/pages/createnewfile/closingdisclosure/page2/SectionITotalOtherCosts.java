package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.common.CollapsibleSection;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class SectionITotalOtherCosts extends PageObject {
	// Other Costs - I. Total Other Costs (Borrower - Paid)
	@FindBy(xpath = "//label[text()='I. Total Other Costs (Borrower - Paid)']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade totalOtherCostsBorrowerPaidCollapsibleSection;
	
	@FindBy(xpath = "//input[@tile='OtherLoanCostsBpAtClosing']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@tile='OtherLoanCostsBpBeforeClosing']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='OtherLoanCostsBorrowerPaid']")
	private WebElementFacade totalOtherLoanCostsBorrowerPaidField;
	
	/**
	 * Returns the value from 'Other Costs Subtotals (E + F + G + H)' At Closing
	 * @return the value
	 */
	public Money getOtherCostsSubtotalsAtClosing() {
		openSection();
		return MoneyUtil.fromString(totalOtherLoanCostsBorrowerPaidAtClosingField.getValue());
	}
	
	/**
	 * Returns the value from 'Other Costs Subtotals (E + F + G + H)' Before Closing
	 * @return the value
	 */
	public Money getOtherCostsSubtotalsBeforeClosing() {
		openSection();
		return MoneyUtil.fromString(totalOtherLoanCostsBorrowerPaidBeforeClosingField.getValue());
	}
	
	/**
	 * Returns the value from 'Other Costs (Borrower-Paid)'
	 * @return the value
	 */
	public Money getTotalOtherCostsBorrowerPaid() {
		openSection();
		return MoneyUtil.fromString(totalOtherLoanCostsBorrowerPaidField.getValue());
	}
	
	/**
	 * Opens this collapsible section, if it is closed
	 */
	private void openSection() {
		new CollapsibleSection(totalOtherCostsBorrowerPaidCollapsibleSection).openSection();
	}
}
