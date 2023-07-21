@US_24
Feature: Admin should be able to create teacher

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button for enter


  Scenario Outline: Create teacher as a admin
    Given admin clicks on Teacher Management Option
    When admin enter "<lesson>"
    And admin enter "<name>","<surname>"
    And admin enter "<birthplace>" , "<email>" , "<phonenumber>"
    And admin choose a gender
    And admin enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
    And admin able to choose adviser teacher
    And admin click on the submit button
    Then verify new teacher saved successfully
    Then close application
    Examples:
      | lesson | name | surname | birthplace | email           | phonenumber  | dateofbirth | ssn         | username | password  |
      | Java   | issy | kont    | kenya      | herae@gmail.com | 238-712-2089 | 01.07.2023  | 362-11-6896 | koksal   | 123457789 |
