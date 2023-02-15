package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ContactUsButton;
import pageObjects.ContactUsFuctionality;

public class ContactUsFuctionalityVerification {
	public static WebDriver driver;

	public void ContactusVerificationMethod() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://web.td112.net/");
		System.out.println("Current url : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedurl = "http://web.td112.net/";
		String originalurl = driver.getCurrentUrl();
		Assert.assertEquals(originalurl, expectedurl);
		ContactUsFuctionality button = new ContactUsFuctionality(driver);
	//	ContactUsFuctionalityVerification button = new ContactUsFuctionalityVerification();
		button.ContactusVerification();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	    button.LoginFuction();
	    button.ContactUspageBO();
	
	}
	
}
