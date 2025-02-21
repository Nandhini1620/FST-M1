package com.testng.crm;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
	
	public String baseUrl = "https://alchemy.hguy.co/crm/";
	public WebDriver driver;
	
	@BeforeClass
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
	public void traversingTables() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement sale = driver.findElement(By.id("grouptab_0")); //Sales
		sale.click();
		
		WebElement accounts = driver.findElement(By.id("moduleTab_9_Accounts")); //Accounts
		accounts.click();
		
		//this will print odd number of the table
		
		String rowsXpathText;
		List<WebElement> row;
		for(int i = 1; i <= 10; i+=2) {
			rowsXpathText = "//div[@class= 'list-view-rounded-corners']/table/tbody/tr["+i+"]";
			row = driver.findElements(By.xpath(rowsXpathText));
			for (WebElement col : row) {
				col = driver.findElement(By.xpath(rowsXpathText+"/td[@field = 'name']//a"));
				System.out.println("Name of account "+i+": "+col.getText());
				//Reporter.log("Name of account "+i+": "+col.getText());
			}
		}
        
	}
	
	
	
	
	@AfterClass
	public void zendSession() {
		driver.quit();
	}


}
