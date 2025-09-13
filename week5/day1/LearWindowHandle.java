package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to get the currentaddresss of the opened tab
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//DD232DB5721B19BB54DCF0AC3814245C,A3F21D5806B82D695F5AE5C7CD9E6914
		System.out.println(driver.getTitle());
		//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		/*
		 * String windowHandle = driver.getWindowHandle();
		 * System.out.println(windowHandle); System.out.println(driver.getTitle());
		 */
		Set<String> childWindow = driver.getWindowHandles();
		//convert the set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to childwindow
		driver.switchTo().window(listWindow.get(1));
		String cWindow = driver.getWindowHandle();
		System.out.println(cWindow );
		System.out.println(driver.getTitle());
		//close the current tab
		//driver.close();
		//driver.switchTo().window(listWindow.get(1));//no such window exception
		driver.quit();

	}

}
