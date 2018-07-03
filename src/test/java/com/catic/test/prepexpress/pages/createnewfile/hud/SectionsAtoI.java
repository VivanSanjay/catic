package com.catic.test.prepexpress.pages.createnewfile.hud;

import java.time.LocalDate;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;
import com.catic.test.prepexpress.pages.home.HomePageUtils;

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
	
	@FindBy(id = "AgentPhoneNumber")
	private WebElementFacade agentPhoneNumberField;
	
	@FindBy(id = "PlaceOfSettlement")
	private WebElementFacade placeOfSettlementField;
	
	// I - Settlement Date
	@FindBy(id = "SettlementDate")
	private WebElementFacade settlementDateField;
	
	@FindBy(id = "DisbursementDate")
	private WebElementFacade disbursementDateField;
	
	public GenInfoPage editGeneralInformation() {
		editGeneralInformationButton.click();
		return switchToPage(GenInfoPage.class);
	}
	
	public boolean typeOfLoanFHA() {
		return typeOfLoanFHARadioButton.isSelected();
	}
	
	public boolean typeOfLoanRHS() {
		return typeOfLoanRHSRadioButton.isSelected();
	}
	
	public boolean typeOfLoanConvUnins() {
		return typeOfLoanConvUninsRadioButton.isSelected();
	}
	
	public boolean typeOfLoanVA() {
		return typeOfLoanVARadioButton.isSelected();
	}
	
	public boolean typeOfLoanConvIns() {
		return typeOfLoanConvInsRadioButton.isSelected();
	}
	
	public String getFileNumber() {
		return fileNumberField.getValue();
	}
	
	public String getLoanNumber() {
		return loanNumberField.getValue();
	}
	
	public String getMortgageInsuranceCaseNumber() {
		return mortgageInsuranceCaseNumberField.getValue();
	}
	
	public String getBorrowerNames() {
		return borrowerNamesField.getValue();
	}
	
	public String getBorrowerAddress1() {
		return borrowerAddress1Field.getValue();
	}
	
	public String getBorrowerAddress2() {
		return borrowerAddress2Field.getValue();
	}
	
	public String getBorrowerCityStateZip() {
		return borrowerCityStateZipField.getValue();
	}
	
	public String getSellerNames() {
		return sellerNamesField.getValue();
	}
	
	public String getSellerAddress1() {
		return sellerAddress1Field.getValue();
	}
	
	public String getSellerAddress2() {
		return sellerAddress2Field.getValue();
	}
	
	public String getSellerCityStateZip() {
		return sellerCityStateZipField.getValue();
	}
	
	public String getLenderName() {
		return lenderNameField.getValue();
	}
	
	public String getLenderAddress1() {
		return lenderAddress1Field.getValue();
	}
	
	public String getLenderAddress2() {
		return lenderAddress2Field.getValue();
	}
	
	public String getLenderCityStateZip() {
		return lenderCityStateZipField.getValue();
	}
	
	public String getPropertyLocation() {
		return propertyAddressField.getValue();
	}
	
	public String getSettlementAgent() {
		return settlementAgentField.getValue();
	}
	
	public String getAgentPhoneNumber() {
		return agentPhoneNumberField.getValue();
	}
	
	public String getPlaceOfSettlement() {
		return placeOfSettlementField.getValue();
	}
	
	public LocalDate getSettlementDate() {
		return HomePageUtils.parseCreatedBetweenDateString(settlementDateField.getValue());
	}
	
	public LocalDate getDisbursementDate() {
		return HomePageUtils.parseCreatedBetweenDateString(disbursementDateField.getValue());
	}
}
