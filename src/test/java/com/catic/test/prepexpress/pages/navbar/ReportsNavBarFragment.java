package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class ReportsNavBarFragment {
	private static final By MENU_REPORTS = By.xpath(".//li[@class='dropdown' and contains(., 'Reports')]");
	private static final By ITEM_JACKET_HIST = By.linkText("Jacket History");
	private static final By ITEM_ICL_HIST = By.linkText("ICL History");
	private static final By ITEM_BORROWER_LIST = By.linkText("Borrower List");
	private static final By ITEM_CLOSINGS = By.linkText("Closings By Lender");
	private static final By ITEM_1099S_LIST = By.linkText("1099-S Filing List");
	private static final By ITEM_LENDER_LIST = By.linkText("Lender List");
	
	private NavBarHelper helper;
	
	private ReportsNavBarFragment(NavBarHelper helper) {
		this.helper = helper;
	}
	
	public void jacketHistory() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_JACKET_HIST);
	}
	
	public void iclHistory() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_ICL_HIST);
	}
	
	public void borrowerList() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_BORROWER_LIST);
	}
	
	public void closingsByLender() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_CLOSINGS);
	}
	
	public void form1099SFilingList() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_1099S_LIST);
	}
	
	public void lenderList() {
		helper.selectDropdownMenuItem(MENU_REPORTS, ITEM_LENDER_LIST);
	}
	
	public static ReportsNavBarFragment from(PageObject page) {
		NavBarHelper helper = new NavBarHelper(page);
		return new ReportsNavBarFragment(helper);
	}
}
