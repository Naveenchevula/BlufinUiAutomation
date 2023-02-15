package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.AddOrganizationVerify;

public class AddOrganizationTest extends AddOrganizationVerify{
	@Test(priority = 2, description = "Test Description   = Verification Add Organization")
	public void AddOrganization() throws Throwable{
		AddOrganizationBO();
		
	}
}
