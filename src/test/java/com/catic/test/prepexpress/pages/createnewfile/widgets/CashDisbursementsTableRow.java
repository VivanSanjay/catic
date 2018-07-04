
package com.catic.test.prepexpress.pages.createnewfile.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(CashDisbursementsTableRowImpl.class)
public interface CashDisbursementsTableRow  extends WidgetObject {

	void save();

	void cancel();


}
