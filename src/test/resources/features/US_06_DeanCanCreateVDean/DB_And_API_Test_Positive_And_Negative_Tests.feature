@US_06_DB_API  @end_to_end
Feature: US_06 Dean should be able to create Vice Dean

  Scenario: US_06_UI User logins as a Dean and Creates A Vice Dean
    Given user goes to "MosUrl"
    When  user clicks on login button
    And   user enters username "deanNecminson01"
    And   user enters admin password "87651234"
    And   user clicks on login button for enter
    And   user fills all required credentials
    And   user clicks on submit button
    And close the application

  Scenario:  US_06_DB Dean can create Vice Dean "Positive Test"
    Given get vice dean via username
    Then body contains birth_day, birth_place, gender, name, phone_number, ssn, surname, username

  Scenario: US_06_DB Dean should NOT be able to get with non existing username from Vice Dean List. "Negative Test"
    Given get vice dean via  non existing username
    Then body should be empty

  Scenario: US_06_API User can create Vice Dean by entering required credentials "Positive Test"
    Given user sends get request by existing id
    Then body should contain birth_day, birth_place, gender, name, phone_number, ssn, surname, username

  Scenario: US_06_API Dean should NOT be able to get with non existing username of Vice Dean List. "Negative Test"
    Given user sends get request by non existing id
    Then body must be empty with non existing username "<username>"