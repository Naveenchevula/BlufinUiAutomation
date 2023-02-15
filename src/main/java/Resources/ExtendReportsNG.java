package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsNG {
public static ExtentReports getReportObject() {
	String path = System.getProperty("user.dir") + "//report//index.html";
			ExtentSparkReporter reporter = new ExtentSparkReporter (path);
			reporter.config().setReportName("Web Automation Results");
			reporter.config().setDocumentTitle("Test Results");
			ExtentReports extent= new  ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Naveen Chevula");
			return extent;
}




}
