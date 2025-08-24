package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		/**Steps to handle he dropdown:
		 * 1)Identify whether the given dropdown is predent inside the <
		 * select>tag
		 * 2)if it is present in the select tag,then locate the element and store this in a variable
		 * 3)instantiate the select class
		 * 4)with the object created,use the helper methods of select class
		 *  a)Select by index
		 *  b)select by visible text
		 *  c)select by value
		 * 
		 * 
		 */
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//enter the password
		//driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//locate the source DD
		WebElement sourceDD = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		//instantiate the select class
		Select select=new Select(sourceDD);
		select.selectByIndex(4);
		//industryDD
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sel=new Select(industryDD);
		sel.selectByValue("IND_MEDIA");
	}

}
