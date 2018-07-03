package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class Section1400 extends PageObject {
	@FindBy(id = "L1400BorrowerAmt")
	private WebElementFacade l1400BorrowerAmountField;
	
	@FindBy(id = "L1400SellerAmt")
	private WebElementFacade l1400SellerAmountField;
	
	public Money get1400BorrowerTotalSettlementCharges() {
		return MoneyUtil.fromString(l1400BorrowerAmountField.getValue());
	}
	
	public Money get1400SellerTotalSettlementCharges() {
		return MoneyUtil.fromString(l1400SellerAmountField.getValue());
	}
}
