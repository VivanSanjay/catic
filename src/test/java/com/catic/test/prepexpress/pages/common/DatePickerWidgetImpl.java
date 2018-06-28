package com.catic.test.prepexpress.pages.common;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WidgetObjectImpl;

public class DatePickerWidgetImpl extends WidgetObjectImpl implements DatePickerWidget {
	private static final By DATEPICKER_TABLE_LOCATOR = By.className("table-condensed");
	private static final By SWITCH_DATEPICKER_BTN_LOCATOR = By.className("datepicker-switch");
	private static final By ALL_YEARS_LOCATOR = By.xpath(".//span[contains(@class, 'year')]");
	
	private static final String DAY_TO_CLICK_LOCATOR = ".//td[contains(@class, 'day') and not(contains(@class, 'old')) and text()='%s']";
	private static final String MONTH_TO_CLICK_LOCATOR = ".//span[contains(@class, 'month') and text()='%s']";
	private static final String YEAR_TO_CLICK_LOCATOR = ".//span[contains(@class, 'year') and text()='%s']";
	
	private static final Map<Integer, String> MONTH_NUM_TO_ABBREV = initMonthMap();
	
	@FindBy(className = "datepicker-days")
	private WebElementFacade dayPicker;
	
	@FindBy(className = "datepicker-months")
	private WebElementFacade monthPicker;
	
	@FindBy(className = "datepicker-years")
	private WebElementFacade yearPicker;
	
	public DatePickerWidgetImpl(PageObject page, ElementLocator locator, long timeoutInMilliseconds) {
		super(page, locator, timeoutInMilliseconds);
	}

	public DatePickerWidgetImpl(PageObject page, ElementLocator locator, WebElement webElement,
			long timeoutInMilliseconds) {
		super(page, locator, webElement, timeoutInMilliseconds);
	}

	@Override
	public void pickDate(LocalDate date) {
		int yearToSelect = date.getYear();
		int monthToSelect = date.getMonthValue();
		int dayToSelect = date.getDayOfMonth();
		int displayedYear = getDisplayedYearOnDayPicker();
		
		if (yearToSelect != displayedYear) {
			WebElementFacade dayPickerSwitch = datepickerSwitch(dayPicker);
			
			// since year does not match when viewing the day picker, click twice to move to the year picker
			changePicker(dayPickerSwitch, monthPicker);
			WebElementFacade monthPickerSwitch = datepickerSwitch(monthPicker);
			changePicker(monthPickerSwitch, yearPicker);
			
			// search through the year picker until the year is found
			selectYear(yearToSelect);
		}
		else {
			// since the year is correct, move to the month picker
			// click once to move from the day picker to the month picker
			WebElementFacade dayPickerSwitch = datepickerSwitch(dayPicker);
			changePicker(dayPickerSwitch, monthPicker);
		}
		
		// select the correct month
		selectMonth(monthToSelect);
		
		// select the correct day
		selectDay(dayToSelect);
	}

	/**
	 * Changes the date picker being displayed.
	 * @param datepickerSwitch The date picker switch element of the currently displayed date picker
	 * @param datepicker The new date picker to be displayed
	 */
	private void changePicker(WebElementFacade datepickerSwitch, WebElementFacade datepicker) {
		datepickerSwitch.click();
		datepicker.waitUntilVisible();
	}
	
	/**
	 * Returns the integer value of the year currently displayed on the day date picker
	 * @return the currently displayed year
	 */
	private int getDisplayedYearOnDayPicker() {
		String yearMonth = datepickerSwitch(dayPicker).getText();
		String year = yearMonth.split(" ")[1];
		return Integer.valueOf(year);
	}
	
	/**
	 * Assuming that the year date picker is displayed, this will click the correct year on the date picker. This method 
	 * handles navigating to lists of previous and next years, as needed, until the target year is found and clicked.
	 * @param yearToSelect
	 */
	private void selectYear(int yearToSelect) {
		WebElementFacade yearPickerTable = datepickerTable(yearPicker);
		
		// 1. determine if the year to select is displayed by checking if it is in the range of displayed years
		// 2. if not, click prev/next depending on the given year, and go back to (1)
		List<WebElementFacade> yearElements = yearPickerTable.thenFindAll(ALL_YEARS_LOCATOR);
		int firstYearListed = Integer.valueOf(yearElements.get(0).getText());
		int lastYearListed = Integer.valueOf(yearElements.get(yearElements.size()-1).getText());
		
		if (yearToSelect < firstYearListed) {
			yearPickerTable.find(By.className("prev")).click();
			selectYear(yearToSelect);
		}
		else if (yearToSelect > lastYearListed) {
			yearPickerTable.find(By.className("next")).click();
			selectYear(yearToSelect);
		}
		else {
			By yearLocator = yearToClickLocator(yearToSelect);
			WebElementFacade yearToClick = yearPickerTable.find(yearLocator);
			yearToClick.click();
		}
	}
	
	/**
	 * Assuming that the month date picker is displayed, this will click the correct month
	 * @param monthToSelect the month to select, where 1 = Jan and 12 = December
	 */
	private void selectMonth(int monthToSelect) {
		WebElementFacade monthPickerTable = datepickerTable(monthPicker);
		By monthLocator = monthToClickLocator(monthToSelect);
		WebElementFacade monthToClick = monthPickerTable.find(monthLocator);
		monthToClick.click();
	}
	
	/**
	 * Assuming that the month date picker is displayed, this will correct day
	 * within the  currently selected month.
	 * @param dayToSelect the day to click, this refers to days within the month only
	 */
	private void selectDay(int dayToSelect) {
		WebElementFacade dayPickerTable = datepickerTable(dayPicker);
		By dayLocator = dayToClickLocator(dayToSelect);
		WebElementFacade dayToClick = dayPickerTable.find(dayLocator);
		dayToClick.click();
	}
	
	/**
	 * Assuming the day datepicker is displayed, this returns a valid locator for the actual 
	 * day element for the current month
	 * @param dayToClick must be within the current month
	 * @return the locator
	 */
	private static By dayToClickLocator(int dayToClick) {
		return By.xpath(String.format(DAY_TO_CLICK_LOCATOR, dayToClick));
	}
	
	/**
	 * Assuming the month datepicker is displayed, this returns a valid locator for the actual
	 * month element
	 * @param monthToClick the month to select, where January = 1 and December = 12
	 * @return the locator
	 */
	private static By monthToClickLocator(int monthToClick) {
		String abbrev = MONTH_NUM_TO_ABBREV.get(monthToClick);
		return By.xpath(String.format(MONTH_TO_CLICK_LOCATOR, abbrev));
	}
	
	/**
	 * Assuming the year datepicker is displayed, this returns a valid locator for the actual year element
	 * @param yearToClick
	 * @return the locator
	 */
	private static By yearToClickLocator(int yearToClick) {
		return By.xpath(String.format(YEAR_TO_CLICK_LOCATOR, yearToClick));
	}
	
	/**
	 * The inner table for the given date picker. This table contains the actual date related values.
	 * (such as day, month, year)
	 * @param datePicker
	 * @return the inner table of the given date picker
	 */
	private static WebElementFacade datepickerTable(WebElementFacade datePicker) {
		return datePicker.find(DATEPICKER_TABLE_LOCATOR);
	}
	
	/**
	 * The button to switch the date picker between days, months, and years
	 * @param datePicker
	 * @return the switcher button
	 */
	private static WebElementFacade datepickerSwitch(WebElementFacade datePicker) {
		return datepickerTable(datePicker).find(SWITCH_DATEPICKER_BTN_LOCATOR);
	}
	
	private static Map<Integer, String> initMonthMap() {
		Map<Integer, String> m = new HashMap<>();
		m.put(1, "Jan");
		m.put(2, "Feb");
		m.put(3, "Mar");
		m.put(4, "Apr");
		m.put(5, "May");
		m.put(6, "Jun");
		m.put(7, "Jul");
		m.put(8, "Aug");
		m.put(9, "Sep");
		m.put(10, "Oct");
		m.put(11, "Nov");
		m.put(12, "Dec");
		return m;
	}
}
