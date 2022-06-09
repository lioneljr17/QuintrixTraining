@tag
Feature: user should be able to change product layout

  @tag1
  Scenario: validate user ability to change product layout
    Given driver is openn
    And user is on the home page
    When user search any product
    And user click serach button
    And user click list layout
    Then user is navigate to the serach page
