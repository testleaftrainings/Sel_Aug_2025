package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class WelcomePage extends BaseClass {
	
	
	@And("click on crmsfa link")
	public HomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}

}
