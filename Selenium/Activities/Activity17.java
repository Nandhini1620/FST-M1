import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/selects");
		 System.out.println(driver.getTitle());
		 
		 WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
		 Select multiSelect = new Select(selectElement);
		 
		 multiSelect.selectByContainsVisibleText("HTML");
		 
		 for(int i=3;i<=5;i++) {
			 multiSelect.selectByIndex(i);
		 }
		 
		 List<WebElement> elements = multiSelect.getAllSelectedOptions();
		 for(WebElement opt: elements) {
			 System.out.println(opt.getText());
			 
		 }
		 
		 multiSelect.selectByValue("nodejs");
		 
		 multiSelect.deselectByIndex(5);
		 
		 driver.close();		 

	}

}
