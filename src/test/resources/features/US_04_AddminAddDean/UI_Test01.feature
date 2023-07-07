@US04_TC01
Feature: US_04 Admin should be able to add Dean

  Background: Sign in as admin
    Given user goes to "https://managementonschools.com"
    When user clicks on login button
    And user enters username "AdminProject"
    And user enters admin password "12345678"
    And user clicks on login button for enter


  Scenario Outline: Create Dean
    Given user clicks on menu
    Then user clicks on dean management option
    And user enters dean name "<dean name>"
    And user enters surname "<surname>"
    And user enters birth place "<birth place>"
    And user clicks on gender
    And  user enters date of birth "<date of birth>"
    And user enters phone number "<phone number>"

    And user enters ssn number "<ssn>"
    And user enters username for dean "<username for dean>"
    And user enters dean password "<password>"
    And user clicks submit button

    And user enters Vice dean password "<password>"

    Then assert alert message
    And close the application
    Examples:
      | dean name | surname | birth place | date of birth | phone number | ssn         | username for dean | password |
      | Arslans   | arslans | France      | 10111978      | 526-865-5044 | 421-40-7563 | DeanArslans       | Al123456 |




