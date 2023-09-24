Feature: Application Login
  Background: User is Logged In
  Given I navigate to the login page
  When I submit username and password
  Then I should be logged in
  @tag1
  Scenario: Login with valid credentials
    Given launch browser 
    And open application url
    When user Enter username
    And user enter password
    And user click on login button
    Then user should be logged in successfully

Scenario Outline: Login with invalid credentials 
  Given User launches browser 
  When User open application URL 
  And  User enter "<username>" 
  And User enter "<password>" 
  And User click on login button 
  Then User should be able to login successfully
Examples: 
| username  | password  | 
| username1 | password1 | 
| username2 | password2 |