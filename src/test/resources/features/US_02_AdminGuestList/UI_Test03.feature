@US02_TC03
Feature: US_02 TC_03 Admin should be able to delete information of Guest User List.

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button for enter

  Scenario: Check the Guest List

    Given admin click on Menu section
    And admin click Guest User on pop-up
    And Click the delete button
    Then Assert the pop-up contains Guest User deleted

