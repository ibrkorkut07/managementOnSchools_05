Feature: US01 TC05 Users should be able to select their gender

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user scrolls into Gender section

  Scenario: TC_005A Female gender is selectable

    And user clicks on Female Radio button and selects Female as a gender

  Scenario: TC_005B Male gender is selectable

    And user clicks on Male Radio button and selects Male as a gender