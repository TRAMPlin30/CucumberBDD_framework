@login @regression

Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page

  @smoke
  Scenario: Validate Successful login
#    Given I access the webdriver university login page
    When I enter a username webdriver
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful login message

  Scenario: Validate UnSuccessful login
#    Given I access the webdriver university login page
    When I enter a username webdriver
    And I enter a password password123
    And I click on the login button
    Then I should be presented with the unsuccessful login message

  Scenario Outline: Validate - Successful and Unsuccessful
#    Given I access the webdriver university login page
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with message <loginValidationText>
    Examples:
      | username  | password     | loginValidationText  |
      | webdriver | webdriver123 | validation succeeded |
      | webdriver | password123  | validation failed    |
      | john_wick | password321  | validation failed    |