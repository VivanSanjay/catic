package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

import com.catic.test.prepexpress.pages.home.HomePage;

import net.serenitybdd.core.pages.PageObject;

public class ReturnNavBarFragment {
	private static final By RETURN_LINK = By.linkText("Return");
	
	private NavBarHelper helper;
	
	private ReturnNavBarFragment(NavBarHelper helper) {
		this.helper = helper;
	}
	
	public HomePage returnToHome() {
		helper.selectMenuItem(RETURN_LINK);
		return helper.getPage().switchToPage(HomePage.class);
	}
	
	public static ReturnNavBarFragment from(PageObject page) {
		NavBarHelper helper = new NavBarHelper(page);
		return new ReturnNavBarFragment(helper);
	}
}
