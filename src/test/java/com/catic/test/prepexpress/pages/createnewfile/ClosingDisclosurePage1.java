package com.catic.test.prepexpress.pages.createnewfile;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.common.CollapsibleSection;
import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClosingDisclosurePage1 extends PageObject {
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
	
	// 1. Projected Payments
	
	//TODO: projected payments table
	
	@FindBy(id = "EstimatedTotal")
	private WebElementFacade estimatedTaxesInsuranceAndAssessmentsInputField;
	
	@FindBy(id = "PropertyTaxesIncluded")
	private WebElementFacade propertyTaxesIncludedCheckbox;
	
	@FindBy(name = "PropertyTaxesIncluded")
	private WebElementFacade propertyTaxesInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='PropertyTaxesInEscrow'])[1]")
	private WebElementFacade noPropertyTaxesInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='PropertyTaxesInEscrow'])[2]")
	private WebElementFacade somePropertyTaxesInEscrowRadioButton;
	
	@FindBy(id = "HomeownersInsuranceIncluded")
	private WebElementFacade homeownersInsuranceIncludedCheckbox;
	
	@FindBy(xpath = "(//input[@name='HomeownersInsuranceInEscrow'])[1]")
	private WebElementFacade homeownersInsuranceInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='HomeownersInsuranceInEscrow'])[2]")
	private WebElementFacade noHomeownersInsuranceInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='HomeownersInsuranceInEscrow'])[3]")
	private WebElementFacade someHomeownersInsuranceInEscrowRadioButton;
	
	@FindBy(id = "OtherIncluded")
	private WebElementFacade otherIncludedCheckbox;
	
	@FindBy(xpath = "(//input[@name='OtherInEscrow'])[1]")
	private WebElementFacade otherInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='OtherInEscrow'])[2]")
	private WebElementFacade noOtherInEscrowRadioButton;
	
	@FindBy(xpath = "(//input[@name='OtherInEscrow'])[3]")
	private WebElementFacade someOtherInEscrowRadioButton;
	
	@FindBy(id = "OtherDescription")
	private WebElementFacade otherDescriptionInputField;
	
	// 1. Costs At Closing
	@FindBy(xpath = "//label[text()='1. Costs at Closing']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade collapsibleSection;
	
	@FindBy(xpath = "//input[@title='TotalBorrowerClosingCosts']")
	private WebElementFacade totalBorrowerClosingCostsField;
	
	@FindBy(xpath = "//input[@title='TotalLoanCostsBorrowerPaid']")
	private WebElementFacade totalLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='OtherLoanCostsBorrowerPaid']")
	private WebElementFacade otherLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='LenderCreditBorrowerPaidAtClosing']")
	private WebElementFacade lenderCreditBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TotalBorrowerCashToCloseAbs']")
	private WebElementFacade totalBorrowerCashToCloseField;
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
	
	public ClosingDisclosureNavBarFragment pages() {
		return ClosingDisclosureNavBarFragment.from(this);
	}
	
	private void openSection() {
		new CollapsibleSection(collapsibleSection).openSection();
	}
}
