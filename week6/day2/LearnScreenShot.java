package week6.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//take the snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//locate the page
		File destination=new File("./snaps/homepage.png");
		//connect source and destination
		FileUtils.copyFile(source, destination);
		
		//particular textfield
		WebElement pwd = driver.findElement(By.id("password"));
		File source1 = pwd.getScreenshotAs(OutputType.FILE);
		File destinat=new File("./snaps/pwd.png");
		FileUtils.copyFile(source1, destinat);
	}

}
