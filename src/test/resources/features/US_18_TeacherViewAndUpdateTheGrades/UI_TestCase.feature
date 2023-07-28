@US_18_UI_Test

Feature: US_18 The teacher should be able to view and update the grades given to the student

  Background: Sign in as teacher
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "TeacherAlex"
    And user enters admin password "12345678"
    And user clicks on login button for enter as teacher

  @US_18_TC_01
  Scenario: Teacher should be see student info list
    Given user clicks on menu
    Then user clicks on student info management
    Then print entire page
    Then close the application


  @US_18_TC_02
  Scenario Outline: Teacher should be update student info list
    Given user clicks on menu
    When user clicks on student info management
    And user clicks on edit
    Then user clicks on choose lesson drop down and select
    Then user clicks on choose education term drop down and select
    Then user clicks on absentee and upload "<absentee>"
    Then user clicks on midterm exam and upload "<midterm>"
    Then user clicks on final exam and upload "<finalexam>"
    Then user clicks on info note and upload "<InfoNote>"
    Then take screenshot
    Then clicks on submit button
    Then close the application
    Examples:
      | absentee | midterm | finalexam | InfoNote     |
      | 3        | 80      | 90        | successfulll |


  @US_18_TC_03
  Scenario:  Teacher should be able to delete the student info list
    Given user clicks on menu
    Then user clicks on student info management
    Then user clicks on the dustbin shape
    Then assert alert message for deleted student
    Then close the application