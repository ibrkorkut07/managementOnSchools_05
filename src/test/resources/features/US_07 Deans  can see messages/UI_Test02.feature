
Feature: Deans should be able to see the messages sent by users

 @US07-TC06 @smokeTest
  Scenario:Dean should be able to deletes message
   When Dean clicks the login button
   And Dean enters "DeanUserName" on login page
   And Dean enters "DeanPassword" on the login page
   And Dean clicks the loginBlue button
   And Dean clicks the menu option on the page that opens
   And Dean clicks "Contact Get All"option from main menu
    And Dean clicks delete button
    Then Dean verifies messages have been deleted
    Then close the application