@US_15_API
Feature: Get the student by name and validate the credentials

  @US_15_API_PositiveTest
  Scenario Outline: Get student by name
    Given send the get request by name "<name>"
    Then body should contains username "<username>", name "<name>",surname "<surname>",birthDay "<birthDay>", birthPlace "<birthPlace>",phoneNumber "<phoneNumber>",gender "<gender>",studentNumber "<studentNumber>",motherName "<motherName>",fatherName "<fatherName>",email "<email>",active "<active>"
    Examples:
      | name  | username       | surname | birthDay   | birthPlace | phoneNumber  | gender | studentNumber | motherName | fatherName | email                    | active |
      | Korey | brande.streich | Gaylord | 1994-08-15 | USA        | 437-114-5410 | MALE   | 2252          | Frederic   | Eldon      | hugo.gutmann@hotmail.com | true   |

  @US_15_API_NegativeTest
  Scenario: Not get student by non-existing name
    Given send the get request by name "korii"
    Then the body should be empty with non-existing name "korii"

