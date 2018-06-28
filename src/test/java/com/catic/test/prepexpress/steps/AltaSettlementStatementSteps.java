package com.catic.test.prepexpress.steps;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.AltaSettlementStatementPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AltaSettlementStatementSteps extends ScenarioSteps {
	private static final long serialVersionUID = 2255402919422743646L;
	
	private AltaSettlementStatementPage altaSettlementPage;
	
	@Step
	public void addFinancialItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addFinancialItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addFinancialItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addFinancialItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addProrationsOrAdjustmentsItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addProrationsOrAdjustmentsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addProrationsOrAdjustmentsItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addProrationsOrAdjustmentsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addLoanChargesItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addLoanChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addLoanChargesItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addLoanChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addOtherLoanChargesItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addOtherLoanChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addOtherLoanChargesItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addOtherLoanChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addImpoundsItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addImpoundsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addImpoundsItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addImpoundsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addTitleSettlementItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addTitleSettlementItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addTitleSettlementItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addTitleSettlementItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addCommissionItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addCommissionItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addCommissionItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addCommissionItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addGovernmentChargesItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addGovernmentChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addGovernmentChargesItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addGovernmentChargesItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addPayOffsItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addPayOffsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addPayOffsItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addPayOffsItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
	
	@Step
	public void addMiscellaneousItemAndSave(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addMiscellaneousItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).save();
	}
	
	@Step
	public void addMiscellaneousItemAndCancel(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		altaSettlementPage.addMiscellaneousItem(sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit).cancel();
	}
}
