03:00 - 03:50 -> TestNG Annotations
03:50 - 04:00 -> Break
04:00 - 04:45 -> Static Parameterization
04:45 - 05:05 -> BreakOut
05:10 - 05:45 -> Dynamic parameterization
05:45 - 06:15 -> Breakout

Annotations hierarchy:

@BeforeSuite--->startReports
 @BeforeTest----set up the testlevel info
  @@BeforeClass-->testcase details
   @BeforeMethod--->preconditions
    @Test--->testcase
   @AfterMethod--->postconditions
  @AfterClass
@AfterTest
@AfterSuite--->stop the reports

Parameterization:
1)Static---data which is common across all the testcases
2)Dynamic--->datas to be parameterized in the testcases.

steps to acheive static parameterization:
Identify the data which is common across all the testcasedetails
2)Add parameter tag for each data in the xml file
3)map the parameters in the class using @Parameters
note:the names should exactly match with names in the xml file
4)use that parameters inside the method as arguments
note:sequence matters but the name of the args doesn't matter.
5)replace the args with the hardcoded values
note:always execte from the xml file

Dynamic Parameterization: 
1.Identify the data that are need to be dynamic for the particular testcase ex: CreateLead : companyName, firstName, lastName, phoneNumber EditLead : phoneNumber,companyName 
2.Create a method sendData and annotate with @Dataprovider annotation and give a name for the DataProvider
3.Create an Input array with rowCount and columnCount - add datas into the array with index starting from 0 
4.Return data back to the calling method
5.Receive the data in the testcase uding dataProvider attribute 
6. Pass input arguments to the test method and replace all the hardcoded data

read from excel
1)add the library--->apache POI
WB--->IDENTIFY THE WS--->ROW--->CELL
XSSF