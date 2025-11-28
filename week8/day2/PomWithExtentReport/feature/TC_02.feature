Feature: CreateLead functionality for leaftaps application

##Background:
#Given launch the browser and load the url

Scenario Outline: createlead with singledata

When Enter the username as 'demoCSR'
And Enter the Password as 'crmsfa'
When Click on login button
And click on crmsfa link
And click on leads button
And click on createleadlink
When Enter the company name as <company name>
And Enter the firstName as <first name>
And Enter the lastname as <last name>
When Click on createlead
Then viewleads page is displayed

Examples:
|company name|first name|last name|
|infosys|sasirekha|S|
|tcs|sjaveed|S|
|CTS|kamales|S|
