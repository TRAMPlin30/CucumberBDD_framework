@upload-file @regression

Feature: WebDriver University - Upload File

  @ignore
  Scenario: Validate Upload File - with file
    Given I access the webdriver university Upload file Page
    When I choice the file by entering file path
    And I click on the button Send
    Then I should be presented with the successful upload file

  @ignore
  Scenario: Validate Upload File - without file
    Given I access the webdriver university Upload file Page
    And I click on the button Send
    Then I should be presented with the failed upload file