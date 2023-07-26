@US22_TC001_ApiTest
Feature: Add admin and validate

  Scenario Outline: US22_Add admin

    Given send the request for admin "<id>"
    And body should contains id "<id>", username "<username>", birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"
    Examples:
      | id    | username   | birth_day  | birth_place | gender | name | phone_number | ssn           | surname |
      | 457   | YunusAhmet |  1993-12-12|  Amasya     |  MALE  |Ahmet | 534-643-5431 |  321-53-4673  |  Sahin  |
