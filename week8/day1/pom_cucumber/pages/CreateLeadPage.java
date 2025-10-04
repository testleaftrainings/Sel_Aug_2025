package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{
	
	@When("Enter the company name as(.*)$")
	public CreateLeadPage enterCName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	@And("Enter the firstName as(.*)$")
	public CreateLeadPage enterfName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	@And("Enter the lastname as(.*)$")
	public CreateLeadPage enterlName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	@When("Click on createlead")
	public ViewLeadsPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}
}
