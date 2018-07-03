package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionETaxesAndOtherGovernmentFees extends PageObject {
	// Other Costs - E. Taxes And Other Government Fees
	
	// fees
	@FindBy(id = "DeedFees")
	private WebElementFacade deedFeesInputField;
	
	@FindBy(id = "MortgageFees")
	private WebElementFacade mortgageFeesInputField;
	
	@FindBy(xpath = "//input[@data-id='ReleaseFees']")
	private WebElementFacade releaseFeesInputField;
	
	@FindBy(id = "FeesBpAtClosing")
	private WebElementFacade feesBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='FeesBpBeforeClosing']")
	private WebElementFacade feesBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='FeesSpAtClosing']")
	private WebElementFacade feesSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='FeesSpBeforeClosing']")
	private WebElementFacade feesSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='FeesPaidByOthers']")
	private WebElementFacade feesPaidByOthersInputField;
	
	@FindBy(id = "btnFeesPaidByOthersIndicator")
	private WebElementFacade feesPaidByOthersIndicatorButton;
	
	@FindBy(id = "RecFeeManualOverride")
	private WebElementFacade feeManualOverrideButton;
	
	// state transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxAmount']")
	private WebElementFacade stateTransferTaxesAmountInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxState']")
	private WebElementFacade transferTaxStateInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxBpAtClosing']")
	private WebElementFacade stateTransferTaxesBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxBpBeforeClosing']")
	private WebElementFacade stateTransferTaxesBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxSpAtClosing']")
	private WebElementFacade stateTransferTaxesSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxSpBeforeClosing']")
	private WebElementFacade stateTransferTaxesSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxPaidByOthers']")
	private WebElementFacade stateTransferTaxesPaidByOthersInputField;
	
	@FindBy(id = "btnTransTaxByOthersIndicator")
	private WebElementFacade stateTransferTaxesPaidByOthersIndicatorButton;
	
	@FindBy(id = "TransTaxManualOverride")
	private WebElementFacade stateTransferTaxesManualOverrideButton;
	
	// town transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxTownAmount']")
	private WebElementFacade townTransferTaxesAmountInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTown']")
	private WebElementFacade transferTaxTownInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownBpAtClosing']")
	private WebElementFacade townTransferTaxesBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownBpBeforeClosing']")
	private WebElementFacade townTransferTaxesBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownSpAtClosing']")
	private WebElementFacade townTransferTaxesSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownSpBeforeClosing']")
	private WebElementFacade townTransferTaxesSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownPaidByOthers']")
	private WebElementFacade townTransferTaxesPaidByOthersInputField;
	
	@FindBy(id = "btnTransTaxTownByOthersIndicator")
	private WebElementFacade townTransferTaxesPaidByOthersIndicatorButton;
	
	// county transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxCountyAmount']")
	private WebElementFacade countTransferTaxesAmountInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCounty']")
	private WebElementFacade transferTaxCountyInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyBpAtClosing']")
	private WebElementFacade countyTransferTaxesBorrowerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyBpBeforeClosing']")
	private WebElementFacade countyTransferTaxesBorrowerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountySpAtClosing']")
	private WebElementFacade countyTransferTaxesSellerPaidAtClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountySpBeforeClosing']")
	private WebElementFacade countyTransferTaxesSellerPaidBeforeClosingInputField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyPaidByOthers']")
	private WebElementFacade countyTransferTaxesPaidByOthersInputField;
	
	@FindBy(id = "btnTransTaxCountyByOthersIndicator")
	private WebElementFacade countyTransferTaxesPaidByOthersIndicatorButton;
	
	//TODO: taxes & other gov't fees table
	
	@FindBy(xpath = "//section[@id='SectionE']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addTaxesAndOtherGovernmentFeesItemButton;
	
	@FindBy(id = "SectionEBpTotal")
	private WebElementFacade taxesAndOtherGovernmentFeesField;
}
