package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	public ChromeDriver driver;
	
	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		
		  driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When("Enter the username as demosalesmanger")
	public void enter_the_username_as_demosalesmanger() {
		driver.findElement(By.id("username")).sendKeys("demoCSR");
	    
	}

	@When("Enter the Password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	   
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
	    
	}

}
