Feature: US01 TC08  User Should Be Able to Enter Their  User Name

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls into User Name box

  Scenario: TC_008 User Enters a User Name Positive Senario

    And user enters a User Name
    Then the Required text under the User Name box is NOT displayed

  Scenario: TC_008 User Enters a User Name Negative Senario

    And user clicks somewhere out of any Box
    Then the Required text under the User Name box is displayed