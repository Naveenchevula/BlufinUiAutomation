package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.DashBoard;

public class DashboardTest extends TestBase{
	
	
	public DashboardTest() {
		super();
	}
	
	DashBoard dashboard;

	@Test(priority = 1, description = "Test Description   = Verification of DashBoard Components")
	public void DashBordverify() throws Throwable {
		dashboard = new DashBoard();
		dashboard.Dashboardverification();
		dashboard.DashboardCompVerify();
		
	}
}
