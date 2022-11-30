Feature: User menu Drop Down in Salesforce application

#Scenario: Select user menu from drop down
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#When User enter into text box "Password" "ganesh54"
#Then User Click on Button "Login"
#Given User is on "HomePage"
#Then User Click on Button "UserMenuDropDown"
#Given User is on "UserMenuPage"
#Then Validate the Usermenu "menuOptions"


Scenario: Select My Profie option from user menu
 Given User is on "LoginPage"
When User enter into text box "Username" "luxmi@infomaster.com"
When User enter into text box "Password" "ganesh54"
Then User Click on Button "Login"
Given User is on "HomePage"
Then User Click on Button "UserMenuDropDown"
Given User is on "UserMenuPage"
Then Validate the Usermenu "menuOptions"
Then Click on option "myprofile"
And Click on image "editProfile"
Then Switch to frame "editProfileFrame"
And Click on Tab "about"
Then User Clear the text box "lastname"
When User enter into text box "lastname" "singh"
Then User Click on Button "saveall"
When User Click on link "post"
Then Switch to frame "postframe"
And User enter into text box "postText" "Hello all"
Then Switch to default 
Then User Click on Button "share"
#When User Click on link "file"
#Then User Click on Button "uploadFile"
#Then User Click on Button "choosefile"


#Scenario: Select Devloper console from drop down TC08
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#When User enter into text box "Password" "ganesh54"
#Then User Click on Button "Login"
#Given User is on "HomePage"
#Then User Click on Button "UserMenuDropDown"
#Given User is on "UserMenuPage"
#Then Click on option "devloperconsole"
#And Switch to window popup

#Scenario: Select Logout option from drop down menu TC09
#Given User is on "LoginPage"
#When User enter into text box "Username" "luxmi@infomaster.com"
#When User enter into text box "Password" "ganesh54"
#Then User Click on Button "Login"
#Given User is on "HomePage"
#Then User Click on Button "UserMenuDropDown"
#Given User is on "UserMenuPage"
#Then Click on option "logout"
#Given User is on "LoginPage"
#Then validate the page title "Login|Salesforce"

