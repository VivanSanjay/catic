package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Section1400 extends PageObject {
	@FindBy(id = "L1400BorrowerAmt")
	private WebElementFacade l1400BorrowerAmountField;
	
	@FindBy(id = "L1400SellerAmt")
	private WebElementFacade l1400SellerAmountField;
}
