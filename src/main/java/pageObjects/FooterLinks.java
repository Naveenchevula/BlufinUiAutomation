package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config.TestBase;

public class FooterLinks extends TestBase {
	WebDriver driver;
	FooterLinks footerlinks;
	static final Logger logger = LogManager.getLogger(FooterLinks.class.getName());
	
	public FooterLinks() {
		// intialistion
		this.driver = TestBase.driver;
		PageFactory.initElements(TestBase.driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF FOOTER LINKS # # # # # # # # # ");
		logger.info("Browser Lunched");
	}

	@FindBy(xpath = "//div[normalize-space()='Service and Support']")
	WebElement ServiceandSupport;
	@FindBy(xpath = "//a[normalize-space()='Learning']")
	WebElement LearningLink;
	@FindBy(xpath = "//a[normalize-space()='Contact Sales']")
	WebElement ContactSalesLinks;

	@FindBy(xpath = "//a[normalize-space()='My Account']")
	WebElement MyAccountLink;

	@FindBy(xpath = "//div[@class='menu-col']//a[@class='link cursor-pointer'][normalize-space()='Pricing']")
	WebElement Pricing;

	@FindBy(xpath = "//div[@class='menu-col']//a[@class='link cursor-pointer'][normalize-space()='About Us']")
	WebElement Aboutus;

	@FindBy(xpath = "//a[normalize-space()='Case Studies']")
	WebElement CaseStudies;
	@FindBy(xpath = "//a[@class='link cursor-pointer'][normalize-space()='Request Demo']")
	WebElement RequestDemolink;

	String clickl = Keys.chord(Keys.CONTROL, Keys.ENTER);

	

	public void FooterlinkCheck() {
		
		
	//	driver.get("http://web.td112.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Element = driver.findElement(By.xpath("//div[normalize-space()='Service and Support']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		logger.info("Page Scrolled Down");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("ON Service and Support Box Section");
		//System.out.println("ON Service and Support Box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/// Learning link Window opened////
		LearningLink.sendKeys(clickl);
		logger.info("Clicked On Learning Link");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String originalurl2 = driver.getCurrentUrl();
		logger.info("Current Url : " + originalurl2);
		logger.info("ON Learning Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/// contact sales Window opened////
		ContactSalesLinks.sendKeys(clickl);
		String originalurl4 = driver.getCurrentUrl();
		logger.info("ON contact Sale's Links");
		logger.info("Current Url : " + originalurl4);
		/// Billing Header//
		logger.info("ON Billing section");

/// My Account Window opened////
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		MyAccountLink.sendKeys(clickl);
		logger.info("Clicked on My Account Link");
		logger.info("On My Account Link");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/// pricing //
		Pricing.sendKeys(clickl);
		logger.info("Clicked on Pricing");
		logger.info("On Pricing page ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// QUICK LINKS //
		logger.info("ON QUICK LINKS section");
		// about us//

		Aboutus.sendKeys(clickl);
		logger.info("Clicked on About Us");
		logger.info("On About Us");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Case studies//
		CaseStudies.sendKeys(clickl);
		logger.info("Clicked on CaseStudies");
		logger.info("On CaseStudies");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// RequestDemo link
		RequestDemolink.sendKeys(clickl);
		logger.info("Clicked on RequestDemolink");
		logger.info("On RequestDemolink");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Footer Links verified");
	}
}