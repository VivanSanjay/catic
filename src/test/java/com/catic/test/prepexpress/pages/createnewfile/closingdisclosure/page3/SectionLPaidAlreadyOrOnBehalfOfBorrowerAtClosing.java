package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionLPaidAlreadyOrOnBehalfOfBorrowerAtClosing extends PageObject {
	@FindBy(id = "SectionLDeposit")
	private WebElementFacade depositInputField;
	
	@FindBy(xpath = "//input[@data-id='FirstAdvance']")
	private WebElementFacade loanAmountField;
	
	@FindBy(id = "SectionLExistingLoansAmount")
	private WebElementFacade existingLoansAmountInputField;
	
	@FindBy(id = "SectionLExtraLine1Label")
	private WebElementFacade sectionLExtraLine1LabelInputField;
	
	@FindBy(id = "SectionLExtraLine1Amount")
	private WebElementFacade sectionLExtraLine1AmountInputField;
	
	@FindBy(id = "SectionLExtraLine2Label")
	private WebElementFacade sectionLExtraLine2LabelInputField;
	
	@FindBy(id = "SectionLExtraLine2Amount")
	private WebElementFacade sectionLExtraLine2AmountInputField;
	
	@FindBy(id = "SectionLSellerCredit")
	private WebElementFacade sellerCreditInputField;
	
	//TODO: other credits table
	
	@FindBy(xpath = "(//button[contains(@class, 'btnAddSectionDetail')])[12]")
	private WebElementFacade addOtherCreditsItemButton;
	
	//TODO: adjustments table
	
	@FindBy(xpath = "(//button[contains(@class, 'btnAddSectionDetail')])[13]")
	private WebElementFacade addAdjustmentItemButton;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesFromDateCalendar'])[3]")
	private WebElementFacade cityOrTownTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesToDateCalendar'])[3]")
	private WebElementFacade cityOrTownTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesAmount'])[3]")
	private WebElementFacade cityOrTownTaxesAmountField;
	
	@FindBy(id = "btnSectionLCityTaxManualOverride")
	private WebElementFacade cityOrCountyTaxesManualOverrideButton;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesFromDateCalendar'])[3]")
	private WebElementFacade countyTaxesFromDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesToDateCalendar'])[3]")
	private WebElementFacade countyTaxesToDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesAmount'])[3]")
	private WebElementFacade countyTaxesAmountInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsFromDateCalendar'])[3]")
	private WebElementFacade assessmentsFromDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsToDateCalendar'])[3]")
	private WebElementFacade assessmentsToDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsAmount'])[3]")
	private WebElementFacade assessmentsAmountInputField;
	
	//TODO: assessments table
	
	@FindBy(xpath = "(//button[contains(@class, 'btnAddSectionDetail')])[14]")
	private WebElementFacade addAssessmentItemButton;
	
	@FindBy(id = "SectionLPaidAlreadyByBorroweratClosing")
	private WebElementFacade paidAlreadyByOrOnBehalfOfBorrowerAtClosingField;
	
}
