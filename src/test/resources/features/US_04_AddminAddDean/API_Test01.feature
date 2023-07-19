@US04_TC01_ApiTest
Feature: Get the dean and validate

  Scenario Outline: US04_GetDeanByUserName

    Given send the request by "<userId>"
    And body should contains username "<username>" birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"
    Examples:
      | userId | username | birth_day | birth_place | gender | name | phone_number | ssn | surname |
      | 540    |    DeanAlexx      |    1978-11-10       |  France           |    MALE    |  Jhonson    |   526-865-5854           |  421-45-8563   |     Brows    |
