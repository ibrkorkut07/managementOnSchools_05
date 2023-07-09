Feature: US01 TC07 User registers their Ssn

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls down to Date of Birth box
    And user clicks on Ssn box

  Scenario: TC_007A User enters a 9-digit valid Ssn

    And user enters 9-digit Ssn
    Then the Required text under the Ssn box is NOT displayed

  Scenario: TC_007B User leaves Ssn box blank Negative Senario 1

    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

  Scenario Outline: TC_007C User enters invalid Ssn Senario 2

    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

    Examples:
      |month|day|year|
      |11|||
      ||22||
      |||3333|
      |11||3333|