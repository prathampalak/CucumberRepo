Feature: User menu Drop Down in Salesforce application

Scenario: Select user menu from drop down
Given User is on "LoginPage"
When User enter into text box "Username" "luxmi@infomaster.com"
When User enter into text box "Password" "ganesh54"
Then User Click on Button "Login"
Given User is on "HomePage"
