package myutilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.swing.text.DefaultEditorKit.CopyAction;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	public Boolean waitForPageLoad() {
        ExpectedCondition<Boolean> pageLoadCondition = new 
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        return wait.until(pageLoadCondition);
    }
	
	
	public static void takeSnapShot(WebDriver webDriver, String pathname) {
		File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		try {
			File destFile = new File(pathname);
			FileUtils.copyFile(srcFile, destFile );
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
