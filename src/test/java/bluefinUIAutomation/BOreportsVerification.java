package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.ReportspageBO;

public class BOreportsVerification extends ReportspageBO {

	@Test(priority = 6, description = "Test Description   = Verification of Reports Back Office ")
	
	public void ReportsPage() throws Throwable {

		ReportsBackOffice();
		
	}
}
