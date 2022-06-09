@tag
Feature: test login
  I want to use this template for my feature file

  @tag1
  Scenario: validate login is successfull with valid credentials
    Given driver is open
    And user is on the login page
    When user enters Username and password
    Then user is navigate to the homepage
