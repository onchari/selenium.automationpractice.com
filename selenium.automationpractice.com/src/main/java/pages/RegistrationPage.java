package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import myutilities.AutomationUtils;

public class RegistrationPage extends BasePage {

	static By accountCreationForm = By.id("account-creation_form");
	static By mrTitle = By.id("id_gender1");
	static By mrsTitle = By.id("id_gender2");
	static By customerFirstname = By.id("customer_firstname");
	static By customerLastname = By.id("customer_lastname");
	static By Email = By.id("email");
	static By password = By.id("passwd");

	static By birthDay = By.id("days");
	static By birthMonth = By.id("months");
	static By birthYear = By.id("years");

	static By newsletter = By.xpath("//input[@id =\"newsletter\"]");
	static By specialOffer = By.xpath("//input[@id =\"optin\"]");

	static By firstname = By.id("firstname");
	static By lastname = By.id("lastname");

	static By company = By.id("company");
	static By address1 = By.id("address1");
	static By address2 = By.id("address2");
	static By city = By.id("city");

	static By state = By.xpath("//select[@id =\"id_state\"]");
	static By postcode = By.id("postcode");
	static By country = By.xpath("//select[@id= \"id_country\"]");
	static By otherinfo = By.id("other");

	static By homePhone = By.id("phone");
	static By mobilePhone = By.id("phone_mobile");
	
	static By alias = By.id("alias");
	static By submitAccount = By.id("submitAccount");

	public RegistrationPage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	// getters

	
	public WebElement getWebElement(By by) {
		return AutomationUtils.waitForPresenceOfAutoElement(by);
	}
	
	public static WebElement getMrRadioButton() {
		return AutomationUtils.waitForPresenceOfAutoElement(mrTitle);
	}

	public static WebElement getMrsRadioButton() {
		return AutomationUtils.waitForPresenceOfAutoElement(mrsTitle);
	}

	private static WebElement getcustomerFirstnameField() {
		return AutomationUtils.waitForPresenceOfAutoElement(customerFirstname);
	}

	private static WebElement getcustomerLastnameField() {
		return AutomationUtils.waitForPresenceOfAutoElement(customerLastname);
	}

	private static WebElement getPasswordField() {
		return AutomationUtils.waitForPresenceOfAutoElement(password);
	}

	public static WebElement getBirthDayField() {
		return AutomationUtils.waitForPresenceOfAutoElement(birthDay);
	}

	public static WebElement getBirthMonthField() {
		return AutomationUtils.waitForPresenceOfAutoElement(birthMonth);
	}

	public static WebElement getBirthYearField() {
		return AutomationUtils.waitForPresenceOfAutoElement(birthYear);
	}
	
	public static WebElement  getSignupForNewsletterCheckbox() {
		return AutomationUtils.waitForPresenceOfAutoElement(newsletter);
	}
	public static WebElement getReceiveOfferCheckbox() {
		return AutomationUtils.waitForPresenceOfAutoElement(specialOffer);
	}
	
	public static WebElement getFirstName() {
		return AutomationUtils.waitForPresenceOfAutoElement(firstname);
	}
	
	public static WebElement getLastName() {
		return AutomationUtils.waitForPresenceOfAutoElement(lastname);
	}
	
	public static WebElement getCompanyField() {
		return AutomationUtils.waitForPresenceOfAutoElement(company);
	}
	public static WebElement getAddress1() {
		return AutomationUtils.waitForPresenceOfAutoElement(address1);
	}
	
	public static WebElement getAddres2() {
		return AutomationUtils.waitForPresenceOfAutoElement(address2);
	}
	
	private static WebElement getCity() {
		return AutomationUtils.waitForPresenceOfAutoElement(city);
	}
	
	
	public static WebElement getState() {
		return AutomationUtils.waitForPresenceOfAutoElement(state);
	}
	private static WebElement getZicode() {
		return AutomationUtils.waitForPresenceOfAutoElement(postcode);
	}
	
	public static WebElement getCountry() {
		return AutomationUtils.waitForPresenceOfAutoElement(country);
	}
	
	public static WebElement getAdditionalInfo() {
		return AutomationUtils.waitForPresenceOfAutoElement(otherinfo);
	}
	
	public static WebElement getHomePhone() {
		return AutomationUtils.waitForPresenceOfAutoElement(homePhone);
	}
	
	public static WebElement getMobilephone() {
		return AutomationUtils.waitForPresenceOfAutoElement(mobilePhone);
	}
	
	public static WebElement getAlias() {
		return AutomationUtils.waitForPresenceOfAutoElement(alias);
	}
	
	public static WebElement getRegisterButton() {
		return AutomationUtils.waitForLinkToBeClickable(submitAccount);
	}
	

	// setters
	public static void clickMr() {
		if (!getMrRadioButton().isSelected()) {
			getMrRadioButton().click();
		}
	}

	public static void clickMrs() {
		if (!getMrsRadioButton().isSelected()) {
			getMrsRadioButton().click();
		}
	}

	public static void setcustomerFirstnameField(String firstName) {
		getcustomerFirstnameField().sendKeys(firstName);
	}

	public static void setcustomerLastnameField(String secondName) {
		getcustomerLastnameField().sendKeys(secondName);
	}

	public static void setRegistrationEmailAddress(String string) {
		// TODO Auto-generated method stub

	}

	public static void setcustomerPasswordField(String password) {
		getPasswordField().sendKeys(password);

	}

	public static void selectBirthDay(String dayValue) {
		 Select select = new Select(getBirthDayField());
		 select.selectByValue(dayValue);
	}
	
	public static void selectBirthMonth(String monthvisibleText) {
		
		
		Select select = new Select(getBirthMonthField());
		select.selectByValue(monthvisibleText);;	
	}
	
	public static void  selectBirthYear(int yearindex) {
		Select select = new Select(getBirthYearField());
		select.selectByIndex(yearindex);
	}
	
	
	public static void dateOfBirth(String dayValue, String monthVisibleText, int yearindex) {
		selectBirthDay(dayValue);
		selectBirthMonth(monthVisibleText);
		selectBirthYear(yearindex);
	}

	public static void signupForNewsletter() {
		if(!getSignupForNewsletterCheckbox().isSelected()) {
			getSignupForNewsletterCheckbox().click();
		}
		

	}

	public static void AcceptToReceiveSpecialOffersFromPartners() {
		if(!getReceiveOfferCheckbox().isSelected()) {
			getReceiveOfferCheckbox().click();
		}

	}

	public static void setFirstname(String fname) {
		getFirstName().sendKeys(fname);

	}

	public static void setLastName(String lname) {
		getLastName().sendKeys(lname);

	}

	public static void setCompanyName(String company) {
		getCompanyField().sendKeys(company);

	}
	public static void setAddressLine1(String address1) {
		getAddress1().sendKeys(address1);

	}
	public static void setAddressLine2(String address2) {
		getAddres2().sendKeys(address2);

	}

	public static void setCity(String city) {
		getCity().sendKeys(city);

	}

	public static void selectState(String state) {
		Select select = new Select(getState());
		select.selectByValue(state);	
		}

	public static void setZip_PostalCode(String zip) {
		getZicode().sendKeys(zip);
	}


	//select country
	public static void selectCountry(String country) {
		Select select = new Select(getCountry());
		
		String  selectedOption = select.getFirstSelectedOption().getText();
		if(!selectedOption.equalsIgnoreCase("United States")) {
			select.selectByValue(country);
		}
		System.out.println(selectedOption + "Is already selected");
	}
	
	public static void setAdditionalInformation(String info) {
		getAdditionalInfo().sendKeys(info);
	}
	

	public static void setHomePhone(String homePhone) {
		getHomePhone().sendKeys(homePhone);

	}

	public static void setMMobilePhone(String mobile) {
		getMobilephone().sendKeys(mobile);

	}

	public static void setAliasToaddress(String alias) {
		getAlias().clear();
		getAlias().sendKeys(alias);

	}

	public static void submitRegistration() {
		getRegisterButton().click();

	}

}
