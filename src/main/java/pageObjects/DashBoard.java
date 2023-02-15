package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard extends LogIn {
	WebDriver driver;
	static final Logger logger = LogManager.getLogger(DashBoard.class.getName());

	public DashBoard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF DASHBOARD # # # # # # # # # ");

	}

	@FindBy(xpath = "//div[@role='button']")
	WebElement SelectOrg;
	@FindBy(xpath = "//div[@class='header-left']//a[@class='link-nav dropdown-toggle'][normalize-space()='Services']")
	WebElement SelectService;

	@FindBy(xpath = "//div[@class='dropdown-menu show']//div[@class='megamenu-container']")
	WebElement Container;

	@FindBy(xpath = "(//i[@class='icon icon-support'])[1]")
	WebElement SupportIconHeader;

	@FindBy(xpath = "(//a[normalize-space()='Logout'])[1]")
	WebElement Logout;
	@FindBy(xpath = "//img[@class='img-avatar']")
	WebElement Profileicon;

	public void Dashboardverification() throws Throwable {
		LogIn log = new LogIn(driver);
		log.LoginFuction();
		logger.info("verifying Profile Icon");
		logger.info("Clicked on Profile Icon");
		logger.info("Profile Icon Window opend");
		logger.info("Verified Profile Section");
		logger.info("Closed Profile Section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void DashboardCompVerify() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("verifying Components on Dashbaord");
		logger.info("Clicking on Organization dropdown");
		SelectOrg.click();
		logger.info("Organization Drop down is Opend");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectOrg.click();
		logger.info("Organization Section Closed");
		logger.info("Service section");
		logger.info("Verifying Service section");

		SelectService.click();

		logger.info("Clicked on Service section");
		logger.info("Heading Dispalying as : " + SelectService.getText());
		logger.info("Service section is Opened ");
		logger.info("List of Options under Service Section " + Container.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectService.click();
		logger.info("Service Section is Closed ");
		logger.info("Verifying Support Icon on Header");
		logger.info("Searching for Support Icon on Header");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Support Icon Is displayed :" + SupportIconHeader.isDisplayed());
		SupportIconHeader.click();
		logger.info("Clicked on Support icon");
		logger.info("Support page is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(driver.getCurrentUrl());
		logger.info("Searching for logout");
		logger.info("Clicked on Logout Button");
		Profileicon.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Logout.click();
		logger.info("Successfully Logged out");
		logger.info("Verified Dashboard functionality");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	driver.close();

	}
	
}
