Feature: US01 TC09  User Should Be Able to Enter Their Password with at Aeast 8 Characters

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls into User Name box

  Scenario: TC_009 User Enters a Password With At Least 8 Characters Positive Scenario

    And user enters a Password
    Then the Required text under the Password box is NOT displayed

  Scenario: TC_009 User Leaves Password Box Blank Negative Scenario 1

    And user clicks on Password box & leaves it blank
    And user clicks User Name box
    Then the Required text under the Password box is displayed

  Scenario: TC_009 User Enters a Password With Less Than 8 Characters Negative Scenario 2

    And user enters a Password with less than 8 characters
    Then Minimum 8 character text under the Password box is displayed