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
	private static By processCarrier = By.xpath("//button[@name=\"processCarrier\"]");

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

	// List of all women clothes Showing
	public static List<WebElement> getListOfAllWomenClothesShowing() {
		return AutomationUtils.waitForPresenceOfElements(allWomenClothes);
	}

	// select a woman's cloth to add to cart
	public static void selectClothToAddToCart(int index) {
		WebElement element = getListOfAllWomenClothesShowing().get(index);
		actions.moveToElement(element);
		element.click();
	}

	// add to cart functions
	private static WebElement getAddToCartBtn() {
		return AutomationUtils.waitForElementToBeClickable(addToCart);
	}

	public static void addToCart() {
		WebElement element = getAddToCartBtn();
		actions.moveToElement(element);
		element.click();
	}

	// ----- continue shopping & proceed to checkout--------------------------------
	private static WebElement getContinueShoppingBtn() {
		return AutomationUtils.waitForElementToBeClickable(continueShoppingBy);
	}

	public static WebElement getProceedToCheckoutBtn() {
		return AutomationUtils.waitForElementToBeClickable(proceed);
	}

	public static void clickContinueShoppingBtn() {
		js.executeScript("arguments[0].click();", getContinueShoppingBtn());
	}
	
	public static void clickProceedToCheckoutBtn() {
		js.executeScript("arguments[0].click();", getProceedToCheckoutBtn());
	}

	
	
	
	public static WebElement getProceedCheckout3() {
		return AutomationUtils.waitForElementToBeClickable(processAddress);
	}

	public static void clickProceedCheckout3() {
		WebElement element = getProceedCheckout3();
		actions.moveToElement(element);
		element.click();
	}

	// ----------------------------------------------------------------------
	public static WebElement getprocessCarrier() {
		return AutomationUtils.waitForElementToBeClickable(processCarrier);
	}

	public static void clickprocessCarrier() {
		WebElement element = getprocessCarrier();
		actions.moveToElement(element);
		element.click();
	}

}
