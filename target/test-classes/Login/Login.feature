#This is what is done by BA and provide it to developers and testers
Feature: OrangeHRM
Scenario: Validate Login
Given I should be in the login page of OrangeHRM
When Enter Name
And Enter Password
And Click on Login Button
Then Login Successful
