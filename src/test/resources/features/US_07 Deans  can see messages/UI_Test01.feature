@US07-TC01
Feature: US07  Deans should be able to see the messages sent by users

  Scenario: TC_01 Deans should be able to see the messages sent by users


    Given Dean goes to "MosUrl"

 When Dean clicks the login button
 And Dean enters "DeanUserName" on login page
 And Dean enters "DeanPassword" on the login page
 And Dean clicks the loginBlue button
 And Dean clicks the menu option on the page that opens
 And Dean clicks "Contact Get All"option from main menu
    Then Dean verifies that authors are displayed on the page
    Then Close the application

  @US07-TC02
  Scenario:Dean should be able to see the e-mails
    When Dean clicks the login button
    And Dean enters "DeanUserName" on login page
    And Dean enters "DeanPassword" on the login page
    And Dean clicks the loginBlue button
    And Dean clicks the menu option on the page that opens
    And Dean clicks "Contact Get All"option from main menu
    Then Dean verifies emails are displayed on the page
    Then Close the application

 @US07-TC03
  Scenario:Dean should be able to see sending dates
   When Dean clicks the login button
   And Dean enters "DeanUserName" on login page
   And Dean enters "DeanPassword" on the login page
   And Dean clicks the loginBlue button
   And Dean clicks the menu option on the page that opens
   And Dean clicks "Contact Get All"option from main menu
    Then Dean verifies that the date the messages were sent is displayed on the page
    Then close the application

   @US07-TC04
  Scenario:Dean should be able to see subject information
     When Dean clicks the login button
     And Dean enters "DeanUserName" on login page
     And Dean enters "DeanPassword" on the login page
     And Dean clicks the loginBlue button
     And Dean clicks the menu option on the page that opens
     And Dean clicks "Contact Get All"option from main menu
    Then Dean verifies that subject information is displayed on the page
    Then close the application

 @US07-TC05 @smokeTest
  Scenario:Dean should be able to see message on this page
   When Dean clicks the login button
   And Dean enters "DeanUserName" on login page
   And Dean enters "DeanPassword" on the login page
   And Dean clicks the loginBlue button
   And Dean clicks the menu option on the page that opens
   And Dean clicks "Contact Get All"option from main menu
    Then Dean verifies that messages are displayed on the page
    Then close the application


