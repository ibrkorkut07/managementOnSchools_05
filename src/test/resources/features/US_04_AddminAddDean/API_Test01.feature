@US04_TC01_ApiTest
Feature: Get the dean and validate

  Scenario Outline: US04_GetDeanByUserName

    Given send the request by "<username>"
    And body should contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"
    Examples:
      | username  | birth_day  | birth_place | gender | name    | phone_number | ssn         | surname |
      | DeanAlexx | 1978-11-10 | France      | 0      | Jhonson | 526-865-5854 | 421-45-8563 | Brows   |