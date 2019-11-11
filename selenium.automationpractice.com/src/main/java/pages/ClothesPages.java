package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

import java.util.List;

public class ClothesPages extends BasePage {

	// New locators
		private static By women = By.xpath("//div[@id = \"block_top_menu\"]/ul/li[1]");
		private By dresses = By.xpath("//div[@id = \"block_top_menu\"]/ul/li[2]");
		private By tshirts = By.xpath("//div[@id = \"block_top_menu\"]/ul/li[3]");
		private By popularTab = By.xpath("//a[@class =\"homefeatured\"]");
		private By bestSellers = By.xpath("//a[@class =\"blockbestsellers\"]");
		

	

	public ClothesPages(WebDriver webDriver) {
		super(webDriver);
	}

	public static WebElement getWomenClothesBtn() {
		return AutomationUtils.waitForPresenceOfAutoElement(women);
	}

	public WebElement getDressClothesBtn() {
		return AutomationUtils.waitForPresenceOfAutoElement(dresses);
	}

	public WebElement getTShirtsClothesBtn() {
		return AutomationUtils.waitForPresenceOfAutoElement(tshirts);
	}
	
	public static void clickWomenTab() {
		getWomenClothesBtn().click();
	}
	
	public void clickDressesTab() {
		getDressClothesBtn().click();
	}
	
	public void clickTshirtsTab() {
		getTShirtsClothesBtn().click();
	}

	
	public WebElement getCasualDressesBtn() {
		return null;
	}

	public WebElement getEveningDressesBtn() {
		return null;
	}

	public WebElement getSummerDressesBtn() {
		return null;
	}

	public WebElement getSummerDressProduct(int elementLevel) {
		return null;
	}

	public WebElement getCasualDressProduct() {
		return null;
	}

	public WebElement getEveningDressProduct() {
		return null;
	}

	public WebElement getEveningDressProduct(int elementLevel) {
		return null;
	}

	public List<WebElement> getDressesCount() {
		return null;
	}
	
	
	public static void shopForWomenClothes() {
		clickWomenTab();
	}

	public static boolean selectClothToAddToCart() {
		By clothesBy  = By.linkText("//a[@class=\"product_img_link\"]/img[@class=\"replace-2x img-responsive\"]");
		List<WebElement> elements = AutomationUtils.waitForPresenceOfElements(clothesBy);
		
		boolean noOfElements = false;
	   if(elements.size() == 7) {
		   noOfElements = true;
	   }else {
		   noOfElements = false;
	   }
	   
	   return noOfElements;
	}
	
	
	
}
