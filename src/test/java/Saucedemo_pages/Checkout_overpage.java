package Saucedemo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout_overpage {
WebDriver driver;
	
	public Checkout_overpage(WebDriver driver) {
		
		
		this.driver = driver;
	}
	
	By finish = By.linkText("FINISH");
	By Cancel = By.linkText("CANCEL");
	By message = By.xpath("//h2[@class='complete-header']");
	
	
	public void finish1() {
		
		driver.findElement(finish).click();
		System.out.println(driver.findElement(message).getText());
	}

}
