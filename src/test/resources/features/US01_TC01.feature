Feature: US01 TC01 Student Registration

  Scenario: TC01 Student should be able to register with valid data
    Given user navigates to "MosUrl"
    And user clicks on "MosRegisterLink" link
    Then usewr enters verify the page title contains "iPhone"
    Then close the application


  # Name must contain any character and cannot be left blank.
  # Surname must contain any character and cannot be left blank.
  # Birth Place must contain any character and cannot be left blank.
  # The user should be able to enter their phone number.
  # The user should be able to select their gender.
  # The user should be able to enter their date of birth.
  # SSN must be entered. SSN; must contain ‘-’ after the 3rd and 5th digits and consist of 9 digits.
  # The user should enter ‘User Name’.
  # Password can be entered. Password must consist of at least 8 characters.
  # Password must contain at least one uppercase letter, one lowercase letter and one digit
