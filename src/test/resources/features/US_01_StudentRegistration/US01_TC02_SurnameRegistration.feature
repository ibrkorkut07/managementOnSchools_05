Feature: US01 TC02 Surname Must Contain Any Character and Cannot Be Left Blank

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user clicks on Surname box

  Scenario: TC_002 Surname Cannot Be Left Blank

    And user leaves the Surname box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Surname box is displayed

  Scenario: TC_002 Surname As Only One Space

    And user enters a space as a surname
    And user clicks somewhere out of any Box
    Then the Required text under the Surname box is NOT displayed

  Scenario Outline: TC_002 Surname as As One or More Characters

    And user enters "<Surname>" as surname
    Then the Required text under the Surname box is NOT displayed

    Examples:
      |Surname|
      |c|
      |&|
      |3|
      |33|
      |  |
      |c |
      |ccc|
      | n|
      |  n|
      |c n|
      |can|
      |can can|