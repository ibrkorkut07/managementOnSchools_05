@US_13
Feature: Vice Dean should be able to create teacher

  Background: Sign in as vice dean
    Given user goes to "https://managementonschools.com"
    When user clicks on login button
    And user enters username "mrnice"
    And user enters password "12345678"
    And user clicks on login button

  @TC_01
  Scenario Outline:TC_01_adding_lesson_program_successfully
    Given vice dean clicks on Teacher Management Option
    When vice dean choose a lesson "<lesson>"
    And vice dean enter "<name>"
    And vice dean enter "<surname>"
    And vice dean enter "<birthplace>" , "<email>" , "<phone number>"
    And vice dean choose "<gender>"
    And vice dean enter "<Date of birth>" and "<ssn>"
    And vice dean enter "<user name>" and "<password>"
    And vice dean clicks on the Submit button
    Then verify teacher saved successfully
    Examples:
      | lesson | name | surname | birthplace | email | phone number | gender | Date of birth | ssn | user name | password |
      | lesson | name | surname | birthplace | email | phone number | gender | Date of birth | ssn | user name | password |
