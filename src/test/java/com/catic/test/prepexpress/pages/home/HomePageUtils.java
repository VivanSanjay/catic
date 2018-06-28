package com.catic.test.prepexpress.pages.home;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class HomePageUtils {
	private HomePageUtils() {}
	
	private static final DateTimeFormatter CREATED_BETWEEN_DATE_FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	
	/**
	 * Parses the given date string into a {@link LocalDate} object
	 * @param dateString
	 * @return the parsed date object
	 */
	public static LocalDate parseCreatedBetweenDateString(String dateString) {
		return LocalDate.parse(dateString, CREATED_BETWEEN_DATE_FORMATTER);
	}
	
	/**
	 * Formats the given {@link LocalDate} into a date string
	 * @param date
	 * @return the date string
	 */
	public static String formatCreatedBetweenDate(LocalDate date) {
		return CREATED_BETWEEN_DATE_FORMATTER.format(date);
	}
}
