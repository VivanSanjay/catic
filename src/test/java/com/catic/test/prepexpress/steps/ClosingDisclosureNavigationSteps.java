package com.catic.test.prepexpress.steps;

import com.catic.test.prepexpress.pages.createnewfile.GenericClosingDisclosurePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ClosingDisclosureNavigationSteps extends ScenarioSteps {
	private static final long serialVersionUID = -4521423088077534474L;

	private GenericClosingDisclosurePage cdPage;
	
	// page 1
	
	@Step
	public void goToLoanTerms() {
		cdPage.pages().loanTerms();
	}
	
	@Step
	public void goToProjectedPayments() {
		cdPage.pages().projectedPayments();
	}
	
	@Step
	public void goToCostsAtClosing() {
		cdPage.pages().costsAtClosing();
	}
	
	// page 2
	
	@Step
	public void goToOriginationCosts() {
		cdPage.pages().originationCosts();
	}
	
	@Step
	public void goToServicesBorrowerDidNotShopFor() {
		cdPage.pages().servicesBorrowerDidNotShopFor();
	}
	
	@Step
	public void goToServicesBorrowerDidShopFor() {
		cdPage.pages().servicesBorrowerDidShopFor();
	}
	
	@Step
	public void goToTotalLoanCosts() {
		cdPage.pages().totalLoanCosts();
	}
	
	@Step
	public void goToTaxesAndOtherGovernmentFees() {
		cdPage.pages().taxesAndOtherGovernmentFees();
	}
	
	@Step
	public void goToPrepaids() {
		cdPage.pages().prepaids();
	}
	
	@Step
	public void goToInitialEscrowPaymentAtClosing() {
		cdPage.pages().initialEscrowPaymentAtClosing();
	}
	
	@Step
	public void goToOther() {
		cdPage.pages().other();
	}
	
	@Step
	public void goToTotalOtherCosts() {
		cdPage.pages().totalOtherCosts();
	}
	
	@Step
	public void goToTotalClosingCosts() {
		cdPage.pages().totalClosingCosts();
	}
	
	// page 3
	
	@Step
	public void goToCalculatingCashToClose() {
		cdPage.pages().calculatingCashToClose();
	}
	
	@Step
	public void goToSummariesOfTransactions() {
		cdPage.pages().summariesOfTransactions();
	}
	
	@Step
	public void goToCalculations() {
		cdPage.pages().calculations();
	}
	
	// page 4
	
	@Step
	public void goToLoanDisclosures() {
		cdPage.pages().loanDisclosures();
	}
	
	// page 5
	
	@Step
	public void goToLoanCalculationsAndOtherDisclosures() {
		cdPage.pages().loanCalculationsAndOtherDisclosures();
	}
}
