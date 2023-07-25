@US_25_API @Test
Feature: Admin should be able to create student
  # By Admin token i search get request for students getAll : we dont have specific username in api.

Scenario Outline: US25_GetStudentByName
  Given user should send the get request by name "<name>"
  Then the body should be contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", surname "<surname>", username "<username>"
  Examples:
    | name      | birth_day  | birth_place | gender | phone_number | surname   | username     |
    | Sharmaine | 1994-08-15 | USA         | FEMALE | 217-787-9438 | Gleichner | alva.ritchie |

  @US_25_API_NegativeTest
  Scenario: Not get student by non-existing name
    Given send the get request by name "bazzz"
    Then the body should be empty with non-existing name "bazzz"
