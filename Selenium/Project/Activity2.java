package com.testng.crm;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void verifyTitleImage() {
		
		try {
			
			String src1 = driver.findElement(By.tagName("img")).getAttribute("src");
			System.out.println(src1);
                      

        } catch (NoSuchElementException e) {}
		
	}
	
	@AfterMethod
	public void endSession() {
		driver.quit();
	}
}
