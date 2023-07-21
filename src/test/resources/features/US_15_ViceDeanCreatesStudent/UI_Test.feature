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

  @US15_TC02
  Scenario: TC_02_Vice_dean_can_not_submit_student_without_entering_required_fields
    And vice dean clicks on Submit button
    Then verify required message under fields
    Then close the application

  @US15_TC03
  Scenario: TC_03_Vice_dean_can_not_submit_student_without_choosing_advisor_teacher
    And vice dean do not choose advisor teacher advisor teacher
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean clicks on Submit button
    Then verify an error message is displayed indicating advisor teacher error
    Then close the application

  @US15_TC04
  Scenario: TC_04_Vice_dean_can_not_submit_student_without_choosing_gender
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean do not choose gender
    And vice dean clicks on Submit button
    Then verify an error message is displayed indicating invalid value error
    Then close the application

  @US15_TC05
  Scenario Outline: TC_05_Vice_dean_can_not_submit_student_with_an_invalid_SSN_format
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enter ssn "<ssn>" with an invalid format
    And vice dean clicks on Submit button
    Then verify an error message indicating Please enter valid SSN number
    Then close the application
    Examples:
      | ssn          |
      | 34567898056  |
      | asdfghgfdfgh |

  @US15_TC06
  Scenario Outline: TC_06_Creating a student with a duplicate SSN
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters duplicate "<ssn>"
    And vice dean clicks on Submit button
    Then verify a student with the SSN already exists
    Then close the application
    Examples:
      | ssn         |
      | 123-45-6789 |

  @US15_TC07
  Scenario Outline: TC_07_Creating a student with a password that doesn't meet the requirements
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername"
    And vice dean choose gender
    And vice dean enters a "<password>" doesn't meet the lowercase uppercase number requirements
    And vice dean clicks on Submit button
    Then verify password error message is displayed
    And take screenshot of entire page
    Then close the application
    Examples:
      | password |
      | PASSWORD |
      | password |
      | 12345678 |

  @US15_TC08
  Scenario Outline: TC_08_Creating a student with a password less than 8 characters
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername"
    And vice dean choose gender
    And vice dean enters a "<password>" doesn't at least eight char
    And vice dean clicks on Submit button
    Then verify password error message is displayed
    And take screenshot of entire page
    Then close the application
    Examples:
      | password |
      | pass     |

  @US15_TC09
  Scenario Outline: TC_09_Creating a student with a duplicate username
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters an "<username>" already exist
    And vice dean clicks on Submit button
    Then verify an error message is displayed indicating username is already exist message
    Examples:
      | username |
      | sdfsd    |

  @US15_TC010
  Scenario Outline: TC_010_Trying to create a student with an invalid date of birth
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters invalid date of birth "<dateofbirth>"
    And vice dean clicks on Submit button
#    Then verify date of birth error message is exist
    Then close the application
    Examples:
      | dateofbirth |
      | 48-90-1520  |

  @US15_TC011
  Scenario Outline: TC_011_Creating a student with a future date and very old date of birth
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters future date of birth "<futurepastdateofbirth>"
    And vice dean clicks on Submit button
    Then verify date of birth error messages is displayed
    Then close the application
    Examples:
      | futurepastdateofbirth |
      | 12.10.2050            |
      | 12.10.1220            |

  @US15_TC012
  Scenario Outline: TC_012_Creating a student with an invalid email format
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters invalid email "<email>"
    And vice dean clicks on Submit button
    And take screenshot
    Then verify invalid email error message is displayed
    Then close the application
    Examples:
      | email    |
      | adad@     |
      | asd@@    |
      | sdsfdsfd |
      | sd@asdfd |

  @US15_TC013
  Scenario Outline: TC_013_Creating a student name with different formats
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters name "<name>" with different formats
    And vice dean clicks on Submit button
    Then take screenshot
    Then verify invalid name error message should be displayed
    Then close the application

    Examples:
      | name                |
      | aliaysefatmahayriye |
      | a6                  |
      |                     |
      | ..fgh               |
      | ?*-123              |

  @US15_TC014
  Scenario Outline: TC_014_Creating a student surname with different formats
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",username "username",fathername "fathername",mothername "mothername",password "password"
    And vice dean choose gender
    And vice dean enters surname "<surname>" with different formats
    And vice dean clicks on Submit button
    Then take screenshot
    Then verify invalid name error message should be displayed
    Then close the application
    Examples:
      | surname             |
      | aliaysefatmahayriye |
      | a6                  |
      |                     |
      | ..fgh               |
      | ?*-123              |

  @US15_TC015
  Scenario Outline: TC_015_Creating a username with different formats
    Given vice dean choose advisor teacher "advisor teacher"
    And vice dean enters name "name",surname "surname",birthplace "birth place",email "email",phone "phone",dateofbirth "dateofbirth",ssn "ssn",fathername "fathername",mothername "mothername",password "password"
    And vice dean enters username "<username>" with different formats
    And vice dean clicks on Submit button
    Then take screenshot
    Then verify invalid name error message should be displayed
    Then close the application
    Examples:
      | username            |
      | aliayşefatmahayriye |
      | a6                  |
      |                     |
      | ..fgh               |
      | ?*-123              |
      | 2334566             |















