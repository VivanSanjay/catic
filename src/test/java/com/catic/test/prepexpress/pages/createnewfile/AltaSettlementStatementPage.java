package com.catic.test.prepexpress.pages.createnewfile;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.javamoney.moneta.Money;
import org.openqa.selenium.support.FindBy;

import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;
import com.catic.test.prepexpress.pages.createnewfile.widgets.AltaSettlementTableRow;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment;
import com.catic.test.prepexpress.pages.navbar.GenericCreateNewFileNavBarFragment.ActionsMenu;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import util.MoneyUtil;

public class AltaSettlementStatementPage extends PageObject {
	@FindBy(xpath = "//tr[@cat-id='1']/following-sibling::tr[count(following-sibling::tr[@cat-id='2'])=1]")
	private List<AltaSettlementTableRow> financialItems;
	
	@FindBy(xpath = "//tr[@cat-id='2']/following-sibling::tr[count(following-sibling::tr[@cat-id='3'])=1]")
	private List<AltaSettlementTableRow> prorationsOrAdjustmentsItems;
	
	@FindBy(xpath = "//tr[@cat-id='3']/following-sibling::tr[count(following-sibling::tr[@cat-id='4'])=1]")
	private List<AltaSettlementTableRow> loanChargesItems;
	
	@FindBy(xpath = "//tr[@cat-id='4']/following-sibling::tr[count(following-sibling::tr[@cat-id='5'])=1]")
	private List<AltaSettlementTableRow> otherLoanChargesItems;
	
	@FindBy(xpath = "//tr[@cat-id='5']/following-sibling::tr[count(following-sibling::tr[@cat-id='6'])=1]")
	private List<AltaSettlementTableRow> impoundsItems;
	
	@FindBy(xpath = "//tr[@cat-id='6']/following-sibling::tr[count(following-sibling::tr[@cat-id='7'])=1]")
	private List<AltaSettlementTableRow> titleSettlementItems;
	
	@FindBy(xpath = "//tr[@cat-id='7']/following-sibling::tr[count(following-sibling::tr[@cat-id='8'])=1]")
	private List<AltaSettlementTableRow> commissionItems;
	
	@FindBy(xpath = "//tr[@cat-id='8']/following-sibling::tr[count(following-sibling::tr[@cat-id='9'])=1]")
	private List<AltaSettlementTableRow> governmentChargesItems;
	
	@FindBy(xpath = "//tr[@cat-id='9']/following-sibling::tr[count(following-sibling::tr[@cat-id='10'])=1]")
	private List<AltaSettlementTableRow> paysOffsItems;
	
	@FindBy(xpath = "//tr[@cat-id='10']/following-sibling::tr")
	private List<AltaSettlementTableRow> miscellaneousItems;
	
	@FindBy(xpath = "//tr[contains(@class, 'rowSelected')]")
	private AltaSettlementTableRow selectedRow;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[1]")
	private WebElementFacade addFinancialItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[2]")
	private WebElementFacade addProrationsAdjustmentsItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[3]")
	private WebElementFacade addLoanChargesItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[4]")
	private WebElementFacade addOtherLoanChargesItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[5]")
	private WebElementFacade addImpoundsItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[6]")
	private WebElementFacade addTitleSettlementItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[7]")
	private WebElementFacade addCommissionItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[8]")
	private WebElementFacade addGovernmentChargesItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[9]")
	private WebElementFacade addPayOffsItemButton;
	
	@FindBy(xpath = "(//a[@title='Add Item'])[10]")
	private WebElementFacade addMiscellaneousItemButton;
	
	@FindBy(xpath = "(//td[@class='totals'][1])[1]/span")
	private WebElementFacade sellerDebitSubtotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][2])[1]/span")
	private WebElementFacade sellerCreditSubtotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][3])[1]/span")
	private WebElementFacade borrowerDebitSubtotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][4])[1]/span")
	private WebElementFacade borrowerCreditSubtotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][1])[2]/span")
	private WebElementFacade borrowerDebitDueToBorrowerText;
	
	@FindBy(xpath = "(//td[@class='totals'][2])[2]/span")
	private WebElementFacade borrowerCreditDueToBorrowerText;
	
	@FindBy(xpath = "(//td[@class='totals'][1])[3]/span")
	private WebElementFacade sellerDebitDueToSellerText;
	
	@FindBy(xpath = "(//td[@class='totals'][2])[3]/span")
	private WebElementFacade sellerCreditDueToSellerText;
	
	@FindBy(xpath = "(//td[@class='totals'][1])[4]/span")
	private WebElementFacade sellerDebitTotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][2])[4]/span")
	private WebElementFacade sellerCreditTotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][3])[2]/span")
	private WebElementFacade borrowerDebitTotalText;
	
	@FindBy(xpath = "(//td[@class='totals'][4])[2]/span")
	private WebElementFacade borrowerCreditTotalText;
	
	public AltaSettlementTableRow findFirstFinancialItemByDescription(String description) {
		return findFirstItemByDescription("Financial", description, financialItems);
	}
	
	public AltaSettlementTableRow findFirstProrationsOrAdjustmentsItemByDescription(String description) {
		return findFirstItemByDescription("Prorations/Adjustments", description, prorationsOrAdjustmentsItems);
	}
	
	public AltaSettlementTableRow findFirstLoanChargesItemByDescription(String description) {
		return findFirstItemByDescription("Loan Charges", description, loanChargesItems);
	}
	
	public AltaSettlementTableRow findFirstOtherLoanChargesItemByDescription(String description) {
		return findFirstItemByDescription("Other Loan Charges", description, otherLoanChargesItems);
	}
	
	public AltaSettlementTableRow findFirstImpoundsItemByDescription(String description) {
		return findFirstItemByDescription("Impounds", description, impoundsItems);
	}
	
	public AltaSettlementTableRow findFirstTitleSettlementItemByDescription(String description) {
		return findFirstItemByDescription("Title Settlement", description, titleSettlementItems);
	}
	
	public AltaSettlementTableRow findFirstCommissionItemByDescription(String description) {
		return findFirstItemByDescription("Commission", description, commissionItems);
	}
	
	public AltaSettlementTableRow findFirstGovernmentChargesItemByDescription(String description) {
		return findFirstItemByDescription("Government Charges", description, governmentChargesItems);
	}
	
	public AltaSettlementTableRow findFirstPayOffsItemByDescription(String description) {
		return findFirstItemByDescription("Payoffs", description, paysOffsItems);
	}
	
	public AltaSettlementTableRow findFirstMiscellaneousItemByDescription(String description) {
		return findFirstItemByDescription("Miscellaneous", description, miscellaneousItems);
	}
	
	public AltaSettlementTableRow addFinancialItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addFinancialItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
		
	public AltaSettlementTableRow addProrationsOrAdjustmentsItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addProrationsAdjustmentsItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public AltaSettlementTableRow addLoanChargesItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addLoanChargesItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public AltaSettlementTableRow addOtherLoanChargesItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addOtherLoanChargesItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public AltaSettlementTableRow addImpoundsItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addImpoundsItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public AltaSettlementTableRow addTitleSettlementItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addTitleSettlementItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	
	public AltaSettlementTableRow addCommissionItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addCommissionItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public AltaSettlementTableRow addGovernmentChargesItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addGovernmentChargesItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	
	public AltaSettlementTableRow addPayOffsItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addPayOffsItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	
	public AltaSettlementTableRow addMiscellaneousItem(Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		return addItem(addMiscellaneousItemButton, sellerDebit, sellerCredit, description, borrowerDebit, borrowerCredit);
	}
	
	public ConfirmDialog removeFinancialItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstFinancialItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeProrationsOrAdjustmentsItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstProrationsOrAdjustmentsItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeLoanChargesItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstLoanChargesItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeOtherLoanChargesItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstOtherLoanChargesItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeImpoundsItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstImpoundsItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeTitleSettlementItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstTitleSettlementItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeCommissionByDescription(String description) {
		AltaSettlementTableRow row = findFirstCommissionItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeGovernmentChargesItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstGovernmentChargesItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removePayOffsItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstPayOffsItemByDescription(description);
		return row.remove();
	}
	
	public ConfirmDialog removeMiscellaneousItemByDescription(String description) {
		AltaSettlementTableRow row = findFirstMiscellaneousItemByDescription(description);
		return row.remove();
	}
	
	public Money getSellerDebitSubtotal() {
		return getMoneyAmount(sellerDebitSubtotalText);
	}
	
	public Money getSellerCreditSubtotal() {
		return getMoneyAmount(sellerCreditSubtotalText);
	}
	
	public Money getBorrowerDebitSubtotal() {
		return getMoneyAmount(borrowerDebitSubtotalText);
	}
	
	public Money getBorrowerCreditSubtotal() {
		return getMoneyAmount(borrowerCreditSubtotalText);
	}
	
	public Money getBorrowerDebitDueToBorrower() {
		return getMoneyAmount(borrowerDebitDueToBorrowerText);
	}
	
	public Money getBorrowerCreditDueToBorrower() {
		return getMoneyAmount(borrowerCreditDueToBorrowerText);
	}
	
	public Money getSellerDebitDueToSeller() {
		return getMoneyAmount(sellerDebitDueToSellerText);
	}
	
	public Money getSellerCreditDueToSeller() {
		return getMoneyAmount(sellerCreditDueToSellerText);
	}
	
	public Money getSellerDebitTotal() {
		return getMoneyAmount(sellerDebitTotalText);
	}
	
	public Money getSellerCreditTotal() {
		return getMoneyAmount(sellerCreditTotalText);
	}
	
	public Money getBorrowerDebitTotal() {
		return getMoneyAmount(borrowerDebitTotalText);
	}
	
	public Money getBorrowerCreditTotal() {
		return getMoneyAmount(borrowerCreditTotalText);
	}
	
	public ActionsMenu actions() {
		return navigation().actions();
	}
	
	public void closeFile() {
		navigation().closeFile();
	}
	
	private GenericCreateNewFileNavBarFragment navigation() {
		return GenericCreateNewFileNavBarFragment.from(this);
	}
	
	private AltaSettlementTableRow findFirstItemByDescription(String category, String description, List<AltaSettlementTableRow> items) {
		AltaSettlementTableRow ret = null;
		
		for (AltaSettlementTableRow item : items) {
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
	
	private AltaSettlementTableRow addItem(WebElementFacade addItemButton, Money sellerDebit, Money sellerCredit, String description, Money borrowerDebit, Money borrowerCredit) {
		addItemButton.click();
		selectedRow.waitUntilEditable();
		selectedRow.enterSellerDebit(sellerDebit);
		selectedRow.enterSellerCredit(sellerCredit);
		selectedRow.enterDescription(description);
		selectedRow.enterBorrowerDebit(borrowerDebit);
		selectedRow.enterBorrowerCredit(borrowerCredit);
		return selectedRow;
	}
	
	private Money getMoneyAmount(WebElementFacade element) {
		return MoneyUtil.fromString(element.getText());
	}
}
