package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page2;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class SectionCServicesBorrowerDidShopFor extends PageObject {
	// Loan Costs - C. Services Borrower Did Shop For
	
	//TODO: services borrower did for items table
	
	@FindBy(xpath = "//section[@id='SectionC']//button[contains(@class, 'btnAddSectionDetail')]")
	private WebElementFacade addServicesBorrowerDidShopForItemButton;
	
	@FindBy(id = "SectionCBpTotal")
	private WebElementFacade servicesBorrowerDidShopForField;
	
	/**
	 * Returns the value of 'Services Borrower Did Shop For'
	 * @return value of 'Services Borrower Did Shop For'
	 */
	public Money getTotalServicesBorrowerDidShopFor() {
		return MoneyUtil.fromString(servicesBorrowerDidShopForField.getValue());
	}
}
