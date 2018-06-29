package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.navbar.ClosingDisclosureNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ClosingDisclosurePage2 extends PageObject {
	// Common - Dropdown for paid by others
	@FindBy(id = "paidByDropDownContainer")
	private WebElementFacade paidByOthersDropdownMenuContainer;
	
	@FindBy(id = "paidbyUnknown")
	private WebElementFacade paidByUnknownDropdownItem;
	
	@FindBy(id = "paidbyLender")
	private WebElementFacade paidByLenderDropdownItem;
	
	@FindBy(id = "paidbyBroker")
	private WebElementFacade paidByBrokerDropdownItem;
	
	@FindBy(id = "paidbyInvestor")
	private WebElementFacade paidByInvestorDropdownItem;
	
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
