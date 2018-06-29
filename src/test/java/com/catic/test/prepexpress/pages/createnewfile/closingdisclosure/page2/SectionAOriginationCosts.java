package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionAOriginationCosts extends PageObject {
	// Loan Costs - A. Origination Charges
	@FindBy(xpath = "//input[@data-id='PointPct']")
	private WebElementFacade loanAmountPointsInputField;
	
	@FindBy(xpath = "//input[@data-id='BpAtClosing']")
	private WebElementFacade borrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='BpBeforeClosing']")
	private WebElementFacade borrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='SpAtClosing']")
	private WebElementFacade sellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='SpBeforeClosing']")
	private WebElementFacade sellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='PaidByOthers']")
	private WebElementFacade paidByOthersInputField;
	
	@FindBy(id = "btnPaidByOthersIndicator")
	private WebElementFacade paidByOthersIndicatorButton;
	
	//TODO: origination charges items table
	
	@FindBy(xpath = "//section[@id='SectionA']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addOriginationChargesItemButton;
	
	@FindBy(id = "SectionABpTotal")
	private WebElementFacade originationChargesField;
}
