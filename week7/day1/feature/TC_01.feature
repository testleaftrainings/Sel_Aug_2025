Feature: Login functionality for leaftaps application

#Background:
#Given launch the browser and load the url
@smoke@regression
Scenario: Login with valid credentials

When Enter the username as 'demoCSR'
And Enter the Password as 'crmsfa'
When Click on login button
Then homepage is displayed
@regression
Scenario: Login with invalid credentials

When Enter the username as 'demosales'
And Enter the Password as 'crmsfa'
When Click on login button
But Error msg is displayed