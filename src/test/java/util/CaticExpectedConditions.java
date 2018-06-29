package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.javascript.JavascriptExecutorFacade;

public final class CaticExpectedConditions {
	private CaticExpectedConditions() {}
	
	/**
	 * An expectation that the document reaches the desired document.readyState
	 * @param readyState The expected state
	 * @return true when the document has the specified readyState value
	 */
	public static ExpectedCondition<Boolean> pageHasReadyState(final DocumentReadyState readyState) {
		return new ExpectedCondition<Boolean>() {
			private String currentReadyState = null;
			
			@Override
			public Boolean apply(WebDriver input) {
				Object temp = null;
				
				try {
					JavascriptExecutorFacade executor = new JavascriptExecutorFacade(input);
					temp = executor.executeScript("return document.readyState");
				} catch (Exception e) {}
				
				if (temp == null) {
					return null;
				}
				
				currentReadyState = temp.toString().trim();
				
				return currentReadyState.equalsIgnoreCase(readyState.getStateName());
			}
			
			@Override
			public String toString() {
				return String.format("page has document.readyState: %s", readyState.getStateName());
			}
		};
	}
	
	/**
	 * An expectation that a given {@link WebElementFacade} contains the given classes
	 * @param element
	 * @param classes
	 * @return true if the element contains all the given classes
	 */
	public static ExpectedCondition<Boolean> elementHasClasses(final WebElementFacade element, final String... classes) {
		return new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver input) {
				boolean hasClasses = true;
				
				for (String clazz : classes) {
					if (!element.hasClass(clazz)) {
						hasClasses = false;
						break;
					}
				}
				
				return hasClasses;
			}
			
			@Override
			public String toString() {
				return String.format("element (%s) has class(es): %s", element, "[" + String.join(",", classes) + "]");
			}
		};
	}
}
