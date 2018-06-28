package com.catic.test.prepexpress.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import net.thucydides.core.annotations.Managed;

public class Hooks {
	@Managed
	private WebDriver driver;
	
	@Before
	public void before() {
		driver.manage().window().maximize();
	}
}
