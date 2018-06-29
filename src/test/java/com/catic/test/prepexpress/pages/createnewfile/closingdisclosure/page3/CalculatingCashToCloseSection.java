package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalculatingCashToCloseSection extends PageObject {
	// total closing costs
	@FindBy(id = "TotalClosingCostsEstimate")
	private WebElementFacade totalClosingCostsEstimateInputField;
	
	@FindBy(id = "TotalClosingCostsFinal")
	private WebElementFacade totalClosingCostsFinalField;
	
	@FindBy(xpath = "(//input[@name='totalClosingCostsChanged'])[1]")
	private WebElementFacade totalClosingCostsChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='totalClosingCostsChanged'])[2]")
	private WebElementFacade totalClosingCostsDidNotChangeRadioButton;
	
	@FindBy(id = "TotalClosingCostsChangeTextBtn")
	private WebElementFacade totalClosingCostsChangedTextButton;
	
	// closing costs paid before closing
	@FindBy(id = "ClosingCostsPaidBeforeClosingEstimate")
	private WebElementFacade closingCostsPaidBeforeClosingEstimateInputField;
	
	@FindBy(id = "ClosingCostsPaidBeforeClosingFinal")
	private WebElementFacade closingCostsPaidBeforeClosingFinalField;
	
	@FindBy(xpath = "(//input[@name='closingCostsPaidBeforeClosingChanged'])[1]")
	private WebElementFacade closingCostsPaidBeforeClosingChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='closingCostsPaidBeforeClosingChanged'])[2]")
	private WebElementFacade closingCostsPaidBeforeClosingDidNotChangeRadioButton;
	
	@FindBy(id = "ClosingCostsPaidBeforeClosingChangeTextBtn")
	private WebElementFacade closingCostsPaidBeforeClosingChangedTextButton;
	
	// closing costs financed
	@FindBy(id = "ClosingCostsFinancedEstimate")
	private WebElementFacade closingCostsFinancedEstimateInputField;
	
	@FindBy(id = "ClosingCostsFinancedFinal")
	private WebElementFacade closingCostsFinancedFinalField;
	
	@FindBy(xpath = "(//input[@name='closingCostsFinancedChanged'])[1]")
	private WebElementFacade closingCostsFinancedChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='closingCostsFinancedChanged'])[2]")
	private WebElementFacade closingCostsFinancedDidNotChangeRadioButton;
	
	@FindBy(id = "ClosingCostsFinancedChangeTextBtn")
	private WebElementFacade closingCostsFinancedChangedTextButton;
	
	// down payment/funds from borrower
	@FindBy(id = "DownPaymentFundsFromBorrowerEstimate")
	private WebElementFacade downPaymentOrFundsFromBorrowerEstimateInputField;
	
	@FindBy(id = "DownPaymentFundsFromBorrowerFinal")
	private WebElementFacade downPaymentOrFundsFromBorrowerFinalField;
	
	@FindBy(id = "btnFundsFromBorrowerFinal")
	private WebElementFacade downPaymentOrFundsFromBorrowerManualOverrideButton;
	
	@FindBy(xpath = "(//input[@name='downPaymentFundsFromBorrowerChanged'])[1]")
	private WebElementFacade downPaymentOrFundsFromBorrowerChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='downPaymentFundsFromBorrowerChanged'])[2]")
	private WebElementFacade downPaymentOrFundsFromBorrowerDidNotChangeRadioButton;
	
	@FindBy(id = "DownPaymentFundsFromBorrowerChangeTextBtn")
	private WebElementFacade downPaymentOrFundsFromBorrowerChangedTextButton;
	
	// deposit
	@FindBy(id = "DepositEstimate")
	private WebElementFacade depositEstimateInputField;
	
	@FindBy(id = "DepositFinal")
	private WebElementFacade depositFinalField;
	
	@FindBy(xpath = "(//input[@name='depositChanged'])[1]")
	private WebElementFacade depositChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='depositChanged'])[2]")
	private WebElementFacade depositDidNotChangeRadioButton;
	
	@FindBy(id = "DepositChangeTextBtn")
	private WebElementFacade depositChangedTextButton;
	
	// funds for borrower
	@FindBy(id = "FundsForBorrowerEstimate")
	private WebElementFacade fundsForBorrowerEstimateInputField;
	
	@FindBy(id = "FundsForBorrowerFinal")
	private WebElementFacade fundsForBorrowerFinalField;
	
	@FindBy(xpath = "(//input[@name='fundsForBorrowerChanged'])[1]")
	private WebElementFacade fundsForBorrowerChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='fundsForBorrowerChanged'])[2]")
	private WebElementFacade fundsForBorrowerDidNotChangeRadioButton;
	
	@FindBy(id = "FundsForBorrowerChangeTextBtn")
	private WebElementFacade fundsForBorrowerChangedTextButton;
	
	// seller credits
	@FindBy(id = "SellerCreditsEstimate")
	private WebElementFacade sellerCreditsEstimateInputField;
	
	@FindBy(id = "SellerCreditsFinal")
	private WebElementFacade sellerCreditsFinalField;
	
	@FindBy(xpath = "(//input[@name='sellerCreditsChanged'])[1]")
	private WebElementFacade sellerCreditsChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='sellerCreditsChanged'])[2]")
	private WebElementFacade sellerCreditsDidNotChangeRadioButton;
	
	@FindBy(id = "SellerCreditsChangeTextBtn")
	private WebElementFacade sellerCreditsChangedTextButton;
	
	// adjustments and other credits
	@FindBy(id = "AdjustmentsAndOtherCreditsEstimate")
	private WebElementFacade adjustmentsAndOtherCreditsEstimateInputField;
	
	@FindBy(id = "AdjustmentsAndOtherCreditsFinal")
	private WebElementFacade adjustmentsAndOtherCreditsFinalField;
	
	@FindBy(id = "btnAdjustmentsAndOtherCreditsFinal")
	private WebElementFacade adjustmentsAndOtherCreditsManualOverrideButton;
	
	@FindBy(xpath = "(//input[@name='adjustmentsAndOtherCreditsChanged'])[1]")
	private WebElementFacade adjustmentsAndOtherCreditsChangedRadioButton;
	
	@FindBy(xpath = "(//input[@name='adjustmentsAndOtherCreditsChanged'])[2]")
	private WebElementFacade adjustmentsAndOtherCreditsDidNotChangeRadioButton;
	
	@FindBy(id = "AdjustmentsAndOtherCreditsChangeTextBtn")
	private WebElementFacade adjustmentsAndOtherCreditsChangedTextButton;
	
	// cash to close
	@FindBy(id = "CashToCloseTotalEstimate")
	private WebElementFacade cashToCloseEstimateInputField;
	
	@FindBy(id = "CashToCloseTotalFinal")
	private WebElementFacade cashToCloseFinalField;
}
