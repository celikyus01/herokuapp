Feature: Infinite Scroll

  @wip3
  Scenario: Scenario-1: Infinite Scroll
    Given the user is in main page
    When the user navigates to "Key Presses" page
    When the user sends below keys and verify them
      | A | A     |
      | a | a     |
      | / | SLASH |
      | , | COMMA |