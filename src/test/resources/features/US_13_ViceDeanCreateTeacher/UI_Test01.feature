@US_13_TC_01
Feature: Vice Dean should be able to create teacher

  Background: Sign in as vice dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "mrsnice"
    And user enters password "12345678"
    And user clicks on login button

  Scenario Outline:TC_01_create_teacher_successfully
    Given vice dean clicks on Teacher Management Option
    When vice dean enter "<lesson>"
    And vice dean enter "<name>","<surname>"
    And vice dean enter "<birthplace>" , "<email>" , "<phonenumber>"
    And vice dean choose gender
    And vice dean enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
    And vice dean click on the Submit button
    Then verify teacher saved successfully
    Then close the application
    Examples:
      | lesson   | name  | surname | birthplace | email           | phonenumber  | dateofbirth | ssn         | username    | password |
      | Calculus | fatma | naz     | ulubey     | email12@email12 | 576-586-5484 | 09-04-1970  | 227-99-8933 | fatmanaz099 | 12345678 |


