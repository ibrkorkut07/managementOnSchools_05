Feature: US01 TC02 Surname must contain any character and cannot be left blank

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "RegisterLink"
    And user clicks on Surname box

  Scenario: TC_002 Surname cannot be left blank

    And user leaves the Surname box blank
    And user clicks somewhere out of any Box
    Then the Required text under the Surname box is displayed

  Scenario: TC_002 Surname as only one space

    And user enters a space as a surname
    And user clicks somewhere out of any Box
    Then the Required text under the Surname box is NOT displayed

  Scenario Outline: TC_002 Surname as one or more characters

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