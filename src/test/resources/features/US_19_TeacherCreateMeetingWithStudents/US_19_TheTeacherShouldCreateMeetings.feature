@US_19
Feature: US_19_The_teacher_should_be_able_to_create_meetings
  Background: login a Teacher
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "OmerRahsan"
    And user enters admin password "12345678"
    And user clicks on login button for enter

  Scenario: TC_01 The_teacher_should_be_able_to_create_meetings
    Then click on Menu
    Then clicks on Meet Management
    Then choose a student
    Then choose a day "05/08/2023"
    Then choose start time "14:00" and end time "17:00"
    Then choose a description "Demo Meeting"
    Then clicks on submit button
    Then validate meeting created by alert text
    Then close driver