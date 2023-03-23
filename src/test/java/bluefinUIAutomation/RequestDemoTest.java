package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.DemoRequest;

public class RequestDemoTest extends TestBase {
	public RequestDemoTest() {
		super();
	}
	DemoRequest demo;
	
	
	@Test(priority = 1, description = " Test Description   =  Verification of Request Demo Feature")

  public void testdemo() {
		demo = new DemoRequest();
		demo.RequestDemoMethod();
	
	
	}

}