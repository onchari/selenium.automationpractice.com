package shopworkflow;

import org.testng.annotations.Test;

import myutilities.ExcelDataProviderUtil;
import pages.AuthenticationPage;
import pages.ClothesPages;
import testcommonutils.BaseTest;

public class SelectClothes extends BaseTest {

	@Test(dataProvider = "clothesDataProvider", dataProviderClass = ExcelDataProviderUtil.class)	
	public void shopForFadedShortSleeveT_shirts(int index) {

		//ClothesPages.shopWomenClothes(index);
		//ClothesPages.proceedToCheckout();

		//ClothesPages.checkout();
		//AuthenticationPage.login("test1@automationpractice.com", "28328719@Aut?!");
	}
}
