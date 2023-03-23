package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config.TestBase;

public class ForgotPassword {
	WebDriver driver;
	ForgotPassword forgotpassword;
	static final Logger logger = LogManager.getLogger(ForgotPassword.class.getName());

	public ForgotPassword() {
		// intialistion
		this.driver = TestBase.driver;
		PageFactory.initElements(TestBase.driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF FORGET PASSWORD # # # # # # # # # ");
	}

	@FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
	WebElement ForgetPass;
	@FindBy(xpath = "//input[@placeholder='Please enter your email']")
	WebElement EmailBox;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement SubmitBtn;
	@FindBy(xpath = "//div[@class='p-toast-detail']")
	WebElement TostMsg;
	@FindBy(xpath = "//button[normalize-space()='Go back']")
	WebElement GobackBtn;
	
	@FindBy(xpath = "(//a[@class='btn btn-submit ng-star-inserted'][normalize-space()='Login'])[2]")
	WebElement LogInBtn;

	public void forgotPass() {
		
		driver.get("https://console.td112.net/login?redirect=%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Test Started to test forget password page Verification");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ForgetPass.click();
		
		logger.info("Clicked on forget Password Link/Button");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		EmailBox.sendKeys("naveenchevula221@gmail.com");
		// EmailBox.sendKeys("Automation"+"_" + RandomStringUtils.randomAlphabetic(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val = EmailBox.getAttribute("value");
		logger.info("Entered Email  is: " + val);
		SubmitBtn.click();
		logger.info("Clicked On Submit Button");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		logger.info("Email Sent Successfully");
		logger.info(GobackBtn.isDisplayed());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Able to see Go Back Button");
		GobackBtn.click();
		logger.info("Clicked on Go Back Button");
		logger.info("Forget Password Functionality Verification Done");
	}
	
	
	
	
}