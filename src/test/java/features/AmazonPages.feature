@all
Feature: Test Amazon page on browser

  @functional
  Scenario: Test Login account on Amazon page
    Given User is on Main Page
    Then User Enters username
    Then User clicks on continue
    Then User Enters password
    And User clicks on sign in
