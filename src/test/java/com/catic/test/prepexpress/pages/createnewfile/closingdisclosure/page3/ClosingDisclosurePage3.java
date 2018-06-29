package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class ClosingDisclosurePage3 extends PageObject {
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
	
	public ClosingDisclosureNavBarFragment pages() {
		return ClosingDisclosureNavBarFragment.from(this);
	}
	
	public CalculatingCashToCloseSection calculatingCashToClose() {
		return this.switchToPage(CalculatingCashToCloseSection.class);
	}
	
	public SectionKDueFromBorrowerAtClosing dueFromBorrowerAtClosing() {
		return this.switchToPage(SectionKDueFromBorrowerAtClosing.class);
	}
	
	public SectionLPaidAlreadyOrOnBehalfOfBorrowerAtClosing paidAlreadyByOrOnBehalfOfBorrowerAtClosing() {
		return this.switchToPage(SectionLPaidAlreadyOrOnBehalfOfBorrowerAtClosing.class);
	}
	
	public SectionMDueToSellerAtClosing dueToSellerAtClosing() {
		return this.switchToPage(SectionMDueToSellerAtClosing.class);
	}
	
	public SectionNDueFromSellerAtClosing dueFromSellerAtClosing() {
		return this.switchToPage(SectionNDueFromSellerAtClosing.class);
	}
	
	public CalculationsSection calculations() {
		return this.switchToPage(CalculationsSection.class);
	}
}
