package com.catic.test.prepexpress.pages.common;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.CaticExpectedConditions;

/**
 * Utility class to represent a collapsible section in the CD/HUD screens
 */
public class CollapsibleSection {
	private static final String OPENED = "icon-chevron-up";
	private static final String CLOSED = "icon-chevron-down";
	
	private final WebElementFacade collapsibleSection;
	
	public CollapsibleSection(final WebElementFacade element) {
		this.collapsibleSection = element;
	}
	
	public CollapsibleSection(final PageObject page, final By locator) {
		this.collapsibleSection = page.element(locator);
	}
	
	public void openSection() {
		if (isClosed()) {
			collapsibleSection.click();
		}
		waitForSectionToBe(OPENED);
	}
	
	public void closeSection() {
		if (isOpened()) {
			collapsibleSection.click();
		}
		waitForSectionToBe(CLOSED);
	}
	
	private boolean isOpened() {
		return collapsibleSection.hasClass(OPENED);
	}
	
	private boolean isClosed() {
		return collapsibleSection.hasClass(CLOSED);
	}
	
	private void waitForSectionToBe(String state) {
		collapsibleSection.waitForCondition().until(CaticExpectedConditions.elementHasClasses(collapsibleSection, state));
	}
}
