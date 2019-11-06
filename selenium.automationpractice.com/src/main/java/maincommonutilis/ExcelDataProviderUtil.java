package maincommonutilis;

import org.testng.annotations.DataProvider;

public class ExcelDataProviderUtil {

	@DataProvider
	public Object[][] loginDataProvider() {
		return new Object[][] { 
			
			//All fields being blank /blank email  = An email address required.
			//Password being blank =  Password is required.
			//Wrong password/email = Authentication failed.
			//Invalid email address. = Invalid email address.
			//Correct credentials = MY ACCOUNT PAGE
			
			new Object[] { "test1@automationpractice.com", "28328719@Tes?!" }, 
			
			new Object[] { "wrongEmail@automationpractice.com", "28328719@Tes?!" },//wrong username 
			
			new Object[] { "test1@automationpractice.com", "WrongPassword@Tes?!" },//wrong password 
			
			new Object[] { "invalidEmail", "WrongPassword@Tes?!" }//wrong password
			};
	}
}
