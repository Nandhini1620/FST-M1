package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
AppiumDriver driver;
	
	//create setup function
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		
		//Desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");//this line is to connect to the mob
		options.setAutomationName("UiAutomator2"); // this line is to connect to the mob
		options.setAppPackage("com.android.calculator2"); // this line is for specific application(here it is a calculator)
		options.setAppActivity(".Calculator");// this line is for specific application (class name) we can get through from inspector ->command tab -> AppManagement
		//options.setApp(".ipa");/// this is for Iphone
		
		//options.setApp("pathto .apk"); // if our system doesnt have the calculator.apk file but emulator have the apk file so we useing AppPackage and AppActivity
		options.noReset();
		
		//SErver URL
		
		URL serverURL = new URI("http://127.0.0.1:4723/").toURL();
		
		
		//Initialize the driver
		
		driver = new AppiumDriver(serverURL, options);
	}
	//test function for addition
		@Test
		public void addTest() {
			driver.findElement(AppiumBy.id("digit_5")).click();
			driver.findElement(AppiumBy.id("plus")).click();	
			driver.findElement(AppiumBy.id("digit_9")).click();			
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			//assertions			
			String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
			assertEquals(result1,"13");			
		}

		@Test
		public void subTest() {
			driver.findElement(AppiumBy.id("digit_10")).click();
			driver.findElement(AppiumBy.id("minus")).click();	
			driver.findElement(AppiumBy.id("digit_5")).click();			
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			//assertions			
			String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
			assertEquals(result1,"5");			
		}
		@Test
		public void multiplyTest() {
			driver.findElement(AppiumBy.id("digit_5")).click();
			driver.findElement(AppiumBy.id("minus")).click();	
			driver.findElement(AppiumBy.id("digit_1")).click();	
			driver.findElement(AppiumBy.id("digit_0")).click();	
			driver.findElement(AppiumBy.id("digit_0")).click();	
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			//assertions			
			String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
			assertEquals(result1,"500");			
		}
		@Test
		public void divitionTest() {
			driver.findElement(AppiumBy.id("digit_5")).click();
			driver.findElement(AppiumBy.id("digit_0")).click();
			driver.findElement(AppiumBy.id("/")).click();	
			driver.findElement(AppiumBy.id("digit_2")).click();
			
			driver.findElement(AppiumBy.accessibilityId("equals")).click();
			//assertions			
			String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
			assertEquals(result1,"25");			
		}


}
