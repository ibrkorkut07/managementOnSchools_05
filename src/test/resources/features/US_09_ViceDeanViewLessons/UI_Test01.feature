@US_09
Feature: US_09  Vice Deans should be able to view the lesson list and make updates

  Background:vice_dean_goes_to_login
    Given Vice Deans navigates to LoginLink
    Then Vice Deans enter user name
    And Vice Deans enter password
    And Vice Deans click on Login button
    And Vice Deans click on Lesson button

  Scenario: US_09 TC_001 Vice Deans should be able to view the lesson list and make updates
    Then YSA verifies the Lesson Name, Compulsory and Credit Score are visible created.

  Scenario: US_09 TC_002 Vice Deans should be able to delete the lesson.
    Given YSA adds a new lesson
    And YSA deletes the added lesson.

  Scenario: US_09 TC_003 Vive Deans should be able to update the lesson information.
    And YSA is able to update the lesson information
