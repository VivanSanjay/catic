package com.catic.test.prepexpress.pages.home.table;

import java.util.List;
import java.util.Map;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;
import net.thucydides.core.matchers.BeanMatcher;

@ImplementedBy(FileTableWidgetImpl.class)
public interface FileTableWidget extends WidgetObject {
	/**
	 * The list of currently displayed column names, from left to right
	 * @return list of column names
	 */
	List<String> getColumnNames();
	
	/**
	 * Checks if the given column name is currently visible in the table
	 * @param columnName the column name to check
	 * @return {@code true} if the column is currently displayed, {@code false} otherwise
	 */
	boolean hasColumn(String columnName);
	
	/**
	 * Returns a list of rows with data for the given columns, assuming the given 
	 * columns appear left to right in the table
	 * @param columnNames
	 * @return the list of row elements
	 */
	List<FileTableRowWidget> getRowElementsFor(List<String> columnNames);
	
	/**
	 * Returns a list of rows with data for all displayed columns
	 * @return the list of row elements
	 */
	List<FileTableRowWidget> getRowElements();
	
	/**
	 * Returns a list of rows where the row elements satisfy the given matching criteria.
	 * @param matchers zero or more {@link BeanMatcher}s, refer to {@link net.thucydides.core.matchers.BeanMatchers BeanMatchers} for available matching criteria
	 * @return the list of row elements
	 */
	List<FileTableRowWidget> getRowElementsWhere(BeanMatcher... matchers);
	
	/**
	 * Returns data for all currently displayed rows in the table
	 * @return a list of {@link Map}s of column name (or number, starting from 0) to raw text value in the cell
	 */
	List<Map<Object, String>> getRows();
	
	/**
	 * Returns the first row that satisfies all the given matching criteria.
	 * @param matchers zero or more {@link BeanMatcher}s, refer to {@link net.thucydides.core.matchers.BeanMatchers BeanMatchers} for available matching criteria
	 * @return the row element
	 */
	FileTableRowWidget findFirstRowElementWhere(BeanMatcher... matchers);
	
	/**
	 * Returns the first row with the given value in the <tt>File Name</tt> column
	 * @param fileName the file name to check
	 * @return the row element
	 */
	FileTableRowWidget findFirstRowElementByFileName(String fileName);
	
	/**
	 * Checks if the data currently displayed in the table contains any row(s) matching the given criteria
	 * @param matchers zero or more {@link BeanMatcher}s, refer to {@link net.thucydides.core.matchers.BeanMatchers BeanMatchers} for available matching criteria
	 * @return
	 */
	boolean containsRowElementsWhere(BeanMatcher... matchers);
	
	/**
	 * Returns a {@link FileTableFilterWidget} to control the filter options above the table
	 * @return the filter options widget
	 */
	FileTableFilterWidget filterOptions();
	
	/**
	 * Sets the sorting for this column to ascending
	 * @param columnName
	 * @return the same table
	 */
	FileTableWidget sortAscendingFor(String columnName);
	
	/**
	 * Sets the sorting for this column to descending
	 * @param columnName
	 * @return the same table
	 */
	FileTableWidget sortDescendingFor(String columnName);
	
	/**
	 * Checks if this column is sorted in ascending order
	 * @param columnName
	 * @return {@code true} if the column is sorted in ascending order, {@code false} otherwise
	 */
	boolean isSortedAscendingBy(String columnName);
	
	/**
	 * Checks if this column is sorted in descending order
	 * @param columnName
	 * @return {@code true} if the column is sorted in descending order, {@code false} otherwise
	 */
	boolean isSortedDescendingBy(String columnName);
	
	/**
	 * Adds the given column to the table, making the column visible
	 * @param columnName
	 * @return the same table
	 */
	FileTableWidget addColumn(String columnName);
	
	/**
	 * Removes the given column from the table, making the column invisible
	 * @param columnName
	 * @return the same table
	 */
	FileTableWidget removeColumn(String columnName);
	
	/**
	 * Returns the total number of entries indicated below the table
	 * @return the value for the total number of entries
	 */
	int totalEntries();
	
	/**
	 * Returns the value of the currently displayed page on the table
	 * @return the currently displayed page
	 */
	int currentPage();
	
	/**
	 * Navigates to the previous page in the table results
	 * @return the same table
	 */
	FileTableWidget previousPage();
	
	/**
	 * Checks if there is a previous page to navigate to
	 * @return {@code true} if the page can be navigated to, {@code false} otherwise
	 */
	boolean hasPreviousPage();
	
	/**
	 * Navigates to the next page in the table results
	 * @return the same table
	 */
	FileTableWidget nextPage();
	
	/**
	 * Checks if there is a next page to navigate to
	 * @return {@code true} if the page can be navigated to, {@code false} otherwise
	 */
	boolean hasNextPage();
}
