package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNested {
	//no such frame exception

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//nested frame-->handle the outer frame---frame1
		WebElement nestFrame = driver.findElement(By.xpath("//h5[contains(text(), 'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		//switch the parent frame to inner frame
		driver.switchTo().frame(nestFrame);
		//driver.switchTo().frame("frame2");//frame 0
		driver.switchTo().frame(0);
		//locate the elemnt
		driver.findElement(By.id("Click")).click();
	}

}
