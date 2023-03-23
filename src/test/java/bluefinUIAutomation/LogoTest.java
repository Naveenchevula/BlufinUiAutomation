package bluefinUIAutomation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.HomePageLogo;

public class LogoTest extends TestBase {
	
	public LogoTest() {
		super();
		
	}
	HomePageLogo homepage;
	
	@Test(priority = 4, description = "Test Description   = Verification of LoGo Feature")

	public void logoVerify() {
		homepage = new HomePageLogo();
		homepage.LogoVerify();
		
	}
}
