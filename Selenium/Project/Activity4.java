package com.testng.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	
	@Test
	public void login() {
		
		WebElement username = driver.findElement(By.id("user_name"));
		username.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.id("username_password"));
		pwd.sendKeys("pa$$w0rd");
		
		WebElement submit = driver.findElement(By.id("bigbutton"));
		submit.click();
		
		WebElement dash = driver.findElement(By.id("tab0"));
		dash.getText();
		
		String actualUrl ="https://alchemy.hguy.co/crm/index.php?module=Home&action=index";
		
		String expectedurl= driver.getCurrentUrl();
	    Assert.assertEquals(expectedurl,actualUrl);
		
		
	}
	
	@AfterMethod
	public void endSession() {
		driver.quit();
	}


}
