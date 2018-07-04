package com.catic.test.poc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.catic.test.prepexpress.model.DisclosureType;
import com.catic.test.prepexpress.steps.AltaSettlementStatementSteps;
import com.catic.test.prepexpress.steps.BasicCreateNewFileNavigationSteps;
import com.catic.test.prepexpress.steps.HomeNavigationSteps;
import com.catic.test.prepexpress.steps.HomeSteps;
import com.catic.test.prepexpress.steps.LoginSteps;
import com.catic.test.prepexpress.steps.ReportsNavigationSteps;
import com.catic.test.prepexpress.steps.SellerEditorSteps;
import com.catic.test.prepexpress.steps.ToolsNavigationSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import util.MoneyUtil;

@RunWith(SerenityRunner.class)
public class PoCTestSuite {
	@Managed
	private WebDriver driver;
	
	@Steps
	private LoginSteps login;
	
	@Steps
	private HomeNavigationSteps homeNavSteps;
	
	@Steps
	private HomeSteps homeSteps;
	
	@Steps
	private BasicCreateNewFileNavigationSteps createNewFileNavSteps;
	
	@Steps
	private ToolsNavigationSteps toolsNavSteps;
	
	@Steps
	private ReportsNavigationSteps reportsNavSteps;
	
	@Steps
	private AltaSettlementStatementSteps altaSteps;
	
	@Steps
	private SellerEditorSteps sellerEditorSteps;

	
	@Test
	public void test() {
		login.loginIntoPrepExpressAs("6852AR", "6852Mar!");
		
		homeSteps.createNewFileWithRandomizedName("Alex PoC Test", "", "", DisclosureType.CD);
		createNewFileNavSteps.goToAltaSettlementStatement();
		
		altaSteps.addFinancialItemAndSave(
				MoneyUtil.fromString("20"), 
				MoneyUtil.fromString("25.20"), 
				"Financial Item 1", 
				MoneyUtil.fromString("15.37"), 
				MoneyUtil.fromString("7.03"));
		
		altaSteps.addLoanChargesItemAndSave(
				MoneyUtil.fromString("100"), 
				MoneyUtil.fromString("100"), 
				"Loan Charges Item 1", 
				MoneyUtil.fromString("8.03"), 
				MoneyUtil.fromString("5.05"));
		
		altaSteps.addOtherLoanChargesItemAndSave(
				MoneyUtil.fromString("0.05"), 
				MoneyUtil.fromString("1.00"), 
				"Other Loan Charges Item 1", 
				MoneyUtil.fromString("3.50"), 
				MoneyUtil.fromString("3.33"));
		
		altaSteps.addMiscellaneousItemAndSave(
				MoneyUtil.fromString("20"), 
				MoneyUtil.fromString("10"), 
				"Miscellaneous Item 1", 
				MoneyUtil.fromString("5"), 
				MoneyUtil.fromString("55"));
		
		createNewFileNavSteps.goToHome();
		
		homeSteps.logOff();
	}
	
	@Test
	public void test1() throws Exception {
		login.loginIntoPrepExpressAs("6853AR", "6853Mar!");
		
		homeSteps.createNewFileWithRandomizedName("Alex PoC Test", "", "", DisclosureType.CD);
		createNewFileNavSteps.goTo1099S();
		sellerEditorSteps.addSellerEditorSave("abcde", "123", "123 street", "Atlanta", "xyz", "12345", "123", MoneyUtil.fromString("20"), MoneyUtil.fromString("200"));
		Thread.sleep(2000);
		
	    //createNewFileNavSteps.goToHome();
	   //homeSteps.logOff();
	}

}
