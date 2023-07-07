@US_12
Feature: US_12 Vice Dean should be able to assign a teacher to lesson

  Background: TC_Login User should be able to login as a Vice Dean
    Given user goes to "https://managementonschools.com"
    When user navigate to login page
    And user login as a vice dean

  Scenario: TC_001 User should be able to assign a teacher to lesson

    Given  user access the lesson program
    And    user select a lesson to assign
    And    user select a teacher from available teachers
    And    user click on "Submit" button
    Then   user verify the lesson should be successfully assigned to the selected teacher
    And    close the applications


  Scenario: TC_002 User should not be able to assign a teacher to lesson

    Given  user access the lesson program
    And    user select a lesson to assign
    And    user do not select a teacher from available teachers
    And    user click on "Submit" button
    Then   user verify the error message should be displayed
    And    close the applications


  Scenario: TC_003 User should not be able to assign a teacher to lesson

    Given  user access the lesson program
    And    user select a lesson to assign
    And    user select a teacher is already assigned to same lesson at the same time
    And    user click on "Submit" button
    Then   user verify the error message should be displayed indicating " Course schedule cannot be selected for the same hour and day"
    And    close the applications


  Scenario: TC_004 User should be able to assign a teacher to lesson

    Given  user access the lesson program
    And    user select multiple lesson in different times to assign
    And    user select a teacher from available teachers
    And    user click on "Submit" button
    Then   user verify the lessons should be successfully assigned to the selected teacher
    And    close the applications

  Scenario: TC_005 User should not be able to assign a teacher to lesson

    Given  user access the lesson program
    And    user select multiple lesson in conflict times to assign
    And    user select a teacher from available teachers
    And    user click on "Submit" button
    Then   user verify the error message should be displayed
    And    close the applications









