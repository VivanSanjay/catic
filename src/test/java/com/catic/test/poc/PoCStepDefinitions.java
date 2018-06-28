package com.catic.test.poc;

import java.time.LocalDate;

import com.catic.test.prepexpress.pages.home.HomePageUtils;
import com.catic.test.prepexpress.steps.HomeSteps;
import com.catic.test.prepexpress.steps.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PoCStepDefinitions {
	@Steps
	private LoginSteps loginSteps;
	
	@Steps
	private HomeSteps homePageSteps;
	
	@Given("I am on the home page")
	public void userIsLoggedIn() {
		loginSteps.loginIntoPrepExpressAs("6852AR", "6852Mar!");
	}
	
	@When("I select the start date '(.*)'")
	public void iSelectTheStartDate(String start) {
		LocalDate startDate = HomePageUtils.parseCreatedBetweenDateString(start);
		homePageSteps.filterByCreatedBetweenStartDate(startDate);
	}
	
	@When("I select the end date '(.*)'")
	public void iSelectTheEndDate(String end) {
		LocalDate endDate = HomePageUtils.parseCreatedBetweenDateString(end);
		homePageSteps.filterByCreatedBetweenEndDate(endDate);
	}
	
	@Then("I should see files with a creation date between '(.*)' and '(.*)'")
	public void iShouldSeeFilesWithACreationDateBetween(String start, String end) {
		
	}
	
	@When("I search for '(.*)'")
	public void iSearchFor(String term) {
		homePageSteps.filterByFileName(term);
	}
	
	@Then("I should see files whose names contain '(.*)'")
	public void iShouldSeeFilesWhoseNamesContain(String term) {
		
	}
}
