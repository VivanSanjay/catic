package com.catic.test.prepexpress.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FileLockedPage extends PageObject {
	@FindBy(linkText = "Return to Home")
	private WebElementFacade returnToHomeButton;
	
	@FindBy(id = "UnlockFile")
	private WebElementFacade unlockFileButton;
}
