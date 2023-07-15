Feature: US01 TC01 Prospective students should be able to register in the system with valid data

  Scenario Outline: Prospective students register in the system with valid data (Positive Scenario)
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user enters "<Name>" as a name
    And user enters "<Surname>" as surname
    And user enters "<Birth Place>"  as a birth place
    And user enters "<Phone>"  as a phone number
    Then user scrolls into User Name box
    And user clicks on Male Radio button and selects Male as a gender
    #Then user scrolls down to Date of Birth box
    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user enters a "<Password>" as a password
    And user clicks on Register button

    Examples:
      |Name|Surname|Birth Place|Phone       |month|day|year|Ssn        |User Name|Password|
      |ibr7|can7   |UK         |(555)3777234|13   |13 |2013|187-33-4321|ibrhan   |ibrhan07|