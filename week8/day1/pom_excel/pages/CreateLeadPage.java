package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}
	public CreateLeadPage enterfName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	

	public CreateLeadPage enterlName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public ViewLeadsPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
