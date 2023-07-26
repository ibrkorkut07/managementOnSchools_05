@US_22_DB
Feature: US_22 add admin

  Scenario: Us_22 add admin
    Given get admin via username
    Then id "<id>", username "<username>", birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>"