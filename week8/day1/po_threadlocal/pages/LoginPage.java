package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{
	
	@When("Enter the username as {string}")
	public LoginPage enterUname(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}
	@And("Enter the Password as {string}")
	public LoginPage passWord(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	@When("Click on login button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
