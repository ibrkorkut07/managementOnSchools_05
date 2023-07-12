@US01_DB
Feature: Prospective students should be able to register in the system

  Scenario Outline: GetRegisteredUser

    Given Get registered user via "<username>"
    Then Body contains birth_day "<birth_day>", birth_place "<birth_place>", gender "<gender>", name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"


    Examples:
      |username|birth_day|birth_place|gender|name|phone_number|ssn|surname|
      | ibrcan | 11 Nov 2011 | UK | 0 | ibr | 555-111-1234 | 187-65-4321 | can |