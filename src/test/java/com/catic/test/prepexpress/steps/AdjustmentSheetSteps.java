package com.catic.test.prepexpress.steps;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.AdjustmentSheetPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AdjustmentSheetSteps extends ScenarioSteps {
	private static final long serialVersionUID = -2789220462349657417L;
	
	private AdjustmentSheetPage adjustmentSheetPage;
	
	@Step
	public void addCreditsToSellerAndSave(String description, Money amount) {
		adjustmentSheetPage.addCreditsToSellerItem(description, amount).save();
	}
	
	@Step
	public void addCreditsToSellerAndCancel(String description, Money amount) {
		adjustmentSheetPage.addPayOffsItem(description, amount).cancel();
	}
	
	@Step
	public void addCreditsToBuyerAndSave(String description, Money amount) {
		adjustmentSheetPage.addCreditsToBuyerItem(description, amount).save();
	}
	
	@Step
	public void addCreditsToBuyerAndCancel(String description, Money amount) {
		adjustmentSheetPage.addCreditsToSellerItem(description, amount).cancel();
	}
	
	@Step
	public void addPayOffsAndSave(String description, Money amount) {
		adjustmentSheetPage.addPayOffsItem(description, amount).save();
	}
	
	@Step 
	public void addPayOffsAndcancel(String description, Money amount) {
		adjustmentSheetPage.addPayOffsItem(description, amount).cancel();
	}


}
