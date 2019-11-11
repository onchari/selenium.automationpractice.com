package shopworkflow;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ClothesPages;
import testcommonutils.BaseTest;

public class SelectClothes extends BaseTest {
	
	@Test
	public void selectWomenClothes(){
		
		System.out.println("Selecting women clothes");
		ClothesPages.shopForWomenClothes();
		Assert.assertTrue(ClothesPages.selectClothToAddToCart());
	}

}
