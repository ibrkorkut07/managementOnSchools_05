@US_08_UI
Feature: US_08  Vice Deans goes to lesson management page
  Background:vice_dean_goes_to_login
   Given Vice Deans navigates to LoginLink
    Then Vice Deans enter user name
    And Vice Deans enter password
    And Vice Deans click on Login button
  @US_08_UI_TC01
  Scenario:  Vice Deans should be able to create a lesson "Positive Test"
    And Vice Deans click on Lesson button
    And Vice Deans input lesson name
    And Vice Deans selected Compulsory
    And Vice Deans input credit score
    And Vice Deans click on Submit button
    Then Verify the Lesson is created.
    And close the application
  @US_08_UI_TC02
  Scenario: Vice Deans can NOT be  create a lesson by entering required credentials except "Lesson Name""Negative Test"
    And Vice Deans click on Lesson button
    And Vice Deans selected Compulsory
    And Vice Deans input credit score
    And Vice Deans click on Submit button
    Then Verify enter the name of lesson
    And close the application
  @US_08_UI_TC03
  Scenario:  Vice Deans should be able to create a lesson "Positive Test"
    And Vice Deans click on Lesson button
    And Vice Deans input lesson name
    And Vice Deans input credit score
    And Vice Deans click on Submit button
    Then Verify the Lesson is created.
    And close the application
  @US_08_UI_TC04
  Scenario: Vice Deans can NOT be  create a lesson by entering required credentials except "Credit Score""Negative Test"
    And Vice Deans click on Lesson button
    And Vice Deans input lesson name
    And Vice Deans selected Compulsory
    And Vice Deans click on Submit button
    Then Verify enter the credit score of lesson
    And close the application
  @US_08_UI_TC05
  Scenario Outline:  Vice Deans can NOT be  create a lesson by entering required credentials invalid "Credit Score""Negative Test"
    And Vice Deans click on Lesson button
    And Vice Deans input lesson name
    And Vice Deans selected Compulsory
    And Vice Deans input invalid "<credit score>"
    And Vice Deans click on Submit button
    Then Verify input invalid credit score.
    And close the application
    Examples:
    | credit score |
    | aa           |
    | 1a           |
    | a1           |
    | @,           |
    | 1,1          |
