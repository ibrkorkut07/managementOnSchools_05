@US_06_API
Feature: US_06 Dean should be able to create Vice Dean


  Scenario Outline: TC_001 User can create Vice Dean by entering required credentials "Positive Test"
    Given user sends get request by existing id
    Then body should contain birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username | birth_day  | birth_place     | gender | name          | phone_number | ssn         | surname |
      | deanSaid | 2000-05-31 | North Macedonia | MALE   | Muhammed Said | 545-774-0132 | 185-32-1664 | Ersöz   |

  @US_06_Negative_API
  Scenario: Dean should NOT be able to get with non existing username of Vice Dean List.
    Given user sends get request by non existing id
    Then body must be empty with non existing username "<username>"













