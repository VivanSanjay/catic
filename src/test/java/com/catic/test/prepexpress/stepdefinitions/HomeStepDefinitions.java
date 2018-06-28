package com.catic.test.prepexpress.stepdefinitions;

import java.util.List;

import com.catic.test.prepexpress.model.FileDetails;
import com.catic.test.prepexpress.steps.HomeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomeStepDefinitions {
	@Steps
	private HomeSteps homeSteps;

	@Given("^I have created a new file with the following details:$")
	public void iHaveCreatedANewFile(List<FileDetails> files) {
		FileDetails file = files.get(0);
		homeSteps.createNewFile(file);
	}
	
	@Given("^I have opened the file named '(.+)'$")
	public void iHaveOpenedTheFileNamed(String fileName) {
		homeSteps.openFile(fileName);
	}
	
	@When("^I create a new file with the following details:$")
	public void iCreateANewFile(List<FileDetails> files) {
		FileDetails file = files.get(0);
		homeSteps.createNewFile(file);
	}
	
	@When("^I open the file named '(.+)'$")
	public void iOpenAFile(String fileName) {
		homeSteps.openFile(fileName);
	}
	
	@Then("^I should see the '(.+)' page")
	public void iShouldSeeAPage(String pageName) {
		
	}
}
