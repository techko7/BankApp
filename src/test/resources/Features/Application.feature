Feature: Test Application object
  I want to use this feature file to test the application object

  Background: 
    Given I open chrome browser
    And I visit the environment
    When I enter username
    Then I enter pwd
    And I click on the login button
    And I should see Home page


@Application
  Scenario: Create New View Application testing 
    Given I click on the Applications page
    And I click on the Create New View
    Then I enter view_name
    And I hit save
    #And I select the link of "Stef's Application"
    And I select the checkbox of Stefs Application
    #Then select all checkboxes

