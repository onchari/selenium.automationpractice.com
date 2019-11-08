package authentication;

import org.testng.Assert;
import org.testng.annotations.Test;

import myutilities.AutomationUtils;
import pages.HomePage;
import testcommonutils.BaseTest;

public class RegistrationTest extends BaseTest {

	@Test(priority = 1)
	public void registerWithUiqueValidEmailAddess() throws InterruptedException {
		HomePage.clickSignInLink();
		authentication.createAnAccount(AutomationUtils.generateTestEmail());
      
	}

	@Test(priority = 2)
	public void createAccountSuccessfullyWithAllRequiredValidData() throws InterruptedException {

		HomePage.clickSignInLink();
		
		authentication.createAnAccount(AutomationUtils.generateTestEmail());
		authentication.checkMrRadioButton();
		
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
