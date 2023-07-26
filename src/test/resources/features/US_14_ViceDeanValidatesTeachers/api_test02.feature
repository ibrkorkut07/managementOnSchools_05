@US14_API
Feature: Vice Dean should be able to see and update teachers

  @US14_API_PositiveTest
  Scenario Outline: US14_GetCreatedTeacherByName
    Given send get request by name "<name>"
    Then body should contain username "<username>", name "<name>", surname "<surname>",birthDay "<birthDay>", birthPlace "<birthPlace>",phoneNumber "<phoneNumber>",gender "<gender>",email "<email>"
    Examples:
      | name  | username  | surname | birthDay   | birthPlace  | phoneNumber  | gender | email                    | ssn         |
      | Ahmad | loan.feil | Quitzon | 1984-06-22 | Carrollside | 883-935-4045 | MALE   | ollie.conroy@hotmail.com | 350-20-9168 |
    #And user sends put request with id 290 to get response


