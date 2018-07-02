package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page4;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdjustablePaymentTableSection extends PageObject {
	@FindBy(xpath = "(//input[@name='HasInterestOnlyPayments'])[1]")
	private WebElementFacade interestOnlyPaymentsYesRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasInterestOnlyPayments'])[2]")
	private WebElementFacade interestOnlyPaymentsNoRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasOptionalPayments'])[1]")
	private WebElementFacade optionalPaymentsYesRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasOptionalPayments'])[2]")
	private WebElementFacade optionalPaymentsNoRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasStepPayments'])[1]")
	private WebElementFacade stepPaymentsYesRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasStepPayments'])[2]")
	private WebElementFacade stepPaymentsNoRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasSeasonalPayments'])[1]")
	private WebElementFacade seasonalPaymentsYesRadioButton;
	
	@FindBy(xpath = "(//input[@name='HasSeasonalPayments'])[2]")
	private WebElementFacade seasonalPaymentsNoRadioButton;
	
	@FindBy(id = "PrincipalAndInterestFirstChangeMinAmount")
	private WebElementFacade principalAndInterestFirstChangeMinAmountInputField;
	
	@FindBy(id = "PrincipalAndInterestFirstChangeMaxAmount")
	private WebElementFacade principalAndInterestFirstChangeMaxAmountInputField;
	
	@FindBy(id = "PrincipalAndInterestFirstChangeMonthsCount")
	private WebElementFacade principalAndInterestFirstChangeMonthsCountInputField;
	
	@FindBy(id = "PrincipalAndInterestSubsequentChangeMonthsCount")
	private WebElementFacade principalAndInterestSubsequentChangesMonthsCountInputField;
	
	@FindBy(id = "MaximumPrincipalAndInterestAmount")
	private WebElementFacade principalAndInterestMaximumPaymentAmountInputField;
	
	@FindBy(id = "MaximumPrincipalAndInterestMonthsCount")
	private WebElementFacade principalAndInterestMaximumPaymentMonthsCountInputField;
	
	@FindBy(id = "APPrintTable")
	private WebElementFacade printAPTableOnPage4Checkbox;
}
