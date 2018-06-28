package com.catic.test.prepexpress.pages.createnewfile;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PolicyOtherDocumentsPage extends PageObject {
	@FindBy(id = "pcBtn")
	private WebElementFacade policyCommitmentButton;
	
	@FindBy(id = "mpBtn")
	private WebElementFacade mortgageePolicyButton;
	
	@FindBy(id = "opBtn")
	private WebElementFacade ownerPolicyButton;
	
	@FindBy(id = "sfBtn")
	private WebElementFacade shortFormMortgageePolicyButton;
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
}
