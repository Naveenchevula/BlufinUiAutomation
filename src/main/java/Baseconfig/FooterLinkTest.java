package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FooterLinks;



public class FooterLinkTest  {

	
	public static WebDriver driver;

	public void FooterLinksMethod() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nchevula\\eclipse-workspace\\UIAutomation\\drivers\\chromedriver.exe");  	  
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
		String expectedTitle = "Lobby";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);
		FooterLinks footerlinks1 = new FooterLinks(driver);
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		footerlinks1.FooterlinkCheck();
		System.out.println("Current Title : " + driver.getTitle());

		// on Learning Link
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// on contact sales
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}
}
