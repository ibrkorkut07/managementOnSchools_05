@US_25_DB
  Feature: Admin should be able to create student
#    Scenario Outline: US_25_GetStudent
#     Given get student with "<name>"
#      Then body should be contains birth_day "<birth_day>", birth_place "<birth_place>",gender "<gender>",phone_number "<phone_number>",ssn "<ssn>",surname "<surname>",username "<username>", name "<name>", email "<email>",father_name "<father_name>",mother_name "<mother_name>"
#      Examples:
#        | name      | birth_day  | birth_place | gender | phone_number | ssn         | surname   | username     | email                       | father_name | mother_name |
#        | Sharmaine | 1994-08-15 | USA         | 1      | 217-787-9438 | 760-13-4533 | Gleichner | alva.ritchie | ebonie.mosciski@hotmail.com | Enid        | Freeman     |
    Scenario Outline: US25_GetStudent
      Given get student by "<name>"
      Then body must be contains birth_day "<birth_day>", birth_place "<birth_place>",gender "<gender>", name "<name>",phone_number "<phone_number>",ssn "<ssn>",surname "<surname>",username "<username>",email "<email>",father_name "<father_name>",mother_name "<mother_name>"
      Examples:
        | birth_day  | birth_place | gender | name      | phone_number | ssn         | username     | surname   | email                       | father_name | mother_name |
        | 1994-08-15 | USA         | 1      | Sharmaine | 217-787-9438 | 760-13-4533 | alva.ritchie | Gleichner | ebonie.mosciski@hotmail.com | Enid        | Freeman     |
