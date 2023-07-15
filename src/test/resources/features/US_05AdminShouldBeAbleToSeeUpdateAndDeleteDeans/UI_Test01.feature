@US_05
  Feature: US_05_Admin_See_Delete_Update_Deans

    Background:
      Given user goes to "MosUrl"
      When user clicks on login button
     Then user enters username "Project09Admin"
      Then user enters admin password "12345678"
      Then user clicks on login button for enter
      Then user clicks on menu
      Then user clicks on dean management option

@US_05_TC_001

Scenario: Admin should be able to see Name, Gender, Phone Number, SSN and User Name information of Deans

  Then Admin verify to see Name of Deans
  Then Admin verify to see Gender of Deans
  Then Admin verify to see Phone Number of Deans
  Then Admin verify to see SSN of Deans
  Then Admin verify to see User Name of Deans
  And close the application

@US_05_TC_002
Scenario: Admin should be able to delete Deans
  Then Click on Delete button
  Then Admin verify that Dean was deleted
  And close the application



@US_05_TC_003
Scenario: Admin should be able to update Deans
  Then click the "edit" button
  Then Enters different data into name field in the edit window
  Then click the submit button in the edit window
  Then close the edit window
  Then verify that Dean's name has been updated
  And close the application


