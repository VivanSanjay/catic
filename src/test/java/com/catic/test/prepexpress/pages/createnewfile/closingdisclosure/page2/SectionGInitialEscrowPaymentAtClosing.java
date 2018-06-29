package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionGInitialEscrowPaymentAtClosing extends PageObject {
	// Other Costs - G. Initial Escrow Payment At Closing
	
	// homeowners insurance
	@FindBy(xpath = "//input[@data-id='HOwnInsPerMonthEsc']")
	private WebElementFacade homeownersInsurancePerMonthEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsMonthsEsc']")
	private WebElementFacade homeownersInsuranceMonthsEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsBpAtClosingEsc']")
	private WebElementFacade homeownersInsuranceEscrowBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsBpBeforeClosingEsc']")
	private WebElementFacade homeownersInsuranceEscrowBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsSpAtClosingEsc']")
	private WebElementFacade homeownersInsuranceEscrowSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsSpBeforeClosingEsc']")
	private WebElementFacade homeownersInsuranceEscrowSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='HOwnInsPaidByOthersEsc']")
	private WebElementFacade homeownersInsuranceEscrowPaidByOthersInputField;
	
	@FindBy(id = "btnHOwnInsPaidByOthersIndicatorEsc")
	private WebElementFacade homeownersInsuranceEscrowPaidByOthersIndicatorButton;
	
	// mortgage insurance
	@FindBy(xpath = "//input[@data-id='MtgInsPerMonthEsc']")
	private WebElementFacade mortgageInsurancePerMonthEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsMonthsEsc']")
	private WebElementFacade mortgageInsuranceMonthsEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsBpAtClosingEsc']")
	private WebElementFacade mortgageInsuranceEscrowBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsBpBeforeClosingEsc']")
	private WebElementFacade mortgageInsuranceEscrowBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsSpAtClosingEsc']")
	private WebElementFacade mortgageInsuranceEscrowSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsSpBeforeClosingEsc']")
	private WebElementFacade mortgageInsuranceEscrowSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='MtgInsPaidByOthersEsc']")
	private WebElementFacade mortgageInsuranceEscrowPaidByOthersInputField;
	
	@FindBy(id = "btnMtgInsPaidByOthersIndicatorEsc")
	private WebElementFacade mortgageInsuranceEscrowPaidByOthersIndicatorButton;
	
	// property taxes
	@FindBy(xpath = "//input[@data-id='PropTax1PerMonthEsc']")
	private WebElementFacade propertyTaxesPerMonthEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1MonthsEsc']")
	private WebElementFacade propertyTaxesMonthsEscrowInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1BpAtClosingEsc']")
	private WebElementFacade propertyTaxesEscrowBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1BpBeforeClosingEsc']")
	private WebElementFacade propertyTaxesEscrowBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1SpAtClosingEsc']")
	private WebElementFacade propertyTaxesEscrowSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1SpBeforeClosingEsc']")
	private WebElementFacade propertyTaxesEscrowSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PropTax1PaidByOthersEsc']")
	private WebElementFacade propertyTaxesEscrowPaidByOthersInputField;
	
	@FindBy(id = "btnPropTax1PaidByOthersIndicatorEsc")
	private WebElementFacade propertyTaxesEscrowPaidByOthersIndicatorButton;
	
	// aggregate adjustment
	@FindBy(xpath = "//input[@data-id='AggrAdjBpAtClosingEsc']")
	private WebElementFacade aggregateAdjustmentEscrowBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='AggrAdjBpBeforeClosingEsc']")
	private WebElementFacade aggregateAdjustmentEscrowBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='AggrAdjSpAtClosingEsc']")
	private WebElementFacade aggregateAdjustmentEscrowSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='AggrAdjSpBeforeClosingEsc']")
	private WebElementFacade aggregateAdjustmentEscrowSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='AggrAdjPaidByOthersEsc']")
	private WebElementFacade aggregateAdjustmentEscrowPaidByOthersInputField;
	
	@FindBy(id = "btnAggrAdjPaidByOthersIndicatorEsc")
	private WebElementFacade aggregateAdjustmentEscrowPaidByOthersIndicatorButton;
	
	//TODO: escrow payment at closing table
	
	@FindBy(xpath = "//section[@id='SectionG']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addInitialEscrowAtClosingItemButton;
	
	@FindBy(id = "SectionGBpTotal")
	private WebElementFacade initialEscrowPaymentAtClosingField;
}
