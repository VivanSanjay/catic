package com.catic.test.prepexpress.pages.createnewfile;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DisbursementsPage extends PageObject {
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
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
}
