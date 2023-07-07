@US_08
Feature: US_08  Vice Deans should be able to create a lesson
  Background:vice_dean_goes_to_login



    Given Vice Deans navigates to LoginLink
    Then Vice Deans enter user name
    And Vice Deans enter password
    And Vice Deans click on Login button
  Scenario: Vice Deans goes to lesson management page
    And Vice Deans click on Lesson button
    And Vice Deans input lesson name
    And Vice Deans selected Compulsory
    And Vice Deans input credit score
    And Vice Deans click on Submit button
    And close the application

