package com.catic.test.prepexpress.stepdefinitions;

import com.catic.test.prepexpress.steps.LoginSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;

public class LoginStepDefinitions {
	@Steps
	private LoginSteps loginSteps;
	
	private EnvironmentVariables environment;
	
	@Given("^I have logged in$")
	public void iHaveLoggedIn() {
		String user = environment.getProperty("user");
		String password = environment.getProperty("password");
		loginSteps.loginIntoPrepExpressAs(user, password);
	}
	
	@Given("^I have logged in as '(.+)' with password '(.+)'$")
	public void iHaveLoggedInAs(String user, String password) {
		loginSteps.loginIntoPrepExpressAs(user, password);
	}
}
