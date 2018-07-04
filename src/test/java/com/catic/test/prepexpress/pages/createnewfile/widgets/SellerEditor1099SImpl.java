package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.javamoney.moneta.Money;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;
import util.MoneyUtil;

public class SellerEditor1099SImpl extends WidgetObjectImpl implements SellerEditor1099S{
	
	@FindBy(xpath = "//label[contains(.,'Name')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade nameinputfield;
		
	@FindBy(xpath = "//label[contains(.,'TIN/SSN')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade tin_ssninputfield;
	
	@FindBy(xpath = "//label[contains(.,'Street Address')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade addressinputfield;
	
	@FindBy(xpath = "//label[contains(.,'City/Town')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade city_towninputfield;
	
	@FindBy(xpath = "//label[contains(.,'State')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade stateinputfield;
	
	@FindBy(xpath = "//label[contains(.,'Zip Code')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade zipcodeinputfield;
	
	@FindBy(xpath = "//label[contains(.,'Marriage code')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade marriagecodeinputfield;
	
	@FindBy(xpath = "//label[contains(.,'Gross Proceeds')]//ancestor::div[@class='control-group']//input")
	private WebElementFacade grosspreceedsinputfield;
	
	@FindBy(xpath = "//input[@data-bind='value: editItem.tax.formatted']")
	private WebElementFacade realestatetexinputfield;
	
	@FindBy(id = "saveSellerButton")
	private WebElementFacade savebutton;
	
	@FindBy(id = "cancelSellerButton")
	private WebElementFacade closebutton;
	
	
	public SellerEditor1099SImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	public SellerEditor1099SImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	@Override
	public SellerEditor1099S sellerEditorEnterName(String name) {
		if(name!=null)
		{
			nameinputfield.clear();	
			nameinputfield.type(name);
		}	
		else
		{
		    nameinputfield.type(name);
		}
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterTin_Ssn(String ssn) {
		tin_ssninputfield.type(ssn);
		return this;
		
	}

	@Override
	public SellerEditor1099S sellerEditorEnterStreetSddress(String address) {
		addressinputfield.type(address);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterCity_Town(String city) {
		city_towninputfield.type(city);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterState(String state) {
		stateinputfield.type(state);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterZipCode(String zipcode) {
		zipcodeinputfield.type(zipcode);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterMarriageCode(String marriagecode) {
		marriagecodeinputfield.type(marriagecode);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterGross(Money gross) {
		String amt = MoneyUtil.toString(gross);
		grosspreceedsinputfield.type(amt);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorEnterEstateTax(Money estatetax) {
		String amt = MoneyUtil.toString(estatetax);
		realestatetexinputfield.type(amt);
		return this;
	}

	@Override
	public SellerEditor1099S sellerEditorClickSaveButton() {
		savebutton.click();
		return this;				
	}

	@Override
	public SellerEditor1099S sellerEditorClickCloseButton() {
		closebutton.click();		
		return null;
		
	}
	
	
}
