Feature: US01 TC07 User registers their Ssn

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls down to Date of Birth box
    And user clicks on Ssn box

  Scenario: TC_007A User enters a 9-digit valid Ssn

    And user enters a valid 9-digit Ssn
    Then the Required text under the Ssn box is NOT displayed

  Scenario: TC_007B User leaves Ssn box blank Negative Senario 1

    And user clicks out of Ssn box (User Name box)
    Then the Required text under the Ssn box is displayed

  Scenario Outline: TC_007C User enters invalid Ssn Senario 2

    And user enters an invalid "<Ssn>" as an Ssn
    # And user clicks out of Ssn box (User Name box)
    Then the Required text under the Ssn box is displayed

    Examples:
      |Ssn|
      |123-45-    |
      |   -45-    |
      |123-  -6789|