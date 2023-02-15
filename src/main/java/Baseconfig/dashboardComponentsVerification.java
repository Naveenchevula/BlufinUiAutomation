package Baseconfig;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DashBoard;

public class dashboardComponentsVerification {
	public static WebDriver driver;

	public void DashboardVerify() throws Throwable {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DashBoard dashboard = new DashBoard (driver);
		dashboard.Dashboardverification();
		dashboard.DashboardCompVerify();
}
}