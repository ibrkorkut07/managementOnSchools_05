Feature: US01 TC01 Name must contain any character and cannot be left blank

  Scenario: TC_001A Name cannot be left blank

    Given user goes to "MosUrl"
    When user clicks on Register link
    And user clicks on Name box
    And user leaves the Name box blank and clicks somewhere out of Name Box
    Then user tests the Required text under the Name box is displayed

#    Examples:
 #     |Name|
  #    ||
  #    | |
 #     |J|
 #     |Jo|
#      |John|