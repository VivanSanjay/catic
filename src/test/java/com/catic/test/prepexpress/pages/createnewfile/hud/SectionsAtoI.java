package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionsAtoI extends PageObject {
	// A - Settlement Statement
	@FindBy(xpath = "//section[@id='sectionreview']//a")
	private WebElementFacade editGeneralInformationButton;
	
	// B - Type of Loan
	@FindBy(id = "TypeOfLoanFHA")
	private WebElementFacade typeOfLoanFHARadioButton;
	
	@FindBy(id = "TypeOfLoanRHS")
	private WebElementFacade typeOfLoanRHSRadioButton;
	
	@FindBy(id = "TypeOfLoanConvUnins")
	private WebElementFacade typeOfLoanConvUninsRadioButton;
	
	@FindBy(id = "TypeOfLoanVA")
	private WebElementFacade typeOfLoanVARadioButton;
	
	@FindBy(id = "TypeOfLoanConvIns")
	private WebElementFacade typeOfLoanConvInsRadioButton;
	
	@FindBy(id = "FileNumber")
	private WebElementFacade fileNumberField;
	
	@FindBy(id = "LoanNumber")
	private WebElementFacade loanNumberField;
	
	@FindBy(id = "MortgageInsuranceCaseNumber")
	private WebElementFacade mortgageInsuranceCaseNumberField;
	
	// D - Name and Address of Borrower
	@FindBy(id = "BorrowerNames")
	private WebElementFacade borrowerNamesField;
	
	@FindBy(id = "BorrowerAddress1")
	private WebElementFacade borrowerAddress1Field;
	
	@FindBy(id = "BorrowerAddress2")
	private WebElementFacade borrowerAddress2Field;
	
	@FindBy(id = "BorrowerCityStateZip")
	private WebElementFacade borrowerCityStateZipField;
	
	// E - Name and Address of Seller
	@FindBy(id = "SellerNames")
	private WebElementFacade sellerNamesField;
	
	@FindBy(id = "SellerAddress1")
	private WebElementFacade sellerAddress1Field;
	
	@FindBy(id = "SellerAddress2")
	private WebElementFacade sellerAddress2Field;
	
	@FindBy(id = "SellerCityStateZip")
	private WebElementFacade sellerCityStateZipField;
	
	// F - Name and Address of Lender
	@FindBy(id = "LenderName")
	private WebElementFacade lenderNameField;
	
	@FindBy(id = "LenderAddress1")
	private WebElementFacade lenderAddress1Field;
	
	@FindBy(id = "LenderAddress2")
	private WebElementFacade lenderAddress2Field;
	
	@FindBy(id = "LenderCityState")
	private WebElementFacade lenderCityStateZipField;
	
	// G - Property Location
	@FindBy(id = "PropertyAddress")
	private WebElementFacade propertyAddressField;
	
	// H - Settlement Agent
	@FindBy(id = "SettlementAgent")
	private WebElementFacade settlementAgentField;
	
	// I - Settlement Date
	@FindBy(id = "SettlementDate")
	private WebElementFacade settlementDateField;
	
	@FindBy(id = "DisbursementDate")
	private WebElementFacade disbursementDateField;
}
