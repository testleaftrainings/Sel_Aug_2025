package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass{
	
	@When("Enter the username as {string}")
	public LoginPage enterUname(String uName) throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys(uName);
			reportStep("uname entered sucessfully","pass");
		} catch (Exception e) {
			reportStep("uname not entered sucessfully","fail");
		}
		return this;
	}
	@And("Enter the Password as {string}")
	public LoginPage passWord(String pwd) throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys(pwd);
			reportStep("pwd entered sucessfully","pass");
		} catch (Exception e) {
			reportStep("pwd not entered sucessfully","fail");
		}
		return this;
	}
	@When("Click on login button")
	public WelcomePage clickLogin() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStep("logged in sucessfully","pass");
		} catch (Exception e) {
			reportStep("not logged sucessfully","fail");
		}
		return new WelcomePage();
	}

}
