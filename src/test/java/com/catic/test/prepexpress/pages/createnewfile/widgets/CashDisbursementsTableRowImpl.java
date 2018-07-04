
package com.catic.test.prepexpress.pages.createnewfile.widgets;

import java.util.List;

import org.javamoney.moneta.Money;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import util.MoneyUtil;

public class CashDisbursementsTableRowImpl extends WidgetObjectImpl implements CashDisbursementsTableRow  {

	
	public CashDisbursementsTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);

	}
	private static final By CELLS = By.className("dataCol");
	private static final By SAVE_BTN = By.id("btnDisbursementEditorSave");
	private static final By CANCEL_BTN = By.id("btnDisbursementEditorClose");
	

	@FindBy(id = "paymentFromTo")
	private WebElementFacade DisbursementToTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'Memo')]/..//input[not(@id)]")
	private WebElementFacade memoOrDescriptionTextBox;
	
	@FindBy(xpath = "//label[text()='Amount :']/..//input[not(@id) and contains(@type,'text' )]")
	private WebElementFacade AmountTextBox;

	
	@FindBy(id = "btnDisbursementEditorClose")
	private WebElementFacade disbursementCancelBtn;

	private String getCellTextForIndex(int cellIndex) {
		return getCellsForRow().get(cellIndex).getText();
	}
	
	private List<WebElementFacade> getCellsForRow() {
		return this.thenFindAll(CELLS);
	}

	public CashDisbursementsTableRow addCashDisbursement(String description ) {
		DisbursementToTextBox.type(description);
		return this;
	}
	
	public CashDisbursementsTableRow addMemoOrDescription(String description){
		memoOrDescriptionTextBox.type(description);
		return this;
	}
	
	public CashDisbursementsTableRow addAmount(Money amount) {
		String amt = MoneyUtil.toString(amount);
		AmountTextBox.type(amt);
		return this;
	}
	@Override
	public void save() {
		this.find(SAVE_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}
	@Override
	public void cancel() {
		this.find(CANCEL_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}
	public CashDisbursementsTableRow  clickSaveBtn() {

		return this;
	}
	public CashDisbursementsTableRow  clickCancelBtn() {

		return this;
	}
}

