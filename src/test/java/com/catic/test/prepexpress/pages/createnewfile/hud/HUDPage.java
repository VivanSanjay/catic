package com.catic.test.prepexpress.pages.createnewfile.hud;

import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class HUDPage extends PageObject {
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
