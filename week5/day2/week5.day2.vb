3:00 to 3:20 --->Actions
3:20 to 3:40 --->BreakOut
3:40 to 4:15 --->TestNG Basics
4:15 to 4:45 --->BreakOut+Break
4:45 to 5:30 --->Seq &Parallel Execution
5:30 to 6:00 --->BreakOut
6:00 to 6:15 --->Recap
RequireMents:
1)TestNg Plugins--->for compile and execute the testcases
2)dependencies-->library for developing the testscripts

steps to convert to TestNG:
1)convert the main method into normal method.
 a)remove static keyword
 b)remove main,string args
 c)should give a valid method name
 2)Add @Test on top of the method and import it.
 note:classname and method name should be different

 reports:
1)after the execction--->right click the project--->refresh--->test-output--->open-->right click the index.html-->open with s/y editor
Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml file