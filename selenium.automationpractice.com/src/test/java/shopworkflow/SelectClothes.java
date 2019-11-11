package shopworkflow;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClothesPages;
import testcommonutils.BaseTest;

public class SelectClothes extends BaseTest {
	
	@Test
	public void selectWomenClothes() throws InterruptedException{
		
		System.out.println("Selecting women clothes");
		ClothesPages.shopForWomenClothes();
		ClothesPages.selectClothToAddToCart(2);
		authentication.login("test1@automationpractice.com", "28328719@Aut?!");
		Thread.sleep(10000);
	}
	
	

}
