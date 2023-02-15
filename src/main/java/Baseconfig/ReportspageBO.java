package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.ReportsPage;

public class ReportspageBO {
	public static WebDriver driver;
	public void ReportsBackOffice() throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ReportsPage rp = new ReportsPage(driver);
		rp.Reportspageverification();		
}


	
	
	
	
	
	
}
