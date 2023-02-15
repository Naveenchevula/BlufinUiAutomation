package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.ContactUsButtonOnHomePage;

public class ContactusButton extends ContactUsButtonOnHomePage {
	@Test(priority = 3, description = " Test Description   = Verification of contact  Button & Send Message ")
	public void ContactUsButtonOnHomePage() {

		ContactusMethod();

	}

}
