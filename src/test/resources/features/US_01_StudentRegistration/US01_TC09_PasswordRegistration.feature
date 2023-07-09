Feature: US01 TC09  User should enter Password with at least 8 characters

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"

  Scenario: TC_009 User enters a Password with at least 8 characters Positive Senario

    And user scrolls into User Name box
    And user enters a Password
    Then the Required text under the Password box is NOT displayed

  Scenario: TC_009 User enters a Password with at least 8 characters Negative Senario

    And user scrolls into User Name box
    And user clicks on User Name box
    And user clicks somewhere out of any Box
    Then the Required text under the User Name box is displayed