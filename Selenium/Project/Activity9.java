package com.testng.crm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {

	
		public String baseUrl = "https://alchemy.hguy.co/crm/";
		public WebDriver driver;
		public WebDriverWait wait;
		
		@BeforeClass
		public void setBaseUrl()
		{
			driver = new FirefoxDriver();
			driver.get(baseUrl);
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".table-responsive")));
			
			WebElement sale = driver.findElement(By.id("grouptab_0")); //Sales
			sale.click();
			
			WebElement lead = driver.findElement(By.id("moduleTab_9_Leads")); //leads
			lead.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".table-responsive")));
			
			String rowsXpathText;
			List<WebElement> row;
			for(int i = 1; i <= 10; i++) {
				
				// this will gove frist 10 column of leads
				rowsXpathText = "//div[@class= 'list-view-rounded-corners']/table/tbody/tr["+i+"]";
				row = driver.findElements(By.xpath(rowsXpathText));
				for (WebElement col : row) {
					col = driver.findElement(By.xpath(rowsXpathText+"/td[@field = 'name']//a"));
					System.out.println("Name of account "+i+": "+col.getText());
					
					//user name
					col = driver.findElement(By.xpath(rowsXpathText+"/td[@field = 'assigned_user_name']//a"));
					System.out.println("Name of user "+i+": "+col.getText());
					
				}
			}
		}
		
		
		@AfterClass
		public void zendSession() {
			driver.quit();
		}

		


	}


