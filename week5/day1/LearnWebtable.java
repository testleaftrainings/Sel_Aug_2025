package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		//rowCount
	List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
	int size = row.size();
	System.out.println(size);
	//column count
	List<WebElement> columnCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
	int size2 = columnCount.size();
	System.out.println(size2);
	
	//particular data
	String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td[2]")).getText();
	System.out.println(text);//United Kingdom
	
	//entire row
	List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]"));
	for (WebElement rowIter : singleRow) {
		System.out.println(rowIter.getText());
		
	}
	//entire data
	List<WebElement> allData = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
	for (WebElement iter : allData) {
		System.out.println(iter.getText());
		
	}
	//dynamic data
	for (int i = 1; i < row.size(); i++) {
		driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
		System.out.println("--------------------------");
		for (int j = 1; j < columnCount.size(); j++) {
			WebElement dynamicDatas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
			System.out.println(dynamicDatas.getText());
		}
		
	}
	
	}

}
