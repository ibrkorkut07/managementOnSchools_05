@US_06_DB
Feature: US_06 Dean should be able to create Vice Dean

  Scenario Outline: : US_06 Dean can create Vice Dean

    Given get vice dean via username "<username>"
    Then body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username  | birth_day  | birth_place | gender | name | phone_number | ssn         | surname |
      | Johnbulls | 2012-12-12 | Dublin      | 0      | John | 098-234-7654 | 832-12-9832 | Bulls   |


  @US01_Negative
  Scenario: Dean should NOT be able to get with non existing username from Vice Dean List.
    Given get vice dean via  non existing username "Johnbulls01"
    Then body should be empty














