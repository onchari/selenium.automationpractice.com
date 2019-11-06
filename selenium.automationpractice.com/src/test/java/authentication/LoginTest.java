package authentication;

import org.testng.annotations.Test;

import maincommonutilis.ExcelDataProviderUtil;
import testcommonutils.BaseTest;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "loginDataProvider", dataProviderClass = ExcelDataProviderUtil.class)
	public void login(String n, String s) {
		System.out.println("Username is : " + n + " Password is : " + s);
	}

}


//https://stackoverflow.com/questions/48426992/using-selenium-webdriver-with-testng-and-dataproviders-how-to-assert

//https://github.com/bnosrati/Login-Test/blob/master/LoginTest.java