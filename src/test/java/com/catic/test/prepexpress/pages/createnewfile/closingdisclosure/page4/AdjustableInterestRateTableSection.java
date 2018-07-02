package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page4;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdjustableInterestRateTableSection extends PageObject {
	@FindBy(id = "IndexTypeDescription")
	private WebElementFacade indexTypeDescriptionInputField;
	
	@FindBy(id = "MarginRatePercent")
	private WebElementFacade marginRatePercentInputField;
	
	@FindBy(id = "InitialInterestRatePercent")
	private WebElementFacade initialInterestRatePercentInputField;
	
	@FindBy(id = "MinimumInterestRatePercent")
	private WebElementFacade minimumInterestRatePercentInputField;
	
	@FindBy(id = "MaximumInterestRatePercent")
	private WebElementFacade maximumInterestRatePercentInputField;
	
	@FindBy(id = "InterestRateFirstRateChangeMonthsCount")
	private WebElementFacade interestRateChangeFrequencyFirstChangeInputField;
	
	@FindBy(id = "InterestRateSubsequentChangeMonthsCount")
	private WebElementFacade interestRateChangeFrequencySubsequentChangesInputField;
	
	@FindBy(id = "InterestRateFirstRateChangePercent")
	private WebElementFacade interestRateLimitOnChangesFirstChangeInputField;
	
	@FindBy(id = "InterestRateSubsequentChangePercent")
	private WebElementFacade interestRateLimitOnChangesSubsequentChangesInputField;
	
	@FindBy(id = "AIRPrintTable")
	private WebElementFacade printAIRTableOnPage4Checkbox;
}
