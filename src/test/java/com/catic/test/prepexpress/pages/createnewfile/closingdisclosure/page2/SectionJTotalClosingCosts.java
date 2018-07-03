package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.common.CollapsibleSection;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

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
	
	/**
	 * Gets the value in the 'Lender Credit' field
	 * @return value in the 'Lender Credit' field
	 */
	public String getLenderCredit() {
		openSection();
		return lenderCreditInputField.getValue();
	}
	
	/**
	 * Enters the given value into the 'Lender Credit' field
	 * @param credit
	 */
	public void enterLenderCredit(String credit) {
		openSection();
		lenderCreditInputField.type(credit);
	}
	
	/**
	 * Gets the value for the lender credit paid at closing
	 * @return the value
	 */
	public Money getLenderCreditBorrowerPaidAtClosing() {
		openSection();
		return MoneyUtil.fromString(lenderCreditBorrowerPaidAtClosingInputField.getValue());
	}
	
	/**
	 * Enters the amount into the field for lender credit paid at closing
	 * @param amount
	 */
	public void enterLenderCreditBorrowerPaidAtClosing(Money amount) {
		openSection();
		lenderCreditBorrowerPaidAtClosingInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Gets the value in 'Closing Costs Subtotals (D + I)' Borrower Paid At Closing field
	 * @return the value
	 */
	public Money getClosingCostsSubtotalsBorrowerPaidAtClosing() {
		openSection();
		return MoneyUtil.fromString(closingCostsBorrowerPaidAtClosingField.getValue());
	}
	
	/**
	 * Gets the value in 'Closing Costs Subtotals (D + I)' Borrower Paid Before Closing field
	 * @return the value
	 */
	public Money getClosingCostsSubototalsBorrowerPaidBeforeClosing() {
		openSection();
		return MoneyUtil.fromString(closingCostsBorrowerPaidBeforeClosingField.getValue());
	}
	
	/**
	 * Gets the value in 'Closing Costs Subtotals (D + I)' Seller Paid At Closing field
	 * @return the value
	 */
	public Money getClosingCostsSubtotalsSellerPaidAtClosing() {
		openSection();
		return MoneyUtil.fromString(closingCostsSellerPaidAtClosingField.getValue());
	}
	
	/**
	 * Gets the value in 'Closing Costs Subtotals (D + I)' Seller Paid Before Closing field
	 * @return the value
	 */
	public Money getClosingCostsSubtotalsSellerPaidBeforeClosing() {
		openSection();
		return MoneyUtil.fromString(closingCostsSellerPaidBeforeClosingField.getValue());
	}
	
	/**
	 * Gets the value in 'Closing Costs Subtotals (D + I)' Paid By Others field
	 * @return the value
	 */
	public Money getClosingCostsSubtotalsPaidByOthers() {
		openSection();
		return MoneyUtil.fromString(totalPaidByOtherClosingCostsField.getValue());
	}
	
	/**
	 * Gets the value in the 'Total Closing Costs (Borrower-Paid)' field
	 * @return the value
	 */
	public Money getTotalClosingCostsBorrowerPaid() {
		openSection();
		return MoneyUtil.fromString(totalClosingCostsField.getValue());
	}
	
	/**
	 * Opens this collapsible section, if it is closed
	 */
	private void openSection() {
		new CollapsibleSection(totalClosingCostsBorrowerPaidCollapsibleSection).openSection();
	}
}
