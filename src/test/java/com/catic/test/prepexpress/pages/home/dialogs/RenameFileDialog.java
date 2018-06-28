package com.catic.test.prepexpress.pages.home.dialogs;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(RenameFileDialogImpl.class)
public interface RenameFileDialog extends WidgetObject {
	/**
	 * Enters the given value into the 'File Name' input field
	 * @param fileName
	 * @return this object
	 */
	RenameFileDialog enterFileName(String fileName);
	
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
	RenameFileDialog enterFileNumber(String fileNumber);
	
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
	RenameFileDialog enterTitleNumber(String titleNumber);
	
	/**
	 * Returns the currently displayed text in the 'Title Number' input field
	 * @return the text from the input field
	 */
	String getTitleNumber();
	
	/**
	 * Enters all given values into the 'File Name', 'File Number', and 'Title Number' input fields
	 * @param fileName
	 * @param fileNumber
	 * @param titleNumber
	 * @return this object
	 */
	RenameFileDialog enter(String fileName, String fileNumber, String titleNumber);
	
	/**
	 * Clicks the 'OK' button
	 */
	void clickOk();
	
	/**
	 * Clicks the 'Clear' button
	 * @return this object
	 */
	RenameFileDialog clickClear();
	
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
	 * Creates a new instance of the class that implements this widget
	 * @param page the {@link PageObject} this widget belongs to
	 * @return the widget
	 */
	public static RenameFileDialog newInstance(PageObject page) {
		WebElementFacade dialogElement = page.find(By.id("createNewFileModal"));
		RenameFileDialog dialog = new RenameFileDialogImpl(page, null, dialogElement, dialogElement.getImplicitTimeoutInMilliseconds());
		return dialog;
	}
}
