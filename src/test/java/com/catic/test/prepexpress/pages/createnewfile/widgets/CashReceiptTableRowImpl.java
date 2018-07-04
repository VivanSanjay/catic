
package com.catic.test.prepexpress.pages.createnewfile.widgets;

import java.util.List;

import org.javamoney.moneta.Money;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementDescriber;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import util.MoneyUtil;

public class CashReceiptTableRowImpl extends WidgetObjectImpl implements CashReceiptTableRow  {

	
	public CashReceiptTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}
	private static final By CELLS = By.className("dataCol");

	private static final By CANCEL_BTN = By.id("btnDisbursementEditorClose");
	
	 ////    cashReceipt  ////
	
	
	@FindBy(id = "paymentFromTo")
	private WebElementFacade ReceiptFromTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'Memo')]/..//input[not(@id)]")
	private WebElementFacade memoOrDescriptionTextBox;
	
	@FindBy(xpath = "//label[text()='Amount :']/..//input[not(@id) and contains(@type,'text' )]")
	private WebElementFacade AmountTextBox;

	@FindBy(id = "btnDisbursementEditorClose")
	private WebElementFacade disbursementCancelBtn;
	
	@FindBys({ @FindBy(xpath = "//input[contains(@class,'cashInItemSelected')]") })
	private List<WebElementDescriber> cashReceiptCheckbox;
	

	private String getCellTextForIndex(int cellIndex) {
		return getCellsForRow().get(cellIndex).getText();
	}
	
	private List<WebElementFacade> getCellsForRow() {
		return this.thenFindAll(CELLS);
	}

	public CashReceiptTableRow addCashReceipt(String description ) {
		ReceiptFromTextBox.type(description);
		return this;
	}
	
	public CashReceiptTableRow addMemoOrDescription(String description){
		memoOrDescriptionTextBox.type(description);
		return this;
	}
	
	public CashReceiptTableRow addAmount(Money amount) {
		String amt = MoneyUtil.toString(amount);
		AmountTextBox.type(amt);
		return this;
	}
	public String findCashReceiptByDescription(String description) {
		return this.memoOrDescriptionTextBox.getText();

	}
	
	public int checkBoxCashReceipt() {
		int checkBoxList = cashReceiptCheckbox.size();
		return checkBoxList;	
	}
	
	public void checkRandomCashReceipt() {
		
	}

	@Override
	public void cancel() {
		this.find(CANCEL_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}

	public CashReceiptTableRowImpl  clickCancelBtn() {

		return this;
	}

}

