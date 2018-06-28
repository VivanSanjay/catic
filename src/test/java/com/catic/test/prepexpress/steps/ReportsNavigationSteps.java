package com.catic.test.prepexpress.steps;

import com.catic.test.prepexpress.pages.reports.GenericReportsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ReportsNavigationSteps extends ScenarioSteps {
	private static final long serialVersionUID = -8696307398042235885L;
	
	private GenericReportsPage page;
	
	@Step
	public void returnToHome() {
		page.returnToHome();
	}
	
	@Step
	public void goToHome() {
		page.returnToHome();
	}
	
	@Step
	public void goToJacketHistory() {
		page.reports().jacketHistory();
	}
	
	@Step
	public void goToICLHistory() {
		page.reports().iclHistory();
	}
	
	@Step
	public void goToBorrowerList() {
		page.reports().borrowerList();
	}
	
	@Step
	public void goToClosingsByLender() {
		page.reports().closingsByLender();
	}
	
	@Step
	public void goTo1099SFilingList() {
		page.reports().form1099SFilingList();
	}
	
	@Step
	public void goToLenderList() {
		page.reports().lenderList();
	}
}
