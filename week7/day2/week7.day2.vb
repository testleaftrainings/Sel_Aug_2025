3:00 to 3:30 --->Explicit wait
3:30 to 4:00 --->Exception Handling
4:00 to 4:40 --->Constructor
4:40 to 4:50 --->Break
4:50 to 5:30 --->POM introduction
5:30 to 5:50 --->Breakout
5:50 to 6:30 --->Seq & Parallel Execution

Explicit wait:
-condn based wait,wait for the specific condn on the specific element.
-if the specified condition is not met,throw timeout exception.
-it is applicable only for the particular piece of code

ExceptionHandling:
 Exceptions:
 1)checked(compiletime)-due to i/o errors,n/w errors
 2)unchecked(runtime)--execution of pgm

 Login page:
 -enteruname
 -enterpwd
 -click login
Welcome page
 -click crmsfa
homepage
 -click leads
 MyLeads
  -createlead
Createleadpage
 -enter cname
 -enterfname
 -enterlname
 -click createlead
viewlEADS
-VERIFYLEADS
Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file