package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class HomePage extends BaseClass {
	
	@And("click on leads button")
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}
