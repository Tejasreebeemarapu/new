Feature: login functionality

  Scenario: Login with valid user
Given user navigates on to app
Then user checks the page title
Then user enters  "<username>" username 
And user clicks on login
Then User navigates to dashboard page

Examples:
|username|
|Admin   |

Scenario: Login with invalid user
Given user navigates on to app
And user checks the page title
Then user enters  "<username>" username
And user clicks on login
Then user valid text message

Examples:
|username|
|rajkumar  |
