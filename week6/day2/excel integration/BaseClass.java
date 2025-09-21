package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public String excelFileName;
	public ChromeDriver driver;
	
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		
		return CommonExcelIntegration.readData(excelFileName);
	}
	
	/*
	 * @BeforeSuite public void startReports() {
	 * System.out.println("reports started"); }
	 * 
	 * @BeforeClass public void testcaseDetails() {
	 * System.out.println("testcase details are assigned"); }
	 * 
	 * @BeforeTest public void setValues() { System.out.println("values are set"); }
	 */
	
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondition(String browser,String url,String uName,String pwd) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	  @AfterMethod public void postCondition() { driver.close();
	  
	  
	  }
	  
	  @AfterSuite public void stopReports() {
	  System.out.println("reports stopped"); }
	 

}
