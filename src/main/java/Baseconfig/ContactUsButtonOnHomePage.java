package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ContactUsButton;

public class ContactUsButtonOnHomePage {
	public static WebDriver driver;

	public void ContactusMethod() {
		// PropertyConfigurator.configure("log4j.properties");
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\nchevula\\eclipse-workspace\\UIAutomation\\drivers\\chromedriver.exe");
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

		ContactUsButton button = new ContactUsButton(driver);
		button.Contactus();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
