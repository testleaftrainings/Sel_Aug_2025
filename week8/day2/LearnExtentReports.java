package week6.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		//set up the report path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//maintain the history
		reporter.setAppendExisting(true);
		//instantiate the extent reports
		ExtentReports extent=new ExtentReports();
		//attach the data with the file
		extent.attachReporter(reporter);
		
		//create a testcase and description of the testcase
		ExtentTest test=extent.createTest("CreateLead","Crate lead with mandatory details");
		//assign category
		test.assignAuthor("saranya");
		test.assignCategory("smoke");
		
		//attach the steplevel status
		test.pass("uname entered sucessfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/homepage.png").build());
		test.pass("pwd entered sucessfully");
		//mandatory step
		extent.flush();
		System.out.println("completed");

	}

}
