package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hooksimplementation.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	
	
	
	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		  driver= new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanger(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	    
	}

	@When("Enter the Password as {string}")
	public void enter_the_password(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	    
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
	@When("Error msg is displayed")
	public void error_msg_is_displayed() {
	    String text = driver.findElement(By.id("errorDiv")).getText();
	    if (text.contains("Errors")) {
	    	System.out.println("text is matched");
			
		} else {
			System.out.println("text is not matched");

		}
	    }


}
