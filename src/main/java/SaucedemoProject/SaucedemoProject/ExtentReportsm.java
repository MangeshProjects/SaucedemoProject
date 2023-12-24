package SaucedemoProject.SaucedemoProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsm {
	public static ExtentReports extentdm1(){
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Reports");
		reporter.config().setDocumentTitle("Testing Reports");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Mangesh Tamakhe");
		return extent;

}
}
