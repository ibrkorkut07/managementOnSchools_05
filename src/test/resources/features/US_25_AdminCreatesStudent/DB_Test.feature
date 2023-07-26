@US_25_DB
  Feature: Admin should be able to create student
    Scenario Outline: US_25_GetStudent
     Given get student with "<username>"
      Then body should be contains birth_day "<birth_day>", birth_place "<birth_place>",gender "<gender>",phone_number "<phone_number>",ssn "<ssn>",surname "<surname>",username "<username>", name "<name>", email "<email>",father_name "<father_name>",mother_name "<mother_name>"
      Examples:
        | name      | birth_day  | birth_place | gender | phone_number | ssn         | surname   | username     | email                       | father_name | mother_name |
        | Sharmaine | 1994-08-15 | USA         | 1      | 217-787-9438 | 760-13-4533 | Gleichner | alva.ritchie | ebonie.mosciski@hotmail.com | Enid        | Freeman     |
