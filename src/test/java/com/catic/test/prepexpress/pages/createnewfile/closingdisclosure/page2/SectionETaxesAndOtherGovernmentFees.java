package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionETaxesAndOtherGovernmentFees extends PageObject {
	// Other Costs - E. Taxes And Other Government Fees
	
	// fees
	@FindBy(id = "DeedFees")
	private WebElementFacade deedFeesField;
	
	@FindBy(id = "MortgageFees")
	private WebElementFacade mortgageFeesField;
	
	@FindBy(xpath = "//input[@data-id='ReleaseFees']")
	private WebElementFacade releaseFeesField;
	
	@FindBy(id = "FeesBpAtClosing")
	private WebElementFacade feesBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='FeesBpBeforeClosing']")
	private WebElementFacade feesBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='FeesSpAtClosing']")
	private WebElementFacade feesSellerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='FeesSpBeforeClosing']")
	private WebElementFacade feesSellerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='FeesPaidByOthers']")
	private WebElementFacade feesPaidByOthersField;
	
	@FindBy(id = "btnFeesPaidByOthersIndicator")
	private WebElementFacade feesPaidByOthersIndicatorButton;
	
	@FindBy(id = "RecFeeManualOverride")
	private WebElementFacade feeManualOverrideButton;
	
	// state transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxAmount']")
	private WebElementFacade stateTransferTaxesAmountField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxState']")
	private WebElementFacade transferTaxStateField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxBpAtClosing']")
	private WebElementFacade stateTransferTaxesBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxBpBeforeClosing']")
	private WebElementFacade stateTransferTaxesBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxSpAtClosing']")
	private WebElementFacade stateTransferTaxesSellerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxSpBeforeClosing']")
	private WebElementFacade stateTransferTaxesSellerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxPaidByOthers']")
	private WebElementFacade stateTransferTaxesPaidByOthersField;
	
	@FindBy(id = "btnTransTaxByOthersIndicator")
	private WebElementFacade stateTransferTaxesPaidByOthersIndicatorButton;
	
	@FindBy(id = "TransTaxManualOverride")
	private WebElementFacade stateTransferTaxesManualOverrideButton;
	
	// town transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxTownAmount']")
	private WebElementFacade townTransferTaxesAmountField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTown']")
	private WebElementFacade transferTaxTownField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownBpAtClosing']")
	private WebElementFacade townTransferTaxesBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownBpBeforeClosing']")
	private WebElementFacade townTransferTaxesBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownSpAtClosing']")
	private WebElementFacade townTransferTaxesSellerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownSpBeforeClosing']")
	private WebElementFacade townTransferTaxesSellerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxTownPaidByOthers']")
	private WebElementFacade townTransferTaxesPaidByOthersField;
	
	@FindBy(id = "btnTransTaxTownByOthersIndicator")
	private WebElementFacade townTransferTaxesPaidByOthersIndicatorButton;
	
	// county transfer taxes
	@FindBy(xpath = "//input[@data-id='TransTaxCountyAmount']")
	private WebElementFacade countTransferTaxesAmountField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCounty']")
	private WebElementFacade transferTaxCountyField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyBpAtClosing']")
	private WebElementFacade countyTransferTaxesBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyBpBeforeClosing']")
	private WebElementFacade countyTransferTaxesBorrowerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountySpAtClosing']")
	private WebElementFacade countyTransferTaxesSellerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountySpBeforeClosing']")
	private WebElementFacade countyTransferTaxesSellerPaidBeforeClosingField;
	
	@FindBy(xpath = "//input[@data-id='TransTaxCountyPaidByOthers']")
	private WebElementFacade countyTransferTaxesPaidByOthersField;
	
	@FindBy(id = "btnTransTaxCountyByOthersIndicator")
	private WebElementFacade countyTransferTaxesPaidByOthersIndicatorButton;
	
	//TODO: taxes & other gov't fees table
	
	@FindBy(xpath = "//section[@id='SectionE']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addTaxesAndOtherGovernmentFeesItemButton;
	
	@FindBy(id = "SectionEBpTotal")
	private WebElementFacade taxesAndOtherGovernmentFeesField;
}
