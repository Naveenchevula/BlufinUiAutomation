package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.logoVerify;

public class LogoTest extends logoVerify {
	@Test(priority = 4, description = "Test Description   = Verification of LoGo Feature")

	public void logoVerify() {
		logo();
		
	}
}
