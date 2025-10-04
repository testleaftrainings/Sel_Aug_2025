package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class RunCreateLead extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="createlead";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String uName,String pwd,String cName,String fName,String lName) {
		//System.out.println(driver);
		LoginPage lp=new LoginPage(driver);
		lp.enterUname(uName).passWord(pwd).clickLogin().clickCrmsfa().clickLeads().clickCreateLead().enterCName(cName).enterfName(fName).enterlName(lName).clickSubmit().verifyLeads();
		
	}

}
