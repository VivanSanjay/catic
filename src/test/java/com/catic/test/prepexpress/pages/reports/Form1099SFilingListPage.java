package com.catic.test.prepexpress.pages.reports;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;
import com.catic.test.prepexpress.pages.navbar.ReportsNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.ReturnNavBarFragment;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(DefaultUrls.FILING_LIST_1099S)
public class Form1099SFilingListPage extends PageObject {
	public HomePage returnToHome() {
		return returnNavigationBar().returnToHome();
	}
	
	private ReturnNavBarFragment returnNavigationBar() {
		return ReturnNavBarFragment.from(this);
	}
	
	public ReportsNavBarFragment reports() {
		return ReportsNavBarFragment.from(this);
	}
}
