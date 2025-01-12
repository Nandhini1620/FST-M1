import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	
	/**driver.get("https://training-support.net/");
	System.out.println(driver.getTitle());
	//used xpath here
    driver.findElement(By.xpath("//a[text()='About Us']"));
    System.out.printf("About us page",driver.getTitle());
	driver.close();**/
	
	driver.get("https://training-support.net/webelements/login-form/");
	System.out.println(driver.getTitle());
	//used xpath here
	WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("admin");
	//used xpath here
	WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("password");
	//used xpath here
	WebElement login = driver.findElement(By.xpath("//button[text()='Submit']"));
	login.click();

}}

