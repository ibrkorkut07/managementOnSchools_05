@US_25_UI
Feature: Vice Dean should be able to create student

  Background: Sign in as admin
    Given user goes to "MosUrl"
    When user clicks on the login link
    And user enters username "Project09Admin"
    And user enters admin password "12345678"
    And user clicks on login button to enter
    And user clicks on student management link
