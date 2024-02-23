Feature: To check Login functionality

Scenario: Login page title 
Given User is on login page
And User gets title of the page

Scenario: Forgot password link
Given User is on login page
Then Forgot password link should be displayed

@skip
Scenario: Login with incorrect credentials
Given User is on login page
When User enters username as "Admin" and incorrect Password as "admin1233"
And User clicks on login button 
Then Incorrect credentials message is displayed  

Scenario: Login with Correct credentials 
Given User is on login page
When User enters username as "Admin" and Password as "admin123"
And User clicks on login button 
Then User gets the title of the page   