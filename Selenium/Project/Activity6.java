package com.testng.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity6 {
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
		public void alogin() {
			
			WebElement username = driver.findElement(By.id("user_name"));
			username.sendKeys("admin");
			
			WebElement pwd = driver.findElement(By.id("username_password"));
			pwd.sendKeys("pa$$w0rd");
			
			WebElement submit = driver.findElement(By.id("bigbutton"));
			submit.click();
		}
		
		
		@Test
		public void bgetActivityTab() {
			
			WebElement act = driver.findElement(By.id("grouptab_3"));
			act.click();
			System.out.println("Activities is present :" +act.isDisplayed());
		}
			
			
			
			
		
		/**@AfterMethod
		public void zendSession() {
			driver.quit();
		}
**/
	}

}
