package com.catic.test.prepexpress.pages.createnewfile.widgets;

import org.javamoney.moneta.Money;
import com.catic.test.prepexpress.pages.createnewfile.dialogs.ConfirmDialog;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(AdjustmentSheetTableRowImpl.class)
public interface AdjustmentSheetTableRow extends WidgetObject {

	void waitUntilEditable();

	AdjustmentSheetTableRow enterAmount(Money amount);
	
	Money getenterAmount();

	AdjustmentSheetTableRow enterDescription(String description);
	
	String getDescription();

	void save();
	
	void cancel();
	
	AdjustmentSheetTableRow edit();

	ConfirmDialog remove();


}
