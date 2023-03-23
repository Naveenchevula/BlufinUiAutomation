package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.ContactUsFuctionality;
import pageObjects.LogIn;

public class ContactUsVerificationTest extends TestBase {
	
	public ContactUsVerificationTest() {
		super();
	}
	
	ContactUsFuctionality contactus;
	LogIn login;
		@Test(priority = 5, description = " Test Description   = Verification of contact us fuctionality form lobby and back office aswell  ")
		
		public void ContactUsBo() throws Throwable {
			contactus = new ContactUsFuctionality();
			contactus.ContactusVerification();
			contactus.LoginFuction();
			
			contactus.ContactUspageBO();
		}
		
		
		
		
	}

