package myutilities;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.BasePage;

public class AutomationUtils extends BasePage {


	public AutomationUtils(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	
	public static WebElement waitForElementToBeClickable(By locator) {		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));	
	}

    public static WebElement waitForElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static WebElement waitForPresenceOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}

	public static WebElement waitForVisibilityOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static List<WebElement> waitForPresenceOfElements(By locator) {
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));	
	}
	
	
	 public static String generateTestEmail() {

         String generatedEmail ="";
         String prefixString = "@automationpractice.com";
       
         String email = "";
        
         String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
         StringBuilder salt = new StringBuilder();
         Random rnd = new Random();
         
            
         while (salt.length() < 6) { // length of the random string.
             int index = (int) (rnd.nextFloat() * SALTCHARS.length());
             salt.append(SALTCHARS.charAt(index));
         }      
         generatedEmail = salt.toString();
         email = generatedEmail + prefixString;

        return email;
    }
	 
	 
	 //--------------Refresh browser using JS 
	 public static void refreshBrowser() {
		js.executeScript("history.go(0)");
	}
	 
	 //-----scroll the page 
	 public static void scrollPageHeight() {
		
	}



	public static void createAnAccount(String generateTestEmail) {
		// TODO Auto-generated method stub
		
	}
}
