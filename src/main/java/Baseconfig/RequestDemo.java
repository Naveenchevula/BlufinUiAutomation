package Baseconfig;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomepageElements;

public class RequestDemo {

	public static WebDriver driver;

	// for letters
	public String generateRandomString(int length) {
		return RandomStringUtils.randomAlphabetic(length).toLowerCase();
	}

	// for numbers
	public String generateRandomNumber(int length) {
		return RandomStringUtils.randomNumeric(length);
	}

	public void RequestDemoMethod() {
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
		String expectedTitle = "Lobby";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle);
		HomepageElements homepageElement = new HomepageElements(driver);
		homepageElement.RequestDemoButton();
		homepageElement.RequestDemoDetails("Auto_FirstName" + RandomStringUtils.randomAlphabetic(3),
				"Auto_LirstName" + RandomStringUtils.randomAlphabetic(3),
				"99638036" + RandomStringUtils.randomNumeric(2), "Auto_Comp" + RandomStringUtils.randomAlphabetic(3),
				"auto" + RandomStringUtils.randomAlphabetic(3).toLowerCase() + "@mailinator.com",
				"Automation Test Request demo Success" + RandomStringUtils.randomAlphabetic(3));

		// homepageElement.LoginButtonTest();
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://web.td112.net/");
		homepageElement.RequestDemoButton();
		System.out.println("DemoPage Opened");
		System.out.println("Current url : " + driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//	   homepageElement.RequestDemoDetails(originalTitle, originalTitle, originalTitle, originalTitle, originalTitle, originalTitle);
		System.out.println("Entered details sucessfully");
		// driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.close();

	}

	///////////////// get screenshot demo code /////////////////
	public String getScreenshot(String testcaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + testcaseName + ".png");
		FileUtils.copyFile(source, dest);
		return System.getProperty("user.dir") + testcaseName + ".png";
	}

}
