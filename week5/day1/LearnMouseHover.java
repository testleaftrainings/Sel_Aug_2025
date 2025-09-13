package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//mo on men
		WebElement mH = driver.findElement(By.xpath("//span[@class='catText']"));
		//instantiate the action class
		Actions act=new Actions(driver);
		act.moveToElement(mH).perform();
		driver.findElement(By.xpath("//span[text()='Casual Shoes']")).click();
		//scroll
		WebElement sD = driver.findElement(By.xpath("//a[contains(text(),'Footwear')]"));
		act.scrollToElement(sD).perform();

	}

}
