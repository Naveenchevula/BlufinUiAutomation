package Baseconfig;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddOrganization;

public class AddOrganizationVerify {
	public static WebDriver driver;
	// for letters
		public String generateRandomString(int length) {
			return RandomStringUtils.randomAlphabetic(length).toLowerCase();
		}

		// for numbers
		public String generateRandomNumber(int length) {
			return RandomStringUtils.randomNumeric(length);
		}

	public void AddOrganizationBO() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    AddOrganization addOrg = new AddOrganization(driver);
	    addOrg.addOrg();
	    addOrg.organizationForm("Auto Org"+ RandomStringUtils.randomAlphabetic(3),"99638036" + RandomStringUtils.randomNumeric(2),"Auto Org"+ RandomStringUtils.randomAlphabetic(3),"auto" + RandomStringUtils.randomAlphabetic(3).toLowerCase() + "@mailinator.com","Auto Org"+ RandomStringUtils.randomAlphabetic(3),"99638036" + RandomStringUtils.randomNumeric(2));
	//    organizationForm orgFrom = new organizationForm();
	//    addOrg.Search("Auto Org"+ RandomStringUtils.randomAlphabetic(3));
	   
	}
	
	public void SearchOrg() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    AddOrganization addOrg = new AddOrganization(driver);
	    addOrg.addOrg();
	    addOrg.organizationForm("Auto Org"+ RandomStringUtils.randomAlphabetic(3),"99638036" + RandomStringUtils.randomNumeric(2),"Auto Org"+ RandomStringUtils.randomAlphabetic(3),"auto" + RandomStringUtils.randomAlphabetic(3).toLowerCase() + "@mailinator.com","Auto Org"+ RandomStringUtils.randomAlphabetic(3),"99638036" + RandomStringUtils.randomNumeric(2));
	 // addOrg.Search("Auto Org"+ RandomStringUtils.randomAlphabetic(3));
	   
	}
	
}
