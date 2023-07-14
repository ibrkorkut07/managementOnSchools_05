@US13_DataBase
Feature: Vice Deans should be able to create a teacher

  Scenario Outline: US13_GetTeacher
    Given get teacher via name "<name>"
    Then body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>",phone_number "<phone_number>",ssn "<ssn>", surname "<surname>", username "<username>", email "<email>"
    Examples:
      | name    | birth_day  | birth_place | gender | phone_number | ssn         | surname | username | email              |
      | mr.john | 1992-12-12 | usa         | 0      | 456-123-8901 | 234-12-8890 | dyson   | mr.john  | mr.john@abcdef.com |