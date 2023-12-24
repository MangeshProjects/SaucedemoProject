package Saucedemo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProducts {
	WebDriver driver;
	public AddProducts(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By addclick = By.xpath("(//button[contains(text(),'ADD TO CART')])[6]");
	By clickcart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	public void addclick() {
		
		driver.findElement(addclick).click();
		driver.findElement(clickcart).click();
	}
	
	
	
	
	

}
