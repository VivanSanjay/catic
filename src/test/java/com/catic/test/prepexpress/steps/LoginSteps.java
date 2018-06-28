package com.catic.test.prepexpress.steps;

import org.assertj.core.api.Assertions;
import com.catic.test.prepexpress.pages.LoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {
	private static final long serialVersionUID = -1583471106294324609L;
	
	private LoginPage loginPage;
	
	@Step
	public void loginIntoPrepExpressAs(String userName, String password) {
		loginPage.open();
		loginPage.login(userName, password);
	}
	
	@Step
	public void assertUserNameText(String expectedUsername) {
		String displayedUserName = loginPage.getUserName();
				
		Assertions.assertThat(displayedUserName)
		.as("'Login' username")
		.isEqualTo(expectedUsername);
	}
	
	@Step
	public void assertPasswordText(String expectedPassword) {
		String displayedPassword = loginPage.getPassword();
		
		Assertions.assertThat(displayedPassword)
		.as("'Login' password")
		.isEqualTo(expectedPassword);
	}
}
