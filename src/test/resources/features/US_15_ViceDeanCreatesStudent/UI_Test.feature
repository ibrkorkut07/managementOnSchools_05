@US_15_UI
Feature: Vice Dean should be able to create student

  Background: Sign in as vice dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "mrsnice"
    And user enters password "12345678"
    And user clicks on login button for enter
    When vice dean clicks on Menü link
    Then vice dean clicks on Student Management option

  Scenario: TC_01_Creating_student_successfully
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    Then vice dean clicks on Submit button
    Then verify student is created successfully message
    Then verify student id should automatically appear

#  Scenario: TC_02_Vice_dean_can_not_submit_student_without_entering_required_fields
#    And vice dean clicks on Submit button
#    Then verify required message under fields
#
#  Scenario: TC_03_Vice_dean_can_not_submit_student_without_choosing_advisor_teacher
#    And vice dean do not choose advisor teacher advisor teacher
#    And vice dean clicks on Submit button
#    Then verify an error message is displayed indicating jsonparseerror
#
#  Scenario: TC_03_Vice_dean_can_not_submit_student_without_choosing_gender
#    Given vice dean choose advisor teacher "advisor teacher"
#    And vice dean do not choose gender
#    And vice dean clicks on Submit button
#    Then verify an error message is displayed indicating jsonparseerror
#
#  Scenario: TC_04_Vice_dean_can_not_submit__student_with_an_invalid_SSN_format
#    Given vice dean choose advisor teacher "advisor teacher"
#    And vice dean enters name "name", surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enter ssn "ssn" with an invalid format
#    And vice dean clicks on Submit button
#    Then verify an error message indicating Please enter valid SSN number
#
#  Scenario: Creating a student with a duplicate SSN
#    Given vice dean choose advisor teacher "advisor teacher"
#    And vice dean enters name "name", surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name",password "password"
#    Then verify a student with the SSN already exists
#
#  Scenario Outline: Creating a student with a password that doesn't meet the requirements
#    And vice dean enters name "name", surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name"
#    And vice dean enters a password doesn't meet the requirements(uppercase,lowercase,number,at least 8 char)
#    Then verify password error message is displayed
#
#  Scenario: Creating a student with a password less than 8 characters
#    And vice dean enters name "name", surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name"
#    And vice dean enters a password doesn't meet the requirements(uppercase,lowercase,number,at least 8 char)
#    Then verify password error message is displayed
#
#  Scenario: Creating a student with a duplicate username
#    Given vice dean enters name "name", surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean clicks on Submit button
#    Then verify an error message is displayed indicating username is already exist message
#
#  Scenario Outline: Trying to create a student with an invalid date of birth
#    Given vice dean enters name "name", surname "surname", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters invalid date of birth format
#    Then verify date of birth error message is displayed
#
#  Scenario: Creating a student with a future date of birth
#    Given vice dean enters name "name", surname "surname", email "email",phone "phone",date of birth "date of birth", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters future date of birth
#    Then verify date of birth should be passed time error message is displayed
#
#  Scenario Outline: Trying to create a student with an invalid phone number format
#    Given vice dean enters name "name", surname "surname",birth place "birth place", email "email",date of birth "date of birth",ssn "ssn", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters invalid phone number format
#    Then verify invalid phone number error message is displayed
#
#  Scenario Outline: Creating a student with an invalid email format
#    Given vice dean enters name "name", surname "surname",birth place "birth place",phone "phone",date of birth "date of birth",ssn "ssn", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters invalid email format
##  (ad@,asd@@,sd@asdfd,sdsfdsfd)
#    Then verify invalid email error message is displayed
#
#  Scenario Outline: Creating a student name with different formats
#    Given vice dean enters surname "surname",birth place "birth place", email "email",phone "phone",date of birth "date of birth",ssn "ssn", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters name with different formats
##  (long name,short name,blank name)
#    Then verify invalid name error message should be displayed
#
#  Scenario: Creating a student surname with different formats
#    Given vice dean enters name "name",birth place "birth place", email "email",phone "phone",date of birth "date of birth",ssn "ssn", username "username",father name"father name",mother name "mother name",password "password"
#    And vice dean enters surname with different formats
##  (long surname,short surname,blank surname)
#    Then verify invalid surname error message should be displayed
#
#















