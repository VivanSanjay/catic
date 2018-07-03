package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class ClosingDisclosurePage2 extends PageObject {	
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
	
	public SectionAOriginationCosts originationCosts() {
		return this.switchToPage(SectionAOriginationCosts.class);
	}
	
	public SectionBServicesBorrowerDidNotShopFor servicesBorrowerDidNotShopFor() {
		return this.switchToPage(SectionBServicesBorrowerDidNotShopFor.class);
	}
	
	public SectionCServicesBorrowerDidShopFor servicesBorrowerDidShopFor() {
		return this.switchToPage(SectionCServicesBorrowerDidShopFor.class);
	}
	
	public SectionDTotalLoanCosts totalLoanCosts() {
		return this.switchToPage(SectionDTotalLoanCosts.class);
	}
	
	public SectionETaxesAndOtherGovernmentFees taxesAndOtherGovernmentFees() {
		return this.switchToPage(SectionETaxesAndOtherGovernmentFees.class);
	}
	
	public SectionGInitialEscrowPaymentAtClosing initialEscrowPaymentAtClosing() {
		return this.switchToPage(SectionGInitialEscrowPaymentAtClosing.class);
	}
	
	public SectionHOther other() {
		return this.switchToPage(SectionHOther.class);
	}
	
	public SectionITotalOtherCosts totalOtherCosts() {
		return this.switchToPage(SectionITotalOtherCosts.class);
	}
	
	public SectionJTotalClosingCosts totalClosingCosts() {
		return this.switchToPage(SectionJTotalClosingCosts.class);
	}
}
