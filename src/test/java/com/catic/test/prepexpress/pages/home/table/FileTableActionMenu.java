package com.catic.test.prepexpress.pages.home.table;

import com.catic.test.prepexpress.pages.createnewfile.AdjustmentSheetPage;
import com.catic.test.prepexpress.pages.createnewfile.AltaSettlementStatementPage;
import com.catic.test.prepexpress.pages.createnewfile.DisbursementsPage;
import com.catic.test.prepexpress.pages.createnewfile.Form1099SPage;
import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;
import com.catic.test.prepexpress.pages.createnewfile.HUDPage;
import com.catic.test.prepexpress.pages.createnewfile.ManageDocumentsPage;
import com.catic.test.prepexpress.pages.createnewfile.PolicyOtherDocumentsPage;
import com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2.ClosingDisclosurePage2;
import com.catic.test.prepexpress.pages.home.dialogs.CreateNewFileFromFileDialog;
import com.catic.test.prepexpress.pages.home.dialogs.RenameFileDialog;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FileTableActionMenuImpl.class)
public interface FileTableActionMenu extends WidgetObject {
	/**
	 * Navigates to 'Open File And Go To > GenInfo' in the menu
	 * @return a {@link GenInfoPage}
	 */
	GenInfoPage openFileAndGoToGenInfo();
	
	/**
	 * Navigates to 'Open File And Go To > HUD' in the menu
	 * @return a {@link HUDPage}
	 */
	HUDPage openFileAndGoToHUD();
	
	/**
	 * Navigates to 'Open File And Go To > Closing Disclosure' in the menu
	 * @return a {@link ClosingDisclosurePage2}
	 */
	ClosingDisclosurePage2 openFileAndGoToClosingDisclosure();
	
	/**
	 * Navigates to 'Open File And Go To > Disbursements' in the menu
	 * @return a {@link DisbursementsPage}
	 */
	DisbursementsPage openFileAndGoToDisbursements();
	
	/**
	 * Navigates to 'Open File And Go To > Policy/Other Documents' in the menu
	 * @return a {@link PolicyOtherDocumentsPage}
	 */
	PolicyOtherDocumentsPage openFileAndGoToPolicyOtherDocuments();
	
	/**
	 * Navigates to 'Open File And Go To > Adjustment Sheet' in the menu
	 * @return a {@link AdjustmentSheetPage}
	 */
	AdjustmentSheetPage openFileAndGoToAdjustmentSheet();
	
	/**
	 * Navigates to 'Open File And Go To > ALTA Settlement Statement' in the menu
	 * @return a {@link AltaSettlementStatementPage}
	 */
	AltaSettlementStatementPage openFileAndGoToAltaSettlementStatement();
	
	/**
	 * Navigates to 'Open File And Go To > 1099-S' in the menu
	 * @return a {@link Form1099SPage}
	 */
	Form1099SPage openFileAndGoTo1099S();
	
	/**
	 * Navigates to 'Open File And Go To > Manage Documents' in the menu
	 * @return a {@link ManageDocumentsPage}
	 */
	ManageDocumentsPage openFileAndGoToManageDocuments();
	
	/**
	 * Clicks 'Rename This File' in the menu
	 * @return a {@link RenameFileDialog}
	 */
	RenameFileDialog renameThisFile();
	
	/**
	 * Clicks 'Make File Active' in the menu
	 */
	void makeFileActive();
	
	/**
	 * Clicks 'Make File Inactive' in the menu
	 */
	void makeFileInactive();
	
	/**
	 * Clicks 'Create New File From This File' in the menu
	 * @return a {@link CreateNewFileFromFileDialog}
	 */
	CreateNewFileFromFileDialog createNewFileFromThisFile();
}
