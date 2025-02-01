package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch extends BaseClass{
	
	@Given("User is on Google Home Page")
	public void userIsGoogle() throws Throwable{
		driver.get("https://www.google.com");
	}

	@When("User types in Cheese and hits ENTER")
	public void userTypes() throws Throwable {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
	}

	@Then("\"Show how many search results were shown")
	public void userFoundResult() throws Throwable{
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls"))).click();
		String resultStats = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats"))).getText();
		System.out.println("Number of results found: " + resultStats);
	}

}
