@US20
Feature: Feature: US_20 The teacher should be able to view meeting lists and make updates

  Background:
    Given user goes to "MosUrl"
    When user clicks on login button
    Then user enters username "OmerRahsan"
    Then user enters admin password "12345678"
    Then user clicks on login button to enter
    Then Teacher clicks on menu button
    Then Teacher clicks on Meet Management option


  Scenario: US_20 TC_001 The teacher should be able to view meeting lists and make updates

    Then Teacher verifies the Date, Start Time, Stop Time and Description are visible created.
    Then close the application
  @US20_1
 Scenario: US_20 TC_002 The teacher should be able to delete the meeting.
    Given Teacher adds a new meeting
    #And Teacher deletes the added meeting.

 # Scenario: US_09 TC_003 Vive Deans should be able to update the lesson information.
  #  And YSA is able to update the lesson information

