package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
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
	
	//test function
	@Test
	public void test() {
		
		//find the digit 5 and tab it
		driver.findElement(AppiumBy.id("digit_5")).click();;// we can use resource id as com.android.calculator2:id/ or only id value -> digit_5. 
		                                           //com.android.calculator2  this one is package and it is constent
		
		driver.findElement(AppiumBy.id("op_mul")).click();
		
		//find the digit 4 and tab it
		driver.findElement(AppiumBy.id("digit_4")).click();;
		
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		//assertions
		String result1 = driver.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText();
		assertEquals(result1,"20");
		
		
		
		
	}
	
	//tearDown function
	@AfterClass
	
	public void closeDriver() {
		
		driver.quit();
		
	}

}
