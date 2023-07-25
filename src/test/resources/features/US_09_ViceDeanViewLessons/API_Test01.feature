@Us_09_Api_test

Feature: Admin should able to see the deleted lesson(Api)

  Scenario Outline: US_09_Get_deletedLesson_by_LessonName
    Given send get request by "<lessonName>" to get the deleted lesson
    Then  body should contains lessonName "<lessonName>",creditScore "<creditScore>",compulsory "<compulsory>"

    Examples:
      | lessonName | creditScore | compulsory |
      | Cypress    |  10       | true       |