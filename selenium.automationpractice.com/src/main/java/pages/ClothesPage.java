package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class ClothesPage {
	//New locators 
	private By women = By.xpath("//a[@title = \"Women\"]");
	   
	    public WebElement getWomenClothesBtn(){
	        return AutomationUtils.waitForPresenceOfAutoElement(women);
	    }

	    

}
