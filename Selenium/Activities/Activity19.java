import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("confirmation")).click();
		
		Alert confAlert = driver.switchTo().alert();
		
		String text=confAlert.getText();
		System.out.println(text);
		
		confAlert.accept();
		
        driver.findElement(By.id("confirmation")).click();
		
        confAlert.dismiss();
		
		
		
		
		driver.close();
	}

}
