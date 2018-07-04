
package com.catic.test.prepexpress.steps;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.DisbursementsPage;
import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;
import com.catic.test.prepexpress.pages.createnewfile.widgets.CashDisbursementsTableRow;
import com.catic.test.prepexpress.pages.createnewfile.widgets.CashDisbursementsTableRowImpl;
import com.catic.test.prepexpress.pages.createnewfile.widgets.CashReceiptTableRowImpl;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CashDisbursementsSteps extends ScenarioSteps{
	
	private static final long serialVersionUID = 2255402919422743646L;
	private DisbursementsPage disbursementsPage;
	private CashDisbursementsTableRowImpl cashDisbursementsTableRowImpl;
	private ConfirmDialog confirmDialog;
	
	@Step 
	public void clickCashREceiptInsertItem(WebElementFacade cashReceiptsInsertItemButton) {
		disbursementsPage.clickInsertItemCashReceipt(cashReceiptsInsertItemButton);
	}
	@Step 
	public void enterDisbursementTo(String description) {
		cashDisbursementsTableRowImpl.addCashDisbursement(description);
	}
	@Step 
	public void entermemoORDescription(String description) {
		cashDisbursementsTableRowImpl.addMemoOrDescription(description);
	}
	@Step 
	public void enterAmount(Money Amount) {
		cashDisbursementsTableRowImpl.addAmount(Amount);
	}
	@Step 
	public void clickSaveButton() {
      confirmDialog.save();
	}
}

