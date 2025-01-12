package com.testng.crm;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7 {
	
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
	public void readInfo() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		WebElement sale = driver.findElement(By.id("grouptab_0"));
		sale.click();
		WebElement lead = driver.findElement(By.id("moduleTab_9_Leads"));
		lead.click();
		Thread.sleep(5000);
		
		WebElement adInfo = driver.findElement(By.xpath("(//span[@title='Additional Details'])[1]"));
		adInfo.click();
		
		Alert leadAlrt = driver.switchTo().alert();
		
		String alertText = leadAlrt.getText();
        System.out.println("Text in alert: " + alertText);

       	
		
	}
	/**@AfterMethod
	public void zendSession() {
		driver.quit();
	}
**/

}
