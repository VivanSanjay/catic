package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class PaidByDropdownImpl extends WidgetObjectImpl implements PaidByDropdown {
	@FindBy(id = "paidbyDropdown")
	private WebElementFacade theMenu;
	
	@FindBy(id = "paidbyUnknown")
	private WebElementFacade paidByUnknownDropdownItem;
	
	@FindBy(id = "paidbyLender")
	private WebElementFacade paidByLenderDropdownItem;
	
	@FindBy(id = "paidbyBroker")
	private WebElementFacade paidByBrokerDropdownItem;
	
	@FindBy(id = "paidbyInvestor")
	private WebElementFacade paidByInvestorDropdownItem;
	
	public PaidByDropdownImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public PaidByDropdownImpl(PageObject page, ElementLocator locator, WebElement webElement, long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public void select(PaidBy other) {
		menuItem(other).click();
		theMenu.waitUntilNotVisible();
	}

	@Override
	public boolean isSelected(PaidBy other) {
		return menuItem(other).hasClass("selectedMenu");
	}
	
	private WebElementFacade menuItem(PaidBy other) {
		switch (other) {
		case BROKER:
			return paidByBrokerDropdownItem;
		case INVESTOR:
			return paidByInvestorDropdownItem;
		case LENDER:
			return paidByLenderDropdownItem;
		case UNKNOWN:
			return paidByUnknownDropdownItem;
		default:
			throw new RuntimeException("Invalid value for paid by others");
		}
	}
}
