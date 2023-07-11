
Feature: US07  Deans should be able to see the messages sent by users

  Scenario: TC_01 Deans should be able to see the delete button


    Given Dean goes to "MosUrl"

 When Dean clicks the login button
 And Dean enters "DeanUserName" on login page
 And Dean enters "DeanPassword" on the login page
 And Dean clicks the loginBlue button
 And Dean clicks the menu option on the page that opens
 And Dean clicks "Contact Get All"option from main menu
  And Dean comes to contact message page
 Then Dean sees the delete button



