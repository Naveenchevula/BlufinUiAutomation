package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.forgotpasswordEvents;

public class forgetpassword {
	// public static WebDriver driver;
	public void forgotPass() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://console.td112.net/login");
		System.out.println("Current url : " + driver.getCurrentUrl());
		System.out.println("Current Title : " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedurl = "https://console.td112.net/login";
		String originalurl = driver.getCurrentUrl();
		Assert.assertEquals(originalurl, expectedurl);

		forgotpasswordEvents forgetPass = new forgotpasswordEvents(driver);
		forgetPass.forgotPass();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();

	}
}
