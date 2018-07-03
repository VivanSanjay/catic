package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObject;

public interface PaidByDropdown extends WidgetObject {
	void select(PaidBy other);
	
	boolean isSelected(PaidBy other);
	
	static enum PaidBy {
		UNKNOWN, LENDER, BROKER, INVESTOR
	}
	
	/**
	 * Clicks the given button on the given page and returns the dropdown menu
	 * @param page
	 * @param buttonLocator
	 * @return the dropdown menu
	 */
	static PaidByDropdown open(PageObject page, By buttonLocator) {
		WebElementFacade button = page.element(buttonLocator);
		return open(page, button);
	}
	
	/**
	 * Clicks the given button on the given page and returns the dropdown menu
	 * @param page
	 * @param button
	 * @return the dropdown menu
	 */
	static PaidByDropdown open(PageObject page, WebElementFacade button) {
		button.click();
		WebElementFacade dropdown = page.element(By.id("paidByDropDownContainer"));
		dropdown.waitUntilVisible();
		return new PaidByDropdownImpl(page, null, dropdown, dropdown.getImplicitTimeoutInMilliseconds());
	}
}
