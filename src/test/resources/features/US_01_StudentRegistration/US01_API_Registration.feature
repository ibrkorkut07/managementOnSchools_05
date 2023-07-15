@US01_Api @Api
Feature: Prospective students should be able to register in the system(Api)

  Scenario Outline: US01_GetGuestUserByUsername

    Given send get request by "<username>"
    Then body should contain birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username | birth_day  | birth_place | gender | name | phone_number | ssn         | surname |
      | ibrcan   | 2011-11-11 | UK          | MALE   | ibr  | 555-111-1234 | 187-65-4321 | can     |

  @US01_NegativeApi
  Scenario: Admin should be able to delete information of Guest User List.
    Given send get request by "john_doeX"
    Then body must be empty with non existing username "ibrcan"

 #     |Name|Surname|Birth Place|Phone       |month|day|year|Ssn        |User Name   |Password|
 #     |ibr|can     |UK         |(555)3331234|11   |11 |2011|187-65-4321|ibrcan      |ibrcan07|