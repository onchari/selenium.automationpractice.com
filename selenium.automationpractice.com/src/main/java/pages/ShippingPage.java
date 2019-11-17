package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class ShippingPage extends BasePage {

	private static By terms = By.id("cgv");

	public ShippingPage(WebDriver webDriver) {
		super(webDriver);
	}

	// ------------Agreeing to terms --------------------------------------
	public static WebElement getCartSummaryTermsCheckbox() {
		return AutomationUtils.waitForPresenceOfAutoElement(terms);
	}

	public static void clickCartSummaryTermsCheckbox() {
		WebElement element = getCartSummaryTermsCheckbox();
		actions.moveToElement(element);
		element.click();
	}
}
