import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity2 {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		driver.get("https://training-support.net/webelements/login-form/");
		System.out.println(driver.getTitle());
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("password");
		
		WebElement login = driver.findElement(By.xpath("//button[text()='Submit']"));
		login.click();
		
		driver.close();
		

		
		
		

	}

}
