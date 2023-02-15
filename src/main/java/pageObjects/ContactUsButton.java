package pageObjects;

import java.time.Duration;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsButton {
	WebDriver driver;

	static final Logger logger = LogManager.getLogger(ContactUsButton.class.getName());

	public ContactUsButton(WebDriver driver) {
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

	public void Goto() {

		driver.get("http://web.td112.net/");

	}

	public void Contactus() {
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
	
}
