import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println(driver.getTitle());
		
		WebElement full_name = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
		full_name.sendKeys("Nandhini");
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@id, '-email')]"));
		email.sendKeys("nandhini.r7@ibm.com");
		
		WebElement date = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
		date.sendKeys("2025-06-26");
		
		WebElement ad_details = driver.findElement(By.xpath("//button[text()='Submit']"));
		ad_details.sendKeys("Registration");
		
		
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
                .getText();
        System.out.println("Success message: " + message);
        
        driver.quit();
		}
	

}
