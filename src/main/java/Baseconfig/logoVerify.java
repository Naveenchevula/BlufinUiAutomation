package Baseconfig;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageLogo;

public class logoVerify {

	public static WebDriver driver;

	public void logo() {

		WebDriverManager.chromedriver().setup();
//			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nchevula\\eclipse-workspace\\UIAutomation\\drivers\\chromedriver.exe");  	  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://web.td112.net/");

		HomePageLogo logo = new HomePageLogo(driver);
		logo.LogoVerify();
		
	//	driver.close();

	}
	 
	  
}