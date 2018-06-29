package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page4;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class ClosingDisclosurePage4 extends PageObject {
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
	
	public LoanDisclosuresSection loanDisclosures() {
		return this.switchToPage(LoanDisclosuresSection.class);
	}
	
	public AdjustablePaymentTableSection adjustablePaymentTable() {
		return this.switchToPage(AdjustablePaymentTableSection.class);
	}
	
	public AdjustableInterestRateTableSection adjustableInterestRateTable() {
		return this.switchToPage(AdjustableInterestRateTableSection.class);
	}
}
