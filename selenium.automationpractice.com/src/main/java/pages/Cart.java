package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class Cart extends BasePage {

	public Cart(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	static By  cartTab = By.cssSelector("div.shopping_cart");
	static By cartQty = By.cssSelector("a > span.ajax_cart_quantity");
	
	public static WebElement getCartTab() {
		return AutomationUtils.waitForElementToBeClickable(cartTab);
	}
	
	public static void clickCartTab() {
		getCartTab().click();
	}
	
	public static WebElement getTotalCartQty() {
		return AutomationUtils.waitForPresenceOfAutoElement(cartQty);
	}
	
	public static String checkTotalCartQty() {
		return getTotalCartQty().getText();
	}
	
	public static WebElement getCartEmpty() {
		return null;
	}
	
	public static WebElement getCartProducts(int productNumber) {
		return null;
	}
	
	public static WebElement getProductQty(int numOfProduct) {
		return null;
	}
	
	public static WebElement getCartProductElementPrice(int numOfProduct) {
		return null;
	}
	
	public static WebElement getProductDeleteX(int numOfProduct) {
		return null;
	}
	
	public static WebElement getCartShippingFree() {
		return null;
	}
	
	public static WebElement getCartShippingCost() {
		return null;
	}
	
	
	public static WebElement getCartTotalPrice() {
		return null;
	}
	
	public static WebElement getCartTabCheckOutBtn() {
		return null;
	}
	
	public static  WebElement getCartProductsQty() {
		return null;
	}
	
	
	

}
