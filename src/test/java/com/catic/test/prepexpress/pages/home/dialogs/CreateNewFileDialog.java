package com.catic.test.prepexpress.pages.home.dialogs;

import org.openqa.selenium.By;

import com.catic.test.prepexpress.model.DisclosureType;
import com.catic.test.prepexpress.model.FileDetails;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(CreateNewFileDialogImpl.class)
public interface CreateNewFileDialog extends WidgetObject {
	
	/**
	 * Enters the given value into the 'File Name' input field
	 * @param fileName
	 * @return this object
	 */
	CreateNewFileDialog enterFileName(String fileName);
	
	/**
	 * Returns the currently displayed text in the 'File Name' input field
	 * @return the text from the input field
	 */
	String getFileName();
	
	/**
	 * Enters the given value into the 'File Number' input field
	 * @param fileNumber
	 * @return this object
	 */
	CreateNewFileDialog enterFileNumber(String fileNumber);
	
	/**
	 * Returns the currently displayed text in the 'File Number' input field
	 * @return the text from the input field
	 */
	String getFileNumber();
	
	/**
	 * Enters the given value into the 'Title Number' input field
	 * @param titleNumber
	 * @return this object
	 */
	CreateNewFileDialog enterTitleNumber(String titleNumber);
	
	/**
	 * Returns the currently displayed text in the 'Title Number' input field
	 * @return the text from the input field
	 */
	String getTitleNumber();
	
	/**
	 * Selects a value from the 'Disclosure Type' dropdown
	 * @param disclosureType
	 * @return this object
	 */
	CreateNewFileDialog selectDisclosureType(DisclosureType disclosureType);
	
	/**
	 * Returns the text for the currently selected item in the 'Disclosure Type' field
	 * @return the text from the currently selected item
	 */
	DisclosureType getDisclosureType();
	
	/**
	 * Enters all given values into the 'File Name', 'File Number', 'Title Number', and 'Disclosure Type' 
	 * input fields
	 * @param fileName
	 * @param fileNumber
	 * @param titleNumber
	 * @param disclosureType
	 * @return this object
	 */
	CreateNewFileDialog enter(String fileName, String fileNumber, String titleNumber, DisclosureType disclosureType);
	
	/**
	 * Enters all given values into the 'File Name', 'File Number', 'Title Number', and 'Disclosure Type' input fields
	 * @param file
	 * @return this object
	 */
	CreateNewFileDialog enter(FileDetails file);
	
	/**
	 * Clicks the 'OK' button
	 */
	void clickOk();
	
	/**
	 * Clicks the 'Clear' button
	 * @return this object
	 */
	CreateNewFileDialog clickClear();
	
	/**
	 * Clicks the 'Cancel' button
	 */
	void clickCancel();
	
	/**
	 * Returns the currently displayed 'File Name' error message, or an empty string if there is no error message
	 * @return the error message, or an empty string
	 */
	String getFileNameErrorMessage();
	
	/**
	 * Returns the currently displayed 'File Number' error message, or an empty string if there is no error message
	 * @return the error message, or an empty string
	 */
	String getFileNumberErrorMessage();

	/**
	 * Inputs all information, then submits it
	 * @param file
	 * @return an instance of a {@link GenInfoPage}
	 */
	GenInfoPage createNewFile(FileDetails file);
	
	/**
	 * Creates a new instance of the class that implements this widget
	 * @param page the {@link PageObject} this widget belongs to
	 * @return the widget
	 */
	public static CreateNewFileDialog newInstance(PageObject page) {
		WebElementFacade dialogElement = page.find(By.id("createNewFileModal"));
		CreateNewFileDialog dialog = new CreateNewFileDialogImpl(page, null, dialogElement, dialogElement.getImplicitTimeoutInMilliseconds());
		return dialog;
	}
}
