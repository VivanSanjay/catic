package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GfeHudComparison extends PageObject {
	// charges that cannot increase
	
	// charges that in total cannot increase more than 10%
	
	// charges that can change
	
	// gfe loan terms
	@FindBy(id = "InitialLoanAmount")
	private WebElementFacade initialLoanAmountInputField;
	
	@FindBy(id = "LoanTerm")
	private WebElementFacade loanTermInputField;
	
	@FindBy(id = "InitialInterestRate")
	private WebElementFacade initialInterestRateInputField;
	
	@FindBy(id = "InitialMonthlyTotal")
	private WebElementFacade initialMonthlyAmountOwedInputField;
	
	@FindBy(id = "HasInitialPrincipal")
	private WebElementFacade hasInitialPrincipalCheckbox;
	
	@FindBy(id = "InitialPrincipal")
	private WebElementFacade initialPrincipalInputField;
	
	@FindBy(id = "HasInitialInterest")
	private WebElementFacade hasInitialInterestCheckbox;
	
	@FindBy(id = "InitialInterest")
	private WebElementFacade initialInterestInputField;
	
	@FindBy(id = "HasInitialInsurance")
	private WebElementFacade hasInitialInsuranceCheckbox;
	
	@FindBy(id = "InitialInsurance")
	private WebElementFacade initialInsuranceInputField;
	
	@FindBy(id = "CanInterestRateRiseNo")
	private WebElementFacade canInterestRateRiseNoRadioButton;
	
	@FindBy(id = "CanInterestRateRiseYes")
	private WebElementFacade canInterestRateRiseYesRadioButton;
	
	@FindBy(id = "MaximumInterestRate")
	private WebElementFacade maximumInterestRateInputField;
	
	@FindBy(id = "FirstInterestRateChangeDate")
	private WebElementFacade firstInterestRateChangeDateInputField;
	
	@FindBy(id = "InterestRateCanChangeInterval")
	private WebElementFacade interestRateCanChangeIntervalInputField;
	
	@FindBy(id = "InterestRateChangeAfterDate")
	private WebElementFacade interestRateCanChangeAfterDateInputField;
	
	@FindBy(id = "InterestRateChangePct")
	private WebElementFacade interestRateChangePercentInputField;
	
	@FindBy(id = "InterestRateLow")
	private WebElementFacade interestRateLowInputField;
	
	@FindBy(id = "InterestRateHigh")
	private WebElementFacade interestRateHighInputField;
	
	@FindBy(id = "CanLoanBalanceRiseNo")
	private WebElementFacade canLoanBalanceRiseNoRadioButton;
	
	@FindBy(id = "CanLoanBalanceRiseYes")
	private WebElementFacade canLoanBalanceRiseYesRadioButton;
	
	@FindBy(id = "LoanBalanceMaximum")
	private WebElementFacade loanBalanceMaximumInputField;
	
	@FindBy(id = "CanMonthlyPaymentRiseNo")
	private WebElementFacade canMonthlyPaymentRiseNoRadioButton;
	
	@FindBy(id = "CanMonthlyPaymentRiseYes")
	private WebElementFacade canMonthlyPaymentRiseYesRadioButton;
	
	@FindBy(id = "FirstMonthlyPaymentRiseDate")
	private WebElementFacade firstMonthlyPaymentRiseDateInputField;
	
	@FindBy(id = "MonthlyPaymentFirstIncreaseMax")
	private WebElementFacade firstMonthlyPaymentIncreaseMaxInputField;
	
	@FindBy(id = "MonthlyPaymentMax")
	private WebElementFacade monthlyPaymentMaxInputField;
	
	@FindBy(id = "HasPrepaymentPenaltyNo")
	private WebElementFacade hasPrepaymentPenaltyNoRadioButton;
	
	@FindBy(id = "HasPrepaymentPenaltyYes")
	private WebElementFacade hasPrepaymentPenaltyYesRadioButton;
	
	@FindBy(id = "PrepaymentPenalty")
	private WebElementFacade prepaymentPenaltyInputField;
	
	@FindBy(id = "HasBallonPaymentNo")
	private WebElementFacade hasBalloonPaymentNoRadioButton;
	
	@FindBy(id = "HasBallonPaymentYes")
	private WebElementFacade hsBalloonPaymentYesRadioButton;
	
	@FindBy(id = "BallonPaymentOf")
	private WebElementFacade balloonPaymentOfInputField;
	
	@FindBy(id = "BallonPaymentDueInYears")
	private WebElementFacade balloonPaymentDueInYearsInputField;
	
	@FindBy(id = "HasMonthlyEscrowNo")
	private WebElementFacade hasMonthlyEscrowNoRadioButton;
	
	@FindBy(id = "HasMonthlyEscrowYes")
	private WebElementFacade hasMonthlyEscrowYesRadioButton;
	
	@FindBy(id = "MonthlyEscrowPayment")
	private WebElementFacade monthlyEscrowPaymentInputField;
	
	@FindBy(id = "InitialPaymentWithEscrow")
	private WebElementFacade initialPaymentWithEscrowInputField;
	
	@FindBy(id = "EscrowIncludesPropertyTax")
	private WebElementFacade escrowIncludesPropertyTaxCheckbox;
	
	@FindBy(id = "EscrowIncludesHomeownersInsurance")
	private WebElementFacade escrowIncludesHomeownersInsuranceCheckbox;
	
	@FindBy(id = "EscrowIncludesFloodInsurance")
	private WebElementFacade escrowIncludesFloodInsuranceCheckbox;
	
	@FindBy(id = "EscrowOther1")
	private WebElementFacade escrowOther1Checkbox;
	
	@FindBy(id = "EscrowOther1Descr")
	private WebElementFacade escrowOther1DescriptionInputField;
	
	@FindBy(id = "EscrowOther2")
	private WebElementFacade escrowOther2Checkbox;
	
	@FindBy(id = "EscrowOther2Descr")
	private WebElementFacade escrowOther2DescriptionInputField;
	
	@FindBy(id = "EscrowOther3")
	private WebElementFacade escrowOther3Checkbox;
	
	@FindBy(id = "EscrowOther3Descr")
	private WebElementFacade escrowOther3DescriptionInputField;
}
