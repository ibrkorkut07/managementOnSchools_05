Feature: US_16 The Vice Dean should be able to view the messages sent by users

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"


  @MyTest_US_16
  Scenario: TC_01 The Vice Dean should be able to see the delete button|
    When User clicks on login button
    And User enters valid vice dean credentials "MydeanQuyash10" and "12345678"
    And User clicks on Login button of vice dean home page.
    And User clicks on Menu button of education term management page.
    And User clicks on the Contact Get All  option from Main Menu window
    Then User verifies that contact message page title "Contact Message" is displayed

  Scenario: TC_02 Validate that the The Vice Dean should be able to view the messages, their authors, emails, sending date and subject information
    Then User verifies that "Contact Message" title is displayed and can view "Name", "Email", "Date", "Subject" and "Message" information.

    Scenario: TC_03 The Vice Dean should be able to delete messages
      #Then user verifies that there is no Delete button in contact message page by getting screenshot.
    #  And User close the application page.


