package com.catic.test.prepexpress.pages.createnewfile.hud;

import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;

public class HUDPage extends PageObject {
	public SectionsAtoI sectionsAtoI() {
		return switchToPage(SectionsAtoI.class);
	}
	
	public Section100and400 section100and400() {
		return switchToPage(Section100and400.class);
	}
	
	public Section200and500 section200and500() {
		return switchToPage(Section200and500.class);
	}
	
	public Section300and600 section300and600() {
		return switchToPage(Section300and600.class);
	}
	
	public Section700 section700() {
		return switchToPage(Section700.class);
	}
	
	public Section800 section800() {
		return switchToPage(Section800.class);
	}
	
	public Section900 section900() {
		return switchToPage(Section900.class);
	}
	
	public Section1000 section1000() {
		return switchToPage(Section1000.class);
	}
	
	public Section1100 section1100() {
		return switchToPage(Section1100.class);
	}
	
	public Section1200 section1200() {
		return switchToPage(Section1200.class);
	}
	
	public Section1300 section1300() {
		return switchToPage(Section1300.class);
	}
	
	public Section1400 section1400() {
		return switchToPage(Section1400.class);
	}
	
	public GfeHudComparison gfeHudComparison() {
		return switchToPage(GfeHudComparison.class);
	}
	
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
