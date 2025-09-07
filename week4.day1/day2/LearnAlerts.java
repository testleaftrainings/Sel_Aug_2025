package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		/**
		 * Alerts:--pop msg in the application
		 * -not inspectable
		 * -cannot be ignored
		 * -javascript functions
		 * 1)noAlert present exception
		 * 2)unhandled alert exceptions
		 */
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//click show
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		//promptalert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("saranya");
		alert.accept();
		
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		//sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		

	}

}
