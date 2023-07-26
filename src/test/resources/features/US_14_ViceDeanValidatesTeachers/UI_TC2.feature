@US_14_TC_002
Feature: US_14 Vice Dean should be able to see and update teachers

Background: Sign in as vice dean
Given user goes to "MosUrl"
When user clicks on login button
And user enters username "MydeanQuyash1"
And user enters password "12345678"
And user clicks on login button to inter.


Scenario Outline: The teacher information in the ‘Teacher List’ should be able to be updated for Vice Deans. (Choose Lessons, Name, Surname, Birth Place, e-mail, phone, is Advisor Teacher, Gender,  Date of Birth, SSN, Username and Password)And user enter "<lesson>"
  When User clicks on Menu button of education term management page.
  And User clicks on the Teacher Management option from Main Menu window
  And vice dean enter "<lesson>"
  And vice dean enter "<name>","<surname>"
  And vice dean enter "<birthplace>" , "<email>" , "<phonenumber>"
 And vice dean choose gender
  And vice dean enter "<dateofbirth>", "<ssn>", "<username>" and "<password>"
 And vice dean click on the submitt button
  Then verify teacher saved successfully
  And user click the edit button
  And vice dean choose "lesson".
  And Enters different data into "name" and "surname" field in edit window
  And vice dean choose "gender" from edith window
  And vice dean enter  "password" to edith window
  And user click the submit button in the edit window
  And user clicks on close sign of edit window
  Then verify that teachers "name" and "surname" has been updated


Examples:
  | lesson | name | surname | birthplace | email           | phonenumber  | dateofbirth | ssn         | username | password |
  | Java   | Khan | Jan     | India      | Jan11@gmail.com | 111-676-4584 | 02-11-1976  | 445-56-3373 | AliJan11 | 12345678 |


