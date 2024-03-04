package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.AddOrganization;
import pageObjects.LogIn;

public class AddOrganizationTest extends TestBase{
	
	public AddOrganizationTest() {
		super();
	}   
	    
	AddOrganization  addorganization;
	LogIn login;
	
	
	@Test(priority = 2, description = "Test Description   = Verification Add Organization")
	
	public void AddOrg() throws Throwable {
	 
		addorganization = new AddOrganization();
		
		
		addorganization.AddOrganizationBO();
	
	}
}
