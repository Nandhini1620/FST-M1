package activities;

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

public class Activity2 {
	AppiumDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		
		//Desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");//this line is to connect to the mob
		options.setAutomationName("UiAutomator2"); // this line is to connect to the mob
		options.setAppPackage("com.android.chrome"); // this line is for specific application(here it is a calculator)
		options.setAppActivity("com.google.android.apps.chrome.Main");// this line is for specific application (class name) we can get through from inspector ->command tab -> AppManagement
		//options.setApp(".ipa");/// this is for Iphone
		
		//options.setApp("pathto .apk"); // if our system doesnt have the calculator.apk file but emulator have the apk file so we useing AppPackage and AppActivity
		options.noReset();
		
		//SErver URL
		
		URL serverURL = new URI("http://127.0.0.1:4723/").toURL();
		
		
		//Initialize the driver
		
		driver = new AppiumDriver(serverURL, options);
		
		}
	@Test
	
	public void testWebPage() {
		
		
			driver.get("https://training-support.net");
	        // Find heading on the page
	        String pageHeading = driver.findElement(AppiumBy.xpath("//android.view.View[@text=\"Training Support\"]")).getText();
	 
	        // Print to console
	        System.out.println("Heading: " + pageHeading);
	 
	        // Find and click the About Us link
	        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).click();
	 
	        // Find heading of new page and print to console
	        String aboutPageHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
	        System.out.println(aboutPageHeading);
	    }
	

//tearDown function
	@AfterClass
	
	public void closeDriver() {
		
		driver.quit();
		
	}
}
