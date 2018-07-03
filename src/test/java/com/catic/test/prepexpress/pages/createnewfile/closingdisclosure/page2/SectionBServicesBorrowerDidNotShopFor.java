package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class SectionBServicesBorrowerDidNotShopFor extends PageObject {
	// Loan Costs - B. Services Borrower Did Not Shop For
	
	//TODO: services borrower did not shop for items table
	
	@FindBy(xpath = "//section[@id='SectionB']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addServicesBorrowerDidNotShopForItemButton;
	
	@FindBy(id = "SectionBBpTotal")
	private WebElementFacade servicesBorrowerDidNotShopForField;
	
	/**
	 * Returns the value of 'Services Borrower Did Not Shop For'
	 * @return value of 'Services Borrower Did Not Shop For'
	 */
	public Money getTotalServicesBorrowerDidNotShopFor() {
		return MoneyUtil.fromString(servicesBorrowerDidNotShopForField.getValue());
	}
}
