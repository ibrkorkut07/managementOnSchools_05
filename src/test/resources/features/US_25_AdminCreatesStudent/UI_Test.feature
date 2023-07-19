@US_25_UI
Feature: Vice Dean should be able to create student

  Background: Sign in as vice dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "Project09Admin"
    And user enters password "12345678"
    And user clicks on login button for enter
    When vice dean clicks on Menü link
    Then vice dean clicks on Student Management option

  Scenario: TC_01_Creating_student_successfully
    Given admin choose advisor teacher "advisor teacher"
    And admin enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
