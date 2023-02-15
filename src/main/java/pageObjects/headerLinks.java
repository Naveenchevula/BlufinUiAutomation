package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class headerLinks {
	WebDriver driver;
	static final Logger logger = LogManager.getLogger(headerLinks.class.getName());

	public headerLinks(WebDriver driver) {
		// intialistion
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF HEADER LINKS # # # # # # # # # ");
		logger.info("Chrome Driver Lunched");
		logger.info("Chrome Browser Opened");
	}

	/* Solution page */
	@FindBy(xpath = "//div[@class='h-right']//a[@class='link cursor-pointer'][normalize-space()='Solutions']")
	WebElement SolutionBtn;

	@FindBy(xpath = "//div[@class='h-right']//h4[@class='title-group'][normalize-space()='WAF Defender']")
	WebElement WAFBtn;

	@FindBy(xpath = "//div[@class='dropdown-menu megamenu-desktop show']//h4[@class='title-group'][normalize-space()='Bot Management']")
	WebElement BotManagement;

	@FindBy(xpath = "//div[@class='dropdown-menu megamenu-desktop show']//h4[@class='title-group'][normalize-space()='Web Acceleration']")
	WebElement WedAcceleration;
	@FindBy(xpath = "//div[@class='dropdown-menu megamenu-desktop show']//h4[@class='title-group'][normalize-space()='Authoritative DNS']")
	WebElement AuthoritativeDNS;
	String clickl = Keys.chord(Keys.CONTROL, Keys.ENTER);

	public void Goto() {
		driver.get("http://web.td112.net/");
		logger.info("Opend Lobby URL");
		logger.info("On Lobby Home Page");

	}

	public void HeaderLinksSubbtn() {
		logger.info("on header");
		SolutionBtn.click();
		logger.info("Clicked On Solution Button");
		logger.info(driver.getCurrentUrl());
		logger.info("\n Verified : Clickin action of Solutions Button");
		logger.info(driver.getCurrentUrl());

	}

	public void SoltuionButtonSection() {

		/* WAF */
		logger.info(" On WAF Button");
		WAFBtn.click();
		logger.info(" Clicked WAF Button");
		logger.info(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("\n Verified : Clickin action of Solutions Button and Verified WAF Button opening new tab");
		logger.info(" Verified WAF Button");
		/* Boat Management */

		SolutionBtn.click();
		logger.info(" Go Back to Home page ");
		logger.info(" On Home Page ");
		logger.info("  Searching for Bot Managament Section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(" Found Bot Managament Section");
		BotManagement.click();
		logger.info(" Clciked on Bot Managament Section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("\n Verified : Clickin action of Solutions Button and Verified Boat Management opening new tab");

		/* Web Acceleration */
		SolutionBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("go Back to home page");
		logger.info("Search For WedAcceleration");
		WedAcceleration.click();
		logger.info(" WedAcceleration is disaplyed");
		logger.info("Click on WedAcceleration");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(driver.getCurrentUrl());

		logger.info("\n Verified : Clickin action of Solutions Button and Verified Web Accelaration opening new tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Verified  WedAcceleration");

		/* AuthoritativeDNS */
		SolutionBtn.click();
		logger.info("Go back to home page");
		logger.info("Search for AuthoritativeDNS");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Found AuthoritativeDNS");
		AuthoritativeDNS.click();
		logger.info("Clicked on AuthoritativeDNS");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(driver.getCurrentUrl());
		logger.info("\n Verified : Clickin action of Solutions Button and Verified AuthoritativeDNS opening new tab");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("verified  AuthoritativeDNS");
		logger.info("verification of home page Compleated");
	}

}
