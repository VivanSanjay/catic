package com.catic.test.prepexpress.pages.createnewfile;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;
import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;
import com.catic.test.prepexpress.pages.createnewfile.widgets.AdjustmentSheetTableRow;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class AdjustmentSheetPage extends PageObject {
	@FindBy(xpath = "//tr[@cat-id='1']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@cat-id='2'])=1]")
	private List<AdjustmentSheetTableRow> creditsToSellerItems;
	
	@FindBy(xpath = "//tr[@cat-id='2']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@cat-id='3'])=1]")
	private List<AdjustmentSheetTableRow> creditsToBuyerItems;
	
	@FindBy(xpath = "//tr[@cat-id='3']/following-sibling::tr[@class='dataRow' and count(following-sibling::tr[@class='footer'])=1]")
	private List<AdjustmentSheetTableRow> payoffsItems;
	
	@FindBy(xpath = "//tr[contains(@class, 'rowSelected')]")
	private AdjustmentSheetTableRow selectedRow;
	
	@FindBy(xpath = "(//i[@class='icon-large icon-plus'])[1]")
	private WebElementFacade creditsToSellerAddButton;
	
	@FindBy(xpath = "(//i[@class='icon-large icon-plus'])[2]")
	private WebElementFacade creditsToBuyerAddButton;
	
	@FindBy(xpath = "(//i[@class='icon-large icon-plus'])[3]")
	private WebElementFacade payOffsAddButton;
	
	@FindBy(id = "CreditsToSellerFooterValue")
	private WebElementFacade totalCreditsToSellerText;
	
	@FindBy(id = "CreditsToBuyerFooterValue")
	private WebElementFacade totalCreditsToBuyerText;
	
	@FindBy(id = "CreditsToBuyerFooter2Amount")
	private WebElementFacade dueSellerFromBuyerText;
	
	@FindBy(id = "PayOffsFooterValue")
	private WebElementFacade totalPayoffsText;
	
	@FindBy(id = "PayOffsFooter2Amount")
	private WebElementFacade netDueSellerFromBuyerText;

	
	public AdjustmentSheetTableRow findCreditToSellerItemByDescription(String description){
		return findFirstItemByDescription("Credit To Seller", description, creditsToSellerItems);
	}
	
	public AdjustmentSheetTableRow findCreditToBuyerItemByDescription(String description) {
		return findFirstItemByDescription("Credit To Buyer", description, creditsToBuyerItems);
	}
	
	public AdjustmentSheetTableRow findPayoffsItemByDescription(String description) {
		return findFirstItemByDescription("Pay Offs", description, payoffsItems);
	}
	
	public AdjustmentSheetTableRow addCreditsToSellerItem(String description, Money amount) {
		return addItem(creditsToSellerAddButton, description, amount);
	}
	
	public AdjustmentSheetTableRow addCreditsToBuyerItem(String description, Money amount) {
		return addItem(creditsToBuyerAddButton, description, amount);
	}
	
	public AdjustmentSheetTableRow addPayOffsItem(String description, Money amount) {
		return addItem(payOffsAddButton, description, amount);
	}
	
	public ConfirmDialog removeCreditToBuyerItemByDescription(String description) {
		AdjustmentSheetTableRow row = findCreditToBuyerItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeCreditToSellerItemByDescription(String description) {
		AdjustmentSheetTableRow row = findCreditToSellerItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removePayoffsItemByDescription(String description) {
		AdjustmentSheetTableRow row = findPayoffsItemByDescription(description);
		return row.remove();
	}
	
	public Money getCreditToSellertotal() {
		return getMoneyAmount(totalCreditsToSellerText);
	}
	
	public Money getCreditToBuyertotal() {
		return getMoneyAmount(totalCreditsToBuyerText);
	}
	
	public Money getPayOffstotal() {
		return getMoneyAmount(totalPayoffsText);
	}

	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
	
	private AdjustmentSheetTableRow findFirstItemByDescription(String category, String description, List<AdjustmentSheetTableRow> items) {
		AdjustmentSheetTableRow ret = null;
		
		for (AdjustmentSheetTableRow item : items) {
			String curDescription = item.getDescription();
			
			if (StringUtils.equals(description, curDescription)) {
				ret = item;
				break;
			}
		}
		
		if (ret == null) {
			throw new AssertionError("Expected to find a(n) " + category + " item with description " + description);
		}
		
		return ret;
	}
	
	private AdjustmentSheetTableRow addItem(WebElementFacade addItemButton,String description, Money amount) {
		addItemButton.click();
		selectedRow.waitUntilEditable();
		selectedRow.enterAmount(amount);
		selectedRow.enterDescription(description);
		return selectedRow;
	}
	
	private Money getMoneyAmount(WebElementFacade element) {
		return MoneyUtil.fromString(element.getText());
	}
	
}
