Feature: Validate products comparison workflow
  
  Scenario: Compare products flow
    Given I am on the Compare Products page
    When I select Orange and Cherry products to compare
    Then the price comparison is displayed
    And Chrry and Orange condition is dsplayed
