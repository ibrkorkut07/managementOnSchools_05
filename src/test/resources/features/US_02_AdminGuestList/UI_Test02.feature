@US02_TC02
Feature: US_02 Admin should be able to see the Guest User List details

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button for enter

  Scenario: Check the Guest List

    Given admin click on Menu section
    And admin click Guest User on pop-up
    And go to second page
    Then assert the list contains User Name
    And close the app