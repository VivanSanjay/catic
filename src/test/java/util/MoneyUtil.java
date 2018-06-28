package util;

import java.math.BigDecimal;
import java.util.Locale;

import javax.money.Monetary;

import org.javamoney.moneta.Money;

public final class MoneyUtil {
	private MoneyUtil() {}
	
	/**
	 * Converts the given string to a {@link Money} object, representing US currency
	 * @param amount
	 * @return the {@link Money} object
	 */
	public static Money fromString(String amount) {
		return Money.of(new BigDecimal(amount), Monetary.getCurrency(Locale.US));
	}
	
	/**
	 * Converts the given {@link Money} object to a string representation of its numeric value
	 * @param amount
	 * @return the numeric value, as a string
	 */
	public static String toString(Money amount) {
		return Double.toString(amount.getNumber().doubleValue());
	}
}
