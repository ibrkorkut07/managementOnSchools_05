@US19
Feature: US_19 The teacher should be able to create meetings with students.(Add Meet)

  Background:
    Given user goes to "MosUrl"
    When user clicks on login button
    Then user enters username "OmerRahsan"
    Then user enters admin password "12345678"
    Then user clicks on login button to enter
    Then Teacher clicks on menu button



  Scenario: TC_001 The teacher can be "Choose Students" "Date Of Meet" "Start Time" "Stop Time" "Description"
    Then Teacher clicks on Meet Management option
    Then Teacher clicks on select students button
    Then Teacher fill out the Date Of Meet
    Then Teacher fill out the Start Time
    Then Teacher fill out the Stop Time
    Then Teacher fill out the Description
    Then click the submit button
    And close the applications
