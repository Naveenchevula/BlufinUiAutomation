package pageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Config.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRequest extends TestBase {

	WebDriver driver;
	DemoRequest demo;
	static final Logger logger = LogManager.getLogger(DemoRequest.class.getName());

	public DemoRequest() {
		// intialistion
		this.driver = TestBase.driver;
		PageFactory.initElements(TestBase.driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF REQUEST DEMO FUCTIONALITY # # # # # # # # # ");
		logger.info("Chrome Driver Lunched");
		logger.info("Chrome Browser Opened");
	}


	@FindBy(xpath = "//div[@class='h-right']//a[@class='btn btn-submit ng-star-inserted'][normalize-space()='Login']")
	WebElement LoginButton;
	@FindBy(xpath = "//div[@class='request']//a[@class='btn btn-border'][normalize-space()='Request Demo']")
	WebElement RequestDemo;
	@FindBy(xpath = "//input[@placeholder='First name']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@placeholder='Last name']")
	WebElement LastName;
	@FindBy(xpath = "//input[@placeholder='Your phone number']")
	WebElement PhoneNumber;
	@FindBy(xpath = "//input[@placeholder='Your email']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Your company']")
	WebElement Company;
	@FindBy(xpath = "//span[contains(.,'Your job title')]")
	WebElement Role;
	@FindBy(xpath = "//li[@aria-label='Software Engineer']")
	WebElement SelectRole;

	@FindBy(xpath = "//textarea[@placeholder='Please enter your note']")
	WebElement Note;
	@FindBy(xpath = "//button[normalize-space()='Click here to proceed with request']")
	WebElement SubmitButton;

	@FindBy(xpath = "//a[normalize-space()='Return to Homepage']")
	WebElement ReturnHomeBtn;

	

	public void RequestDemoButton() {
		logger.info("Searching for Request Demo Button");
		logger.info("Found Request Demo Button");
		logger.info("Click on Request Demo Button ");
		RequestDemo.click();
		logger.info("Clicked on Request Demo Button ");
		
		logger.info("Redirected to  Request Demo form ");
	}

	public void RequestDemoDetails(String firstname, String lastName, String phoneNumber, String compny, String email,
			String note) {
		logger.info("Clear Form ");
		logger.info("Entering Details in Form");
		FirstName.sendKeys(firstname);
		String val = FirstName.getAttribute("value");
		logger.info("Entered First Name is: " + val);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LastName.sendKeys(lastName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val1 = LastName.getAttribute("value");
		logger.info("Entered Last Name is: " + val1);
		PhoneNumber.sendKeys(phoneNumber);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val2 = PhoneNumber.getAttribute("value");
		logger.info("Entered Phone Number is: " + val2);
		Company.sendKeys(compny);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val3 = Company.getAttribute("value");
		logger.info("Entered Organization is: " + val3);
		Role.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectRole.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Email.sendKeys(email);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val4 = Email.getAttribute("value");
		logger.info("Entered Email is: " + val4);
		Note.sendKeys(note);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val5 = Note.getAttribute("value");
		logger.info("Entered Note as: " + val5);
		// driver.quit();
		SubmitButton.click();
		String val6 = ReturnHomeBtn.getText();
		logger.info("Button Text Found : " + val6);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ReturnHomeBtn.click();
		String val7 = driver.getCurrentUrl();
		logger.info("Current Url After clicking on back button : " + val7);
		logger.info("Verified Request Demo Functionality");
	}
	
	public void RequestDemoMethod() {
		
		System.out.println("Current url : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedurl = "https://web.td112.net/";
		String originalurl = driver.getCurrentUrl();
		Assert.assertEquals(originalurl, expectedurl);
		String expectedTitle = "Lobby";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);
		DemoRequest homepageElement = new DemoRequest();
		homepageElement.RequestDemoButton();
		homepageElement.RequestDemoDetails("Auto_FirstName" + RandomStringUtils.randomAlphabetic(3),
				"Auto_LirstName" + RandomStringUtils.randomAlphabetic(3),
				"99638036" + RandomStringUtils.randomNumeric(2), "Auto_Comp" + RandomStringUtils.randomAlphabetic(3),
				"auto" + RandomStringUtils.randomAlphabetic(3).toLowerCase() + "@mailinator.com",
				"Automation Test Request demo Success" + RandomStringUtils.randomAlphabetic(3));

		// homepageElement.LoginButtonTest();
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://web.td112.net/");
		homepageElement.RequestDemoButton();
		System.out.println("DemoPage Opened");
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//	   homepageElement.RequestDemoDetails(originalTitle, originalTitle, originalTitle, originalTitle, originalTitle, originalTitle);
		System.out.println("Entered details sucessfully");
		// driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();

	}

	///////////////// get screenshot demo code /////////////////
	public String getScreenshot(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + testcaseName + ".png");
		FileUtils.copyFile(source, dest);
		return System.getProperty("user.dir") + testcaseName + ".png";
	}
	
	
	
}
