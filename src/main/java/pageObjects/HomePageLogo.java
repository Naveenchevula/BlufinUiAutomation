package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class HomePageLogo {
	WebDriver driver;
	static final Logger logger = LogManager.getLogger(HomePageLogo.class.getName());

	public HomePageLogo(WebDriver driver) {
		// intialistion 
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF LOGO ON HOME PAGE # # # # # # # # # ");
		logger.info("Browser Opend");
		logger.info("Redirected to Lobby");
	}

	@FindBy(xpath = "//img[@src='/logo.png']")
	WebElement LOGO;

	public void LogoVerify() {
		logger.info("ON Home Page ");
		logger.info("Looking for Logo");
		logger.info("Searching for Logo");
		LOGO.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Logo Displaying");
		LOGO.getText();
		logger.info("IS LOGO DISPlAYING :" + "  " + LOGO.isDisplayed());
		logger.info("Verified Logo on Home Page");
		
	}
	
	

	  
}


