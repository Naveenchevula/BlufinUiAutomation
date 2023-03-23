package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.SearchOrganizationElement;

public class SearchorgTest extends TestBase {
	
	public SearchorgTest() {
		super();
	}
	
	SearchOrganizationElement search;
	
		@Test(priority = 3, description = "Test Description   = Verification of Search Organization")
		public void SearchOrgnizationElement() throws Throwable{
			search = new SearchOrganizationElement();
			search.SearchOrganizationadd();
			search.SearchOrg();
			
			
		}
}
