Feature: US01 TC01 Name must contain any character and cannot be left blank

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"

  Scenario: TC_001A Name cannot be left blank

    And user clicks on Name box
    And user leaves the Name box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Name box is displayed

  Scenario: TC_001B Name as only one space

    And user clicks on Name box
    And user enters a space as a name
    And user clicks somewhere out of any Box
    Then the Required text under the Name box is NOT displayed

  Scenario Outline: TC_001C Name as one or more characters

    And user clicks on Name box
    And user enters "<Name>" as a name
    Then the Required text under the Name box is NOT displayed

    Examples:
      |Name|
      |i|
      |%|
      |1|
      |11|
      |  |
      |i |
      |iii|
      | b|
      |  r|
      |i r|
      |ibr|
      |ibr can|