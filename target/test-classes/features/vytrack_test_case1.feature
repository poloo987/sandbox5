@franco
Feature: test case 1
 # Background:
    #Given the user is on the login page
  Scenario: store manager
    Given the manager has logged in
    And the manager clicks Calendar Events under Activities
    When the user hovers over the triple dots
    Then the options View,Edit, and Delete will appear



