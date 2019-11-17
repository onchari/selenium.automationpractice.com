package shopworkflow;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.ClothesPages;
import pages.PaymentMethodPage;
import pages.ShippingPage;
import pages.ShoppingCartSummary;
import testcommonutils.BaseTest;

public class ShopWorkFlowTest extends BaseTest {

	// @Test(priority = 1)
	public void addThreeWomenClothes() {
		ClothesPages.getWomenClothesBtn().click();
		ClothesPages.selectClothToAddToCart(4);
		ClothesPages.addToCart();
		ClothesPages.getProceedToCheckoutBtn().click();

		ShoppingCartSummary.clickCheckOutFromCartSummarry();

		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");

		ClothesPages.clickProceedCheckout3();
		ShippingPage.clickCartSummaryTermsCheckbox();
		ClothesPages.clickprocessCarrier();
		PaymentMethodPage.selectPaymentMethod(1);
		PaymentMethodPage.clickIConfirmMyOrderBtn();
		PaymentMethodPage.getOrderSuccess();
	}

	@Test(priority = 1)
	public void gotoAllWomenClothes() {
		ClothesPages.getWomenClothesBtn().click();
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = "gotoAllWomenClothes" )
	public void addPrintedSummerDressWith5PercentDiscount () throws InterruptedException {
		ClothesPages.selectClothToAddToCart(4);
		ClothesPages.addToCart();
		ClothesPages.continueShopping();
	}
	
	@Test(priority = 3, dependsOnMethods = "addPrintedSummerDressWith5PercentDiscount" )
	public void addPrintedSummerDressWithoutDiscount () throws InterruptedException {
		ClothesPages.selectClothToAddToCart(5);
		ClothesPages.addToCart();	
		ClothesPages.getProceedToCheckoutBtn().click();
	}
	
	
	@Test(priority = 4, dependsOnMethods = "addPrintedSummerDressWithoutDiscount" )
	public void name() throws InterruptedException  {
		
		ShoppingCartSummary.clickCheckOutFromCartSummarry();

		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");

		ClothesPages.clickProceedCheckout3();

		ClothesPages.clickprocessCarrier();

		ShippingPage.closeFancyBoxBtn();

		ShippingPage.clickCartSummaryTermsCheckbox();

		ClothesPages.clickprocessCarrier();
		PaymentMethodPage.selectPaymentMethod(1);
		PaymentMethodPage.clickIConfirmMyOrderBtn();
		PaymentMethodPage.getOrderSuccess();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// @Test(priority = 2, dependsOnMethods = "addThreeWomenClothes" )
	public void shoppingCartSummary() {
		ShoppingCartSummary.clickCheckOutFromCartSummarry();
	}

	// @Test(priority = 3, dependsOnMethods ="shoppingCartSummary" )
	public void loginToPlaceOrder() {
		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
	}

	// @Test(priority = 4 , dependsOnMethods = "loginToPlaceOrder")
	public void other() {
		ClothesPages.clickProceedCheckout3();
		ShippingPage.clickCartSummaryTermsCheckbox();
		ClothesPages.clickprocessCarrier();
		PaymentMethodPage.selectPaymentMethod(1);
		PaymentMethodPage.clickIConfirmMyOrderBtn();
		PaymentMethodPage.getOrderSuccess();
	}

}
