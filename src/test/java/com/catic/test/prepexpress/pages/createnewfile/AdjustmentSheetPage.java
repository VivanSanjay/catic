package com.catic.test.prepexpress.pages.createnewfile;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.widgets.AdjustmentSheetTableRow;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AdjustmentSheetPage extends PageObject {
	@FindBy(xpath = "//tr[@cat-id='1']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@cat-id='2'])=1]")
	private List<AdjustmentSheetTableRow> creditsToSellerItems;
	
	@FindBy(id = "CreditsToSellerFooterValue")
	private WebElementFacade totalCreditsToSellerText;
	
	@FindBy(xpath = "//tr[@cat-id='2']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@cat-id='3'])=1]")
	private List<AdjustmentSheetTableRow> creditsToBuyerItems;
	
	@FindBy(id = "CreditsToBuyerFooterValue")
	private WebElementFacade totalCreditsToBuyerText;
	
	@FindBy(id = "CreditsToBuyerFooter2Amount")
	private WebElementFacade dueSellerFromBuyerText;
	
	@FindBy(xpath = "//tr[@cat-id='3']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@class='footer'])=1]")
	private List<AdjustmentSheetTableRow> payoffsItems;
	
	@FindBy(id = "PayOffsFooterValue")
	private WebElementFacade totalPayoffsText;
	
	@FindBy(id = "PayOffsFooter2Amount")
	private WebElementFacade netDueSellerFromBuyerText;
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
}
