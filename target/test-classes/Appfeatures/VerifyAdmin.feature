Feature: Verify Admin

Scenario: Verify user is on Admin page
Given User is on login page
When User enters username as "Admin" and Password as "admin123"
And User clicks on login button 
Then User gets the title of the page
 
