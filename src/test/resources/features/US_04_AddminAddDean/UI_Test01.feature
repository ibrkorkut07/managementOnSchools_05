@US_04
Feature: US_04 Admin should be able to add Dean

  Background: Sign in as admin
    Given user goes to "https://managementonschools.com"
    When user clicks on login button
    And user enters username "AdminProject09"
    And user enters admin password "12345678"
    And user clicks on login button for enter


  Scenario Outline: Create Dean
    Given user clicks on menu
    Then user clicks on dean management option
    And user enters name "<name>"
    And user enters surname "<surname>"
    And user enters birth place "<birth place>"
    And user clicks on gender
    And  user enters date of birth
    And user enters phone number "<phone number>"
    And user enters Vice dean password "<password>"
    Then assert alert message
    And close the application
    Examples:
      | name | surname | birth place | phone number | password |
      | Alex | Johnson | Florida     | 888-526-444  | Ab987456 |


