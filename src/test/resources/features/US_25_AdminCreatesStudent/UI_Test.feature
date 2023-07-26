@US_25_UI
Feature: Admin should be able to create student

  Background: Sign in as admin
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
   And admin choose gender
   Then admin clicks on Submit button
   Then verify student is created successfully message
   Then verify student id should automatically appear

  Scenario: TC_02_Admin_can_not_submit_student_without_entering_required_fields
    And admin clicks on Submit button
    And vice dean verify the required texts displayed
    And    close the applications

    Scenario: TC_03_Admin_can_not_submit_student_without_choosing_gender
    Given admin choose advisor teacher "advisor teacher"
      And admin enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
      And admin do not choose gender
    And admin clicks on Submit button
    Then verify an error message is displayed


  Scenario: TC_04_Admin_can_not_submit_student_without_choosing_advisor_teacher
    And admin do not choose advisor teacher advisor teacher
    And admin enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And admin choose gender
    And admin clicks on Submit button
    Then verify an error message is displayed indicating advisor teacher error
    Then close the application

  Scenario Outline: TC_05_Admin_can_not_submit_student_with_an_invalid_SSN_format
    Given admin choose advisor teacher "advisor teacher"
    And admin enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",username "username",fathername "fathername",mothername "mothername",password "password"
    And admin choose gender
    And admin enter ssn "<ssn>" with an invalid format
    And admin clicks on Submit button
    Then verify an error message indicating Please enter valid SSN number
    Then close the application
    Examples:
      | ssn          |
      | abc343535343 |
      | .bc-34-3434  |



