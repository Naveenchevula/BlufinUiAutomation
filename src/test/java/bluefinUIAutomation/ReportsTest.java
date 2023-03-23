package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.LogIn;
import pageObjects.ReportsPagedata;

public class ReportsTest extends TestBase {
	
	public ReportsTest () {
		super();
	}
	
	ReportsPagedata reports;
	LogIn login;

	@Test(priority = 6, description = "Test Description   = Verification of Reports Back Office ")
	
	public void ReportsPage() throws Throwable {
		reports = new ReportsPagedata();
		reports.Reportspageverification();
		
		
	}
}
