Feature: Admin Management
Background: 
Given User is on login page
When User enters username as "Admin" and Password as "admin123"
And User clicks on login button

Scenario Outline: Verify test admin user is created
Given Admin user navigates to create user page 
When User selects user role 
And User selects status as "Enabled"
Then User enters "<Employee name>" 
And User enters username as"<username>"
And User enters "<password>" and confirm "<password>"

Examples:
|Employee name|username|password|
