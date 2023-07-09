Feature: US01 TC09  User should enter Password with at least 8 characters

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"

  Scenario: TC_009 User enters a Password with at least 8 characters Positive Senario

    And user scrolls into User Name box
    And user enters a Password
    Then the Required text under the Password box is NOT displayed

  Scenario: TC_009 User leaves Password box blank Negative Senario 1

    And user scrolls into User Name box
    And user clicks on Password box & leaves it blank
    And user clicks User Name box
    Then the Required text under the Password box is displayed

  Scenario: TC_009 User enters a Password with less than 8 characters Negative Senario 2

    And user scrolls into User Name box
    And user enters a Password with less than 8 characters
    Then Minimum 8 character text under the Password box is displayed