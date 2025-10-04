package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyLeadsPage extends BaseClass{
	
	@And("click on createleadlink")
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
