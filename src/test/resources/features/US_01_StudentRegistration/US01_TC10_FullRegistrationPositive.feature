Feature: US01 TC01 Prospective students should be able to register in the system with valid data

  Scenario Outline: Prospective students register in the system with valid data
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user clicks on Name box
    And user enters "<Name>" as a name
    And user clicks on Surname box
    And user enters "<Surname>" as surname
    And user clicks on Birth Place box
    And user enters "<Birth Place>"  as a birth place
    And user clicks on Phone box
    And user enters "<Phone>"  as a phone number
    Then user scrolls into User Name box
    And user clicks on Male Radio button and selects Male as a gender
    Then user scrolls down to Date of Birth box
    And user enters "<month>", "<day>", "<year>"  as a birth date
    And user clicks on Ssn box
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user enters a "<Password>" as a password
    And user clicks on Register button

    Examples:
      |Name|Surname|Birth Place|Phone|month|day|year|Ssn|User Name|Password|
      |ibr|can|UK|(555)3331234|11|11|2011|187-65-4321|ibrcan|ibrcan07|

  Scenario Outline: Prospective students register in the system with valid data SHORTER VERSION
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    # And user clicks on Name box
    And user enters "<Name>" as a name
    # And user clicks on Surname box
    And user enters "<Surname>" as surname
    # And user clicks on Birth Place box
    And user enters "<Birth Place>"  as a birth place
    # And user clicks on Phone box
    And user enters "<Phone>"  as a phone number
    Then user scrolls into User Name box
    And user clicks on Male Radio button and selects Male as a gender
    # Then user scrolls down to Date of Birth box
    And user enters "<month>", "<day>", "<year>"  as a birth date
    # And user clicks on Ssn box
    And user enters an invalid "<Ssn>" as an Ssn
    And user enters a "<User Name>" as an user name
    And user enters a "<Password>" as a password
    And user clicks on Register button

    Examples:
      |Name|Surname|Birth Place|Phone|month|day|year|Ssn|User Name|Password|
      |ibr|can|UK|(555)3331234|11|11|2011|187-65-4321|ibrcan|ibrcan07|