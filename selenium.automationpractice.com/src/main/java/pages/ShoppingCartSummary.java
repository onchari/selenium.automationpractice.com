package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class ShoppingCartSummary extends BasePage {

	private static By checkout = By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]");
	
	public ShoppingCartSummary(WebDriver webDriver) {
		super(webDriver);
	}
	
	// checkout button
		public static WebElement getCheckoutBtn() {
			return AutomationUtils.waitForElementToBeClickable(checkout);
		}
		
		public static void  clickCheckOutFromCartSummarry() {
			getCheckoutBtn().click();	
		}

}
