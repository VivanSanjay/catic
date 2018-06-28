package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

import com.catic.test.prepexpress.AjaxLoader;
import com.catic.test.prepexpress.pages.createnewfile.AdjustmentSheetPage;
import com.catic.test.prepexpress.pages.createnewfile.AltaSettlementStatementPage;
import com.catic.test.prepexpress.pages.createnewfile.ClosingDisclosurePage2;
import com.catic.test.prepexpress.pages.createnewfile.DisbursementsPage;
import com.catic.test.prepexpress.pages.createnewfile.Form1099SPage;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;
import com.catic.test.prepexpress.pages.createnewfile.HUDPage;
import com.catic.test.prepexpress.pages.createnewfile.ManageDocumentsPage;
import com.catic.test.prepexpress.pages.createnewfile.PolicyOtherDocumentsPage;
import com.catic.test.prepexpress.pages.home.HomePage;

import net.serenitybdd.core.pages.PageObject;

public class GenericCreateNewFileNavBarFragment {
	private static final By MENU_ACTIONS = By.xpath(".//li[@class='dropdown' and contains(., 'Actions')]");
	private static final By ITEM_GEN_INFO = By.linkText("General Info");
	private static final By ITEM_CD = By.linkText("Closing Disclosure");
	private static final By ITEM_HUD = By.linkText("HUD");
	private static final By ITEM_POLICY_OTHER_DOCS = By.linkText("Policy/Other Documents");
	private static final By ITEM_DISBURSEMENTS = By.linkText("Disbursements");
	private static final By ITEM_ADJUST_SHEET = By.linkText("Adjustment Sheet");
	private static final By ITEM_ALTA = By.linkText("ALTA Settlement Statement");
	private static final By ITEM_CPL = By.linkText("CPL Create/Revise");
	private static final By ITEM_1099S = By.linkText("1099-S");
	private static final By ITEM_MANAGE_DOCS = By.linkText("Manage Documents");
	private static final By ITEM_PREM_CALC = By.linkText("Premium Calculator");
	private static final By ITEM_DOWNLOAD_PRINT = By.linkText("Download/Print");
	private static final By ITEM_CLOSE_FILE = By.linkText("Close File");
	
	private static final By MENU_CLOSE_FILE = By.id("SaveAndCloseItem");
	
	private NavBarHelper helper;
	
	private GenericCreateNewFileNavBarFragment(NavBarHelper helper) {
		this.helper = helper;
	}
	
	public ActionsMenu actions() {
		return new ActionsMenu();
	}
	
	public HomePage closeFile() {
		helper.selectMenuItem(MENU_CLOSE_FILE);
		return helper.getPage().switchToPage(HomePage.class);
	}
	
	public static GenericCreateNewFileNavBarFragment from(PageObject page) {
		NavBarHelper helper = new NavBarHelper(page);
		return new GenericCreateNewFileNavBarFragment(helper);
	}
	
	public class ActionsMenu {
		public GenInfoPage generalInfo() {
			return selectItem(ITEM_GEN_INFO, GenInfoPage.class);
		}
		
		public ClosingDisclosurePage2 closingDisclosure() {
			return selectItem(ITEM_CD, ClosingDisclosurePage2.class);
		}
		
		public HUDPage hud() {
			return selectItem(ITEM_HUD, HUDPage.class);
		}
		
		public PolicyOtherDocumentsPage policyOtherDocuments() {
			return selectItem(ITEM_POLICY_OTHER_DOCS, PolicyOtherDocumentsPage.class);
		}
		
		public DisbursementsPage disbursements() {
			return selectItem(ITEM_DISBURSEMENTS, DisbursementsPage.class);
		}
		
		public AdjustmentSheetPage adjustmentSheet() {
			return selectItem(ITEM_ADJUST_SHEET, AdjustmentSheetPage.class);
		}
		
		public AltaSettlementStatementPage altaSettlementStatement() {
			return selectItem(ITEM_ALTA, AltaSettlementStatementPage.class);
		}
		
		public void cplCreateRevise() {
			selectItem(ITEM_CPL);
		}
		
		public Form1099SPage form1099s() {
			return selectItem(ITEM_1099S, Form1099SPage.class);
		}
		
		public ManageDocumentsPage manageDocuments() {
			return selectItem(ITEM_MANAGE_DOCS, ManageDocumentsPage.class);
		}
		
		public void premiumCalculator() {
			selectItem(ITEM_PREM_CALC);
		}
		
		public void downloadPrint() {
			selectItem(ITEM_DOWNLOAD_PRINT);
		}
		
		public HomePage closeFile() {
			selectItem(ITEM_CLOSE_FILE);
			return helper.getPage().switchToPage(HomePage.class);
		}
		
		private <T extends PageObject> T selectItem(By dropdownMenuItem, Class<T> pageObjectClass) {
			selectItem(dropdownMenuItem);
			T page = helper.getPage().switchToPage(pageObjectClass);
			AjaxLoader.waitForAjaxLoaderToDisappearOn(page);
			return page;
		}
		
		private void selectItem(By dropdownMenuItem) {
			helper.selectDropdownMenuItem(MENU_ACTIONS, dropdownMenuItem);
		}
	}
}
