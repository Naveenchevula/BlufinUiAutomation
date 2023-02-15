package pageObjects;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TOTPGenerator;

public class ContactUsFuctionality {

	WebDriver driver;

	static final Logger logger = LogManager.getLogger(ContactUsButton.class.getName());

	public ContactUsFuctionality(WebDriver driver) {
		// intialistion

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='button-contact']")
	WebElement ContactUsButton;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//a[@class='btn btn-submit'][normalize-space()='Contact Us']")
	WebElement Button;
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
	@FindBy(xpath = "//button[normalize-space()='Send Message']")
	WebElement SendMessage;
	@FindBy(xpath = "//div[@class='text-message']")
	WebElement SucessMessage;

	// login
	@FindBy(xpath = "(//a[@class='btn btn-submit ng-star-inserted'][normalize-space()='Login'])[2]")
	WebElement LogInBtn;
	@FindBy(xpath = "//input[@placeholder='Please enter your email']")
	WebElement Email1;
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

	// contact us Bo
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]")
	WebElement ContentText;

	@FindBy(xpath = "/html[1]/body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]")
	WebElement View;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]")
	WebElement CloseBtn;

	@FindBy(css = "ng-component.ng-star-inserted:nth-child(2) div.main-wrapper div.content-wrapper div.main-content ng-component.ng-star-inserted:nth-child(2) div.section-content div.clearfix div.table-responsive:nth-child(2) table.tblRpt.width-100per.table-striped tbody:nth-child(2) tr.row-bold.ng-star-inserted:nth-child(1) td.text-center:nth-child(5) div.form-group.m-b-10.d-inline-block > label:nth-child(2)")
	WebElement Label;
	@FindBy(xpath = "(//button[normalize-space()='Yes'])[1]")
	WebElement Yes;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//div[@class='col-megamenu col-menu']//a[@class='link-menu'][normalize-space()='Contact Us']")
	WebElement ContactusBO;
	@FindBy(xpath = "//div[@class='header-left']//a[@class='link-nav dropdown-toggle'][normalize-space()='Services']")
	WebElement SelectService;

	//
	public void Goto() {

		driver.get("http://web.td112.net/");

	}

	public void ContactusVerification() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF CONTACT US BUTTON # # # # # # # # # ");
		logger.info("Redirected to Lobby ");
		logger.info("ON Home Page ");
		logger.info("Contact Us Button Test Started");
		ContactUsButton.click();
		logger.info("Click on contact us Button on home page ");
		logger.info("Click on contact us Button");
		logger.info("Contact us pop is opended");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/// on contact us button
		Button.click();
		logger.info("Click on contact us Button inside Pop- up ");
		logger.info("redirected to contact us form ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Able to see Contact Us Form ");
		logger.info("Cleared form");
		logger.info("Entering Info in the form");
		FirstName.sendKeys("Naveen");
		logger.info("Entered FirstName");
		String val = FirstName.getAttribute("value");
		logger.info("first Name Entered as :" + val);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LastName.sendKeys("chevula");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entered LastName");
		String val1 = LastName.getAttribute("value");
		logger.info("Last Name Entered as :" + val1);
		logger.info("Entering Phone number");
		PhoneNumber.sendKeys("9963802616");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val2 = PhoneNumber.getAttribute("value");
		logger.info("PhoneNumber Entered as :" + val2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entering Email");
		Email.sendKeys("xyz@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val4 = Email.getAttribute("value");
		logger.info("PhoneNumber Entered as :" + val4);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entering Company Name ");

		Company.sendKeys("Automation Organization");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val3 = Company.getAttribute("value");
		logger.info("PhoneNumber Entered as :" + val3);

		logger.info("Selecting Role From DropDown");
		Role.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectRole.click();
		logger.info("Selected Role as : Software Engineer");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entering Note");
		Note.sendKeys("Automation Testing Scripting");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String val5 = Note.getAttribute("value");

		logger.info("Entering Note as :" + val5);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SendMessage.click();
		logger.info("Clicked on Send Message button");

		String originalText = SucessMessage.getText();
		logger.info("Message set Succesfull");
		logger.info("Displaying Success Message as : " + originalText);

		logger.info("Contact Us Button on home page is verified");

	}

	public void LoginFuction() throws Throwable {
		logger.info("Open Lobby Url");
		logger.info("Searching for Loggin Button");
		logger.info("Clicked On Login Button");
		driver.get("http://console.td112.net/login?redirect=%2F");
		logger.info("Redirected to Login Page");
		logger.info("verifing login page ");
		logger.info("found Email & Password Boxes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Email1.clear();
		logger.info("Clear email Box");
		Email1.sendKeys("admin@alphanetworks.com.sg");
		logger.info("Enter Email Id ");
		String val = Email1.getAttribute("value");
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
		// driver.get("https://console.td112.net/customer/contact-us");
	}

	public void ContactUspageBO() {
		SelectService.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ContactusBO.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Redirected to contactus page back office");
		logger.info("List of data is displaying");
		View.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked on view");
		String Content = ContentText.getText();
		logger.info("Displaying content as ;" + Content);
		CloseBtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked on Close Button");
		logger.info("View closed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.cssSelector("label[for='c-0']")).click();
		
		
		
		//Label.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked on reply icon");
		logger.info("Window pop up is opened");
	//	Yes.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked on yes icon");
		logger.info("Popup is closed");
		logger.info("unable to see record");
		logger.info("Test passed succesfully");

	}
}
