package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class HomePage extends BasePage {

	private static  By product_img_link  = By.xpath("//a[@class=\"product_img_link\"]");

	static By signInLink = By.xpath("//a[@class=\"login\"]");

	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	// GETTERS

	private static WebElement getSignInLink() {
		return AutomationUtils.waitForElementToBeClickable(signInLink);
	}

	public static AuthenticationPage clickSignInLink() {
		getSignInLink().click();
		return new AuthenticationPage(driver);
	}

	public static Boolean verifyHomePageTitle() {
		String expectedTitle = "My Store";
		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			return true;
		}
		return false;
	}

	public static List<WebElement> getAllProductImgLink() {
		return AutomationUtils.waitForPresenceOfElements(product_img_link);
	}
	
	public static void quickViewFor() throws InterruptedException {
		WebElement element = getAllProductImgLink().get(4);
		actions.moveToElement(element);
		element.click();
		
		Thread.sleep(10000);;
	}
}
