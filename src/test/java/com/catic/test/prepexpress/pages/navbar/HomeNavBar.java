package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;


public class HomeNavBar {
	private static final By MENU_CREATE_NEW_FILE = By.id("createNewFileMenuItem");
	
	private static final By MENU_IMPORT = By.xpath(".//li[@class='dropdown' and contains(., 'Import')]");
	private static final By ITEM_TITLE_SEARCH = By.id("titleSearchImportButton");
	
	private static final By MENU_TOOLS = By.xpath(".//li[@class='dropdown' and contains(., 'Tools')]");
	private static final By ITEM_BLANK_DOCS = By.linkText("Blank Documents");
	private static final By ITEM_LENDER_MAINT = By.linkText("Lender Maintenance");
	private static final By ITEM_CONTACT_MAINT = By.linkText("Contact Maintenance");
	private static final By ITEM_PHRASE_MAINT = By.linkText("Phrase Code Maintenance");
	private static final By ITEM_PREFS = By.linkText("Preferences");
	
	private static final By MENU_REPORTS = By.xpath(".//li[@class='dropdown' and contains(., 'Reports')]");
	private static final By ITEM_JACKET_HIST = By.linkText("Jacket History");
	private static final By ITEM_ICL_HIST = By.linkText("ICL History");
	private static final By ITEM_BORROWER_LIST = By.linkText("Borrower List");
	private static final By ITEM_CLOSINGS = By.linkText("Closings By Lender");
	private static final By ITEM_1099S_LIST = By.linkText("1099-S Filing List");
	private static final By ITEM_LENDER_LIST = By.linkText("Lender List");
	
	private static final By MENU_LOGOFF = By.id("menuLogOff");
	
	private NavBarHelper helper;
	
	private HomeNavBar(NavBarHelper helper) {
		this.helper = helper;
	}
	
	public void createNewFile() {
		helper.selectMenuItem(MENU_CREATE_NEW_FILE);
	}
	
	public void titleSearch() {
		helper.selectDropdownMenuItem(MENU_IMPORT, ITEM_TITLE_SEARCH);
	}
	
	public void blankDocuments() {
		helper.selectDropdownMenuItem(MENU_TOOLS, ITEM_BLANK_DOCS);
	}
	
	public void lenderMaintenance() {
		helper.selectDropdownMenuItem(MENU_TOOLS, ITEM_LENDER_MAINT);
	}
	
	public void contactMaintenance() {
		helper.selectDropdownMenuItem(MENU_TOOLS, ITEM_CONTACT_MAINT);
	}
	
	public void phraseCodeMaintenance() {
		helper.selectDropdownMenuItem(MENU_TOOLS, ITEM_PHRASE_MAINT);
	}
	
	public void preferences() {
		helper.selectDropdownMenuItem(MENU_TOOLS, ITEM_PREFS);
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
	
	public void logOff() {
		helper.selectMenuItem(MENU_LOGOFF);
	}
	
	public static HomeNavBar from(PageObject page) {
		NavBarHelper helper = new NavBarHelper(page);
		return new HomeNavBar(helper);
	}
}
