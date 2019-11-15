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
	private static By processAddress = By.xpath("//button[@name=\"processAddress\"]");
	private static By checkout = By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]");
	private static By continueShoppingBy = By.xpath("//span[@title=\"Continue shopping\"]");
	private static By proceed = By.xpath("//a[@title=\"Proceed to checkout\"]");
	private static By addToCart = By.xpath("//p[@id=\"add_to_cart\"]/button");
	private static By allWomenClothes = By
			.xpath("//a[@class=\"product_img_link\"]/img[@class=\"replace-2x img-responsive\"]");

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

	// click women tab
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

	// add to cart functions
	private static WebElement getAddToCartBtn() {
		return AutomationUtils.waitForElementToBeClickable(addToCart);
	}

	public static void addToCart() {
		getAddToCartBtn().click();

	}

	// proceed to checkout button
	private static WebElement getProceedToCheckoutBtn() {
		return AutomationUtils.waitForElementToBeClickable(proceed);
	}

	public static void proceedToCheckout() {
		getProceedToCheckoutBtn().click();
	}

	// continue shopping button
	private static WebElement getContinueShoppingBtn() {
		return AutomationUtils.waitForElementToBeClickable(continueShoppingBy);
	}

	public static void continueShopping() {
		getContinueShoppingBtn().click();
	}

	// checkout button
	private static WebElement getCheckoutBtn() {
		return AutomationUtils.waitForElementToBeClickable(checkout);
	}

	public static void checkout() {
		getCheckoutBtn().click();
	}

	public static List<WebElement> getListOfClothes() {
		return AutomationUtils.waitForPresenceOfElements(allWomenClothes);
	}

	public static void selectClothToAddToCart(int index) {
		getListOfClothes().get(index).click();
	}
	
	
	public void shopForFadedShortSleeveT_shirts() {
		
	}
	
}
