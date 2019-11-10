package myutilities;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.BasePage;

public class AutomationUtils extends BasePage {


	public AutomationUtils(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	
	public static WebElement waitForLinkToBeClickable(By locator) {		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));	
	}


	public static WebElement waitForPresenceOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}

	public static WebElement waitForVisibilityOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	
	 public static String generateTestEmail() {

         String generatedEmail ="";
         String prefixString = "@automationpractice.com";
         String testString = "test"; 
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



	public static void createAnAccount(String generateTestEmail) {
		// TODO Auto-generated method stub
		
	}
}
