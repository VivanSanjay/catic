package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionFPrepaids extends PageObject {
	// Other Costs - F. Prepaids
	
	// homeowners insurance
	@FindBy(xpath = "//input[@data-id='HOwnInsName']")
	private WebElementFacade homeownersInsuranceNameInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsPremium']")
	private WebElementFacade homeownersInsurancePremiumInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsMonths']")
	private WebElementFacade homeownersInsuranceMonthsInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsBpAtClosing']")
	private WebElementFacade homeownersInsuranceBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsBpBeforeClosing']")
	private WebElementFacade homeownersInsuranceBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsSpAtClosing']")
	private WebElementFacade homeownersInsuranceSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsSpBeforeClosing']")
	private WebElementFacade homeownersInsuranceSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsPaidByOthers']")
	private WebElementFacade homeownersInsurancePaidByOthersInputField;
	
	@FindBy(id = "btnHOwnInsPaidByOthersIndicator")
	private WebElementFacade homeownersInsurancePaidByOthersIndicatorButton;
	
	// mortgage insurer
	@FindBy(xpath = "//input[@data-id='MtgInsName']")
	private WebElementFacade mortgageInsuranceNameInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsPremium']")
	private WebElementFacade mortgageInsurancePremiumInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsMonths']")
	private WebElementFacade mortgageInsuranceMonthsInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsBpAtClosing']")
	private WebElementFacade mortgageInsuranceBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsBpBeforeClosing']")
	private WebElementFacade mortgageInsuranceBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsSpAtClosing']")
	private WebElementFacade mortgageInsuranceSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsSpBeforeClosing']")
	private WebElementFacade mortgageInsuranceSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsPaidByOthers']")
	private WebElementFacade mortgageInsurancePaidByOthersInputField;
	
	@FindBy(id = "btnMtgInsPaidByOthersIndicator")
	private WebElementFacade mortgageInsurancePaidByOthersIndicatorButton;
	
	// prepaid interest per day
	@FindBy(xpath = "//input[@data-id='PrepaidIntPerDay']")
	private WebElementFacade prepaidInterestPerDayInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntStartDateCalendar']")
	private WebElementFacade prepaidInterestPerDayStartDateInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntEndDateCalendar']")
	private WebElementFacade prepaidInterestPerDayEndDateInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntBpAtClosing']")
	private WebElementFacade prepaidInterestPerDayBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntBpBeforeClosing']")
	private WebElementFacade prepaidInterestPerDayBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntSpAtClosing']")
	private WebElementFacade prepaidInterestPerDaySellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntSpBeforeClosing']")
	private WebElementFacade prepaidInterestPerDaySellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PrepaidIntPaidByOthers']")
	private WebElementFacade prepaidInterestPerDayPaidByOthersInputField;
	
	@FindBy(id = "btnPrepaidIntPaidByOthersIndicator")
	private WebElementFacade prepaidInterestPerDayPaidByOthersIndicatorButton;
	
	@FindBy(id = "PrepaidIntManualOverride")
	private WebElementFacade prepaidInterestPerDayManualOverrideButton;
	
	// property taxes
	@FindBy(xpath = "//input[@data-id='PropTax1To']")
	private WebElementFacade propertyTaxesInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1Amount']")
	private WebElementFacade propertyTaxesAmountInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1MonthsPaid']")
	private WebElementFacade propertyTaxesMonthsInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1BpAtClosing']")
	private WebElementFacade propertyTaxesBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1BpBeforeClosing']")
	private WebElementFacade propertyTaxesBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1SpAtClosing']")
	private WebElementFacade propertyTaxesSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1SpBeforeClosing']")
	private WebElementFacade propertyTaxesSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1PaidByOthers']")
	private WebElementFacade propertyTaxesPaidByOthersInputField;
	
	@FindBy(id = "btnPropTax1PaidByOthersIndicator")
	private WebElementFacade propertyTaxesPaidByOthersIndicatorButton;
	
	//TODO: prepaid items table
	
	@FindBy(xpath = "//section[@id='SectionF']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addPrepaidsItemButton;
	
	@FindBy(id = "SectionFBpTotal")
	private WebElementFacade prepaidsField;
}
