@US13_API
Feature: Get the program lesson and validate the credentials

  @US13_API_PositiveTest
  Scenario Outline: US13_GetCreatedTeacherByName
    Given send get request by name "<name>"
    Then body should contain username "<username>", name "<name>", surname "<surname>",birthDay "<birthDay>", birthPlace "<birthPlace>",phoneNumber "<phoneNumber>",gender "<gender>",email "<email>"
    Examples:
      | name | username | surname | birthDay | birthPlace | phoneNumber | gender | email |
      | mr.john | mr.john  | dyson   | 1992-12-12 | usa        | 456-123-8901 | MALE   | mr.john@abcdef.com |


  @US13_API_NegativeTest
  Scenario Outline: US13_NotGetCreatedTeacherByName
    Given send get request by name "<name>"
    Then body must be empty with non-existing "<name>"
    Examples:
      | name   |
      | mrjohn |



