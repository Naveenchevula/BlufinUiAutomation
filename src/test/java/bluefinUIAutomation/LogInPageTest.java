package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.LogIn;

public class LogInPageTest extends TestBase {
	
	public LogInPageTest() {
		super();
	}
	LogIn login;

	@Test(priority = 5, description = "Test Description  : Verify login page ")
	
	public void LoginPage() throws Throwable {

		login = new LogIn();
		login.LoginFuction();

	}
}
