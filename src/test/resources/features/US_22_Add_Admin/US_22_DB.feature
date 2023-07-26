@US_22_DB
Feature: US_22 add admin

  Scenario Outline: Us_22 add admin DB
    Given get admin via username
    Then id "<id>", username "<username>", birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"

    Examples:
      | id    | username   | birth_day  | birth_place | gender | name | phone_number | ssn           | surname |
      | 457   | YunusAhmet |  1993-12-12|  Amasya     |  0  |Ahmet | 534-643-5431 |  321-53-4673     |Sahin|