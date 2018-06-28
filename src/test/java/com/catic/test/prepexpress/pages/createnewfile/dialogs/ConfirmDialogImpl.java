package com.catic.test.prepexpress.pages.createnewfile.dialogs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class ConfirmDialogImpl extends WidgetObjectImpl implements ConfirmDialog {
	@FindBy(id = "dialogConfirmOkay")
	private WebElementFacade okButton;
	
	@FindBy(id = "dialogConfirmCancel")
	private WebElementFacade cancelButton;
	
	@FindBy(id = "dialogConfirmMessage")
	private WebElementFacade messageText;
	
	@FindBy(id = "dialogConfirmTitle")
	private WebElementFacade titleText;
	
	public ConfirmDialogImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public ConfirmDialogImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public void ok() {
		okButton.click();
	}

	@Override
	public void cancel() {
		cancelButton.click();
	}

	@Override
	public String getMessage() {
		return messageText.getText();
	}
	
	@Override
	public String getTitle() {
		return titleText.getText();
	}

}
