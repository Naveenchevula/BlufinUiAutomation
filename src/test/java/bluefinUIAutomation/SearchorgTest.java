package bluefinUIAutomation;

import org.testng.annotations.Test;

import Baseconfig.SearchOrganization;

public class SearchorgTest extends SearchOrganization {
		@Test(priority = 3, description = "Test Description   = Verification of Search Organization")
		public void SearchOrgnizationElement() throws Throwable{
			SearchOrg();
			
			
		}
}
