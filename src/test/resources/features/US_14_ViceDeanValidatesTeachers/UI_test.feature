Feature: US_14 Vice Dean should be able to see and update teachers

  Background: user goes to Managementonschools web page
    Given user goes to "MosUrl"
    When user clicks on "LoginLink"
  @my_test
  Scenario: TC_01 Validate that the information of the created teacher should be visible for Vice Dean
    #When User clicks on login button
    And User enters valid admin credentials Username "Project09Admin" and password "12345678"
    When User clicks on login button.
    Then User verifies that "Admin Management" title is displayed on the admin home page
    And User clicks on Menu button
    Then User verifies that "Main Menu" title is displayed in new window
    When User clicks on the Vice Dean Management option from Main Menu window
    Then User verifies that "Vice Dean Management" title is displayed
    And User enters valid data "Name" "Sure name", "Madrid", "Gender", "12/06/1990", "101-915-1534", "137-05-2240","MydeanQuyash91" and "12345678" to the vice dean list
    And User clicks on Submit button
    And User clicks on Menu button.
    And User clicks on Logout option
    And user clicks on Yes button
    When User enters valid vice dean credentials "MydeanQuyash91" and "12345678"
    And User clicks on Login button of vice dean home page.
    Then User verifies that "Education Term Management"  page is displayed
    And User clicks on Menu button of education term management page.
    And User clicks on the Teacher Management option from Main Menu window
    Then User verifies that "Teacher Management" title is displayed.







