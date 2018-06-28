package com.catic.test.prepexpress.pages.createnewfile.widgets;

import java.util.List;

import org.javamoney.moneta.Money;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;
import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import util.MoneyUtil;

public class AltaSettlementTableRowImpl extends WidgetObjectImpl implements AltaSettlementTableRow {
	private static final By CELLS = By.className("dataCol");
	private static final By SAVE_BTN = By.className("saveRowBtn");
	private static final By CANCEL_BTN = By.className("cancelRowBtn");
	private static final By EDIT_BTN = By.xpath(".//a[@title='Edit Item']");
	private static final By REMOVE_BTN = By.xpath(".//a[@title='Remove Item']");
	private static final By MOVE_ITEM = By.xpath(".//a[@title='Move Item To Different Category']");
	
	@FindBy(id = "SellerDebit")
	private WebElementFacade editSellerDebitInputField;
	
	@FindBy(id = "SellerCredit")
	private WebElementFacade editSellerCreditInputField;
	
	@FindBy(id = "UserDescription")
	private WebElementFacade editUserDescriptionInputField;
	
	@FindBy(id = "BorrowerDebit")
	private WebElementFacade editBorrowerDebitInputField;
	
	@FindBy(id = "BorrowerCredit")
	private WebElementFacade editBorrowerCreditInputField;
	
	public AltaSettlementTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public AltaSettlementTableRowImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public AltaSettlementTableRow enterSellerDebit(Money amount) {
		String amt = MoneyUtil.toString(amount);
		editSellerDebitInputField.type(amt);
		return this;
	}

	@Override
	public Money getSellerDebit() {
		String amount = null;
		
		if (editSellerDebitInputField.isVisible()) {
			amount = editSellerDebitInputField.getValue();
		}
		else {
			amount = getCellTextForIndex(0);
		}
		
		return MoneyUtil.fromString(amount);
	}

	@Override
	public AltaSettlementTableRow enterSellerCredit(Money amount) {
		String amt = MoneyUtil.toString(amount);
		editSellerCreditInputField.type(amt);
		return this;
	}

	@Override
	public Money getSellerCredit() {
		String amount = null;
		
		if (editSellerCreditInputField.isVisible()) {
			amount = editSellerCreditInputField.getValue();
		}
		else {
			amount = getCellTextForIndex(1);
		}
		
		return MoneyUtil.fromString(amount);
	}

	@Override
	public AltaSettlementTableRow enterDescription(String description) {
		editUserDescriptionInputField.type(description);
		return this;
	}

	@Override
	public String getDescription() {
		String desc = null;
		
		if (editUserDescriptionInputField.isVisible()) {
			desc = editUserDescriptionInputField.getValue();
		}
		else {
			desc = getCellTextForIndex(2);
		}
		
		return desc;
	}

	@Override
	public AltaSettlementTableRow enterBorrowerDebit(Money amount) {
		String amt = MoneyUtil.toString(amount);
		editBorrowerDebitInputField.type(amt);
		return this;
	}

	@Override
	public Money getBorrowerDebit() {
		String amount = null;
		
		if (editBorrowerDebitInputField.isVisible()) {
			amount = editBorrowerDebitInputField.getValue();
		}
		else {
			amount = getCellTextForIndex(3);
		}
		
		return MoneyUtil.fromString(amount);
	}

	@Override
	public AltaSettlementTableRow enterBorrowerCredit(Money amount) {
		String amt = MoneyUtil.toString(amount);
		editBorrowerCreditInputField.type(amt);
		return this;
	}

	@Override
	public Money getBorrowerCredit() {
		String amount = null;
		
		if (editBorrowerCreditInputField.isVisible()) {
			amount = editBorrowerCreditInputField.getValue();
		}
		else {
			amount = getCellTextForIndex(4);
		}
		
		return MoneyUtil.fromString(amount);
	}

	@Override
	public void save() {
		this.find(SAVE_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}

	@Override
	public void cancel() {
		this.find(CANCEL_BTN).click();
		
	}

	@Override
	public AltaSettlementTableRow edit() {
		this.find(EDIT_BTN).click();
		return this;
	}

	@Override
	public ConfirmDialog remove() {
		this.find(REMOVE_BTN).click();
		
		ConfirmDialog dialog = ConfirmDialog.newInstance(getPage());
		dialog.waitUntilVisible();
		
		return dialog;
	}

	@Override
	public void moveItemToDifferentCategory(String categoryName) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("moveItemToDifferentCategory(String categoryName) not ready yet");
	}
	
	@Override
	public void waitUntilEditable() {
		editUserDescriptionInputField.waitUntilVisible();
	}
	
	private String getCellTextForIndex(int cellIndex) {
		return getCellsForRow().get(cellIndex).getText();
	}
	
	private List<WebElementFacade> getCellsForRow() {
		return this.thenFindAll(CELLS);
	}
}
