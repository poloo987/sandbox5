@youtube
Feature: smoke_01_home_page
  Background:
   Given the user is on home page
  Scenario: the user should find The Game Theorists channel
    When the user type in The Game Theorists in the search box
    Then their  channel should be listed

  Scenario: the user should have access to all pages on left table
    When the user click a button it should send you to the corresponding page
    * the home page
    * trending page
    * subscriptions page
    * library page
    * history page
