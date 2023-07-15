Feature: US01 TC06 User registers their Date of Birth

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls down to Date of Birth box
    And user clicks on Date of Birth box

  Scenario: TC_006A User enters a 8-digit valid Birth Date

    And user enters 8-digit mmddyyyy Birth Date
    Then the Required text under the Date of Birth box is NOT displayed

  Scenario: TC_006B User leaves Birth Date box blank Negative Senario 1

    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

  Scenario Outline: TC_006C User enters incomplete Birth Date Senario 2

    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

    Examples:
      |month|day|year|
      |11|||
      ||22||
      |||3333|
      |11||3333|