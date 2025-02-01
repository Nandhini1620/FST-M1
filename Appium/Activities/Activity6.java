package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.functions.ExpectedCondition;

public class Activity6 extends ActionBase{

	
	
AppiumDriver driver;
WebDriverWait wait;
	
	//create setup function
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		
		//Desired capabilities
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2"); 
		options.setAppPackage("com.android.chrome"); 
		options.setAppActivity("com.google.android.apps.chrome.Main");
		//options.setApp(".ipa");/// this is for Iphone		
		options.noReset();
		
		//SErver URL		
		URL serverURL = new URI("http://127.0.0.1:4723/").toURL();		
		
		//Initialize the drive		
		driver = new AppiumDriver(serverURL, options);
		
		
	}
	
	//test function
	@Test
	public void testVolume75() {
		
		//wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.className("//android.widget.SeekBar")));
		
		//Get the size of the screen
		Dimension dims = driver.manage().window().getSize();
		
		Point start = new Point((int) (dims.getWidth() * .32), (int) (dims.getHeight() * .65));
		Point end = new Point((int) (dims.getWidth() * .66), (int) (dims.getHeight() * .77));
		
		doSwipe(driver, start, end, 2000);
	
	}
	
	//test function
		@Test
		public void testVolume25() {
			
			//wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("volume")));
			
			//Get the size of the screen
			Dimension dims = driver.manage().window().getSize();
			
			Point start = new Point((int) (dims.getWidth() * .67), (int) (dims.getHeight() * .65));
			Point end = new Point((int) (dims.getWidth() * .32), (int) (dims.getHeight() * .65));
			
			doSwipe(driver, start, end, 2000);

		}
	
	//tearDown function
	@AfterClass
	
	public void closeDriver() {
		
		driver.quit();
		
	}
}
