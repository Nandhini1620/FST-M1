import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
				
	
	driver.get("https://training-support.net/webelements/keyboard-events");
	System.out.println(driver.getTitle());
	Actions builder = new Actions(driver);
	
	builder.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
    
    // Print the message from the page
    String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
    System.out.println(pageText);
    
    driver.close();
	
	}

}
