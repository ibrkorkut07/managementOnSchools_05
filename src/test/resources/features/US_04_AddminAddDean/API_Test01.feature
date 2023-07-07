@US04_TC01_ApiTest
Feature: Get the dean and validate

  Scenario: Send get request by id
    Given send the request by id
    Then validate the body