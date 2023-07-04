@parameterizing1
Feature: search_feature

  Background: user_goes_to_google
    Given user navigates to "https://www.google.com"

  Scenario: TC01_iphone_search
    And user search for "iPhone"
    Then verify the page title contains "iPhone"
    Then close the application
