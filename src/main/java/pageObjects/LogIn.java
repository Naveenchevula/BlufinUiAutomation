package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config.TestBase;
import utilities.TOTPGenerator;

public class LogIn extends TestBase {
	WebDriver driver;
	LogIn login;
	ReportsPagedata reports;
	static final Logger logger = LogManager.getLogger(WebDriver.class.getName());

	public LogIn() {
		// intialistion
		this.driver = TestBase.driver;
		PageFactory.initElements(TestBase.driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
//		logger.info("# # # # # # # # VERIFICATION OF LOGIN FUNCTIONALITY # # # # # # # # # ");
//		logger.info("Chrome Driver Lunched");
//		logger.info("Chrome Browser Opened");
	}

	@FindBy(xpath = "(//a[@class='btn btn-submit ng-star-inserted'][normalize-space()='Login'])[2]")
	WebElement LogInBtn;
	@FindBy(xpath = "//input[@placeholder='Please enter your email']")
	WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Please enter your password']")
	WebElement Password;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement Submitbtn;
	@FindBy(xpath = "//input[@placeholder='Please enter your code']")
	WebElement CodeBox;
	@FindBy(xpath = "//button[normalize-space()='Go back']")
	WebElement GoBackBtn;
	@FindBy(xpath = "//button[normalize-space()='Done']")
	WebElement Done;

	@FindBy(xpath = "//img[@class='img-avatar']")
	WebElement Select;

	//////////////////////////////////
	@FindBy(xpath = "//input[@id='identifierId']")
	WebElement EmailBox;
	@FindBy(xpath = "//input[@name='Passwd']")
	WebElement Password1;

	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath = "(//a[@class='btn btn-primary cursor-pointer'])")
	WebElement SupportBtn;

	@FindBy(xpath = "(//a[normalize-space()='Create Ticket'])")
	WebElement CreateTicket;

	@FindBy(xpath = "(//input[@placeholder='Subject'])")
	WebElement Subject;
	@FindBy(xpath = "(//input[@placeholder='Organization'])")
	WebElement orgnization;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/p-dropdown[1]/div[1]/span[1]")
	WebElement DropDown1;

	@FindBy(xpath = "(//body[1]/div[2]/div[1]/ul[1]/p-dropdownitem[2])")
	WebElement SelectDrop;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/div[1]/p-dropdown[1]/div[1]/span[1]")
	WebElement Assigne;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement TextBox1;
	@FindBy(xpath = "(//div[@class='item-user ng-star-inserted'])")
	WebElement ClickonAssigne;
	@FindBy(xpath = "(//textarea[@placeholder='Enter description'])")
	WebElement Description;
	@FindBy(xpath = "(//button[@type='submit'][normalize-space()='Submit'])[2]")
	WebElement SubBtn;

	public void LoginFuction() throws Throwable {
		logger.info("Open Lobby Url");
		logger.info("Searching for Loggin Button");
		logger.info("Clicked On Login Button");
		driver.get("http://console.td112.net/login?redirect=%2F");
		logger.info("Redirected to Login Page");
		logger.info("verifing login page ");
		logger.info("found Email & Password Boxes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Email.clear();
		logger.info("Clear email Box");
		Email.sendKeys("admin@alphanetworks.com.sg");
		logger.info("Enter Email Id ");
		String val = Email.getAttribute("value");
		logger.info("Entered Email as :" + val);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Search For Password Box");
		Password.clear();
		logger.info("Clear Password Box");
		Password.sendKeys("AA1@34aa");
		logger.info("Enter Password ");
		String val1 = Password.getAttribute("value");
		logger.info("Entered Email as :" + val1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Search For Submit Button");
		Submitbtn.click();
		logger.info("Clicked On Submit Button");
		logger.info("IS button DISPlAYING :" + "  " + Submitbtn.isDisplayed());
		logger.info("Redirected to Enter Code page ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Fetching Code From Google Authenticator");
		CodeBox.sendKeys(TOTPGenerator.getTwoFactorCode());
		logger.info("Enter Code in Box ");
		String val2 = CodeBox.getAttribute("value");
		logger.info("Entered 2 factor code as :" + val2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		logger.info("Current Url :" + "" + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Search For Done Button ");
		logger.info("Clicked on Done Button ");
		Done.click();
		logger.info("Clicked on Done Button ");
		logger.info("redirected to Back Office");
		logger.info(driver.getCurrentUrl());
		logger.info("Logged in Succesfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Search For Profile Icon On Back office page");
		logger.info("Found Profile Icon");
		Select.click();
		logger.info("Clicked On Profile Icon");
		logger.info("Profile Section Is opened ");
		logger.info("Current Url :" + "" + driver.getTitle());
		logger.info(driver.getCurrentUrl());
		logger.info("Login Functionality Verified");
		Select.click();

	}

	public void CreateTicket() throws InterruptedException {
		logger.info("Seareching for Support Button");
		SupportBtn.click();
		logger.info("Clicked on Search Button");
		logger.info("Support Page is opened");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info(driver.getCurrentUrl());
		CreateTicket.click();
		logger.info("Clicked on Create ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("create ticket Window Opend");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Enter Subject");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Subject.sendKeys("Test Automation Create ticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Sub = Subject.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Enter Subject As :" + Sub);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Enter Organization");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		orgnization.click();
		orgnization.sendKeys("Auto");
		logger.info("Enter Text As  Test" + orgnization.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Enter Organization");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//body[1]/div[2]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/li[3]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Select organization :" + orgnization.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DropDown1.click();
		logger.info("clicked on Category Dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectDrop.click();
		logger.info("Selected Category");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assigne.click();
		logger.info("Clicked on Assigne");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		TextBox1.sendKeys("Support");
		logger.info("Entered Support in Text Box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		ClickonAssigne.click();
		logger.info("Selcetd Support as Assigne from drop down");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Description.sendKeys("Testing Create ticket Senario Automation");
		logger.info("Entered Description As :Testing Create ticket Senario Automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*
		 * Action Classes
		 * 
		 * 
		 * WebElement element = driver.findElement(By.cssSelector(".p-dialog-content"));
		 * Actions builder = new Actions(driver);
		 * builder.moveToElement(element).clickAndHold().perform();
		 * builder.moveToElement(element).perform();
		 * builder.moveToElement(element).release().perform();
		 */
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubBtn);
		Thread.sleep(500);
		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/button[2]"))
		SubBtn.click();
		logger.info("Clicked on Submit Button");
		logger.info("Ticket Created Successfully");
		String content = driver.findElement(By.xpath("//div[@class='section-content']")).getText();

		logger.info("List of ticket's data displaying " + content);
		Thread.sleep(500);
		// driver.quit();

	}

}
