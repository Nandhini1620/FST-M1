import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println(driver.getTitle());
		
		WebElement thrdHeader = driver.findElement(By.xpath("//h3[contains(text(),'#3')]"));
		thrdHeader.getText();
		System.out.println(thrdHeader);
		
		Color fifthHeader = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
		String color = fifthHeader.asRgb();
		System.out.println(color);
		
		String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
        System.out.println(purpleButtonClass);
       
        String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
        System.out.println(slateButtonText);
        
        driver.close();
		

	}

}
