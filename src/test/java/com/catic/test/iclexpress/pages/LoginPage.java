package com.catic.test.iclexpress.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
	@FindBy(id = "ctl00_contentid_LoginControl_UserName")
	private WebElementFacade userNameInputField;
	
	@FindBy(id = "ctl00_contentid_LoginControl_UserNameRequired")
	private WebElementFacade userNameErrorMessageText;
	
	@FindBy(id = "ctl00_contentid_LoginControl_Password")
	private WebElementFacade passwordInputField;
	
	@FindBy(id = "ctl00_contentid_LoginControl_PasswordRequired")
	private WebElementFacade passwordErrorMessageText;
	
	@FindBy(id = "ctl00_contentid_LoginControl_LoginButton")
	private WebElementFacade loginButton;
}
