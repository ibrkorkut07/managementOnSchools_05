@US_05_API_TEST_TC_01

Feature: US_05_Admin_See_Deans

  Scenario Outline: US05_GetDeanByUserName
    Given send the request via "<username>"
    And body should containss birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"
    Examples:
      | username  | birth_day  | birth_place | gender | name    | phone_number | ssn         | surname |
      | DeanAlexx | 1978-11-10 | France      | 0      | Jhonson | 526-865-5854 | 421-45-8563 | Brows   |
      | Mbarisd | 1995-01-01 | Aksaray      | 0      | Mustafa | 542-123-1234 | 111-22-3333 | Baris   |