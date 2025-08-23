package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/**Steps to interact with the webelement:
		 * ways to open the dom:
		 * a)ctrl+shift+I
		 * b)f12
		 * c)right click and inspect
		 * 
		 * 1)locate the element from the dom
		 * 2)to give the input--->sendkeys
		 * 3)click--->clickable actions
		 * 
		 */
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		
	}

}
