package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page4;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoanDisclosuresSection extends PageObject {
	// assumption
	@FindBy(xpath = "(//input[@name='assumptionGroup'])[1]")
	private WebElementFacade lenderWillAllowAssumptionOfThisLoanRadioButton;
	
	@FindBy(xpath = "(//input[@name='assumptionGroup'])[2]")
	private WebElementFacade lenderWillNotAllowAssumptionOfThisLoanRadioButton;
	
	// demand feature
	@FindBy(xpath = "(//input[@name='demandFeatureGroup'])[1]")
	private WebElementFacade loanHasADemandFeatureRadioButton;
	
	@FindBy(xpath = "(//input[@name='demandFeatureGroup'])[2]")
	private WebElementFacade loanDoesNotHaveADemandFeatureRadioButton;
	
	// late payment
	@FindBy(id = "LateChargeGracePeriod")
	private WebElementFacade latePaymentGraceDaysInputField;
	
	@FindBy(id = "LateChargeText")
	private WebElementFacade latePaymentLateFeeInputField;
	
	// negative amortization
	@FindBy(xpath = "(//input[@name='negativeAmortizationGroup'])[1]")
	private WebElementFacade scheduledPaymentsMayCauseNegativeAmortizationRadioButton;
	
	@FindBy(xpath = "(//input[@name='negativeAmortizationGroup'])[2]")
	private WebElementFacade paymentsMayCauseNegativeAmortizationRadioButton;
	
	@FindBy(xpath = "(//input[@name='negativeAmortizationGroup'])[3]")
	private WebElementFacade doNotHaveANegativeAmortizationFeatureRadioButton;
	
	// partial payments
	@FindBy(xpath = "(//input[@name='partialPaymentsGroup'])[1]")
	private WebElementFacade lenderMayAcceptPartialPaymentsRadioButton;
	
	@FindBy(xpath = "(//input[@name='partialPaymentsGroup'])[2]")
	private WebElementFacade lenderMayHoldPartialPaymentsRadioButton;
	
	@FindBy(xpath = "(//input[@name='partialPaymentsGroup'])[3]")
	private WebElementFacade lenderDoesNotAcceptAnyPartialPaymentsRadioButton;
	
	// escrow amount
	@FindBy(xpath = "(//div[@id='loanCalculationsPage4']//input[@type='checkbox'])[1]")
	private WebElementFacade loanWillHaveAnEscrowAmountCheckbox;
	
	@FindBy(id = "EscrowedPropertyCostsYear1")
	private WebElementFacade escrowedPropertyCostsOverYear1AmountInputField;
	
	@FindBy(id = "EscrowedPropertyCostsYear1Text")
	private WebElementFacade escrowedPropertyCostsOverYear1TextInputField;
	
	@FindBy(id = "NonEscrowedPropertyCostsYear1")
	private WebElementFacade nonEscrowedPropertyCostsOverYear1AmountInputField;
	
	@FindBy(id = "NonEscrowedPropertyCostsYear1Text")
	private WebElementFacade nonEscrowedPropertyCostsOverYear1TextInputField;
	
	@FindBy(id = "InitialEscrowPaymentAtClosing")
	private WebElementFacade initialEscrowPaymentInputField;
	
	@FindBy(id = "InitialEscrowPaymentAtClosingManualOverride")
	private WebElementFacade initialEscrowPaymentManualOverrideButton;
	
	@FindBy(id = "MonthlyEscrowPayment")
	private WebElementFacade monthlyEscrowPaymentInputField;
	
	@FindBy(xpath = "(//div[@id='loanCalculationsPage4']//input[@type='checkbox'])[2]")
	private WebElementFacade loanWillNotHaveAnEscrowAccountBecauseCheckbox;
	
	@FindBy(xpath = "(//input[@name='escrowGroup'])[1]")
	private WebElementFacade escrowDeclinedRadioButton;
	
	@FindBy(xpath = "(//input[@name='escrowGroup'])[2]")
	private WebElementFacade lenderDoesNotOfferEscrowAccountRadioButton;
	
	@FindBy(id = "EstimatedPropertyCostsYear1")
	private WebElementFacade estimatedPropertyCostsOverYear1InputField;
	
	@FindBy(id = "EscrowWaiverFee")
	private WebElementFacade escrowWaiverFeeInputField;
}
