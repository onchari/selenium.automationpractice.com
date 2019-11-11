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

	public static void selectClothToAddToCart(int index) {
		By clothesBy  = By.xpath("//a[@class=\"product_img_link\"]/img[@class=\"replace-2x img-responsive\"]");
		By addToCart = By.xpath("//p[@id=\"add_to_cart\"]/button");
		By proceed = By.xpath("//a[@title=\"Proceed to checkout\"]");
		By checkout = By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]");
		List<WebElement> elements = AutomationUtils.waitForPresenceOfElements(clothesBy);
		
		WebElement element = elements.get(index);
		element.click();
		WebElement addToCartElement = AutomationUtils.waitForLinkToBeClickable(addToCart);
		addToCartElement.click();
		
		WebElement element2 = AutomationUtils.waitForLinkToBeClickable(proceed);
		
		element2.click();
		
		WebElement element3 = AutomationUtils.waitForLinkToBeClickable(checkout);
		element3.click();
		
		
		
	}
	
	
	
}
