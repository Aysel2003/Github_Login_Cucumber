
Feature: feature to test login to Github functionality
  I want to use this template to check my Github login functionality

  Scenario: Check Login to Github is successfull with login credentials
    Given user is on Github login page
    When user enters Github username and password
    And clicks on login button
    Then user is navigated to homepage