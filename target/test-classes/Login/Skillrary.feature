Feature: Test the skillrary app
1) Valid Case
2) Invalid Case

#I use background to work with common things
Background:
Given I should open the browser and navigate to the login page of skillrary

#@PositiveTesting
#Whatever you put in " " this is the value passed 
#Scenario: To Test the Login with Valid User Credentials
#When Enter Username as "user"
#And Enter Password as "user"
#And Click on the LoginButton
#Then I should see the username as "Harry Den"
#
#Scenario: To Test the Login with Valid Admin Credentials
#When Enter Username as "admin"
#And Enter Password as "admin"
#And Click on the LoginButton
#Then I should see the admin as "SkillRary Admin"

#When I want to run multiple positive positive cases I use scenario outline
@PositiveTesting
Scenario Outline: To Test login with all positive data
When Enter Username "<user>"
And Enter Password "<pwd>"
And Click on the LoginButton
Then I should see the username as "<name>"

Examples:
|user|pwd|name|
|user|user|Harry Den|
|user|user|Harry Den|
#|admin|admin| SkillRary Admin|

#@ is used for tags
@NegativeTesting
Scenario: To Test the Login with Invalid Credentials
When Enter Username "rithvik"
And Enter Password "rithvik"
And Click on the LoginButton
Then I should navigate to the page "Register"
