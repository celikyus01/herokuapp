Feature: Form Auth

  @wip
  Scenario Outline: Scenario 1/2 : Unsuccessful Login
    Given the user is in main page
    When the user navigates to "Form Authentication" page
    Then user verifies title as "Login Page"
    When the user logs in with "<username>" and "<password>" credentials
    Then user verifies title as "Login Page"

    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword  |
      | tomsmit  | SuperSecretPasswordQ |


  @wip
  Scenario: Scenario-3 : Successful Login
    Given the user is in main page
    When the user navigates to "Form Authentication" page
    Then user verifies title as "Login Page"
    When the user logs in with "tomsmith" and "SuperSecretPassword!" credentials
    Then user verifies title as "Secure Area"
    Then the user clicks on "Logout" button
    Then user verifies title as "Login Page"


