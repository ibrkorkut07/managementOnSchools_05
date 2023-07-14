@US_13_TC_02
Feature: Vice Dean should be able to create teacher

  Background: Sign in as vice dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "mrsnice"
    And user enters password "12345678"
    And user clicks on login button


  Scenario: TC_01_missing_parameters_creating_teacher
    Given vice dean clicks on Teacher Management Option
   And vice dean click on the Submit button
    And vice dean verify the required texts displayed
    And    close the applications