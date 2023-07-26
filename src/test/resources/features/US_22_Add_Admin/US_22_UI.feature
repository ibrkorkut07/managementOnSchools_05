@US_22
Feature: US_22 Add Admin


  Background:
    Given user goes to "MosUrl"
    When user clicks on login button
    Then user enters username "Project09Admin"
    Then user enters admin password "12345678"
    Then user clicks on login button to enter
    Then user clicks on menu
    Then user clicks on admin management option


  Scenario: TC_001 Name must contain any character and cannot be left blank
    Then click the name box
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

    Scenario:TC_002 "Surname" must contain any character and cannot be left blank

      Then fill out the name
      Then click the surname box
      Then fill out the birth place
      Then click the gender
      Then fill out the date of birth
      Then fill out the phone number
      Then fill out the SSN number
      Then fill out the User Name
      Then fill out the password
      Then click the submit button to add admin
      And close the application

  Scenario:TC_003 "Birth Place" must contain any character and cannot be left blank

    Then fill out the name
    Then fill out the surname
    Then click the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

    Scenario: TC_004 Gender must be selected and cannot be left blank.

      Then fill out the name
      Then fill out the surname
      Then fill out the birth place
      Then fill out the date of birth
      Then fill out the phone number
      Then fill out the SSN number
      Then fill out the User Name
      Then fill out the password
      Then click the submit button to add admin
      And close the application


  Scenario: TC_005 Date of birth must be entered and cannot be left blank.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then click the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

  Scenario: TC_006 Phone number must be entered and cannot be left blank.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then click the date of birth
    Then click the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application


  Scenario: TC_007 SSN cannot be left blank.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then click the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application


  Scenario: TC_008 SSN must contain a "-" after the 3rd and 5th digits

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out with invalid SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

  Scenario: TC_009 SSN must consist of 9 digits in total

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out with invalid SSN number in "8" digits
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

  Scenario: TC_010 User Name must be entered and cannot be left blank.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then click the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application

  Scenario: TC_011 Password can be entered and must consist of at least 8 characters.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password in "7" digits
    Then click the submit button to add admin
    And close the application

  Scenario: TC_012 Password field don't left blank

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then click the password
    Then click the submit button to add admin
    And close the application

  Scenario: TC_013 Password must contain uppercase letters

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password without uppercase
    Then click the submit button to add admin
    And close the application

  Scenario: TC_014 Password must contain  lowercase letters

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password without lowercase
    Then click the submit button to add admin
    And close the application

  Scenario: TC_015 Password must contain a number.

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password without number
    Then click the submit button to add admin
    And close the application


  Scenario: TC_016 Add admin

    Then fill out the name
    Then fill out the surname
    Then fill out the birth place
    Then click the gender
    Then fill out the date of birth
    Then fill out the phone number
    Then fill out the SSN number
    Then fill out the User Name
    Then fill out the password
    Then click the submit button to add admin
    And close the application
