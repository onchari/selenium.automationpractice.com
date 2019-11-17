package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import myutilities.Constants;

public abstract class BasePage {
		 protected static WebDriver driver; 	
		 protected static WebDriverWait wait;
		 public static int timeOutInSeconds = Constants.TIME_OUT_IN_SECONNDS;
		 public static Actions actions = null;
		 
		public BasePage(WebDriver webDriver) {
			BasePage.driver = 	webDriver;	
			wait = new WebDriverWait(driver, timeOutInSeconds); 
			actions = new Actions(driver);
		}
		 

}
