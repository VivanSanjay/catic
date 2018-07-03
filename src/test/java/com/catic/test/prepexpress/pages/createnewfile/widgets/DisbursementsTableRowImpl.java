
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

public class DisbursementsTableRowImpl extends WidgetObjectImpl implements DisbursementsTableRow {

	
	private static final By CELLS = By.className("dataCol");
	private static final By SAVE_BTN = By.id("btnDisbursementEditorSave");

	
	 ////    cashReceipt  ////
	
	
	@FindBy(id = "paymentFromTo")
	private WebElementFacade ReceiptFromTextBox;
	
	@FindBy(xpath = "//label[contains(text(),'Memo')]/..//input[not(@id)]")
	private WebElementFacade memoOrDescriptionTextBox;
	
	@FindBy(xpath = "//label[text()='Amount :']/..//input[not(@id) and contains(@type,'text' )]")
	private WebElementFacade AmountTextBox;

	
	@FindBy(id = "btnDisbursementEditorClose")
	private WebElementFacade disbursementCancelBtn;
	

	
	public DisbursementsTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public DisbursementsTableRowImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}
	
	private String getCellTextForIndex(int cellIndex) {
		return getCellsForRow().get(cellIndex).getText();
	}
	
	private List<WebElementFacade> getCellsForRow() {
		return this.thenFindAll(CELLS);
	}

	public DisbursementsTableRow enterReceiptFrom(String description ) {
		ReceiptFromTextBox.type(description);
		return this;
	}
	
	public DisbursementsTableRow enterMemoOrDescription(String description){
		memoOrDescriptionTextBox.type(description);
		return this;
	}
	
	public DisbursementsTableRow enterAmount(Money amount) {
		String amt = MoneyUtil.toString(amount);
		AmountTextBox.type(amt);
		return this;
	}
	@Override
	public void save() {
		this.find(SAVE_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}
	public DisbursementsTableRow clickSaveBtn() {

		return this;
	}
}

