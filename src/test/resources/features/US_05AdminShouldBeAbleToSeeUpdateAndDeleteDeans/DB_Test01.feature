@US_05_DB_TC01
Feature: Admin should be able to add Dean
  Scenario Outline: US_05_Create_Dean
    Given connectt to database
    Then gett dean via name "<name>"
    And bodyy contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | name    | birth_day  | birth_place | gender | phone_number | ssn         | surname | username  |
      | Jhonson | 1978-11-10 | France      | 0      | 526-865-5854 | 421-45-8563 | Brows   | DeanAlexx |