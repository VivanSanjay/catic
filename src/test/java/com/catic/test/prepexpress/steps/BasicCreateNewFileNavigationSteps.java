package com.catic.test.prepexpress.steps;

import com.catic.test.prepexpress.pages.createnewfile.GenericCreateNewFilePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BasicCreateNewFileNavigationSteps extends ScenarioSteps {
	private static final long serialVersionUID = -6525625114339239111L;
	
	private GenericCreateNewFilePage page;
	
	@Step
	public void goToGeneralInfo() {
		page.actions().generalInfo();
	}
	
	@Step
	public void goToClosingDisclosure() {
		page.actions().closingDisclosure();
	}
	
	@Step
	public void goToHUD() {
		page.actions().hud();
	}
	
	@Step
	public void goToPolicyOtherDocuments() {
		page.actions().policyOtherDocuments();
	}
	
	@Step
	public void goToDisbursements() {
		page.actions().disbursements();
	}
	
	@Step
	public void goToAdjustmentSheet() {
		page.actions().adjustmentSheet();
	}
	
	@Step
	public void goToAltaSettlementStatement() {
		page.actions().altaSettlementStatement();
	}

	@Step
	public void goTo1099S() {
		page.actions().form1099s();
	}
	
	@Step
	public void goToManageDocuments() {
		page.actions().manageDocuments();
	}
	
	@Step
	public void closeFile() {
		page.closeFile();
	}
	
	@Step
	public void goToHome() {
		page.closeFile();
	}
}
