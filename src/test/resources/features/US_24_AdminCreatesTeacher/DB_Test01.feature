@US24_DB
Feature: Admin should be able to create a teacher

  Scenario Outline: US24_DB Create a teacher
    Given Get the teacher by name "<name>"
    Then The Body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>",phone_number "<phone_number>",ssn "<ssn>", surname "<surname>", username "<username>", email "<email>"
    Examples:
      | name  | birth_day  | birth_place | gender | phone_number | ssn         | surname    | username         | email                   |
      | Fairy | 1988-11-11 | Greece      | 1      | 598-924-1518 | 671-44-4914 | Wintheiser | morton.abernathy | rueben.schoen@yahoo.com |
