@US21
Feature: Student should be able to see their exam grades and meetings

  Background: Student signs in and clicks on Choose Lesson
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    And Student signs in as a student
    And Clicks on Menu
    Then Clicks on Grades and Announcement

  Scenario: TC06 Student sees their exam grades
    Then Student sees Midterm Exam Grade
    And Student sees Final Exam Grade

  Scenario: TC07 Student sees their meetings
    Then Student sees their meetings