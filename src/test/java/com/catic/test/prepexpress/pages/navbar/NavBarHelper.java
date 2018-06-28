package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

final class NavBarHelper {
	private static final By NAVBAR_LOCATOR = By.id("navbarCatic");
	
	private final PageObject page;
	
	public NavBarHelper(PageObject page) {
		this.page = page;
	}
	
	protected void selectDropdownMenuItem(By menuItem, By dropdownMenuItem) {
		WebElementFacade navbar = navbar();
		navbar.find(menuItem).click();
		navbar.find(dropdownMenuItem).click();
	}
	
	protected void selectMenuItem(By menuItem) {
		navbar().find(menuItem).click();
	}
	
	protected PageObject getPage() {
		return page;
	}
	
	private WebElementFacade navbar() {
		return page.find(NAVBAR_LOCATOR);
	}
}
