@Us_16_db
Feature: Validating the body of the contact messages and successful deletion of contact messages in the database.

  Scenario Outline: : US16_View_Contact_Messages
    Given user connects to the database using appropriate credentials.
    When user reads the message in the database using email "<email>" entry
    Then user asserts that message body contains date "<date>", email "<email>", message "<message>", name "<name>" and subject "<subject>"
    Examples:
      | email           | date       | message                 | name  | subject  |
      | ahmet@gmail.com | 2023-07-24 | Where is your location? | ahmet | location |

 # Scenario Outline: : US16_Delete_Contact_Messages
    #Given user connects to the database using appropriate credentials.
   # When user reads the message in the database using email "<email>" entry
    #Then user asserts that message body contains date "<date>", email "<email>", message "<message>", name "<name>" and subject "<subject>"
    #Then user asserts that the message is deleted in the database
  #  Examples:
   #   | email           | date       | message                 | name  | subject  |
    #  | ahmet@gmail.com | 2023-07-24 | Where is your location? | ahmet | location |