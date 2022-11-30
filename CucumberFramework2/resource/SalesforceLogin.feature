Feature: Login into Salesforce application



Scenario: Login error message
Given User is on "LoginPage"
When User enter into text box "Username" "luxmi@infomaster.com"
And User Clear the text box "Password"
Then User Click on Button "Login"
And Validate the error msg "errorMsg" "Please enter your password."

#Scenario: Login with valid username and valid password
#
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#When User enter into text box "Password" "ganesh54"
#Then User Click on Button "Login"
#Given User is on "HomePage"
#
#Scenario: Login with Check RememberMe
#
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#When User enter into text box "Password" "ganesh54"
#Then User Click on CheckBox "RememberMe"
#Then User Click on Button "Login"
#Given User is on "HomePage"
#
#Scenario: Forgot Password
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#Then User Click on link "Forgot"
#When User enter into text box "Fusername" "luxmi@infomaster.com"
#Then User Click on Button "Continue"
#
#
#Scenario: Login with invalid username and invalid password
#
#Given User is on "LoginPage"
#When User enter into text box "Username" "123"
#When User enter into text box "Password" "22131"
#Then User Click on Button "Login"
#And Validate the error msg "errorMsg" "Please check your username and password. If you still can't log in, contact your Salesforce administrator."
#
#
#
#
