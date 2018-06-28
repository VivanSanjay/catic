package com.catic.test.prepexpress.pages.home.table;

import java.util.Map;

import com.catic.test.prepexpress.pages.createnewfile.GenInfoPage;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FileTableRowWidgetImpl.class)
public interface FileTableRowWidget extends WidgetObject {
	/**
	 * Returns raw data for this row
	 * @return a {@link Map} of column name (or number, starting from 0) to the raw text value contained in the cell
	 */
	Map<Object, String> getData();
	
	/**
	 * Returns text data for the column with this name
	 * @param columnName
	 * @return text data contained in the given column for this row
	 */
	String getCellValueAt(String columnName);
	
	/**
	 * Clicks the 'File Name' cell of this row, landing on the {@link GenInfoPage}
	 * @return a {@link GenInfoPage}
	 */
	GenInfoPage open();
	
	/**
	 * Opens the Action menu for this row
	 * @return the action menu widget
	 */
	FileTableActionMenu actionMenu();
}
