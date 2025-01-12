package com.testng.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeTest
	public void setBaseUrl()
	{
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	
	@Test
	public void verifyWebsiteTitle() {
		
		String expTitle = "SuiteCRM";
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
	    Assert.assertEquals(actTitle,expTitle);
		if(expTitle == actTitle) {
			System.out.println("Title is same");
			driver.close();
		}
		else {
			System.out.println("Title is not match");
		}
	}
	
	/**@AfterMethod
	public void endSession() {
		driver.quit();
	}**/

}
