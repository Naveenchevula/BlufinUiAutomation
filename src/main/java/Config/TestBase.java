package Config;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;

	@BeforeClass
	public void setupApplication() {

		Reporter.log("=====Browser Session Started=====", true);

		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
		driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://web.td112.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		Reporter.log("=====Application Started=====", true);
		

	}

	@AfterClass
	
	public void closeApplication() throws InterruptedException {

		Thread.sleep(2000);

		driver.quit();
		Reporter.log("=====Browser Session End=====", true);

	}

}
