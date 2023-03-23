package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.ForgotPassword;

public class ForgetPasswordTest extends TestBase{
	
	public ForgetPasswordTest () {
		super();
	}
	ForgotPassword forgotpassword;

	@Test(priority = 6, description = "Test Description  : Verification of forget password Feature")
	public void fogetpassword() {
		forgotpassword = new ForgotPassword();
		
		forgotpassword.forgotPass();
	}

}
