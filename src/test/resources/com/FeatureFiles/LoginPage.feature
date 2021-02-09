Feature: Login page feature

Scenario: Login page title
Given user is on the login page
When user gets the title of the page
Then the title of the page should be "Guru99 Bank Home Page"

Scenario: User login with credentials
Given user is on the login page
When user enters username "mngr307720" in the username field
And user enters password "vEmapun" in the password field
And user clicks on the "Login" button
Then user gets the title of the home page
Then the title of the page should be "Guru99 Bank Manager HomePage"