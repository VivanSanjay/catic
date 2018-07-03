package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page5;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class LoanCalculationsAndOtherDisclosuresSection extends PageObject {
	@FindBy(id = "TotalOfPayments")
	private WebElementFacade totalOfPaymentsInputField;
	
	@FindBy(id = "FinanceCharge")
	private WebElementFacade financeChargeInputField;
	
	@FindBy(id = "AmountFinanced")
	private WebElementFacade amountFinancedInputField;
	
	@FindBy(id = "AnnualPercentageRate")
	private WebElementFacade annualPercentageRateInputField;
	
	@FindBy(id = "TotalInterestPercentage")
	private WebElementFacade totalInterestPercentageInputField;
	
	@FindBy(xpath = "(//input[@name='liabilityProtectionGroup'])[1]")
	private WebElementFacade stateLawMayProtectFromLiabilityRadioButton;
	
	@FindBy(xpath = "(//input[@name='liabilityProtectionGroup'])[2]")
	private WebElementFacade stateLawDoesNotProtectFromLiabilityRadioButton;
	
	/**
	 * Gets the value from the 'Total of Payments' field
	 * @return the value
	 */
	public Money getTotalOfPayments() {
		return MoneyUtil.fromString(totalOfPaymentsInputField.getValue());
	}
	
	/**
	 * Enters the given amount into the 'Total of Payments' field
	 * @param amount
	 */
	public void enterTotalOfPayments(Money amount) {
		totalOfPaymentsInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Gets the value from the 'Finance Charge' field
	 * @return the value
	 */
	public Money getFinanceCharge() {
		return MoneyUtil.fromString(financeChargeInputField.getValue());
	}
	
	/**
	 * Enters the given amount into the 'Finance Charge' field
	 * @param amount
	 */
	public void enterFinanceCharge(Money amount) {
		financeChargeInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Gets the value from the 'Amount Financed' field
	 * @return the value
	 */
	public Money getAmountFinanced() {
		return MoneyUtil.fromString(amountFinancedInputField.getValue());
	}
	
	/**
	 * Enters the given amount into the 'Amount Financed' field
	 * @param amount
	 */
	public void enterAmountFinanced(Money amount) {
		amountFinancedInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Gets the value from the 'Annual Percentage Rate (APR)' field
	 * @return the value
	 */
	public BigDecimal getAnnualPercentageRate() {
		return new BigDecimal(annualPercentageRateInputField.getValue());
	}
	
	/**
	 * Enters the given value into the 'Annual Percentage Rate (APR)' field
	 * @param rate
	 */
	public void enterAnnualPercentageRate(BigDecimal rate) {
		String value = rate.toPlainString();
		annualPercentageRateInputField.type(value);
	}
	
	/**
	 * Gets the value from the 'Total Interest Percentage' field
	 * @return the value
	 */
	public BigDecimal getTotalInterestRatePercentage() {
		return new BigDecimal(totalInterestPercentageInputField.getValue());
	}
	
	/**
	 * Enters the given value into the 'Total Interest Percentage' field
	 * @param rate
	 */
	public void enterTotalInterestRatePercentage(BigDecimal rate) {
		String value = rate.toPlainString();
		totalInterestPercentageInputField.type(value);
	}
	
	/**
	 * Returns whether the 'State Law may Protect from Liability' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean stateLawMayProtectFromLiability() {
		return stateLawMayProtectFromLiabilityRadioButton.isSelected();
	}
	
	/**
	 * If {@code true}, then selects the 'State law may protect from liability' option.
	 * Otherwise, selects the 'State law does not protect from liability' option
	 * @param value
	 */
	public void setStateLawMayProtectFromLiability(boolean value) {
		if (value) {
			stateLawMayProtectFromLiabilityRadioButton.click();
		}
		else {
			stateLawDoesNotProtectFromLiabilityRadioButton.click();
		}
	}
}
