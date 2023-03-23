package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.ContactUsButton;

public class ContactusButtonTest extends TestBase {
	
	public ContactusButtonTest() {
		super();
		
	}
	
	ContactUsButton contactusbutton;
	@Test(priority = 3, description = " Test Description   = Verification of contact  Button & Send Message ")
	public void ContactUsButtontest() {
  
		contactusbutton =  new ContactUsButton();		
		
		contactusbutton.Contactus();
	}

}
