package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myutilities.AutomationUtils;

public class AuthenticationPage extends BasePage {

	// locators for : error login, email input, create account button, valid email
	By invalidcreateEmail = By.xpath("//li[contains(text(), \"Invalid email address.\")]");
	By alreadyExistingEmail = By
			.xpath("//li[contains(text(), \"An account using this email address has already been registered\")]");

	By invalidloginEmail = By.xpath("//div[@class = \"form-group form-error\"]/input[@id=\"email\"]");
	static By validLoginEmail = By.xpath("//div[@class = \"form-group form-ok\"]/input[@id=\"email\"]");

	// create account related
	static By emailCreate = By.id("email_create");
	By createEmailRed = By.xpath("//div[@class=\"form-group form-error\"]/input[@id=\"email_create\"]");
	By createEmailGreen = By.xpath("//div[@class=\"form-group form-ok\"]/input[@id=\"email_create\"]");
	static By createAccountButton = By.id("SubmitCreate");

	By loginForm = By.xpath("//form[@id=\"login_form\"]");
	By emailAddressField = By.id("email");
	By passwordField = By.id("passwd");
	By submitLoginBtn = By.id("SubmitLogin");

	By forgotPasswordLink = By.xpath("//a[contains(text(), \"Forgot your password?\")]");
	By isvalidEmail = By.xpath("//div[@class = \"form-group form-ok\"]/input[@id=\"email\"]");
	By emailAddressRequired = By.xpath("//li[contains(text(), \"An email address required.\")]");
	By invalidEmailAddress = By.xpath("//li[contains(text(),\"Invalid email address.\")]");
	By passwordIsRequired = By.xpath("//li[contains(text(), \"Password is required.\")]");
	By invalidPassword = By.xpath("//li[contains(text(), \"Invalid password.\")]");
	By authenticationError = By.xpath("//li[contains(text(),\"Authentication failed.\")]");

	public AuthenticationPage(WebDriver webDriver) {
		super(webDriver);
	}

	// GET methods
	public WebElement getPasswordField() {
		return AutomationUtils.waitForPresenceOfAutoElement(passwordField);
	}

	public WebElement getEmailAddressField() {
		return AutomationUtils.waitForPresenceOfAutoElement(emailAddressField);
	}

	public WebElement getSignInButton() {
		return AutomationUtils.waitForLinkToBeClickable(submitLoginBtn);
	}

	public static WebElement getLoginEmailAddressGreen() {
		return AutomationUtils.waitForVisibilityOfAutoElement(validLoginEmail);
	}

	public void clearFields(WebElement element) {
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
	public void setLoginCredentials(String username, String password) {
		clearFields(getEmailAddressField());

		getEmailAddressField().sendKeys(username);

		clearFields(getPasswordField());
		getPasswordField().sendKeys(password);
	}

	// Click login button.
	public void clickLoginButton() {
		getSignInButton().click();
	}

	// login
	public MyAccountPage login(String username, String password) {
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
		return AutomationUtils.waitForLinkToBeClickable(createAccountButton);
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
