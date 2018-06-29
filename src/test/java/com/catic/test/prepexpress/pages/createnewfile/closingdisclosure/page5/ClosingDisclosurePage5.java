package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page5;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class ClosingDisclosurePage5 extends PageObject {
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
	
	public LoanCalculationsAndOtherDisclosuresSection loanCalculationsAndOtherDisclosures() {
		return this.switchToPage(LoanCalculationsAndOtherDisclosuresSection.class);
	}
}
