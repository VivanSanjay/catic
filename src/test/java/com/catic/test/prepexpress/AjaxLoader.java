package com.catic.test.prepexpress;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.CaticExpectedConditions;
import util.DocumentReadyState;

public class AjaxLoader {
	private static final By AJAX_LOADER = By.id("ajaxLoader");
	private static final By MODAL_BACKDROP = By.xpath("//div[contains(@class, 'modal-backdrop')]");
	
	private AjaxLoader() {}
	
	/**
	 * Waits for the loading bar to disappear for the given timeout and time unit
	 * @param page the page the loading bar appears on
	 * @param waitForTimeout
	 * @param waitForTimeUnit
	 */
	public static void waitForAjaxLoaderToDisappearOn(PageObject page, long waitForTimeout, TimeUnit waitForTimeUnit) {
		WebElementFacade loader = page.element(AJAX_LOADER).withTimeoutOf((int) waitForTimeout, waitForTimeUnit);
		WebElementFacade backdrop = page.element(MODAL_BACKDROP).withTimeoutOf((int) waitForTimeout, waitForTimeUnit);
		
		page.waitFor(CaticExpectedConditions.pageHasReadyState(DocumentReadyState.COMPLETE));
		
		if (loader.isVisible() || backdrop.isVisible()) {
			loader.waitUntilNotVisible();
			backdrop.waitUntilNotVisible();
		}
		
		page.waitFor(1).seconds();
	}
	
	/**
	 * Waits for the loading bar to disappear using a default timeout of 30 seconds
	 * @param page
	 */
	public static void waitForAjaxLoaderToDisappearOn(PageObject page) {
		waitForAjaxLoaderToDisappearOn(page, 30, TimeUnit.SECONDS);
	}
}
