package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import java.math.BigDecimal;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.widgets.PaidByDropdown;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class SectionAOriginationCosts extends PageObject {
	// Loan Costs - A. Origination Charges
	@FindBy(xpath = "//input[@data-id='PointPct']")
	private WebElementFacade loanAmountPointsInputField;
	
	@FindBy(xpath = "//input[@data-id='BpAtClosing']")
	private WebElementFacade borrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='BpBeforeClosing']")
	private WebElementFacade borrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='SpAtClosing']")
	private WebElementFacade sellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='SpBeforeClosing']")
	private WebElementFacade sellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PaidByOthers']")
	private WebElementFacade paidByOthersInputField;
	
	@FindBy(id = "btnPaidByOthersIndicator")
	private WebElementFacade paidByOthersIndicatorButton;
	
	//TODO: origination charges items table
	
	@FindBy(xpath = "//section[@id='SectionA']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addOriginationChargesItemButton;
	
	@FindBy(id = "SectionABpTotal")
	private WebElementFacade originationChargesField;
	
	/**
	 * Returns the value of the 'Loan Amount (Points)' field
	 * @return the loan amount in points
	 */
	public BigDecimal getLoanAmountPoints() {
		return new BigDecimal(loanAmountPointsInputField.getValue());
	}
	
	/**
	 * Enters the given value into the 'Loan Amount (Points)' field
	 * @param points
	 */
	public void enterLoanAmountPoints(BigDecimal points) {
		String value = points.toPlainString();
		loanAmountPointsInputField.type(value);
	}
	
	/**
	 * Returns the value of Borrower Paid - At Closing
	 * @return borrower paid - at closing
	 */
	public Money getBorrowerPaidAtClosing() {
		return MoneyUtil.fromString(borrowerPaidAtClosingInputField.getValue());
	}
	
	/**
	 * Enters the amount into Borrower Paid - At Closing
	 * @param amount
	 */
	public void enterBorrowerPaidAtClosing(Money amount) {
		borrowerPaidAtClosingInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Returns the value of Borrower Paid - Before Closing
	 * @return borrower paid - before closing
	 */
	public Money getBorrowerPaidBeforeClosing() {
		return MoneyUtil.fromString(borrowerPaidBeforeClosingInputField.getValue());
	}
	
	/** 
	 * Enters the amount into Borrower Paid - Before Closing
	 * @param amount
	 */
	public void enterBorrowerPaidBeforeClosing(Money amount) {
		borrowerPaidBeforeClosingInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Returns the value of Seller Paid - At Closing
	 * @return seller paid - at closing
	 */
	public Money getSellerPaidAtClosing() {
		return MoneyUtil.fromString(sellerPaidAtClosingInputField.getValue());
	}
	
	/**
	 * Enters the amount into Seller Paid - At Closing
	 * @param amount
	 */
	public void enterSellerPaidAtClosing(Money amount) {
		sellerPaidAtClosingInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Returns the value of Seller Paid - Before Closing
	 * @return seller paid - before closing
	 */
	public Money getSellerPaidBeforeClosing() {
		return MoneyUtil.fromString(sellerPaidBeforeClosingInputField.getValue());
	}
	
	/**
	 * Enters the amount into Seller Paid - Before Closing
	 * @param amount
	 */
	public void enterSellerPaidBeforeClosing(Money amount) {
		sellerPaidBeforeClosingInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Returns the value in Paid By Others
	 * @return paid by others amount
	 */
	public Money getPaidByOthers() {
		return MoneyUtil.fromString(paidByOthersInputField.getValue());
	}

	/**
	 * Enters the amount into the Paid By Others field
	 * @param amount
	 */
	public void enterPaidByOthers(Money amount) {
		paidByOthersInputField.type(MoneyUtil.toString(amount));
	}
	
	/**
	 * Opens the paid by others dropdown
	 * @return the dropdown
	 */
	public PaidByDropdown paidByOther() {
		return PaidByDropdown.open(this, paidByOthersIndicatorButton);
	}
	
	/**
	 * Opens the paid by others dropdown and selects the given choice
	 * @param other
	 */
	public void paidByOther(PaidByDropdown.PaidBy other) {
		paidByOther().select(other);
	}
	
	/**
	 * Returns the value of the total origination charges
	 * @return total origination charges
	 */
	public Money getTotalOriginationCharges() {
		return MoneyUtil.fromString(originationChargesField.getValue());
	}
}
