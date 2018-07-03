package com.catic.test.prepexpress.pages.createnewfile.closingdisclosure.page4;

import java.math.BigDecimal;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webelements.Checkbox;

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
	
	public String getIndexTypeDescription() {
		return indexTypeDescriptionInputField.getValue();
	}
	
	public void enterIndexTypeDescription(String description) {
		indexTypeDescriptionInputField.type(description);
	}
	
	public BigDecimal getMarginRate() {
		return new BigDecimal(marginRatePercentInputField.getValue());
	}
	
	public void enterMarginRate(BigDecimal rate) {
		String value = rate.toPlainString();
		marginRatePercentInputField.type(value);
	}
	
	public BigDecimal getMinimumInterestRate() {
		return new BigDecimal(minimumInterestRatePercentInputField.getValue());
	}
	
	public void enterMinimumInterestRate(BigDecimal rate) {
		String value = rate.toPlainString();
		minimumInterestRatePercentInputField.type(value);
	}
	
	public BigDecimal getMaximumInterestRate() {
		return new BigDecimal(maximumInterestRatePercentInputField.getValue());
	}
	
	public void enterMaximumInterestRate(BigDecimal rate) {
		String value = rate.toPlainString();
		maximumInterestRatePercentInputField.type(value);
	}
	
	public String getFirstChangeMonthsCount() {
		return interestRateChangeFrequencyFirstChangeInputField.getValue();
	}
	
	public void enterFirstChangeMonthsCount(String count) {
		interestRateChangeFrequencyFirstChangeInputField.type(count);
	}
	
	public String getSubsequentChangesMonthsCount() {
		return interestRateChangeFrequencySubsequentChangesInputField.getValue();
	}
	
	public void enterSubsequentChangesMonthsCount(String count) {
		interestRateChangeFrequencySubsequentChangesInputField.type(count);
	}
	
	public BigDecimal getLimitOnInterestRateFirstChange() {
		return new BigDecimal(interestRateLimitOnChangesFirstChangeInputField.getValue());
	}
	
	public void enterLimitOnInterestRateFirstChange(BigDecimal rate) {
		String value = rate.toPlainString();
		interestRateLimitOnChangesFirstChangeInputField.type(value);
	}
	
	public BigDecimal getLimitOnInterestRateSubsequentChanges() {
		return new BigDecimal(interestRateLimitOnChangesSubsequentChangesInputField.getValue());
	}
	
	public void enterLimitOnInterestRateSubsequentChanges(BigDecimal rate) {
		String value = rate.toString();
		interestRateLimitOnChangesSubsequentChangesInputField.type(value);
	}
	
	public void setPrintAIRTableOnPage4(boolean value) {
		setCheckbox(printAIRTableOnPage4Checkbox, value);
	}
	
	public boolean printAIRTableOnPage4() {
		return new Checkbox(printAIRTableOnPage4Checkbox).isChecked();
	}
}
