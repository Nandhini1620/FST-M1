import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
				
				driver.get(" https://training-support.net/webelements/dynamic-controls");
				System.out.println(driver.getTitle());
				
				WebElement textbox = driver.findElement(By.id("textInput"));
				
				
				System.out.println("Text box is enabled" + textbox.isEnabled());
				
				WebElement enableBut = driver.findElement(By.id("textInputButton"));
				enableBut.click();
				
				System.out.println("Text box is enabled" + textbox.isEnabled());
				
				textbox.sendKeys("hi");
				driver.close();
				}

}
