package Sauce_demoMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Basic {
	WebDriver driver;
	
	         
	
		public String getScreenshot(String testCaseName, WebDriver driver2) throws Exception {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File file = new File(System.getProperty("user.dir")+"//reports//"+ testCaseName + ".png");
			FileUtils.copyFile(source, file);
			return System.getProperty("user.dir")+ "//reports//" + testCaseName + ".png";
		
		
	}


}
