package com.catic.test.prepexpress.pages.home.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import com.catic.test.prepexpress.AjaxLoader;
import com.catic.test.prepexpress.pages.createnewfile.AdjustmentSheetPage;
import com.catic.test.prepexpress.pages.createnewfile.AltaSettlementStatementPage;
import com.catic.test.prepexpress.pages.createnewfile.DisbursementsPage;
import com.catic.test.prepexpress.pages.createnewfile.Form1099SPage;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;
import com.catic.test.prepexpress.pages.createnewfile.ManageDocumentsPage;
import com.catic.test.prepexpress.pages.createnewfile.PolicyOtherDocumentsPage;
import com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2.ClosingDisclosurePage2;
import com.catic.test.prepexpress.pages.createnewfile.hud.HUDPage;
import com.catic.test.prepexpress.pages.home.dialogs.CreateNewFileFromFileDialog;
import com.catic.test.prepexpress.pages.home.dialogs.RenameFileDialog;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class FileTableActionMenuImpl extends WidgetObjectImpl implements FileTableActionMenu {
	@FindBy(className = "modifyFileName")
	private WebElementFacade renameThisFileLink;
	
	@FindBy(className = "activateFile")
	private WebElementFacade makeFileActiveLink;
	
	@FindBy(className = "inactivateFile")
	private WebElementFacade makeFileInactiveLink;
	
	@FindBy(className = "createFileFromFile")
	private WebElementFacade createNewFileFromThisFileLink;
		
	private static final By OPEN_FILE_AND_GO_TO = By.className("dropdown-submenu");
	private static final By OPEN_FILE_AND_GO_TO_SUBMENU = By.className("dropdown-menu");
	
	public FileTableActionMenuImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public FileTableActionMenuImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public GenInfoPage openFileAndGoToGenInfo() {
		return openFileAndGoTo(By.linkText("GenInfo"), GenInfoPage.class);
	}

	@Override
	public HUDPage openFileAndGoToHUD() {
		return openFileAndGoTo(By.linkText("HUD"), HUDPage.class);
	}

	@Override
	public ClosingDisclosurePage2 openFileAndGoToClosingDisclosure() {
		return openFileAndGoTo(By.linkText("Closing Disclosure"), ClosingDisclosurePage2.class);
	}

	@Override
	public DisbursementsPage openFileAndGoToDisbursements() {
		return openFileAndGoTo(By.linkText("Disbursements"), DisbursementsPage.class);
	}

	@Override
	public PolicyOtherDocumentsPage openFileAndGoToPolicyOtherDocuments() {
		return openFileAndGoTo(By.linkText("Policy/Other Documents"), PolicyOtherDocumentsPage.class);
	}

	@Override
	public AdjustmentSheetPage openFileAndGoToAdjustmentSheet() {
		return openFileAndGoTo(By.linkText("Adjustment Sheet"), AdjustmentSheetPage.class);
	}

	@Override
	public AltaSettlementStatementPage openFileAndGoToAltaSettlementStatement() {
		return openFileAndGoTo(By.linkText("ALTA Settlement Statement"), AltaSettlementStatementPage.class);
	}

	@Override
	public Form1099SPage openFileAndGoTo1099S() {
		return openFileAndGoTo(By.linkText("1099-S"), Form1099SPage.class);
	}

	@Override
	public ManageDocumentsPage openFileAndGoToManageDocuments() {
		return openFileAndGoTo(By.linkText("Manage Documents"), ManageDocumentsPage.class);
	}

	@Override
	public RenameFileDialog renameThisFile() {
		renameThisFileLink.click();
		
		RenameFileDialog dialog = RenameFileDialog.newInstance(getPage());
		dialog.waitUntilVisible();
		
		return dialog;
	}

	@Override
	public void makeFileActive() {
		makeFileActiveLink.click();
	}

	@Override
	public void makeFileInactive() {
		makeFileInactiveLink.click();
	}

	@Override
	public CreateNewFileFromFileDialog createNewFileFromThisFile() {
		createNewFileFromThisFileLink.click();
		
		CreateNewFileFromFileDialog dialog = CreateNewFileFromFileDialog.newInstance(getPage());
		dialog.waitUntilVisible();
		
		return dialog;
	}
		
	/**
	 * Hovers over the 'Open File And Go To' menu item, waits for the submenu to appear, then 
	 * clicks the correct item
	 * @param menuItemName
	 * @param pageObjectClass
	 * @return the page object of the given class
	 */
	private <T extends PageObject> T openFileAndGoTo(By menuItemName, Class<T> pageObjectClass) {
		WebElementFacade openFileAndGoTo = this.find(OPEN_FILE_AND_GO_TO);
		getPage().withAction().moveToElement(openFileAndGoTo).perform();
		
		WebElementFacade submenu = this.find(OPEN_FILE_AND_GO_TO_SUBMENU);
		submenu.waitUntilVisible();
		
		WebElementFacade menuItem = submenu.find(menuItemName);
		menuItem.click();
		
		T page = getPage().switchToPage(pageObjectClass);
		AjaxLoader.waitForAjaxLoaderToDisappearOn(page);
		
		return page;
	}
}
