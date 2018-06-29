package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class ClosingDisclosurePage1 extends PageObject {			
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
	
	public LoanTermsSection loanTerms() {
		return this.switchToPage(LoanTermsSection.class);
	}
	
	public ProjectedPaymentsSection projectedPayments() {
		return this.switchToPage(ProjectedPaymentsSection.class);
	}
	
	public CostsAtClosingSection costsAtClosing() {
		return this.switchToPage(CostsAtClosingSection.class);
	}
}
