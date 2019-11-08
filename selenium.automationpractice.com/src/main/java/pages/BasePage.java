package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import myutilities.Constants;

public abstract class BasePage {
		 protected static WebDriver driver; 	
		 protected static WebDriverWait wait;
		 public static int timeOutInSeconds = Constants.TIME_OUT_IN_SECONNDS;
		 
		public BasePage(WebDriver webDriver) {
			BasePage.driver = 	webDriver;	
			wait = new WebDriverWait(driver, timeOutInSeconds); 
		}
		 

}
