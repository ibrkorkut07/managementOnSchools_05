
@us17
Feature: The Teacher should be able to give grades to the student (Add student info)

  Background:
    Given Teacher goes to "MosUrl"
    When Teacher clicks the login button
    And Teacher enters user name
    And Teacher enters password
    And Teacher clicks the loginBlue button
    And Displays the teacher Add Student Info section

  @us17_tc01
  Scenario: TC_01 The Lesson Selectable Test
    And Teacher selects lesson on"Choose Lesson"part
    Then Teacher verifies select lesson
    Then close the applications


  @us17_tc02
  Scenario: TC_02 The Student Selectable Test
    And Teacher selects student on"Choose Student"part
    Then Teacher verifies select student
    Then close the applications

  @us17_tc03
  Scenario: TC_03 The Semester Selectable Test
    And Teacher selects semester on"Choose Education Term"part
    Then Teacher verifies select semester
    Then close the applications

  @us17_tc04
  Scenario: TC_04 The Enters Absence Test
    And Teacher enters absence on"Absentee" box
    Then Teacher verifies enter absentee
    Then close the applications

  @us17_tc05
  Scenario: TC_05 The Enters Midterm Grade Test
    And Teacher enters midterm grade on"Midterm Exam"box
    Then Teacher verifies enter midterm grade
    Then close the applications

  @us17_tc06
  Scenario: TC_06 The Enters Final Grade Test
    And Teacher enters final exam grade on"Final Exam"box
    Then Teacher verifies enter final grade
    Then close the applications

  @us17_tc07
  Scenario: TC_07 The Enters Info Note Test
    And Teacher enters info note on"Info Note"box
    Then Teacher verifies enter info note
    Then close the applications

  @us17_tc08
  Scenario: TC_08 The Not Enters Info Note Test
    And User enter space on"Info Note"box
    Then User verifies enter info note
    Then close the applications

  @us17_tc09 @smokeTest
  Scenario: TC_09 Filling Requires Fields Test
    And Teacher not selects lesson from"Choose Lesson"part
    And Teacher selects student from"Choose Student"part
#    And Teacher selects semester from"Choose Education Term"part
#    And Teacher not enters absences from"Absentee" box
    And Teacher enters midterm grade from"Midterm Exam"box
    And Teacher enters final exam grade from"Final Exam"box
    And Teacher not enters info note from"Info Note"box
    Then Teacher verifies Required text
    Then close the applications
