package Saucedemo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sauce_demo1 {
	
	WebDriver driver;
	
	public sauce_demo1(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By username = By.id("user-name");
	By Password = By.id("password");
	By Login_button = By.id("login-button");
	

	public void username_enter(String uname) {
		// TODO Auto-generated method stub
		driver.findElement(username).sendKeys(uname);
	}
	public void password_enter(String pass) {
		// TODO Auto-generated method stub
		driver.findElement(Password).sendKeys(pass);
		
	}

	public void Login_click() {
		// TODO Auto-generated method stub
		driver.findElement(Login_button).click();
	}
	
	
	
	
	

}
