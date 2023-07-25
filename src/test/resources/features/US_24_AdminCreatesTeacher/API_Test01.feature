@US24_API
Feature: Get the teacher by name and validate

  Scenario Outline: US24_GetTheTeacherByName
    Given Send the get request by name "<name>"
    Then Body must contain username "<username>", name "<name>", surname "<surname>",birthDay "<birthDay>", birthPlace "<birthPlace>",phoneNumber "<phoneNumber>",gender "<gender>",email "<email>"
    Examples:
      | name  | username         | surname    | birthDay   | birthPlace | phoneNumber  | gender | email                   |
      | Fairy | morton.abernathy | Wintheiser | 1988-11-11 | Greece     | 598-924-1518 | FEMALE | rueben.schoen@yahoo.com |
