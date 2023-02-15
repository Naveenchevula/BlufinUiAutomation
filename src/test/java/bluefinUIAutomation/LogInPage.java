package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.LoginPage;

public class LogInPage extends LoginPage {

	@Test(priority = 5, description = "Test Description  : Verify login page ")

	public void LoginPage() {

		login();

	}
}
