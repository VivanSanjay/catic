package com.catic.test.prepexpress.pages.tools;

import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;

import net.serenitybdd.core.pages.PageObject;

public class GenericToolsPage extends PageObject {
	public HomePage returnToHome() {
		return returnNavigationBar().returnToHome();
	}
	
	private ReturnNavBarFragment returnNavigationBar() {
		return ReturnNavBarFragment.from(this);
	}
}
