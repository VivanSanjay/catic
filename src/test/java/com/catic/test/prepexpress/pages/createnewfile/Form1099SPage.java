package com.catic.test.prepexpress.pages.createnewfile;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Form1099SPage extends PageObject {
	@FindBy(id = "addSellerButton")
	private WebElementFacade addSellerButton;
	
	@FindBy(id = "refreshSellersButton")
	private WebElementFacade refreshSellerNamesButton;
	
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
