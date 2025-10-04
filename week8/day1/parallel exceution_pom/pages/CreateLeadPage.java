package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{
	
	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage enterCName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return this;
	}
	public CreateLeadPage enterfName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saran");
		return this;
	}
	

	public CreateLeadPage enterlName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("shanmugam");
		return this;
	}
	
	public ViewLeadsPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage(driver);
	}
}
