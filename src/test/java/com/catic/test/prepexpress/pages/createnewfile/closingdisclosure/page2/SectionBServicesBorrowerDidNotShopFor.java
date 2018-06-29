package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SectionBServicesBorrowerDidNotShopFor extends PageObject {
	// Loan Costs - B. Services Borrower Did Not Shop For
	
	//TODO: services borrower did not shop for items table
	
	@FindBy(xpath = "//section[@id='SectionB']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addServicesBorrowerDidNotShopForItemButton;
	
	@FindBy(id = "SectionBBpTotal")
	private WebElementFacade servicesBorrowerDidNotShopForField;
}
