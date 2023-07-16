Feature: US01 TC01 Birth Place Must Contain Any Character and Cannot Be Left Blank

  Background: User Goes to Managementonschools Webpage
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user clicks on Birth Place box

  Scenario: TC_003A Birth Place Cannot Be Left Blank

    And user leaves the Birth Place box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Birth Place box is displayed

  Scenario: TC_003B Name As Only One Space

    And user enters a space as a birth place
    And user clicks somewhere out of any Box
    Then the Required text under the Birth Place box is NOT displayed

  Scenario Outline: TC_003C Birth Place As One or More Characters

    And user enters "<Birth Place>"  as a birth place
    Then the Required text under the Birth Place box is NOT displayed

    Examples:
      |Birth Place|
      |I|
      |#|
      |1|
      |  |
      |I |
      | t|
      |  a|
      |I a|
      |It ly|
      |Italy|