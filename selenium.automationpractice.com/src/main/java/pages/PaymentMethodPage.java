package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class PaymentMethodPage extends BasePage{

	private static By paymentMethods = By.xpath("//p[@class=\"payment_module\"]");
	private static By confirmCheque = By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]");
	private static By success = By.xpath("//p[@class=\"alert alert-success\"]");
	
	public PaymentMethodPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	public static List<WebElement> paymentMethods() {
		return AutomationUtils.waitForPresenceOfElements(paymentMethods);
	}
	
	public static void selectPaymentMethod(int index) {
		WebElement element = paymentMethods().get(index);
		element.click();
	}
	
	public static WebElement  getIConfirmMyOrderBtn() {
	   return AutomationUtils.waitForElementToBeClickable(confirmCheque);
	}
	
	public static void clickIConfirmMyOrderBtn() {
		WebElement element = getIConfirmMyOrderBtn();
		actions.moveToElement(element);
		element.click();
	}
	
	public static WebElement getOrderSuccess() {
		return AutomationUtils.waitForPresenceOfAutoElement(success);
	}

}
