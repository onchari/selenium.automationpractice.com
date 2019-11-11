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
	
	
	
	//All fields being blank /blank email  = An email address required.
	@Test(priority = 1)
	public void loginWithAllBlankFields() {
		System.out.println("loginWithAllBlankFields");
	}
	
	//Password being blank =  Password is required.
	@Test(priority = 2)
	public void loginWithBlankPassword() {
		System.out.println("loginWithBlankPassword");
	}
	
	//Wrong password/email = Authentication failed.
	@Test(priority = 3)
	public void loginWithWrongPasswordAndEmail() {
		System.out.println("loginWithWrongPasswordAndEmail");
	}
	
	//Invalid email address. = Invalid email address.
	@Test(priority = 4)
	public void loginWithInvalidEmailAddress() {
		System.out.println("loginWithInvalidEmailAddress");
	}
	
	//Correct credentials = MY ACCOUNT PAGE
	@Test(priority = 5, dataProvider = "loginDataProvider", dataProviderClass = ExcelDataProviderUtil.class)	
	public void loginWithValidCredentials(String username, String password, String flag) {
		HomePage.clickSignInLink();
		assertTrue(AuthenticationPage.verifyAuthenticationPageTitle(), "Title Verification failed");
		authentication.login(username, password);
		Assert.assertTrue(MyAccountPage.getLogoutLink().isDisplayed());
		Assert.assertTrue(MyAccountPage.getCustomerName().isDisplayed(), "is not displayed ");	
	}

}





//https://stackoverflow.com/questions/48426992/using-selenium-webdriver-with-testng-and-dataproviders-how-to-assert
//https://github.com/in28minutes/automation-testing-with-java-and-selenium/blob/master/web-driver-4-data-driven-tests/src/test/java/com/in28minutes/datadriventests/LoginDataProviderCompleteTest.java

//https://github.com/bnosrati/Login-Test/blob/master/LoginTest.java