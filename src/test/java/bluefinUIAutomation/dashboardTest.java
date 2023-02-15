package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.dashboardComponentsVerification;

public class dashboardTest extends dashboardComponentsVerification {

	@Test(priority = 1, description = "Test Description   = Verification of DashBoard Components")
	public void DashBoard() throws Throwable {

		DashboardVerify();
		
	}
}
