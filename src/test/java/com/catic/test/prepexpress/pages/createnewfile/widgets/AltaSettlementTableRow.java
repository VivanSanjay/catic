package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.javamoney.moneta.Money;

import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(AltaSettlementTableRowImpl.class)
public interface AltaSettlementTableRow extends WidgetObject {
	AltaSettlementTableRow enterSellerDebit(Money amount);
	
	Money getSellerDebit();
	
	AltaSettlementTableRow enterSellerCredit(Money amount);
	
	Money getSellerCredit();
	
	AltaSettlementTableRow enterDescription(String description);
	
	String getDescription();
	
	AltaSettlementTableRow enterBorrowerDebit(Money amount);
	
	Money getBorrowerDebit();
	
	AltaSettlementTableRow enterBorrowerCredit(Money amount);
	
	Money getBorrowerCredit();
	
	void save();
	
	void cancel();
	
	AltaSettlementTableRow edit();
	
	ConfirmDialog remove();
	
	void moveItemToDifferentCategory(String categoryName);
	
	void waitUntilEditable();
}
