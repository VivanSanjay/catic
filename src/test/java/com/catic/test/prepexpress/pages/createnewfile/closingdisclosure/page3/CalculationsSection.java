package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page3;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CalculationsSection extends PageObject {
	@FindBy(xpath = "//label[text()='Calculations']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade calculationsCollapsibleSection;
	
	@FindBy(xpath = "//input[@title='DueFromBorrowerAtClosing']")
	private WebElementFacade totalDueFromBorrowerAtClosingField;
	
	@FindBy(xpath = "//input[@title='PaidAlreadyByBorrowerAtClosing']")
	private WebElementFacade totalPaidAlreadyByOrOnBehalfOfBorrowerAtClosingField;
	
	@FindBy(xpath = "//input[@title='DueToSellerAtClosing']")
	private WebElementFacade totalDueToSellerAtClosingField;
	
	@FindBy(xpath = "//input[@title='DueFromSellerAtClosing']")
	private WebElementFacade totalDueFromSellerAtClosingField;
	
	@FindBy(xpath = "(//label[text()='Cash To Close']/following-sibling::label/input[@type='checkbox'])[1]")
	private WebElementFacade borrowerCashToCloseFromCheckbox;
	
	@FindBy(xpath = "(//label[text()='Cash To Close']/following-sibling::label/input[@type='checkbox'])[2]")
	private WebElementFacade borrowerCashToCloseToCheckbox;
	
	@FindBy(xpath = "//input[@title='TotalBorrowerCashAbs']")
	private WebElementFacade totalBorrowerCashToCloseField;
	
	@FindBy(xpath = "(//label[text()='Cash To Close']/following-sibling::label/input[@type='checkbox'])[3]")
	private WebElementFacade sellerCashToCloseFromCheckbox;
	
	@FindBy(xpath = "(//label[text()='Cash To Close']/following-sibling::label/input[@type='checkbox'])[4]")
	private WebElementFacade sellerCashToCloseToCheckbox;
	
	@FindBy(xpath = "//input[@title='TotalSellerCashAbs']")
	private WebElementFacade totalSellerCashToCloseField;
	
	
}
