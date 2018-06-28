package com.catic.test.prepexpress.pages;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.DefaultUrls;
import com.catic.test.prepexpress.pages.home.HomePage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl(DefaultUrls.LOGIN)
public class LoginPage extends PageObject {
	@FindBy(id = "formSignin")
	private WebElementFacade me;
	
	@FindBy(id = "UserName")
	private WebElementFacade userNameInput;
	
	@FindBy(xpath = "//label[@for='UserName']")
	private WebElementFacade userNameMessage;
	
	@FindBy(id = "Password")
	private WebElementFacade passwordInput;
	
	@FindBy(xpath = "//label[@for='Password']")
	private WebElementFacade passwordMessage;
	
	@FindBy(id = "loginButton")
	private WebElementFacade loginButton;
	
	@WhenPageOpens
	public void waitUntilLoaded() {
		me.waitUntilVisible();
	}
	
	/**
	 * Logs into the application.
	 * @param userName
	 * @param password
	 * @return the home page
	 */
	public HomePage login(String userName, String password) {
		enterUserName(userName);
		enterPassword(password);
		submitLogin();
		
		return switchToPage(HomePage.class);
	}
	
	/**
	 * Enters a new value for the user name field
	 * @param value
	 */
	public void enterUserName(String value) {
		typeInto(userNameInput, value);
	}
	
	/**
	 * Enters a new value for the password field
	 * @param value
	 */
	public void enterPassword(String value) {
		typeInto(passwordInput, value);
	}
	
	/**
	 * Submits the login
	 */
	public void submitLogin() {
		clickOn(loginButton);
	}
	
	/**
	 * Returns the currently displayed value in the user name input field
	 * @return the value in the user name input field
	 */
	public String getUserName() {
		return userNameInput.getValue();
	}
	
	/**
	 * Returns the currently displayed value in the password input field
	 * @return the vlaue in the password input field
	 */
	public String getPassword() {
		return passwordInput.getValue();
	}
}
