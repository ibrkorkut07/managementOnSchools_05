@US21
Feature: Student should be able to see the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list

  Background: Student signs in and clicks on Choose Lesson
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    And Student signs in as a student
    And Clicks on Menu
    Then Clicks on Choose Lesson

  Scenario: TC01 Student sees Teacher, Day, Start Time and Stop Time
    Then Student sees Teacher
    Then Student sees Day
    Then Student sees Start Time
    Then Student sees Stop Time

  Scenario: TC02 Student Adds two Lessons
    Given Choose two lessons
    And Clicks on Submit
    # And Sees “Lesson added to student” popup text
    Then Student sees added lesson in Lesson Program List

  Scenario: TC03 Student canNOT Add two Coinciding Lessons
    Given Choose two coinciding lessons
    And Clicks on Submit
    And Sees “Error” popup text

  Scenario: TC04 Student can delete a lesson in Lesson they have selected Program List
    Given Go to first registered lesson
    And Delete if it is selectable

  Scenario: TC05 Student Can See Selected Lessons Under Lesson Program List
    Given Go to first registered lesson
    And Student sees added lesson in Lesson Program List