Feature: US01 TC01 Prospective students should be able to register in the system with valid data

  Scenario Outline: Prospective students register in the system with valid data  (Negative Scenario)
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user enters "<Name>" as a name
    And user enters "<Surname>" as surname
    And user enters "<Birth Place>"  as a birth place
    And user enters "<Phone>"  as a phone number
    Then user scrolls into User Name box
    And user clicks on Male Radio button and selects Male as a gender
    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user scrolls into User Name box
    And user enters a "<Password>" as a password
    And user clicks on Register button

    Examples:
      |Name|Surname|Birth Place|Phone       |month|day|year|Ssn        |User Name|Password|
      |1   |1      |1          |(555)3331774|11   |11 |2022|123-11-4789|i        |ibrcan07|