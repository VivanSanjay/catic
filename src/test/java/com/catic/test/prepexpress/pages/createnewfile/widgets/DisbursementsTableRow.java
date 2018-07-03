
package com.catic.test.prepexpress.pages.createnewfile.widgets;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(DisbursementsTableRowImpl.class)
public interface DisbursementsTableRow extends WidgetObject {

	void save();


}
