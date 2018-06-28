package com.catic.test.prepexpress.pages.home.dialogs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class CreateNewFileFromFileDialogImpl extends WidgetObjectImpl implements CreateNewFileFromFileDialog {	
	@FindBy(id = "tbFileName")
	private WebElementFacade fileNameInput;
	
	@FindBy(id = "fileNameError")
	private WebElementFacade fileNameErrorMessage;
	
	@FindBy(id = "tbAgentFileNumber")
	private WebElementFacade fileNumberInput;
	
	@FindBy(id = "fileNumberError")
	private WebElementFacade fileNumberErrorMessage;
	
	@FindBy(id = "tbTitleNumber")
	private WebElementFacade titleNumberInput;
	
	@FindBy(id = "btnFileNameOk")
	private WebElementFacade okButton;
	
	@FindBy(id = "btnFileNameClear")
	private WebElementFacade clearButton;
	
	@FindBy(id = "btnNewFileCancel")
	private WebElementFacade cancelButton;
	
	public CreateNewFileFromFileDialogImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public CreateNewFileFromFileDialogImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public CreateNewFileFromFileDialog enterFileName(String fileName) {
		fileNameInput.type(fileName);
		return this;
	}

	@Override
	public String getFileName() {
		return fileNameInput.getText();
	}

	@Override
	public CreateNewFileFromFileDialog enterFileNumber(String fileNumber) {
		fileNumberInput.type(fileNumber);
		return this;
	}

	@Override
	public String getFileNumber() {
		return fileNumberInput.getText();
	}

	@Override
	public CreateNewFileFromFileDialog enterTitleNumber(String titleNumber) {
		titleNumberInput.type(titleNumber);
		return this;
	}

	@Override
	public String getTitleNumber() {
		return titleNumberInput.getText();
	}

	@Override
	public CreateNewFileFromFileDialog enter(String fileName, String fileNumber, String titleNumber) {
		enterFileName(fileName);
		enterFileNumber(fileNumber);
		enterTitleNumber(titleNumber);
		return this;
	}

	@Override
	public void clickOk() {
		okButton.click();
	}

	@Override
	public CreateNewFileFromFileDialog clickClear() {
		clearButton.click();
		return this;
	}

	@Override
	public void clickCancel() {
		cancelButton.click();
	}

	@Override
	public String getFileNameErrorMessage() {
		return fileNameErrorMessage.isVisible() ? fileNameErrorMessage.getText() : "";
	}

	@Override
	public String getFileNumberErrorMessage() {
		return fileNumberErrorMessage.isVisible() ? fileNumberErrorMessage.getText() : "";
	}
}
