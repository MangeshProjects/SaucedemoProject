package Sauce_demoMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Saucedemo_pages.AddProducts;
import Saucedemo_pages.Checkout_overpage;
import Saucedemo_pages.Information;
import Saucedemo_pages.sauce_demo1;
import Saucedemo_pages.yourcart;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Teardown {
	
	WebDriver driver;

	
	@BeforeTest
	public void beforeMethod() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 0)
	public void Logindone() throws InterruptedException {
		
		sauce_demo1 sd1 = new sauce_demo1(driver);
		sd1.username_enter("standard_user");
		sd1.password_enter("secret_sauce");
		Thread.sleep(2000);
		sd1.Login_click();
	}
	
	@Test (priority = 1)
	public void Addproduct() {
		AddProducts p = new AddProducts(driver);
		p.addclick();
	}
	
	@Test (priority = 2)
	public void Yourcart() {
		yourcart y = new yourcart(driver);
		y.Checkout();
		
	}
	
	@Test (priority = 3)
	public void Informationform() {
		yourcart y = new yourcart(driver);
		y.Checkout();
		
	}
	@Test (priority =4)
	public void info() throws Exception {
		Information infy = new Information(driver);
		infy.form("Mangesh", "tamakhe", "1235");
		
		
		
	}
	@Test (priority=5)
	public void finish() {
		Checkout_overpage cv = new Checkout_overpage(driver);
		cv.finish1();
		
	}
	
	
	
	
	@AfterTest
	public void aftermethod() {
		driver.quit();
		
	}
	
}
