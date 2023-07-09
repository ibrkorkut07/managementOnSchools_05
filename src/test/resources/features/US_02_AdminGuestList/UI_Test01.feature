@US02_TC01
Feature: US_02 Admin should be able to see the Guest User List

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
    Given user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button for enter


    Scenario: Check the Guest List

      Given admin click on Menu section
      And admin click Guest User on pop-up
      Then assert the title contains guest-user
      And close the app


