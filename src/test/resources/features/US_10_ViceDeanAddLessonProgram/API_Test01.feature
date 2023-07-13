@US10_API
Feature: Get the program lesson and validate the credentials

  @US10_API_PositiveTest
  Scenario Outline: US10_GetLessonProgramById
    Given send get request by lessonprogramid "<lessonProgramId>"
    Then body should contain lesson "<lesson>", education term "<education term>", day "<day>",start time "<start time>", end time "<end time>"
    Examples:
      | lessonProgramId | lesson   | education term  | day      | start time | end time |
      | 1067            | Selenium | SPRING_SEMESTER | THURSDAY | 12:10:00   | 12:48:00 |

  @US10_API_NegativeTest
  Scenario Outline: US10_NotGetLessonProgramByIdWithoutEntering
    Given send get request by lessonprogramid "<lessonProgramId>"
    Then in response body status code must be 404 with non existing lessonprogramid "<lessonProgramId>"
    Examples:
      | lessonProgramId |
      | 0000000         |






