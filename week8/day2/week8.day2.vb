2:45 to 3:00 --->ExtentReports
3:00 to 4:00 --->ExtentReportIntegration
4:00 to 4:10 --->Break
4:10 to 5:10 --->HybridFramework
5:10 to 5:40 --->BreakOut
5:40 to 6:00 --->Recap

@BeforeSuite--->startReports()
 @BeforeTest--->setValues()
  @BeforeClass--->testcaseDetais()
   @DataProvider--->sendData
    @BeforeMethod--->preconditions
     @Test--->testcase
    @AfterMethod-->postCondns
 @AfterClass
@AfterTest
@Aftersuite---->stopReports

How to explain the framework:
1)overview of framework:
-hybrid framework(testng_+cucmber)
-design pattern-POM
-Project management-maven
-selenium webdriver-to interact with the browser based applications
-TestNg-control the execution flow of the testcaseDetais
-cucumber--->for BDD excection
-Apachepoi-->to interact with the microsoft applications
-Commons-io--->to handle the files
-ExtentReports--->Avenstack
Git---version control
2)Components of framework:
a)Interface:
-browser--all the browser related activites will be defined
-element--all the elemnt related activities will be defined
-enum--choose the locators quickly 
b)Implementation Class:
SeleniumBase--all the implementations of the interface are defined here
DriverInstance-implementation of the driver and wait by threadloacal for thread safety,and also this can be accesses by getters and setters in a secure way.
              -to avoid the conflicts when working with different browsers or in parallel mode.
c)testng.base:
-projectspecific methods--->precondition,postconditions
-retryengine--use retry analyser(retries the failed testcases automatically based on the conditions specified)
d)utils:
datalibrary-excel ExtentReportIntegration
reporter--abstract Class
e)pages
each webpage is defined..(class---defining all the actions as methods)
f)testcases:testcase flow is designed
3)part(execution flow):
@BeforeSuite--->startReports()--->reporter class
 @BeforeTest--->setValues()-->testcase
  @BeforeClass--->testcaseDetais()--->reporter
   @DataProvider--->sendData--->pSM
    @BeforeMethod--->preconditions--->pasm
     @Test--->testcase
    @AfterMethod-->postCondns-->psm
 @AfterClass
@AfterTest
@Aftersuite---->stopReports--->reporter
4)hierarchy: