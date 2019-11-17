package myutilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProviderUtil {


	@DataProvider(name = "loginDataProvider")
	public Object[][] loginDataProvider() {
		return new Object[][] { 
			
			//All fields being blank /blank email  = An email address required.
			//Password being blank =  Password is required.
			//Wrong password/email = Authentication failed.
			//new Object[] { "@automationpractice.com", "28328719@Aut?!", "INVALI_DEMAIL" },//Invalid email address. = Invalid email address.
			new Object[] { "test1@automationpractice.com", "28328719@Aut?!", "CORRECT_CREDENTIALS" }//Correct credentials = MY ACCOUNT PAGE
			};
	}
	
	
	@DataProvider(name = "clothesDataProvider")
	public Object[][] clothesDataProvider() {
		return new Object[][] { 
			new Object[] { 0},
			new Object[] {2},
			new Object[] { 2},
			new Object[] { 3}
			};
	}
}
