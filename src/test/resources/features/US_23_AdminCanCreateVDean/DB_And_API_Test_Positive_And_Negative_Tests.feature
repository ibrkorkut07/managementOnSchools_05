@US_23_DB_API  @end_to_end_23
Feature: US_23 Admin should be able to create Vice Dean

  Scenario: US_23_UI User logins as an Admin and Creates A Vice Dean
    Given user goes to "MosUrl"
    When  user clicks on login button
    And   user enters username "AdminNecminson"
    And   user enters admin password "12345678"
    And   user clicks on login button for enter
    And   user clicks on menu
    And   user clicks on vice dean management option
    And   user fills all required credentials
    And   user clicks on submit button
    And close the application

  Scenario:  US_23_DB Admin can create Vice Dean "Positive Test"
    Given get vice dean via username
    Then body contains birth_day, birth_place, gender, name, phone_number, ssn, surname, username

  Scenario: US_23_DB Admin should NOT be able to get with non existing username from Vice Dean List. "Negative Test"
    Given get vice dean via  non existing username
    Then body should be empty

  Scenario: US_23_API Admin can create Vice Dean by entering required credentials "Positive Test"
    Given user sends get request by existing id
    Then body should contain birth_day, birth_place, gender, name, phone_number, ssn, surname, username

  Scenario: US_23_API Admin should NOT be able to get with non existing username of Vice Dean List. "Negative Test"
    Given user sends get request by non existing id
    Then body must be empty with non existing username "<username>"