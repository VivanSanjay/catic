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

public class AdjustmentSheetTableRowImpl extends WidgetObjectImpl implements AdjustmentSheetTableRow {
	
	private static final By CELLS = By.className("dataCol");
	private static final By SAVE_BTN = By.className("saveRowBtn");
	private static final By CANCEL_BTN = By.className("cancelRowBtn");
	private static final By EDIT_BTN = By.xpath(".//a[@title='Edit Item']");
	private static final By REMOVE_BTN = By.xpath(".//a[@title='Remove Item']");
	
	
	@FindBy(id = "//tr[@data-id='1183']//td[@data-tdid='Description']")
	private WebElementFacade editCreditsToSellerDescriptionInputField;
	
	@FindBy(id = "//tr[@data-id='1183']//td[@data-tdid='Amount']")
	private WebElementFacade editCreditsToSellerAmountInputField;
	
	@FindBy(id = "//tr[@data-id='1184']//td[@data-tdid='Description']")
	private WebElementFacade editCreditsToBuyerDescriptionInputField;
	
	@FindBy(id = "//tr[@data-id='1184']//td[@data-tdid='Amount']")
	private WebElementFacade editCreditsToBuyerAmountInputField;
	
	@FindBy(id = "//tr[@data-id='1185']//td[@data-tdid='Description']")
	private WebElementFacade editPayOffsDescriptionInputField;
	
	@FindBy(id = "//tr[@data-id='1185']//td[@data-tdid='Amount']")
	private WebElementFacade editPayOffsAmountInputField;
	
	@FindBy(id = "Amount")
	private WebElementFacade amountText;
	
	@FindBy(id = "Description")
	private WebElementFacade DescriptionText;

	public AdjustmentSheetTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public AdjustmentSheetTableRowImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public String getDescription() {
		String desc = null;
		
		if (DescriptionText.isVisible()) {
			desc = DescriptionText.getValue();
		}
		else {
			desc = getCellTextForIndex(0);
		}
		return desc;
	}

	@Override
	public void waitUntilEditable() {
		DescriptionText.waitUntilVisible();
		
	}

	@Override
	public AdjustmentSheetTableRow enterAmount(Money amount) {
		String amt = MoneyUtil.toString(amount);
		amountText.type(amt);
		return this;
	}

	@Override
	public Money getenterAmount() {
		String amount = null;
		
		if (amountText.isVisible()) {
			amount = amountText.getValue();
		}
		else {
			amount = getCellTextForIndex(1);
		}
		
		return MoneyUtil.fromString(amount);
	}

	@Override
	public AdjustmentSheetTableRow enterDescription(String description) {
		DescriptionText.type(description);
		return this;
	}

	@Override
	public void save() {
		this.find(SAVE_BTN).click();
		AjaxLoader.waitForAjaxLoaderToDisappearOn(getPage());
	}
	
	@Override
	public ConfirmDialog remove() {
		this.find(REMOVE_BTN).click();
		
		ConfirmDialog dialog = ConfirmDialog.newInstance(getPage());
		dialog.waitUntilVisible();
		
		return dialog;
	}

	private String getCellTextForIndex(int cellIndex) {
		return getCellsForRow().get(cellIndex).getText();
	}
	
	private List<WebElementFacade> getCellsForRow() {
		return this.thenFindAll(CELLS);
	}

	@Override
	public AdjustmentSheetTableRow edit() {
		this.find(EDIT_BTN).click();
		return this;

	}

	@Override
	public void cancel() {
		this.find(CANCEL_BTN).click();
		
	}
	
}
