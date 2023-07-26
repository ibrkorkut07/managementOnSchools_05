@US_24
Feature: Admin should not be able to create teacher with missing criteria

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button for enter

    Scenario: Without adding parameters
      Given admin clicks on Teacher Management Option
      When admin enter "Java"
      And admin enter "ankara" , " " , "256-685-9865"
      And admin enter " ", " ", " " and "<password>"
      And admin click on the submit button
      And admin verify the required texts displayed
      Then close application

