package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class AdjustmentSheetTableRowImpl extends WidgetObjectImpl implements AdjustmentSheetTableRow {

	public AdjustmentSheetTableRowImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public AdjustmentSheetTableRowImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	
}
