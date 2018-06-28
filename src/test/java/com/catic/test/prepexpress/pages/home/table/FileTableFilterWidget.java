package com.catic.test.prepexpress.pages.home.table;

import java.time.LocalDate;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(FileTableFilterWidgetImpl.class)
public interface FileTableFilterWidget extends WidgetObject {
	/**
	 * Enters a search term into the filter options
	 * @param searchTerm
	 * @return this object
	 */
	FileTableFilterWidget setSearchTerm(String searchTerm);
	
	/**
	 * Returns the currently displayed value in the search input field
	 * @return the current value in search input field
	 */
	String getSearchTerm();
	
	/**
	 * Selects the 'Active Files Only' radio button
	 * @return this object
	 */
	FileTableFilterWidget setActiveFilesOnly();
	
	/**
	 * Returns whether the 'Active Files Only' radio button is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	boolean activeFilesOnly();
	
	/**
	 * Selects the 'All Files' radio button
	 * @return this object
	 */
	FileTableFilterWidget setAllFiles();
	
	/**
	 * Returns whether the 'All Files' radio button is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	boolean allFiles();
	
	/**
	 * Selects the 'Inactive Files Only' radio button
	 * @return this object
	 */
	FileTableFilterWidget setInactiveFilesOnly();
	
	/**
	 * Returns whether the 'Inactive Files Only' radio button is selected
	 * @return {@code true} if it is selected, {@code false} otherwise
	 */
	boolean inactiveFilesOnly();
	
	/**
	 * Sets the dates for the 'Created Between' filter
	 * @param from the start date
	 * @param to the end date
	 * @return this object
	 */
	FileTableFilterWidget setCreatedBetween(LocalDate from, LocalDate to);
	
	/**
	 * Sets the start date for the 'Created Between' filter
	 * @param start the start date
	 * @return this object
	 */
	FileTableFilterWidget setStartDate(LocalDate start);
	
	/**
	 * Returns the currently displayed value in the start date field for the 'Created Between' filter
	 * @return the currently displayed start date
	 */
	String getStartDate();
	
	/**
	 * Sets the end date for the 'Created Between' filter
	 * @param end the end date
	 * @return this object
	 */
	FileTableFilterWidget setEndDate(LocalDate end);
	
	/**
	 * Returns the currently displayed value in the end date field for the 'Created Between' filter
	 * @return the currently displayed end date
	 */
	String getEndDate();
	
	/**
	 * Clicks the 'Clear' button to clear filter options
	 * @return this object
	 */
	FileTableFilterWidget clickClear();
}
