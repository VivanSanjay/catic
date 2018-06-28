package com.catic.test.prepexpress.steps;

import com.catic.test.prepexpress.pages.tools.GenericToolsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ToolsNavigationSteps extends ScenarioSteps {
	private static final long serialVersionUID = 2064580261081161431L;
	
	private GenericToolsPage page;
	
	@Step
	public void returnToHome() {
		page.returnToHome();
	}
	
	@Step
	public void goToHome() {
		page.returnToHome();
	}
}
