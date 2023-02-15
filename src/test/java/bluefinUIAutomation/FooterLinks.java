package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.FooterLinkTest;

public class FooterLinks extends FooterLinkTest {
	@Test(priority = 2, description = "Test Description   = Verification of Footerlinks Feature")
	public void RequestDemoTest() {
		FooterLinksMethod();
	}
}
