package testcommonutils;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	//Fields
	public FirefoxDriver driver = null;
	public static boolean localEnvironment = true;
	private static final String AUT_URL = "http://automationpractice.com/";
	


	

	

	@BeforeSuite
	public void beforeSuite() {
	}
	
	@BeforeTest
	public void setupWebDriver() {
		if (localEnvironment) {
			setupLocalDriver();
		} else {
			setupRemoteDriver();
		}
	}

	@BeforeClass
	public void beforeClass() {
	}

	@BeforeMethod
	public void loadWebApplication() {
		driver.navigate().to(AUT_URL);
		driver.manage().window().maximize();
	}

	public void setupLocalDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	private void setupRemoteDriver() {
		// TODO Auto-generated method stub
	}
	
	

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterClass() {
	}

	@AfterTest(alwaysRun = true)
	public void tearDownSuite() {
		driver.quit();
	}

	@AfterSuite
	public void afterSuite() {
	}

}
