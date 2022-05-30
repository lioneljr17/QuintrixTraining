@tag
Feature: user should be able to seach product on the main page

  @tag1
  Scenario: validate dress search
    Given driver is openn
    And user is on the home page
    When user search any product
    And user click serach button
    Then user is navigate to the serach page
