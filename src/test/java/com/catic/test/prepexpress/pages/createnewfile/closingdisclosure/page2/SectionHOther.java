package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionHOther extends PageObject {
	// Other Costs - H. Other
	
	//TODO: other items table
	
	@FindBy(xpath = "//section[@id='SectionH']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addOtherItemButton;
	
	@FindBy(id = "SectionHBpTotal")
	private WebElementFacade otherField;
}
