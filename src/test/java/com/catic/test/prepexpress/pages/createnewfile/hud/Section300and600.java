package com.catic.test.prepexpress.pages.createnewfile.hud;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class Section300and600 extends PageObject {
	// 300 - cash at settlement from/to borrower
	@FindBy(id = "L301Amount")
	private WebElementFacade l301AmountField;
	
	@FindBy(id = "L302Amount")
	private WebElementFacade l302AmountField;
	
	@FindBy(id = "L303DueFromBorrowerTrue")
	private WebElementFacade l303DueFromBorrowerRadioButton;
	
	@FindBy(id = "L303DueFromBorrowerFalse")
	private WebElementFacade l303DueToBorrowerRadioButton;
	
	@FindBy(id = "L303Amount")
	private WebElementFacade l303AmountField;
	
	// 600 - cash at settlement to/from seller
	@FindBy(id = "L601Amount")
	private WebElementFacade l601AmountField;
	
	@FindBy(id = "L602Amount")
	private WebElementFacade l602AmountField;
	
	@FindBy(id = "L603DueToSellerTrue")
	private WebElementFacade l603DueToSellerRadioButton;
	
	@FindBy(id = "L603DueToSellerFalse")
	private WebElementFacade l603DueFromSellerRadioButton;
	
	@FindBy(id = "L603Amount")
	private WebElementFacade l603AmountField;
}
