package authentication;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import myutilities.ExcelDataProviderUtil;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import testcommonutils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(dataProvider = "loginDataProvider", dataProviderClass = ExcelDataProviderUtil.class)	
	public void loginWithValidCredentials(String username, String password, String flag) {
		HomePage.clickSignInLink();
		assertTrue(AuthenticationPage.verifyAuthenticationPageTitle(), "Title Verification failed");
		authentication.login(username, password);
		Assert.assertTrue(MyAccountPage.getLogoutLink().isDisplayed());
		Assert.assertTrue(MyAccountPage.getCustomerName().isDisplayed(), "is not displayed ");
		
	}

}


//https://stackoverflow.com/questions/48426992/using-selenium-webdriver-with-testng-and-dataproviders-how-to-assert

//https://github.com/bnosrati/Login-Test/blob/master/LoginTest.java