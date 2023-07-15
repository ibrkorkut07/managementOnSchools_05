@US08_TC01_ApiTest
Feature: Get the lesson and validate

  Scenario Outline: US08_GetLessonByLessonName

    Given send the request "<lessonName>"
    And body should contains compulsory "<compulsory>" , creditScore "<creditScore>"
    Examples:
      | lessonName  | compulsory  | creditScore |
      |Cypress        |1           |10           |
