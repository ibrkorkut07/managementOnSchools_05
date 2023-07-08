Feature: US01 TC01 Birth Place must contain any character and cannot be left blank

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"

  Scenario: TC_003A Birth Place cannot be left blank

    When user clicks on "RegisterLink"
    And user clicks on Birth Place box
    And user leaves the Birth Place box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Birth Place box is displayed

  Scenario: TC_003B Name as only one space

    When user clicks on "RegisterLink"
    And user clicks on Birth Place box
    And user enters a space as a birth place
    And user clicks somewhere out of any Box
    Then the Required text under the Birth Place box is NOT displayed

  Scenario Outline: TC_003C Birth Place as one or more characters

    When user clicks on "RegisterLink"
    And user clicks on Birth Place box
    And user enters "<Birth Place>"  as a birth place
    Then the Required text under the Birth Place box is NOT displayed

    Examples:
      |Birth Place|
      |i|
      |#|
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