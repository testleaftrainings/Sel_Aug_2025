package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage enterUname() {
		driver.findElement(By.id("username")).sendKeys("demoCSR");
		return this;
	}
	
	public LoginPage passWord() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}

}
