package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.WelcomePage;

public class RunLogin extends BaseClass{
	
	@BeforeTest
	public void setValues() {
		excelFileName="login";
		testName="login";
		testDescription="login with mandatory details";
		testAuthor="saran";
		testCategory="regression";
		
	}
	@Test(dataProvider="fetchData")
	public void runLogin(String uName,String pwd) throws IOException {
		//System.out.println(driver);
		LoginPage lp=new LoginPage();
		lp.enterUname(uName).passWord(pwd).clickLogin().clickCrmsfa();
		
	}

}
