Feature: US01 TC01 Name Must Contain Any Character and Cannot Be Left Blank

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user clicks on Name box

  Scenario: TC_001A Name Cannot Be Left Blank

    And user leaves the Name box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Name box is displayed

  Scenario: TC_001B Name As Only One Space

    And user enters a space as a name
    And user clicks somewhere out of any Box
    Then the Required text under the Name box is NOT displayed

  Scenario Outline: TC_001C Name As One or More Characters

    And user enters "<Name>" as a name
    Then the Required text under the Name box is NOT displayed

    Examples:
      |Name|
      |i|
      | |
      |11|
      |ibr|
