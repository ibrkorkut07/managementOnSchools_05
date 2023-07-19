Feature: US01 TC05 User Should Be Able to Enter Their Gender

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls into Gender section

  Scenario: TC_005A Female Gender is Selectable

    And user clicks on Female Radio button and selects Female as a gender

  Scenario: TC_005B Male Gender is Selectable

    And user clicks on Male Radio button and selects Male as a gender