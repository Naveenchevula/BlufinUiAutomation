package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.headerLinksVerification;

public class HeaderLinksLobby extends headerLinksVerification {
	@Test(priority = 7, description = "Test Description   = Verification of Headerlinks Feature")
	public void headerLinksVerification() {
	
		headerLinksVerificationMethod();
	}

}
