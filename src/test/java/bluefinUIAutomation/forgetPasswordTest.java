package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.forgetpassword;

public class forgetPasswordTest extends forgetpassword {

	@Test(priority = 6, description = "Test Description  : Verification of forget password Feature")
	public void fogetpassword() {
		forgotPass();
	}

}
