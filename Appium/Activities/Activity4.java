package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity4 {
	
AppiumDriver driver;
WebDriverWait wait;
	
	//create setup function
	
	@BeforeClass
	public void setup() throws MalformedURLException, URISyntaxException {
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2"); 
		options.setAppPackage("com.google.android.contacts"); 
		options.setAppActivity("com.android.contacts.activities.PeopleActivity");
		
		options.noReset();
		URL serverURL = new URI("http://127.0.0.1:4723/").toURL();
		
		driver = new AppiumDriver(serverURL, options);
	}

	//add new contacts
	@Test
	public void addnewContact() {
		
		driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
		 
      
      // wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='First name']")));
 
       
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Akaran");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("kumar");
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("999148292");
        // Click Save
        driver.findElement(AppiumBy.accessibilityId("com.google.android.contacts:id/toolbar_button")).click();
 
        // Wait for contact to save
       // wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
 
        // Assertion
        String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
        Assert.assertEquals(contactName, "Akaran kumar");
    }	
	
}
