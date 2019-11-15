package shopworkflow;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.ClothesPages;
import testcommonutils.BaseTest;

public class SelectClothes extends BaseTest {
	
	@Test
	public void shopForFadedShortSleeveT_shirts(){
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(1);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(2);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(3);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(4);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(5);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(6);
		ClothesPages.addToCart();
		
		ClothesPages.continueShopping();
		
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(7);
		ClothesPages.addToCart();
		
			
		
		ClothesPages.proceedToCheckout();
		
		ClothesPages.checkout();
		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
	}
}
