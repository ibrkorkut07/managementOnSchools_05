@US01_DB
Feature: Prospective students should be able to register in the system

  Scenario Outline: GetRegisteredUser

    Given connect to the database
    Then get guest_user via name "<name>"
    And the body contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | name    | birth_day  | birth_place | gender | phone_number | ssn         | surname | username  |
      |ibr      |2011-11-11  |UK           |0       |(555)3231234  |127-65-4321  |can      |ibrcan07     |