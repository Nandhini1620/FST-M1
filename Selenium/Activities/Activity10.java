import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	
	driver.get("https://training-support.net/webelements/drag-drop");
	System.out.println(driver.getTitle());
	Actions builder = new Actions(driver);
	
	WebElement ball = driver.findElement(By.id("ball"));
	
	WebElement dropz1 = driver.findElement(By.id("dropzone1"));
	
	WebElement dropz2 = driver.findElement(By.id("dropzone2"));
	
	
	builder.clickAndHold(ball).moveToElement(dropz1).pause(5000).release().build().perform();
	 if(dropz1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
     	System.out.println("Ball was dropped in Dropzone 1");
     }
	
	
	}

}
