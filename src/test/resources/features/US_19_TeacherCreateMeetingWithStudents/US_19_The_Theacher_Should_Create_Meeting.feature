@US_19_DB
Feature: US_19_The_teacher_should_be_able_to_create_meetings

  Scenario: validation for creating a meeting
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "OmerRahsan"
    And user enters admin password "12345678"
    And user clicks on login button for enter

    Then create a meeting
    When connect to database
    Then query for meet information
    And validate meeting is created
    And close connection