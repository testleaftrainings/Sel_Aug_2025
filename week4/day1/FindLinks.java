package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//no find the links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//size
		int size = allLinks.size();
		System.out.println(size);
		//retreive
		String text = allLinks.get(4).getText();
		System.out.println(text);
		
		//empty list
		List<String> list=new ArrayList<String>();
		
		for (WebElement iter : allLinks) {
			
			String text2 = iter.getText();
			//System.out.println(text2);
			list.add(text2);
			//System.out.println(list);
		}
		
		System.out.println(list);
	}

}
