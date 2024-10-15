Feature: login functionality-production

  Scenario: Login with creditials 
Given user navigates on to website
Then user clicks on login button
Then user enters  "<username>" username and "<password>" password 
And user clicks on login
And user validates captcha image
Then User naviagtes to homepage

Examples:
|username|password|
|valid   |valid   |
|invalid |valid   |