Feature: Prospective Students Should Be Able to Register in the System (API)

  @US01_Api @Api
  Scenario Outline: US01 TC01 Get GuestUser By Username (Positive Scenario)

    Given Send get request by username "<username>"
    Then body should contain birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | username | birth_day  | birth_place | gender | name | phone_number | ssn         | surname |
      | ibrcan   | 2011-11-11 | UK          | MALE   | ibr  | 555-111-1234 | 187-65-4321 | can     |

  @US01_NegativeApi
  Scenario Outline: US01 TC02 Body Must Be Empty With Non-Existing Guest User information (Negative Scenario)
    Given Send get request by username "<username>"
    Then Body must be empty with non-existing username "<username>"
    Examples:
      | username |
      | 07ibrcan |