@US_13
Feature: Vice Dean should be able to create teacher

  Background: Sign in as vice dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "mrsnice"
    And user enters password "12345678"
    And user clicks on login button

#  @TC_01
#  Scenario Outline:TC_01_adding_lesson_program_successfully
#    Given vice dean clicks on Teacher Management Option
#    When vice dean enter "<lesson>"
#    And vice dean enter "<name>","<surname>"
#    And vice dean enter "<birthplace>" , "<email>" , "<phonenumber>"
#    And vice dean choose gender
#    And vice dean enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
#    And vice dean click on the Submit button
#    Then verify teacher saved successfully
#    Then close the application
#    Examples:
#      | lesson   | name  | surname | birthplace | email         | phonenumber  | dateofbirth | ssn         | username   | password |
#      | Calculus | fatma | naz     | ulubey     | email@email21 | 545-505-5454 | 12-02-1971  | 220-43-8734 | fatmanaz21 | 12345678 |

  @TC_01_Negative
  Scenario Outline:TC_01_adding_lesson_program_missing_parameters
    Given vice dean clicks on Teacher Management Option
    When vice dean enter "<lesson>"
    And vice dean enter "<name>","<surname>"
    And vice dean enter "<birthplace>" , "<email>" , "<phonenumber>"
    And vice dean choose gender
    And vice dean enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
    And vice dean click on the Submit button
    Then verify required message is displayed
    Examples:
      | lesson | name  | surname | birthplace | email        | phonenumber  | dateofbirth | ssn         | username   | password |
      |        | fatma | naz     | ulubey     | email@email1 | 545-565-5454 | 12-02-1969  | 217-43-8756 | fatmanaz46 | 12345678 |
      | java   |       | naz     | ulubey     | email@email1 | 545-575-5454 | 12-02-1971  | 217-43-8757 | fatmanaz45 | 12345678 |
      | java   | fatma |         | ulubey     | email@email1 | 545-585-5454 | 12-02-1972  | 217-43-8758 | fatmanaz44  | 12345678 |

