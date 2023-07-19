Feature: US01 TC04 User Should Be Able to Enter Their Phone Number

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls down to Date of Birth box
    And user clicks on Phone box

  Scenario: TC_004 User enters a valid phone number Pozitive Senario

    And user enters a valid 12-character phone number
    Then the Required text under the Phone box is NOT displayed
    # Then Minimum_12_Character text under the Phone box is NOT displayed

  Scenario: TC_004 User Leaves Phone Number Blank Negative Senario 1

    And user clicks somewhere out of any Box
    Then the Required text under the Phone box is displayed

  Scenario: TC_004 User Enters a Less Than 12-digit Invalid Phone Number Negative Senario 2

    And user enters a less than 12-character invalid phone number
    And user clicks somewhere out of any Box
    Then Minimum_12_Character text under the Phone box is displayed