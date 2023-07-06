@US_12
Feature: US_06 Vice Deans should be able to assign lessons to teachers

  Scenario: TC_001 User should be able to login as a Dean
    Given user goes to "https://managementonschools.com"
    When user clicks on login button
    And user enters username "deanNecminson01"
    And user enters admin password "87651234"
    And user clicks on login button for enter
