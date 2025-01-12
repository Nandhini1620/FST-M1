package com.testng.crm;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	
	@Test
	public void getCopyright() {
		WebElement copyText = driver.findElement(By.id("admin_options"));
		System.out.println("First copyright text is: ");
		System.out.println(copyText.getText());
		
		
	}
	
	@AfterMethod
	public void endSession() {
		driver.quit();
	}


}
