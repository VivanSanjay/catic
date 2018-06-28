package com.catic.test.prepexpress.pages.createnewfile.dialogs;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(ConfirmDialogImpl.class)
public interface ConfirmDialog extends WidgetObject {
	/**
	 * Clicks the OK button.
	 */
	void ok();
	
	/**
	 * Clicks the Cancel button.
	 */
	void cancel();
	
	/**
	 * Returns the message text.
	 * @return the message text
	 */
	String getMessage();
	
	/**
	 * Returns the dialog title text.
	 * @return the title text
	 */
	String getTitle();
	
	/**
	 * Creates a new instance of the class that implements this widget
	 * @param page the {@link PageObject} this widget belongs to
	 * @return the widget
	 */
	public static ConfirmDialog newInstance(PageObject page) {
		WebElementFacade dialogElement = page.find(By.id("dialogConfirm"));
		ConfirmDialog dialog = new ConfirmDialogImpl(page, null, dialogElement, dialogElement.getImplicitTimeoutInMilliseconds());
		return dialog;
	}
}
