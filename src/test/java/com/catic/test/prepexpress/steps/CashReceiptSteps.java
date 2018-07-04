package com.catic.test.prepexpress.steps;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.DisbursementsPage;
import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;
import com.catic.test.prepexpress.pages.createnewfile.widgets.CashReceiptTableRowImpl;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CashReceiptSteps extends ScenarioSteps{
	
	private static final long serialVersionUID = 2255402919422743646L;
	private DisbursementsPage disbursementsPage;
	private CashReceiptTableRowImpl cashReceiptTableRowImpl;
	private ConfirmDialog confirmDialog;
	
	@Step 
	public void clickCashREceiptInsertItem(WebElementFacade cashReceiptsInsertItemButton) {
		disbursementsPage.clickInsertItemCashReceipt(cashReceiptsInsertItemButton);
	}
	@Step 
	public void enterReceiptFrom(String description) {
      cashReceiptTableRowImpl.addCashReceipt(description);
	}
	@Step 
	public void entermemoORDescription(String description) {
      cashReceiptTableRowImpl.addMemoOrDescription(description);
	}
	@Step 
	public void enterAmount(Money Amount) {
      cashReceiptTableRowImpl.addAmount(Amount);
	}
	@Step 
	public void clickSaveButton() {
      confirmDialog.save();
	}
}
