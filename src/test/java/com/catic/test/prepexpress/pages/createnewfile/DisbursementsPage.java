package com.catic.test.prepexpress.pages.createnewfile;

import java.util.List;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.widgets.AltaSettlementTableRow;
import com.catic.test.prepexpress.pages.createnewfile.widgets.CashReceiptTableRow ;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DisbursementsPage extends PageObject {
     ////    cashReceipt  ////
	
	
	@FindBy(xpath = "//input[contains(@class,'cashInItemSelected')]")
	private List<CashReceiptTableRow > disbursementCheckbox;
	
	
     ////    cashReceipt  ////
	
	@FindBy(id = "btnInsertCashin")
	private WebElementFacade cashReceiptsInsertItemButton;
	
	@FindBy(id = "btnDeleteCashinSelected")
	private WebElementFacade cashReceiptsDeleteItemsButton;
	
	@FindBy(id = "btnCombineCashinSelected")
	private WebElementFacade cashReceiptsCombineItemsButton;
	
	@FindBy(id = "btnInsertCashout")
	private WebElementFacade cashDisbursementsInsertItemButton;
	
	@FindBy(id = "btnDeleteCashoutSelected")
	private WebElementFacade cashDisbursementsDeleteItemsButton;
	
	@FindBy(id = "btnNetFundSelected")
	private WebElementFacade cashDisbursementsNetFundItemsButton;
	
	@FindBy(id = "btnCombineCashoutSelected")
	private WebElementFacade cashDisbursementsCombineItemsButton;
	
	@FindBy(id = "totalReceipts")
	private WebElementFacade totalCashReceiptsText;
	
	@FindBy(id = "totalDisbursements")
	private WebElementFacade totalDisbursementsText;

    ////  cash disbursement  //////

	@FindBy(id="btnNetFundSelected")
	private WebElementFacade btnNetFundSelectedButton;

	//add items for cash disbursement
	@FindBy(id="paymentFromTo")
	private WebElementFacade paymentFromToText;
	
	//private WebElementFacade ;
	@FindBy(id="btnDisbursementEditorSave")
	private WebElementFacade btnDisbursementEditorSaveButton;
	
	@FindBy(id="btnDisbursementEditorClose")
	private WebElementFacade btnDisbursementEditorCloseButton;
	
	// checkbox select items
	@FindBy(xpath = "(//td[@class='cashOutItemSelected noDrag']")
	private WebElementFacade cashOutItemSelectedCheckBox ;
	
    ////cash disbursement  //////
	
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
	
	private CashReceiptTableRow  clickItem(WebElementFacade addItem) {
		addItem.click();
		return null;
	}
	public CashReceiptTableRow clickInsertItemCashReceipt(WebElementFacade cashReceiptsInsertItemButton) {
		return clickItem(cashReceiptsInsertItemButton);
	}
	public CashReceiptTableRow deleteCashReceipts(String... descriptions) {
		return clickItem(cashReceiptsDeleteItemsButton);
	}
	public CashReceiptTableRow combineItems(String... descriptions) {
		return clickItem(cashReceiptsCombineItemsButton);
	}
	public CashReceiptTableRow clickInsertItemCashDisbursement(WebElementFacade cashReceiptsInsertItemButton) {
		return clickItem(cashDisbursementsInsertItemButton);
	}
	public CashReceiptTableRow deleteCashDisbursement(String... descriptions) {
		return clickItem(cashDisbursementsDeleteItemsButton);
	}
	public CashReceiptTableRow  combineCashDisbursements(String... descriptions) {
		return clickItem(cashDisbursementsCombineItemsButton);
	}
	public CashReceiptTableRow netFundItem(String... descriptions) {
		return clickItem(btnNetFundSelectedButton);
	}
}
