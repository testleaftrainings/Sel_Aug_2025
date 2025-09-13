package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	/**
	 * NOsuch element exception:
	 * 1)check for the locator
	 * 2)wait stattements
	 * 3)element is in frame
	 * 
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//handle the frame
		driver.switchTo().frame(0);//index starts from 0
		//click
		driver.findElement(By.id("Click")).click();

	}

}
