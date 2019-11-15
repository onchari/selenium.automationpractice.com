package shopworkflow;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AuthenticationPage;
import pages.ClothesPages;
import testcommonutils.BaseTest;

public class AddingMultipleClothesToCartTest extends BaseTest {
	

	@Test
	public void addThreeWomenClothes() throws InterruptedException {
		System.out.println("Selecting women clothes");
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(2);
		
		ClothesPages.checkout();
		AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
		Thread.sleep(10000);
	}
}
