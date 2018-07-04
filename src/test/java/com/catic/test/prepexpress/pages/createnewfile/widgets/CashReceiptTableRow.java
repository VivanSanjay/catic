
package com.catic.test.prepexpress.pages.createnewfile.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(CashReceiptTableRowImpl.class)
public interface CashReceiptTableRow  extends WidgetObject {
	
	void cancel();


}
