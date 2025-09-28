package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.WelcomePage;

public class RunCreateLead extends BaseClass{
	@Test
	public void runCreateLead() {
		//System.out.println(driver);
		LoginPage lp=new LoginPage();
		lp.enterUname().passWord().clickLogin().clickCrmsfa().clickLeads().clickCreateLead().enterCName().enterfName().enterlName().clickSubmit().verifyLeads();
		
	}

}
