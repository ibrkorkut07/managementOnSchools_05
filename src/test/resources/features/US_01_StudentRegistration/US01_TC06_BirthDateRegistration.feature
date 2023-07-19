Feature: US01 TC06 User Should Be Able to Enter Their  Date of Birth

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls down to Date of Birth box
    And user clicks on Date of Birth box

  Scenario: TC_006A User Enters a 8-digit Valid Birth Date

    And user enters 8-digit mmddyyyy Birth Date
    Then the Required text under the Date of Birth box is NOT displayed

  Scenario: TC_006B User Leaves Birth Date Box Blank Negative Senario 1

    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

  Scenario Outline: TC_006C User Enters Incomplete Birth Date Senario 2

    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user clicks out of Date of Birth box (ssn box)
    Then the Required text under the Date of Birth box is displayed

    Examples:
      |month|day|year|
      |11|||
      ||22||
      |||3333|
      |11||3333|