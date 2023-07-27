
Feature: Deans should be able to see the messages sent by users

  @US07-TC06 @smokeTest
  Scenario:Dean should be able to deletes message
    Given Dean goes to "MosUrl"
    When Dean clicks the login button
    And Dean enters user name
    And Dean enters password
    And Dean clicks the loginBlue button
    And Dean clicks the menu option on the page that opens
    And Dean clicks "Contact Get All"option from main menu
    And Dean clicks delete button
    Then Dean verifies messages have been deleted
    Then close the application