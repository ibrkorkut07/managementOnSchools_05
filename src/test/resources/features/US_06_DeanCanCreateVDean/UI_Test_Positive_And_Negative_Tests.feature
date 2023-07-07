@US_06_TC_001
Feature: US_06 Dean should be able to create Vice Dean

  Background: TC_Login User should be able to login as a Dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "deanNecminson01"
    And user enters admin password "87651234"
    And user clicks on login button for enter

  Scenario: TC_001 User can create Vice Dean by entering required credentials "Positive Test"
    Given  user fills all required credentials
    And    user clicks submit button
    Then   verify new Vice Dean is created
    And close the application

  Scenario: TC_002 User can NOT create Vice Dean by entering required credentials except "Name" "Negative Test"
    Given  user fills all required credentials except name
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application

  Scenario: TC_003 User can NOT create Vice Dean by entering required credentials except "Surname" "Negative Test"
    Given  user fills all required credentials except surname
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application









