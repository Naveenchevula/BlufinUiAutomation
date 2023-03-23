package bluefinUIAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.FooterLinks;

public class FooterLinksTest extends TestBase {
	
	public FooterLinksTest () {
		super();
	}
	
	FooterLinks footerlinks;
	
	@Test(priority = 2, description = "Test Description   = Verification of Footerlinks Feature")
	public void FooterTLinks() {
		
		footerlinks = new FooterLinks();
		
		footerlinks.FooterlinkCheck();
		
	}
}
