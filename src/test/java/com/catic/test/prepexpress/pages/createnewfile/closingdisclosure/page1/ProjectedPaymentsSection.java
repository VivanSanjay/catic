package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProjectedPaymentsSection extends PageObject {
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
}
