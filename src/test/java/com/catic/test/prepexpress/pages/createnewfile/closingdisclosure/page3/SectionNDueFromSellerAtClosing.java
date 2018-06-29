package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionNDueFromSellerAtClosing extends PageObject {
	@FindBy(id = "SectionNExcessDeposit")
	private WebElementFacade excessDepositInputField;
	
	@FindBy(xpath = "(//input[@data-id='ClosingCostsPaidAtClosingCalc'])[2]")
	private WebElementFacade closingCostsPaidAtClosingField;
	
	@FindBy(id = "SectionNExistingLoansAmount")
	private WebElementFacade existingLoansAmountInputField;
	
	@FindBy(id = "PayoffOfFirstMortgageText")
	private WebElementFacade payoffOfFirstMortgageInputField;
	
	@FindBy(id = "SectionNPayoffFirstMortgageLoan")
	private WebElementFacade payoffOfFirstMortgageLoanAmountInputField;
	
	@FindBy(id = "PayoffOfSecondMortgageText")
	private WebElementFacade payoffOfSecondMortgageInputField;
	
	@FindBy(id = "SectionNPayoffSecondMortgageLoan")
	private WebElementFacade payoffOfSecondMortgageLoanAmountInputField;
	
	@FindBy(id = "SectionNExtraLine1Label")
	private WebElementFacade extraLine1LabelInputField;
	
	@FindBy(id = "SectionNExtraLine1Amount")
	private WebElementFacade extraLine1AmountInputField;
	
	@FindBy(id = "SectionNExtraLine2Label")
	private WebElementFacade extraLine2LabelInputField;
	
	@FindBy(id = "SectionNExtraLine2Amount")
	private WebElementFacade extraLine2AmountInputField;
	
	@FindBy(id = "SectionNSellerCredit")
	private WebElementFacade sellerCreditField;
	
	//TODO: seller credits table
	
	@FindBy(xpath = "(//button[contains(@class, 'btnAddSectionDetail')])[15]")
	private WebElementFacade addSellerCreditItemButton;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesFromDateCalendar'])[4]")
	private WebElementFacade cityOrTownTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesToDateCalendar'])[4]")
	private WebElementFacade cityOrTownTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesAmount'])[4]")
	private WebElementFacade cityOrTownTaxesAmountField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesFromDateCalendar'])[4]")
	private WebElementFacade countyTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesToDateCalendar'])[4]")
	private WebElementFacade countyTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesAmount'])[4]")
	private WebElementFacade countyTaxesAmountField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsFromDateCalendar'])[4]")
	private WebElementFacade assessmentsFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsToDateCalendar'])[4]")
	private WebElementFacade assessmentsToDateField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsAmount'])[4]")
	private WebElementFacade assessmentsAmountField;
	
	//TODO: assessments table (fields are uneditable)
	
	@FindBy(id = "SectionNDueFromSellerAtClosing")
	private WebElementFacade dueFromSellerAtClosingField;
}
