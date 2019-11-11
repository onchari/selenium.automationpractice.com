package authentication;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import myutilities.AutomationUtils;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import testcommonutils.BaseTest;

public class RegistrationTest extends BaseTest {


	// Without email - Invalid email address.
	@Test
	public void attemptToLoginWithoutEmail() {
		HomePage.clickSignInLink();	
		AuthenticationPage.createAnAccount("");
		Assert.assertTrue(AuthenticationPage.isErrorMessagePresent("Invalid email address."));
		
	}
	// Wrong email format (mapko89ct, mapko89ct@gmail ...)
	// Registered email - An account using this email address has already been registered. Please enter a valid password or request a new one. 
	
	@Test
	public void attemptToLoginWithAlreadyRegisteredEmail() {
		String message = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
		HomePage.clickSignInLink();	
		AuthenticationPage.createAnAccount("test1@automationpractice.com");
		Assert.assertTrue(AuthenticationPage.isErrorMessagePresent(message));
		
	}
	
	// Correct email 
	
	@Test
	public void attemptingToRegisterWithCorrectEmailAddress() {	
		HomePage.clickSignInLink();	
		//AuthenticationPage.createAnAccount(AutomationUtils.generateTestEmail());
		AuthenticationPage.createAnAccount("test001@automationpractice.com");
		assertTrue(RegistrationPage.registrationFormIsDisplayed(), "Failed");
	}


	
	@Test(dependsOnMethods ="attemptingToRegisterWithCorrectEmailAddress" )
	public void createAccountSuccessfullyWithAllRequiredValidData() throws InterruptedException {
		HomePage.clickSignInLink();	
		//AuthenticationPage.createAnAccount(AutomationUtils.generateTestEmail());
		AuthenticationPage.createAnAccount("test001@automationpractice.com");
		
		//Your personal information
		RegistrationPage.clickMrs();
		RegistrationPage.setcustomerFirstnameField("Onchari");
		RegistrationPage.setcustomerLastnameField("Wycliffe");
		//RegistrationPage.setRegistrationEmailAddress("onchari@wycliffe.coma");
		RegistrationPage.setcustomerPasswordField("fstghfkghgkdhfgkg");
		RegistrationPage.dateOfBirth("12", "4", 4);
		
		RegistrationPage.signupForNewsletter();
		RegistrationPage.AcceptToReceiveSpecialOffersFromPartners();
		
		//Your address
		RegistrationPage.setFirstname("Onchari");
		RegistrationPage.setLastName("Wycliffe");
		RegistrationPage.setCompanyName("Automation Practice Ltd");
		RegistrationPage.setAddressLine1("The Mirage ");
		RegistrationPage.setAddressLine2("Nagi Plaza");
		RegistrationPage.setCity("Nairobi");
		RegistrationPage.selectState("3");
		RegistrationPage.setZip_PostalCode("44356");
		RegistrationPage.selectCountry("21");
		RegistrationPage.setAdditionalInformation("I am real interesed");
		RegistrationPage.setHomePhone("07054355756");
		RegistrationPage.setMMobilePhone("43546577");
		RegistrationPage.setAliasToaddress("Okonu");;
		
		RegistrationPage.submitRegistration();
		
		
		Assert.assertTrue(MyAccountPage.getLogoutLink().isDisplayed());
		Assert.assertTrue(MyAccountPage.getCustomerName().isDisplayed(), "is not displayed ");
		
	}

}
