package com.catic.test.prepexpress.steps;

import com.catic.test.prepexpress.pages.home.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeNavigationSteps extends ScenarioSteps {
	private static final long serialVersionUID = 832318372161114079L;
	
	private HomePage homePage;
		
	@Step
	public void goToTitleSearch() {
		homePage.titleSearch();
	}
	
	@Step
	public void goToBlankDocuments() {
		homePage.blankDocuments();
	}
	
	@Step
	public void goToLenderMaintenance() {
		homePage.lenderMaintenance();
	}
	
	@Step
	public void goToContactMaintenance() {
		homePage.contactMaintenance();
	}
	
	@Step
	public void goToPhraseCodeMaintenance() {
		homePage.phraseCodeMaintenance();
	}
	
	@Step
	public void goToPreferences() {
		homePage.preferences();
	}
	
	@Step
	public void goToJacketHistory() {
		homePage.jacketHistory();
	}
	
	@Step
	public void goToICLHistory() {
		homePage.iclHistory();
	}
	
	@Step
	public void goToBorrowerList() {
		homePage.borrowerList();
	}
	
	@Step
	public void goToClosingsByLender() {
		homePage.closingsByLender();
	}
	
	@Step
	public void goTo1099SFilingList() {
		homePage.form1099SFilingList();
	}
	
	@Step
	public void goToLenderList() {
		homePage.lenderList();
	}
}
