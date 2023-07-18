@US02 @US02_TC01_ApiTest

Feature: Get the Guest User List

  Scenario Outline: US02_Send the get request

    Given send get request by "<username>"
    Then body should contain birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username         | birth_day  | birth_place | gender | name    | phone_number | ssn         | surname  |
      | fermin.hettinger | 1982-09-20 | Yozgat      | MALE   | Deloras | 240-109-8208 | 637-33-0272 | Nitzsche |
