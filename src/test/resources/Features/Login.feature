
Feature: Test Login functionality 
  I want to use this template for my feature file

  Scenario: Test using valid creds
    Given I open chrome browser
    And I visit the environment
    When I enter username
    And I enter pwd
    And I click on the login button 
    And I should see Home page
