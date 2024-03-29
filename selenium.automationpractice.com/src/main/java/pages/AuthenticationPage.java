package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class AuthenticationPage extends BasePage {

	// locators for : error login, email input, create account button, valid email
	 static By invalidcreateEmail = By.xpath("//li[contains(text(), \"Invalid email address.\")]");
	 static By alreadyExistingEmail = By.xpath("//li[contains(text(), \"An account using this email address has already been registered\")]");

	 static By invalidloginEmail = By.xpath("//div[@class = \"form-group form-error\"]/input[@id=\"email\"]");
	 static By validLoginEmail = By.xpath("//div[@class = \"form-group form-ok\"]/input[@id=\"email\"]");

	// create account related
	 static  By emailCreate = By.id("email_create");
	 static By createEmailRed = By.xpath("//div[@class=\"form-group form-error\"]/input[@id=\"email_create\"]");
	 static By createEmailGreen = By.xpath("//div[@class=\"form-group form-ok\"]/input[@id=\"email_create\"]");
	 static  By createAccountButton = By.id("SubmitCreate");

	 static By loginForm = By.xpath("//form[@id=\"login_form\"]");
	 static By emailAddressField = By.id("email");
	 static By passwordField = By.id("passwd");
	 static  By submitLoginBtn = By.id("SubmitLogin");

	 static By forgotPasswordLink = By.xpath("//a[contains(text(), \"Forgot your password?\")]");
	 static By isvalidEmail = By.xpath("//div[@class = \"form-group form-ok\"]/input[@id=\"email\"]");
	 static By emailAddressRequired = By.xpath("//li[contains(text(), \"An email address required.\")]");
	 static By invalidEmailAddress = By.xpath("//li[contains(text(),\"Invalid email address.\")]");
	 static By passwordIsRequired = By.xpath("//li[contains(text(), \"Password is required.\")]");
	 static By invalidPassword = By.xpath("//li[contains(text(), \"Invalid password.\")]");
	 static By authenticationError = By.xpath("//li[contains(text(),\"Authentication failed.\")]");

	 
	 //Errors related 
	 static By errorPanel = By.cssSelector("div.alert.alert-danger");
	 static By phoneNumberError = By.cssSelector("p.inline-infos");
	public AuthenticationPage(WebDriver webDriver) {
		super(webDriver);
	}

	// GET methods
	public static WebElement getPasswordField() {
		return AutomationUtils.waitForPresenceOfAutoElement(passwordField);
	}

	public static WebElement getEmailAddressField() {
		return AutomationUtils.waitForPresenceOfAutoElement(emailAddressField);
	}

	public static WebElement getSignInButton() {
		return AutomationUtils.waitForElementToBeClickable(submitLoginBtn);
	}

	public static WebElement getLoginEmailAddressGreen() {
		return AutomationUtils.waitForVisibilityOfAutoElement(validLoginEmail);
	}

	public static void clearFields(WebElement element) {
		if (!element.getAttribute("value").isEmpty()) {
			element.clear();
		}
	}

	// createAccount
	public static RegistrationPage createAnAccount(String email) {
		setEmailToCreateAccountField(email);
		clickCreateAnAccountButton();
		return new RegistrationPage(driver);
	}

	// Enter Login Credentials
	public static void  setLoginCredentials(String username, String password) {
		clearFields(getEmailAddressField());

		getEmailAddressField().sendKeys(username);

		clearFields(getPasswordField());
		getPasswordField().sendKeys(password);
	}

	// Click login button.
	public static void clickLoginButton() {
		getSignInButton().click();
	}

	// login
	public static MyAccountPage login(String username, String password) {
		setLoginCredentials(username, password);
		clickLoginButton();
		return new MyAccountPage(driver);
	}

	// verify page title
	public static Boolean username() {
		String expectedTitle = "Login - My Store";
		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			return true;
		}
		return false;
	}

	// valid email address
	public static Boolean verifyLoginEmailFieldIsGreen() {
		return getLoginEmailAddressGreen().isDisplayed();

	}

	// verify page title
	public static Boolean verifyAuthenticationPageTitle() {
		String expectedTitle = "Login - My Store";
		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			return true;
		}
		return false;
	}

	/*****************************************************
	 * Registration Email Authentication
	 ****************************************************/

	// ----------getters----------------------------

	private static WebElement getEmailToCreateAccountField() {
		return AutomationUtils.waitForPresenceOfAutoElement(emailCreate);
	}

	private static WebElement getCreateAccountButton() {
		return AutomationUtils.waitForElementToBeClickable(createAccountButton);
	}

	// --------------setters------------------------------
	public static void setEmailToCreateAccountField(String email) {
		getEmailToCreateAccountField().sendKeys(email);
	}

	public static void clickCreateAnAccountButton() {
		getCreateAccountButton().click();
	}

	public void checkMrRadioButton() {
		// TODO Auto-generated method stub

	}

	
	
	/*-------------------------------------------------------------------------
				ERRORS
	-------------------------------------------------------------------------*/
	public static boolean isErrorMessagePresent(String errorMessage) {
		boolean isPresent = false;
		By errorLocation = By.xpath("//div[@id=\"create_account_error\"]/ol/li[contains(text(), \""	+ errorMessage	+ "\")]");
		WebElement element = AutomationUtils.waitForPresenceOfAutoElement(errorLocation);
		if (element.isDisplayed()) {
			isPresent = true;
		}
		return isPresent;
	}

}
