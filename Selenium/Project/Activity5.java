package com.testng.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	
	@Test
	public void getColor() {
		Color color = Color.fromString(driver.findElement(By.className("container-fluid")).getCssValue("color"));
        System.out.println("Color of toolbar is: " + color.asRgb());
        System.out.println(color);
        System.out.println("Color as hexcode: " + color.asHex());;
		
		
		
	}
	
	@AfterMethod
	public void endSession() {
		driver.quit();
	}


}
