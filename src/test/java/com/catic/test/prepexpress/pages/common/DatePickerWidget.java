package com.catic.test.prepexpress.pages.common;

import java.time.LocalDate;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(DatePickerWidgetImpl.class)
public interface DatePickerWidget extends WidgetObject {
	/**
	 * Selects the given date from the date picker
	 * @param date
	 */
	void pickDate(LocalDate date);
}
