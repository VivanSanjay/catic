package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionKDueFromBorrowerAtClosing extends PageObject {
	@FindBy(xpath = "(//input[@data-id='PurchasePrice'])[1]")
	private WebElementFacade salePriceOfPropertyField;
	
	@FindBy(id = "SectionKSalePriceOfPersonalProperty")
	private WebElementFacade salePriceOfPersonalPropertyIncludedInSaleInputField;
	
	@FindBy(xpath = "(//input[@data-id='ClosingCostsPaidAtClosingCalc'])[1]")
	private WebElementFacade closingCostsPaidAtClosingField;
	
	@FindBy(id = "SectionKExtraLine1Label")
	private WebElementFacade sectionKExtraLineInputField;
	
	@FindBy(id = "SectionKExtraLine1Amount")
	private WebElementFacade sectionKExtaLineAmountInputField;
	
	//TODO: adjustments table
	
	@FindBy(id = "btnSectionKAddOne")
	private WebElementFacade addAdjustmentItemButton;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesFromDateCalendar'])[1]")
	private WebElementFacade cityOrTownTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesToDateCalendar'])[1]")
	private WebElementFacade cityOrTownTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesAmount'])[1]")
	private WebElementFacade cityOrTownTaxesAmountField;
	
	@FindBy(id = "btnSectionKCityTaxManualOverride")
	private WebElementFacade cityOrCountyTaxesManualOverrideButton;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesFromDateCalendar'])[1]")
	private WebElementFacade countyTaxesFromDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesToDateCalendar'])[1]")
	private WebElementFacade countyTaxesToDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesAmount'])[1]")
	private WebElementFacade countyTaxesAmountInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsFromDateCalendar'])[1]")
	private WebElementFacade assessmentsFromDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsToDateCalendar'])[1]")
	private WebElementFacade assessmentsToDateInputField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsAmount'])[1]")
	private WebElementFacade assessmentsAmountInputField;
	
	//TODO: adjustments for items paid by seller in advance table
	
	@FindBy(xpath = "(//button[contains(@class, 'btnAddSectionDetail')])[10]")
	private WebElementFacade addAdjustmentForItemsPaidBySellerInAdvanceButton;
	
	@FindBy(id = "SectionKDueFromBorrowerAtClosing")
	private WebElementFacade dueFromBorrowingAtClosingField;
}
