package com.catic.test.prepexpress.pages.home;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.LoginPage;
import com.catic.test.prepexpress.pages.TitleSearchImportPage;
import com.catic.test.prepexpress.pages.home.dialogs.CreateNewFileDialog;
import com.catic.test.prepexpress.pages.home.dialogs.CreateNewFileFromFileDialog;
import com.catic.test.prepexpress.pages.home.dialogs.RenameFileDialog;
import com.catic.test.prepexpress.pages.home.table.FileTableWidget;
import com.catic.test.prepexpress.pages.navbar.HomeNavBar;
import com.catic.test.prepexpress.pages.reports.BorrowerListPage;
import com.catic.test.prepexpress.pages.reports.ClosingsByLenderPage;
import com.catic.test.prepexpress.pages.reports.Form1099SFilingListPage;
import com.catic.test.prepexpress.pages.reports.ICLHistoryPage;
import com.catic.test.prepexpress.pages.reports.JacketHistoryPage;
import com.catic.test.prepexpress.pages.reports.LenderListPage;
import com.catic.test.prepexpress.pages.tools.BlankDocumentsPage;
import com.catic.test.prepexpress.pages.tools.ContactMaintenancePage;
import com.catic.test.prepexpress.pages.tools.LenderMaintenancePage;
import com.catic.test.prepexpress.pages.tools.PhraseCodeMaintenancePage;
import com.catic.test.prepexpress.pages.tools.PreferencesPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(DefaultUrls.HOME)
public class HomePage extends PageObject {			
	// agent/branch selection
	@FindBy(id = "branches")
	private WebElementFacade branchDropdown;
	
	// file column customization
	@FindBy(id = "fileColumnDropdown")
	private WebElementFacade fileColumnDropdown;
	
	// file table and filter options
	@FindBy(id = "fileTable")
	private FileTableWidget fileTable;
		
	// menu items
	public CreateNewFileDialog createNewFile() {
		navbar().createNewFile();
		
		CreateNewFileDialog dialog = createNewFileDialog();
		dialog.waitUntilVisible();
				
		return dialog;
	}
	
	public TitleSearchImportPage titleSearch() {
		navbar().titleSearch();
		return switchToPage(TitleSearchImportPage.class);
	}
	
	public BlankDocumentsPage blankDocuments() {
		navbar().blankDocuments();
		return switchToPage(BlankDocumentsPage.class);
	}
	
	public LenderMaintenancePage lenderMaintenance() {
		navbar().lenderMaintenance();
		return switchToPage(LenderMaintenancePage.class);
	}
	
	public ContactMaintenancePage contactMaintenance() {
		navbar().contactMaintenance();
		return switchToPage(ContactMaintenancePage.class);
	}
	
	public PhraseCodeMaintenancePage phraseCodeMaintenance() {
		navbar().phraseCodeMaintenance();
		return switchToPage(PhraseCodeMaintenancePage.class);
	}
	
	public PreferencesPage preferences() {
		navbar().preferences();
		return switchToPage(PreferencesPage.class);
	}
	
	public JacketHistoryPage jacketHistory() {
		navbar().jacketHistory();
		return switchToPage(JacketHistoryPage.class);
	}
	
	public ICLHistoryPage iclHistory() {
		navbar().iclHistory();
		return switchToPage(ICLHistoryPage.class);
	}
	
	public BorrowerListPage borrowerList() {
		navbar().borrowerList();
		return switchToPage(BorrowerListPage.class);
	}
	
	public ClosingsByLenderPage closingsByLender() {
		navbar().closingsByLender();
		return switchToPage(ClosingsByLenderPage.class);
	}
	
	public Form1099SFilingListPage form1099SFilingList() {
		navbar().form1099SFilingList();
		return switchToPage(Form1099SFilingListPage.class);
	}
	
	public LenderListPage lenderList() {
		navbar().lenderList();
		return switchToPage(LenderListPage.class);
	}
	
	/**
	 * Returns the {@link FileTableWidget} displayed on this page
	 * @return the file table widget
	 */
	public FileTableWidget fileTable() {
		return fileTable;
	}
	
	/**
	 * Logs out from the application
	 * @return the login page
	 */
	public LoginPage logOut() {
		navbar().logOff();
		return switchToPage(LoginPage.class);
	}
	
	public CreateNewFileDialog createNewFileDialog() {
		return CreateNewFileDialog.newInstance(this);
	}
	
	public RenameFileDialog renameFileDialog() {
		return RenameFileDialog.newInstance(this);
	}
	
	public CreateNewFileFromFileDialog createNewFileFromDialog() {
		return CreateNewFileFromFileDialog.newInstance(this);
	}
	
	private HomeNavBar navbar() {
		return HomeNavBar.from(this);
	}
}
