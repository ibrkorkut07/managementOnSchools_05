
Feature: Student should be able to see the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list

  Background: Student signs in and clicks on Choose Lesson
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    And Student signs in as a student
    And Clicks on Menu
    Then Clicks on Choose Lesson

  Scenario: Student sees Teacher, Day, Start Time and Stop Time
    Then Student sees Teacher
    Then Student sees Day
    Then Student sees Start Time
    Then Student sees Stop Time
