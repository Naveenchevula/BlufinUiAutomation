package bluefinUIAutomation;

import org.testng.annotations.Test;

import Config.TestBase;
import pageObjects.LogIn;

public class CreateTicketTest extends TestBase {
	
	public CreateTicketTest() {
		super();
	}
	LogIn login;
	
	@Test(priority = 4, description = "Test Description  : Created Support Ticket")

	public void createticket () throws Throwable {
		login = new LogIn();
		login.LoginFuction();
		
		login.CreateTicket();
	}
}


