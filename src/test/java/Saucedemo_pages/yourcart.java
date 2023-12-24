package Saucedemo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class yourcart {
	WebDriver driver;
	public yourcart(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By checkout = By.linkText("CHECKOUT");
	
	public void Checkout() {
		
		driver.findElement(checkout).click();
	}

}
