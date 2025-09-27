package stepdefinition;

import org.openqa.selenium.By;

import hooksimplementation.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CLStepDefinition extends BaseClass{
	
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();  
	}

	@When("click on leads button")
	public void click_on_leads_button() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}

	@When("click on createleadlink")
	public void click_on_createleadlink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@When("Enter the company name as (.*)$")
	public void enter_the_company_name_as_testleaf(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	    
	}

	@When("Enter the firstName as (.*)$")
	public void enter_the_first_name_as_saranya(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	    
	}

	@When("Enter the lastname as (.*)$")
	public void enter_the_lastname_as_s(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	    
	}

	@When("Click on createlead")
	public void click_on_createlead() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("viewleads page is displayed")
	public void viewleads_page_is_displayed() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("saran")) {
			System.out.println("name is matched");
		} else {
			System.out.println("name is not matched");
		}
	    
	}

}
