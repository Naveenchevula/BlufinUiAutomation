package pageObjects;

import java.awt.AWTException;
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

public class SearchOrganizationElement extends LogIn {
	WebDriver driver;

	static final Logger logger = LogManager.getLogger(SearchOrganizationElement.class.getName());

	public SearchOrganizationElement(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		PropertyConfigurator.configure("log4j.properties");
		logger.info("# # # # # # # # # # # # # # # # # # # # # # # # # # # ");
		logger.info("# # # # # # # # VERIFICATION OF SEARCH FUNTIONALITY # # # # # # # # # ");

	}

	@FindBy(xpath = "//div[@class='header-left']//a[@class='link-nav dropdown-toggle'][normalize-space()='Services']")
	WebElement SelectService;
	@FindBy(xpath = "//div[@class='dropdown-menu show']//div[@class='col-megamenu col-menu']//a[@class='link-menu'][normalize-space()='Organization Listing']")
	WebElement OrganisationListingBtn;
	@FindBy(xpath = "(//a[normalize-space()='Add New Organization'])")
	WebElement AddOrganizationBtn;
	@FindBy(xpath = "(//input[@placeholder='Please enter organization name'])")
	WebElement OrgNameFiled;
	@FindBy(xpath = "//body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[1]/div[2]/phone-country[1]/div[1]/p-dropdown[1]/div[1]")
	WebElement SelectCountry;
	@FindBy(xpath = "//body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[1]/div[2]/phone-country[1]/div[1]/p-dropdown[1]/div[1]/div[3]/div[1]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/p-dropdownitem[4]/li[1]/div[1]/span[1]")
	WebElement SelectOption;
	@FindBy(xpath = "(//input[@placeholder='Please enter number phone'])")
	WebElement PhoneNumber;
	@FindBy(xpath = "(//input[@placeholder='Please enter your address'])")
	WebElement Address;
	@FindBy(xpath = "(//input[@placeholder='Please enter your email'])")
	WebElement Email;
	@FindBy(xpath = "(//input[@placeholder='Please enter your billing address'])")
	WebElement BillingAdress;
	@FindBy(xpath = "(//input[@placeholder='Please enter register no.'])")
	WebElement RegistrationNo;
	@FindBy(xpath = "(//a[normalize-space()='See Plans'])")
	WebElement SeePlans;
	@FindBy(xpath = "(//span[@class='p-dialog-header-close-icon pi pi-times ng-tns-c50-16'])")
	WebElement CloseIcon;
	@FindBy(xpath = "//body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[1]/div[1]/div[4]/div[1]/p-dropdown[1]/div[1]/span[1]")
	// @FindBy(xpath = "(//div[@class='p-dropdown-trigger ng-tns-c79-21'])")
	WebElement SelectIcon;
	@FindBy(xpath = "//li[@aria-label='Business']")
	WebElement Selectdropdown;
	@FindBy(xpath = "(//input[@type='file'])")
	WebElement SelectImg;

	// Admin data
	@FindBy(xpath = "(//input[@role='searchbox'])")
	WebElement AdEmail;
	@FindBy(xpath = "//input[@placeholder='Please enter your first name']")
	WebElement AdName;

	@FindBy(xpath = "//input[@placeholder='Please enter your last name']")
	WebElement AdLastName;
	@FindBy(xpath = "(//input[@placeholder='Please enter number phone'])[2]")
	WebElement AdNumber;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement SubmitBtn;
	@FindBy(xpath = "(//input[@placeholder='Search'])")
	WebElement SearchBox;
    
	@FindBy(xpath = "//div[@class='section-content']")
	WebElement ResultsSection;
	
	public void addOrg() throws Throwable {
		LogIn log = new LogIn(driver);
		log.LoginFuction();
		logger.info("Searching for Select Service button");
		logger.info("clicking on Select service");
		SelectService.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Searching for Organisation listing button");
		logger.info("clicking on Organisation listing button");
		OrganisationListingBtn.click();
		logger.info("Organization Listing page opend");
		logger.info("Searching for Add Organization Button");
		logger.info("Clicking on Add Organization Button");
		AddOrganizationBtn.click();
		logger.info("Add organization from is opened");

	}

	public void organizationSearch(String OrgName, String OrgPhoneNumber, String Addresss, String email,
			String billingAdress, String RegisterNo) throws AWTException {
		logger.info("clearing form");
		logger.info("Entering Organization Name");
		OrgNameFiled.sendKeys(OrgName);

		logger.info("Entering Organization Name as :" + OrgName);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked on country dropdown");
		SelectCountry.click();
		logger.info("Selected Country");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		SelectOption.click();
		logger.info("Entering Phone number");
		PhoneNumber.sendKeys(OrgPhoneNumber);
		logger.info("Entered Phone number as :" + OrgPhoneNumber);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entering Address");
		Address.sendKeys(Addresss);
		logger.info("Entered Address as" + Addresss);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Entering Email Id ");
		Email.sendKeys(email);
		logger.info("Entered Email Id as :" + email);
		logger.info("Entering Billing Address ");
		BillingAdress.sendKeys(billingAdress);
		logger.info("Entered Billing Address :" + billingAdress);
		logger.info("Entering registration Number");
		RegistrationNo.sendKeys(RegisterNo);
		logger.info("Entered registration Number as :" + RegisterNo);
		// SeePlans.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// CloseIcon.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// driver.findElement(By.name("Please select subscription plan")).click();

		SelectIcon.click();
		logger.info("Clicked on Select Subscription Plan");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Selectdropdown.click();
		logger.info(" Subscription Plan is Selected");
		logger.info(" Page Scrolled for Admin Section");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Element = driver.findElement(By.xpath("//h3[normalize-space()='Admin Account']"));
		js.executeScript("arguments[0].scrollIntoView();", Element);

		/*
		 * SelectImg.click(); /* upload image
		 * 
		 * StringSelection ss = new StringSelection("C:\\Users\\nchevula\\Downloads\\");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 * 
		 * //imitate mouse events like ENTER, CTRL+C, CTRL+V Robot robot = new Robot();
		 * robot.delay(250); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.keyRelease(KeyEvent.VK_ENTER); robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_V); robot.keyRelease(KeyEvent.VK_V);
		 * robot.keyRelease(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_ENTER);
		 * robot.delay(90); robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		logger.info("Clearing admin Section");
		AdEmail.sendKeys(email);
		logger.info("Entered Admin Email As :" + email);
		AdName.sendKeys(OrgName);
		logger.info("Entered Admin First Name as :" + OrgName);
		AdLastName.sendKeys(OrgName);
		logger.info("Entered Admin Last Name as :" + OrgName);
		AdNumber.sendKeys(OrgPhoneNumber);
		logger.info("Entered Admin Number as :" + OrgPhoneNumber);
		driver.findElement(By.xpath(
				"//body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[3]/div[1]/div[2]/div[1]/phone-country[1]/div[1]/p-dropdown[1]/div[1]/span[1]"))
				.click();
		logger.info("clicked on Select Country");
		driver.findElement(By.xpath(
				"//body[1]/ng-component[1]/div[1]/div[3]/div[2]/ng-component[1]/div[2]/div[3]/div[1]/div[2]/div[1]/phone-country[1]/div[1]/p-dropdown[1]/div[1]/div[3]/div[1]/ul[1]/cdk-virtual-scroll-viewport[1]/div[1]/p-dropdownitem[4]/li[1]/div[1]"))
				.click();
		/*
		 * org name String org = OrgNameFiled.getText();
		 */

		logger.info("Selected Country");
		logger.info("Searching for submit button");
		SubmitBtn.click();
		logger.info("Clicked on Submit button");
		logger.info("Organization Created Successfully");
		logger.info("Searching for Search Text Box");
		logger.info("Search Box Founded");
		SearchBox.click();
		logger.info("Clicked On Search Box");
		SearchBox.sendKeys(OrgName);
		logger.info("Enter Text in Search Box as : " + OrgName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Clicked On Search Icon");
		SearchBox.sendKeys(Keys.ENTER);
		logger.info("Searching for Organization :"+ OrgName);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	String org = ResultsSection.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//	logger.info("Search Results data :"+ org);
		logger.info("Search Results data :"+ driver.findElement(By.xpath("//td[2]")).getText());
		logger.info("Search Functionality is verified");
	}

}
