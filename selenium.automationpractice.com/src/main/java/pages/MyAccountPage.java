package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import myutilities.AutomationUtils;

public class MyAccountPage extends BasePage {
	static By logoutLink = By.className("logout");
	///span[contains(text(), \"Onchari Wycliffe\")]

	static By customName = By.xpath("//a[@class = \"account\"]");
	
	public MyAccountPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public static WebElement getCustomerName() {
		return AutomationUtils.waitForPresenceOfAutoElement(customName);
	}
	
	public static WebElement getLogoutLink() {
		return AutomationUtils.waitForLinkToBeClickable(logoutLink);
	}
	
	//
	public static WebElement verifyCustomerName(String customer) {
		customer = "Wycliffe Onchari";
		By locator = By.xpath("//a[@class = \"account\"]/span[contains(text(), \" " + customer  +"\")]");
		return AutomationUtils.waitForPresenceOfAutoElement(locator);
	}
	
	
	public static void signOut() {
		getLogoutLink().click();
	}

}
