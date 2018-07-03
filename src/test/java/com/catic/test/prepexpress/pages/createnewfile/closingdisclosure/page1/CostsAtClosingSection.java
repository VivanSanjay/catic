package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page1;

import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.common.CollapsibleSection;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class CostsAtClosingSection extends PageObject {
	// 1. Costs At Closing
	@FindBy(xpath = "//label[text()='1. Costs at Closing']/following-sibling::span[contains(@class, 'icon-chevron')]")
	private WebElementFacade costsAtClosingSectionSection;
	
	@FindBy(xpath = "//input[@title='TotalBorrowerClosingCosts']")
	private WebElementFacade totalBorrowerClosingCostsField;
	
	@FindBy(xpath = "//input[@title='TotalLoanCostsBorrowerPaid']")
	private WebElementFacade totalLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='OtherLoanCostsBorrowerPaid']")
	private WebElementFacade otherLoanCostsBorrowerPaidField;
	
	@FindBy(xpath = "//input[@title='LenderCreditBorrowerPaidAtClosing']")
	private WebElementFacade lenderCreditBorrowerPaidAtClosingField;
	
	@FindBy(xpath = "//input[@data-id='TotalBorrowerCashToCloseAbs']")
	private WebElementFacade totalBorrowerCashToCloseField;
	
	/**
	 * Returns value of total closing costs
	 * @return the total closing costs
	 */
	public Money getTotalBorrowerClosingCosts() {
		openSection();
		return MoneyUtil.fromString(totalBorrowerClosingCostsField.getValue());
	}
	
	/**
	 * Returns the value of loan costs
	 * @return the loan costs
	 */
	public Money getTotalLoanCostsBorrowerPaid() {
		openSection();
		return MoneyUtil.fromString(totalLoanCostsBorrowerPaidField.getValue());
	}
	
	/**
	 * Returns the value of other costs
	 * @return the other costs
	 */
	public Money getOtherCostsBorrowerPaid() {
		openSection();
		return MoneyUtil.fromString(otherLoanCostsBorrowerPaidField.getValue());
	}
	
	/**
	 * Returns the value of lender credits
	 * @return the lender credits
	 */
	public Money getLenderCreditsBorrowerPaid() {
		openSection();
		return MoneyUtil.fromString(lenderCreditBorrowerPaidAtClosingField.getValue());
	}
	
	/**
	 * Returns the value of cash to close
	 * @return the cash to close
	 */
	public Money getTotalBorrowerCashToClose() {
		openSection();
		return MoneyUtil.fromString(totalBorrowerCashToCloseField.getValue());
	}
	
	/**
	 * Opens this collapsible section, if it is closed
	 */
	private void openSection() {
		new CollapsibleSection(costsAtClosingSectionSection).openSection();
	}
}
