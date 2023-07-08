@US_06_UI
Feature: US_06 Dean should be able to create Vice Dean

  Background: TC_Login User should be able to login as a Dean
    Given user goes to "MosUrl"
    When user clicks on login button
    And user enters username "deanNecminson01"
    And user enters admin password "87651234"
    And user clicks on login button for enter
  @US_06_TC_001
  Scenario: TC_001 User can create Vice Dean by entering required credentials "Positive Test"
    Given  user fills all required credentials
    And    user clicks submit button
    Then   verify new Vice Dean is created
    And close the application
  @US_06_TC_002
  Scenario: TC_002 User can NOT create Vice Dean by entering required credentials except "Name" "Negative Test"
    Given  user fills all required credentials except name
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_003
  Scenario: TC_003 User can NOT create Vice Dean by entering required credentials except "Surname" "Negative Test"
    Given  user fills all required credentials except surname
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_004
  Scenario: TC_004 User can NOT create Vice Dean by entering required credentials except "Birth Place" "Negative Test"
    Given  user fills all required credentials except birth place
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_005
  Scenario: TC_005 User can NOT create Vice Dean by entering required credentials except "Gender" "Negative Test"
    Given  user fills all required credentials except gender
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_006
  Scenario: TC_006 User can NOT create Vice Dean by entering required credentials except "Date Of Birth" "Negative Test"
    Given  user fills all required credentials except date of birth
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_007
  Scenario: TC_007 User can NOT create Vice Dean by entering required credentials except "Phone Number" "Negative Test"
    Given  user fills all required credentials except phone number
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
  @US_06_TC_008
  Scenario: TC_008 User can NOT create Vice Dean by entering required credentials except "Username" "Negative Test"
    Given  user fills all required credentials except username
    And    user clicks submit button
    Then   verify new Vice Dean is not created without username
    And close the application
  @US_06_TC_009
  Scenario Outline: : TC_009 User can NOT create Vice Dean by entering required credentials except and invalid "Ssn" "Negative Test"
    Given  user fills all required credentials except ssn
    And    user enters invalid "<ssn>"
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
    Examples:
      | ssn          |
      |              |
      | 2543         |
      | 25439035651  |
      | 254905651    |
      | 254-903565   |
      | 25490-5651   |
      | 254-90-565   |
      | 254-90-56513 |
  @US_06_TC_010
  Scenario Outline: : TC_010 User can NOT create Vice Dean by entering required credentials except and invalid "Password" "Negative Test"
    Given  user fills all required credentials except password
    And    user enters an invalid  "<password>"
    And    user clicks submit button
    Then   verify new Vice Dean is not created
    And close the application
    Examples:
      | password |
      |          |
      | Qa38     |
      | q3843646 |
      | Q3843646 |
      | 38436467 |
      | hkskaksk |
      | HKSKAKSK |













