package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features="src/test/java/feature",
glue="stepdefinition",
publish=true,tags="not @smoke")
public class RunnerCucumber extends BaseClass {
	

}
