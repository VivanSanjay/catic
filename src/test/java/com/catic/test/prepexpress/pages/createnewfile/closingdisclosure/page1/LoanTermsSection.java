package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class LoanTermsSection extends PageObject {
	// 1. Loan Terms
	@FindBy(id = "LoanAmount")
	private WebElementFacade loanAmountField;
	
	@FindBy(xpath = "//input[@name='LoanAmountCanIncrease'][1]")
	private WebElementFacade loanAmountCanIncreaseRadioButton;
	
	@FindBy(xpath = "//input[@name='LoanAmountCanIncrease'][2]")
	private WebElementFacade loanAmountCannotIncreaseRadioButton;
	
	@FindBy(id = "LoanAmountCanIncreaseTextBtn")
	private WebElementFacade loanAmountCanIncreaseButton;
	
	@FindBy(id = "InterestRate")
	private WebElementFacade interestRateField;
	
	@FindBy(xpath = "//input[@name='InterestRateCanIncrease'][1]")
	private WebElementFacade interestRateCanIncreaseRadioButton;
	
	@FindBy(xpath = "//input[@name='InterestRateCanIncrease'][2]")
	private WebElementFacade interestRateCannotIncreaseRadioButton;
	
	@FindBy(id = "InterestRateCanIncreaseTextBtn")
	private WebElementFacade interestRateCanIncreaseButton;
	
	@FindBy(id = "MonthlyPrincipalAndInterest")
	private WebElementFacade perPeriodPrincipalAndInterestField;
	
	@FindBy(xpath = "//input[@name='MonthlyPrincipalAndInterestCanIncrease'][1]")
	private WebElementFacade principalAndInterestCanIncreaseRadioButton;
	
	@FindBy(xpath = "//input[@name='MonthlyPrincipalAndInterestCanIncrease'][2]")
	private WebElementFacade principalAndInterestCannotIncreaseRadioButton;
	
	@FindBy(id = "MonthlyPrincipalAndInterestCanIncreaseTextBtn")
	private WebElementFacade principalAndInterestCanIncreaseButton;
	
	@FindBy(xpath = "//input[@name='HasPrepaymentPenalty'][1]")
	private WebElementFacade hasPrepaymentPenaltyRadioButton;
	
	@FindBy(xpath = "//input[@name='HasPrepaymentPenalty'][2]")
	private WebElementFacade doesNotHavePrepaymentPenaltyRadioButton;
	
	@FindBy(id = "PrepaymentPenaltyTextBtn")
	private WebElementFacade prepaymentPenaltyButton;
	
	@FindBy(xpath = "//input[@name='HasPrepaymentPenalty'][1]")
	private WebElementFacade hasBalloonPaymentRadioButton;
	
	@FindBy(xpath = "//input[@name='HasPrepaymentPenalty'][2]")
	private WebElementFacade doesNotHaveBalloonPaymentRadioButton;
	
	@FindBy(id = "BalloonPaymentTextBtn")
	private WebElementFacade balloonPaymentButton;
	
	/**
	 * Returns the value from the loan amount text field
	 * @return the loan amount
	 */
	public Money getLoanAmount() {
		return MoneyUtil.fromString(loanAmountField.getValue());
	}
	
	/**
	 * Returns whether the 'Loan Amount Can Increase' 'YES' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean loanAmountCanIncreaseAfterClosing() {
		return loanAmountCanIncreaseRadioButton.isSelected();
	}
	
	/**
	 * Selects 'YES' or 'NO' for the 'Loan Amount Can Increase' option
	 * @param loanAmountCanIncrease
	 */
	public void selectLoanAmountCanIncreaseAfterClosing(boolean loanAmountCanIncrease) {
		if (loanAmountCanIncrease) {
			loanAmountCanIncreaseRadioButton.click();
		}
		else {
			loanAmountCannotIncreaseRadioButton.click();
		}
	}
	
	/**
	 * Returns the value from the interest rate text field
	 * @return the interest rate
	 */
	public BigDecimal getInterestRate() {
		return new BigDecimal(interestRateField.getValue());
	}
	
	/**
	 * Returns whether the 'Interest Rate Can Increase' 'YES' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean interestRateCanIncreaseAfterClosing() {
		return interestRateCanIncreaseRadioButton.isSelected();
	}
	
	/**
	 * Selects 'YES' or 'NO' for the 'Interest Rate Can Increase' option
	 * @param interestRateCanIncrease
	 */
	public void selectInterestRateCanIncreaseAfterClosing(boolean interestRateCanIncrease) {
		if (interestRateCanIncrease) {
			interestRateCanIncreaseRadioButton.click();
		}
		else {
			interestRateCannotIncreaseRadioButton.click();
		}
	}
	
	/**
	 * Returns the value from the per period principal and interest text field
	 * @return the per period principal and interest
	 */
	public Money getPerPeriodPrincipalAndInterest() {
		return MoneyUtil.fromString(perPeriodPrincipalAndInterestField.getValue());
	}
	
	/**
	 * Enters the given amount into the per period principal and interest text field
	 * @param amount
	 */
	public void enterPerPeriodPrincipalAndInterest(Money amount) {
		perPeriodPrincipalAndInterestField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Returns whether the 'Per Period Principal &amp; Interest Can Increase' 'YES' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean perPeriodPrincipalAndInterestCanIncreaseAfterClosing() {
		return principalAndInterestCanIncreaseRadioButton.isSelected();
	}
	
	/**
	 * Selects 'YES' or 'NO' for the 'Per Period Principal &amp; Interest Can Increase' option
	 * @param principalAndInterestCanIncrease
	 */
	public void selectPerPeriodPrincipalAndInterestCanIncreaseAfterClosing(boolean principalAndInterestCanIncrease) {
		if (principalAndInterestCanIncrease) {
			principalAndInterestCanIncreaseRadioButton.click();
		}
		else {
			principalAndInterestCannotIncreaseRadioButton.click();
		}
	}
	
	/**
	 * Returns whether the 'Has Prepayment Penalty' 'YES' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean hasPrepaymentPenalty() {
		return hasPrepaymentPenaltyRadioButton.isSelected();
	}
	
	/**
	 * Selects 'YES' or 'NO' for the 'Has Prepayment Penalty' option
	 * @param hasPrepaymentPenalty
	 */
	public void setPrepaymentPenalty(boolean hasPrepaymentPenalty) {
		if (hasPrepaymentPenalty) {
			hasPrepaymentPenaltyRadioButton.click();
		}
		else {
			doesNotHavePrepaymentPenaltyRadioButton.click();
		}
	}
	
	/**
	 * Returns whether the 'Has Balloon Payment' 'YES' option is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	public boolean hasBalloonPayment() {
		return hasBalloonPaymentRadioButton.isSelected();
	}
	
	/**
	 * Selects 'YES' or 'NO' for the 'Has Balloon Payment' option
	 * @param hasBalloonPayment
	 */
	public void setBalloonPayment(boolean hasBalloonPayment) {
		if (hasBalloonPayment) {
			hasBalloonPaymentRadioButton.click();
		}
		else {
			doesNotHaveBalloonPaymentRadioButton.click();
		}
	}
}
