package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.HeaderLinks;



public class HeaderLinksTest extends TestBase {
	
	public HeaderLinksTest() {
		super();
	}
	
	
	HeaderLinks headlinks;
	
	
	@Test(priority = 7, description = "Test Description   = Verification of Headerlinks Feature")
	public void headerLinksVerification() {
		headlinks =new HeaderLinks();
		headlinks.HeaderLinksSubbtn();
		headlinks.SoltuionButtonSection();
		
	}

}
