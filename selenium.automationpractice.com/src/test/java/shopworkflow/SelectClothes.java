package shopworkflow;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.ClothesPages;
import testcommonutils.BaseTest;

public class SelectClothes extends BaseTest {
	
	@Test
	public void selectWomenClothes() throws InterruptedException{
		
		System.out.println("Selecting women clothes");
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(4);
		ClothesPages.addToCart();
		ClothesPages.proceedToCheckout();
		ClothesPages.checkout();
		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
		Thread.sleep(10000);
	}
}
