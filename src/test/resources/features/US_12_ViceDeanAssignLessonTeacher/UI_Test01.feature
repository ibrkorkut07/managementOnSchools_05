@US_12
Feature: US_12 Vice Dean should be able to assign a teacher to lesson

  Background:vice_dean_goes_to_login

    Given Vice Deans navigates to LoginLink
    Then Vice Deans enter user name
    And Vice Deans enter password
    And Vice Deans click on Login button

  Scenario: TC_001 User should be able to assign a teacher to lesson

    Given  vice dean clicks on Lesson Program option
    And    vice dean select a lesson to assign
    And    vice dean select a teacher from available teachers
    And    vice dean clicks on the Submit button
    Then   vice dean verify the lesson should be successfully assigned to the selected teacher
    And    close the applications


  Scenario: TC_002 User should not be able to assign a teacher to lesson

    Given vice dean clicks on Lesson Program option
    And    vice dean select a lesson to assign
    And    vice dean do not select a teacher from available teachers
    And    vice dean clicks on the Submit button
    Then   vice dean verify the error message should be displayed
    And    close the applications


  Scenario: TC_003 User should not be able to assign a teacher to lesson

    Given  vice dean clicks on Lesson Program option
    And    vice dean select a lesson to assign
    And    vice dean select a teacher is already assigned to same lesson at the same time
    And    vice dean clicks on the Submit button
    Then   vice dean verify the error message should be displayed indicating " Course schedule cannot be selected for the same hour and day"
    And    close the applications


  Scenario: TC_004 User should be able to assign a teacher to lesson

    Given  vice dean clicks on Lesson Program option
    And    vice dean select multiple lesson in different times to assign
    And    vice dean select a teacher from available teachers
    And    vice dean clicks on the Submit button
    Then   vice dean verify the lessons should be successfully assigned to the selected teacher
    And    close the applications

  Scenario: TC_005 User should not be able to assign a teacher to lesson

    Given  vice dean clicks on Lesson Program option
    And    vice dean select multiple lesson in conflict times to assign
    And    vice dean select a teacher from available teachers
    And    vice dean clicks on the Submit button
    Then   vice dean verify the error message should be displayed
    And    close the applications









