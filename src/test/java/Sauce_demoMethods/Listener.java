package Sauce_demoMethods;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import SaucedemoProject.SaucedemoProject.ExtentReportsm;

public class Listener extends Basic implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportsm.extentdm1();
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	WebDriver driver;
	
	public Listener() {
		
		this.driver=driver;
	}
	@Override
	public void onTestStart(ITestResult result) {
		
		test =extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test); //unique thread id
		
		//
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		//test.log(Status.FAIL, "Test failed");
		extentTest.get().fail(result.getThrowable());
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		String filePath= null;
		try {
	       filePath = getScreenshot(result.getMethod().getMethodName(),driver);
		}catch(Exception e){
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
