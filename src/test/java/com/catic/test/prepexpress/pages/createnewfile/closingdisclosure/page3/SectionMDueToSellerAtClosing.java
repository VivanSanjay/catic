package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionMDueToSellerAtClosing extends PageObject {
	@FindBy(xpath = "(//input[@data-id='PurchasePrice'])[2]")
	private WebElementFacade salePriceOfPropertyField;
	
	@FindBy(xpath = "(//input[@data-id='SalePriceOfPersonalProperty'])[2]")
	private WebElementFacade salePriceOfPersonalPropertyIncludedInSaleInputField;
	
	//TODO: items table
	
	@FindBy(id = "btnSectionMAddOne")
	private WebElementFacade addItemButton;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesFromDateCalendar'])[2]")
	private WebElementFacade cityOrTownTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesToDateCalendar'])[2]")
	private WebElementFacade cityOrTownTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CityTownTaxesAmount'])[2]")
	private WebElementFacade cityOrTownTaxesAmountField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesFromDateCalendar'])[2]")
	private WebElementFacade countyTaxesFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesToDateCalendar'])[2]")
	private WebElementFacade countyTaxesToDateField;
	
	@FindBy(xpath = "(//input[@data-id='CountyTaxesAmount'])[2]")
	private WebElementFacade countyTaxesAmountField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsFromDateCalendar'])[2]")
	private WebElementFacade assessmentsFromDateField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsToDateCalendar'])[2]")
	private WebElementFacade assessmentsToDateField;
	
	@FindBy(xpath = "(//input[@data-id='AssessmentsAmount'])[2]")
	private WebElementFacade assessmentsAmountField;
	
	//TODO: assessments table (fields are uneditable compared to other tables)
	
	@FindBy(id = "SectionMDueToSellerAtClosing")
	private WebElementFacade dueToSellerAtClosingField;
}
