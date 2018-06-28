package com.catic.test.prepexpress.pages.navbar;

import org.openqa.selenium.By;

public class ClosingDisclosureNavBarFragment {
	// page 1
	private static final By MENU_CD_PAGE_1 = By.id("pageOneMenu");
	private static final By ITEM_LOAN_TERMS = By.linkText("Loan Terms");
	private static final By ITEM_PROJECTED_PAYMENTS = By.linkText("Projected Payments");
	private static final By ITEM_COSTS_AT_CLOSING = By.linkText("Costs at Closing");
	
	// page 2
	private static final By MENU_CD_PAGE_2 = By.id("pageTwoMenu");
	private static final By ITEM_ORIGINATION_COSTS = By.linkText("A. Origination Costs");
	private static final By ITEM_SERVICE_NO_SHOP = By.linkText("B. Services Borrower Did Not Shop For");
	private static final By ITEM_SERVCE_DID_SHOP = By.linkText("C. Services Borrower Did Shop For");
	private static final By ITEM_TOTAL_LOAN_COSTS = By.linkText("D. Total Loan Costs (Borrower - Paid)");
	private static final By ITEM_TAXES_AND_OTHER_FEES = By.linkText("E. Taxes And Other Government Fees");
	private static final By ITEM_PREPAIDS = By.linkText("F. Prepaids");
	private static final By ITEM_INITIAL_ESCROW = By.linkText("G. Initial Escrow Payment At Closing");
	private static final By ITEM_OTHER = By.linkText("H. Other");
	private static final By ITEM_TOTAL_OTHER = By.linkText("I. Total Other Costs (Borrower - Paid)");
	private static final By ITEM_TOTAL_CLOSING = By.linkText("J. Total Closing Costs (Borrower - Paid)");
	
	// page 3
	private static final By MENU_CD_PAGE_3 = By.id("pageThreeMenu");
	private static final By ITEM_CALC_CASH_TO_CLOSE = By.linkText("Calculating Cash To Close");
	private static final By ITEM_SUMMARIES_OF_TRANS = By.linkText("Summaries Of Transactions");
	private static final By ITEM_CALCULATIONS = By.linkText("Calculations");
	
	// page 4
	private static final By MENU_CD_PAGE_4 = By.id("pageFourMenu");
	private static final By ITEM_LOAN_DISCLOSURES = By.linkText("Loan Disclosures");
	
	// page 5
	private static final By MENU_CD_PAGE_5 = By.id("pageFiveMenu");
	private static final By ITEM_LOAN_CALCS_DISCLOSURES = By.linkText("Loan Calculations And Other Disclosures");
}
