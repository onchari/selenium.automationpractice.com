package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class ShippingPage extends BasePage {

	private static By fancyboxError = By.xpath("//p[@class=\"fancybox-error\"]");
	private static By closefancybox = By.xpath("//a[@class=\"fancybox-item fancybox-close\"]");
	
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
	
	//----------------Fancy box --------------------------------------------
	public WebElement getFancyBoxMessage() {
		return AutomationUtils.waitForPresenceOfAutoElement(fancyboxError);
	}
	
	public static WebElement getFancyBoxCloseBtn() {
		return AutomationUtils.waitForElementToBeClickable(closefancybox);
	}
	
	public static void closeFancyBoxBtn() throws InterruptedException {
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", getFancyBoxCloseBtn());
		Thread.sleep(3000);
		//getFancyBoxCloseBtn().click();;
	}
}
