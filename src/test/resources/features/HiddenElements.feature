@hidden-elements @regression

Feature: WebDriver University - Hidden Elements

  Background:
  Given I access the webdriver university Hidden Elements Page

  @smoke
  Scenario: Validate Not Displayed Element
    When I click on the not displayed button
    Then I should be presented with the successful click

  @ignore
  Scenario: Validate Visibility Hidden Element
    When I click on the visibility hidden button
    Then I should be presented with the easy click

  @ignore
  Scenario: Validate Zero Opacity Element
    When I click on the zero opacity button
    Then I should be presented with the done click
