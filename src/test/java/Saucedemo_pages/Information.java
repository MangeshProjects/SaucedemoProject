package Saucedemo_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Information {
	
WebDriver driver;
	
	public Information(WebDriver driver) {
		
		
		this.driver = driver;
	}
	
	By name = By.id("first-name");
	By Lname = By.id("last-name");
	By zip = By.id("postal-code");
    By btn = By.xpath("//input[@value='CONTINUE']");
    By cancel = By.linkText("CANCEL");
    
    public void form(String m , String t , String z) throws Exception {
    	Thread.sleep(2000);
    	driver.findElement(name).sendKeys(m);
    	Thread.sleep(2000);
    	driver.findElement(Lname).sendKeys(t);
    	Thread.sleep(2000);
    	driver.findElement(zip).sendKeys(z);
    	driver.findElement(btn).click();
    }
	
	

}
