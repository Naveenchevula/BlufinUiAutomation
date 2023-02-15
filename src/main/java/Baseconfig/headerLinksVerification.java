package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.headerLinks;

public class headerLinksVerification {
	public static WebDriver driver;
	 public void headerLinksVerificationMethod() {
		 WebDriverManager.chromedriver().setup();	  
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 headerLinks hdlinks = new headerLinks(driver);
			 hdlinks.Goto();
			 hdlinks.HeaderLinksSubbtn();
			hdlinks.SoltuionButtonSection();
	 }

	
	
	 
}
