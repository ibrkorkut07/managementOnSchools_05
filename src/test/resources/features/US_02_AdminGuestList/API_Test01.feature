@US02 @US02_TC01_ApiTest
Feature: Get the Guest User List

    Scenario: Send the get request
      Given Send the request see the list
      Then Validate the list contain Name , Phone Number , Ssn ,User Name