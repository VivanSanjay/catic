package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page5;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

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
}
