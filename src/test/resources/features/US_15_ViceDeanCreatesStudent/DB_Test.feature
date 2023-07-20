@US15_DB
Feature: Vice Dean should be able to creates a student
  Scenario Outline: US15_GetStudent
    Given get student by "<name>"
    Then body must be contains birth_day "<birth_day>", birth_place "<birth_place>",gender "<gender>", name "<name>",phone_number "<phone_number>",ssn "<ssn>",surname "<surname>",username "<username>",email "<email>",father_name "<father_name>",mother_name "<mother_name>"
    Examples:
      | birth_day   | birth_place | gender | name  | phone_number | ssn         | username       | surname | email                    | father_name | mother_name |
      | 1994-08-15 | USA         | 0      | Korey | 437-114-5410 | 377-03-6215 | brande.streich | Gaylord | hugo.gutmann@hotmail.com | Eldon       | Frederic    |
