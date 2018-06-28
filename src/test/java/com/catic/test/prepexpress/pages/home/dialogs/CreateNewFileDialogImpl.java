package com.catic.test.prepexpress.pages.home.dialogs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;
import com.catic.test.prepexpress.model.DisclosureType;
import com.catic.test.prepexpress.model.FileDetails;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class CreateNewFileDialogImpl extends WidgetObjectImpl implements CreateNewFileDialog {
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
	
	@FindBy(id = "listDisclosureType")
	private WebElementFacade disclosureTypeSelect;
	
	@FindBy(id = "btnFileNameOk")
	private WebElementFacade okButton;
	
	@FindBy(id = "btnFileNameClear")
	private WebElementFacade clearButton;
	
	@FindBy(id = "btnNewFileCancel")
	private WebElementFacade cancelButton;
	
	@FindBy(id = "createFileBusy")
	private WebElementFacade createFileBusyIndicator;
	
	public CreateNewFileDialogImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public CreateNewFileDialogImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public CreateNewFileDialog enterFileName(String fileName) {
		fileNameInput.type(fileName);
		return this;
	}

	@Override
	public String getFileName() {
		return fileNameInput.getText();
	}

	@Override
	public CreateNewFileDialog enterFileNumber(String fileNumber) {
		fileNumberInput.type(fileNumber);
		return this;
	}

	@Override
	public String getFileNumber() {
		return fileNumberInput.getText();
	}

	@Override
	public CreateNewFileDialog enterTitleNumber(String titleNumber) {
		titleNumberInput.type(titleNumber);
		return this;
	}

	@Override
	public String getTitleNumber() {
		return titleNumberInput.getText();
	}

	@Override
	public CreateNewFileDialog selectDisclosureType(DisclosureType disclosureType) {
		String itemToSelect;
		
		if (disclosureType == DisclosureType.CD) {
			itemToSelect = "Closing Disclosure";
		}
		else {
			itemToSelect = "HUD";
		}
		
		disclosureTypeSelect.selectByVisibleText(itemToSelect);
		
		return this;
	}
	
	@Override
	public DisclosureType getDisclosureType() {
		return DisclosureType.fromString(disclosureTypeSelect.getSelectedVisibleTextValue());
	}
	
	@Override
	public CreateNewFileDialog enter(String fileName, String fileNumber, String titleNumber, DisclosureType disclosureType) {
		enterFileName(fileName);
		enterFileNumber(fileNumber);
		enterTitleNumber(titleNumber);
		selectDisclosureType(disclosureType);
		return this;
	}

	@Override
	public CreateNewFileDialog enter(FileDetails file) {
		return enter(file.getFileName(), file.getFileNumber(), file.getTitleNumber(), file.getDisclosureType());
	}
	
	@Override
	public GenInfoPage createNewFile(FileDetails file) {
		enter(file).clickOk();
		if (createFileBusyIndicator.isVisible()) {
			createFileBusyIndicator.waitUntilNotVisible();
		}
		
		GenInfoPage page = getPage().switchToPage(GenInfoPage.class);
		AjaxLoader.waitForAjaxLoaderToDisappearOn(page);
		
		return page;
	}
	
	@Override
	public void clickOk() {
		okButton.click();
	}

	@Override
	public CreateNewFileDialog clickClear() {
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
