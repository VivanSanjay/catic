package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

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
}
