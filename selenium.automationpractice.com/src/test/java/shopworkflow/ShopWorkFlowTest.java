package shopworkflow;


import org.testng.annotations.Test;
import pages.AuthenticationPage;
import pages.ClothesPages;
import pages.PaymentMethodPage;
import pages.ShippingPage;
import pages.ShoppingCartSummary;
import testcommonutils.BaseTest;

public class ShopWorkFlowTest extends BaseTest {

	@Test(priority = 1)
	public void displayAllWomenClothes(){
		ClothesPages.getWomenClothesBtn().click();	
	}
	
	@Test(priority = 2)
	public void selectCloth1() {
		ClothesPages.selectClothToAddToCart(4);
	}
	
	@Test(priority = 3)
	private void addToCart() {
		ClothesPages.addToCart();
	}
	
	
	@Test(priority = 4)
	public void continueShopping() {
		ClothesPages.clickContinueShoppingBtn();
	}
	
	@Test(priority = 5)
	public void viewDressList() {
		ClothesPages.getWomenClothesBtn().click();
		ClothesPages.selectClothToAddToCart(5);
		ClothesPages.addToCart();
		ClothesPages.clickProceedToCheckoutBtn();
		
	}
	
	@Test(priority = 6)
	public void shoppingCartSummary() {
		ShoppingCartSummary.clickCheckOutFromCartSummarry();
		
	}
	
	@Test(priority = 7)
	public void Login() {
		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
	}
	
	@Test(priority = 8)
	public void addressDetails() throws InterruptedException {
		ClothesPages.clickProceedCheckout3();	
	}
	
	@Test(priority =9)
	public void shipping() throws InterruptedException {
		ClothesPages.clickprocessCarrier();
		ShippingPage.closeFancyBoxBtn();
		ShippingPage.clickCartSummaryTermsCheckbox();
		ClothesPages.clickprocessCarrier();	
	}
	

	@Test(priority = 10)
	public void paymentMethods() {
		PaymentMethodPage.selectPaymentMethod(1);
		PaymentMethodPage.clickIConfirmMyOrderBtn();
		
	}
	
	@Test(priority = 11)
	public void orderSummary() {
		PaymentMethodPage.getOrderSuccess();
	}

}
