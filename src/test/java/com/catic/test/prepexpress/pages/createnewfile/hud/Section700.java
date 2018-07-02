package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Section700 extends PageObject {
	@FindBy(id = "L700BasedOnAmount")
	private WebElementFacade l700BasedOnAmountInputField;
	
	@FindBy(id = "L700BasedOnPercent")
	private WebElementFacade l700BasedOnPercentInputField;
	
	@FindBy(id = "L700BasedOnCalc")
	private WebElementFacade l700BasedOnCalcField;
	
	@FindBy(id = "btnClearCommission")
	private WebElementFacade clearCommissionButton;
	
	@FindBy(id = "L700DeductDeposit")
	private WebElementFacade l700DeductDepositFromCommissionCheckbox;
	
	@FindBy(id = "L701Percent")
	private WebElementFacade l701PercentInputField;
	
	@FindBy(id = "L701Amount")
	private WebElementFacade l701AmountInputField;
	
	@FindBy(id = "L701Text")
	private WebElementFacade l701TextInputField;
	
	@FindBy(id = "L702Amount")
	private WebElementFacade l702AmountInputField;
	
	@FindBy(id = "L702Text")
	private WebElementFacade l702TextInputField;
	
	@FindBy(id = "L703Text")
	private WebElementFacade l703TextInputField;
	
	@FindBy(id = "btn703Override")
	private WebElementFacade l703ManualOverrideButton;
	
	@FindBy(id = "L703BorrowerAmt")
	private WebElementFacade l703BorrowerAmountInputField;
	
	@FindBy(id = "L703SellerAmt")
	private WebElementFacade l703SellerAmountInputField;
	
	@FindBy(id = "L704Text")
	private WebElementFacade l704TextInputField;
	
	@FindBy(id = "L704BorrowerAmt")
	private WebElementFacade l704BorrowerAmountInputField;
	
	@FindBy(id = "L704SellerAmt")
	private WebElementFacade l704SellerAmountInputField;
}
