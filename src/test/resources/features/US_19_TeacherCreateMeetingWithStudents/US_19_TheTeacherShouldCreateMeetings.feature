
Feature: US_19_The_teacher_should_be_able_to_create_meetings
  Background: login a Teacher
    Given go to the "url"
    And login as teacher

  Scenario: TC_01 The_teacher_should_be_able_to_create_meetings
    Then click on Menu
    Then clicks on Meet Management
#    Then choose a student
    Then choose a day "25/07/2023"
    Then choose start time "14:00" and end time "17:00"
    Then choose a description "ro"
    Then clicks on submit button
    Then validate meeting created by alert text
    Then close driver