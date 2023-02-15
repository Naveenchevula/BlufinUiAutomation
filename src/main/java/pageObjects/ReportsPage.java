package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportsPage extends LogIn {
	WebDriver driver;
	static final Logger logger = LogManager.getLogger(DashBoard.class.getName());

	public ReportsPage(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF DASHBOARD # # # # # # # # # ");

	}

	@FindBy(xpath = "//div[@class='header-left']//a[@class='link-nav dropdown-toggle'][normalize-space()='Services']")
	WebElement SelectService;

	@FindBy(xpath = "//body[1]/ng-component[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/li[1]/a[1]")
	WebElement ProvideReport;

	public void Reportspageverification() throws Throwable {
		LogIn log = new LogIn(driver);
		log.LoginFuction();
		logger.info("Logged into Back office");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Services Button found");
		logger.info("Clicking on Services");
		SelectService.click();
		logger.info("Services Drop down is Opend");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ProvideReport.click();
		logger.info("Clicked on Provide report button");
		logger.info("Redirected to Reports page");
		String ab = driver.getCurrentUrl();
		logger.info("Current url :" + ab);
		logger.info("Reports page is opend");
		
		
		

	}
}
