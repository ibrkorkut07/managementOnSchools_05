Feature: US21 Students, choose lesson, grades and announcement (API)

  @US21_Api @Api
  Scenario Outline: US21 TC01 Get Student's Grades

    Given Send get Student Info List request by student_id "<student_id>"
    Then Student Info List body should contain id "<id>", absentee "<absentee>", midterm_exam "<midterm_exam>", final_exam "<final_exam>", letter_grade "<letter_grade>", info_note "<info_note>", exam_average "<exam_average>"
    Examples:
      | username | student_id | lesson_name | id   | absentee | midterm_exam | final_exam | letter_grade | info_note       | exam_average |
      | cramer07 | 1165       | Java        | 780  | 11       | 88.0         | 99.0       | AA           | He really crams | 94.6         |

    # lesson_name | absentee | midterm_exam | final_exam | letter_grade | info_note       | exam_average |

  @US21_Api @Api
  Scenario Outline: US21 TC02 Get Student's Meeting Announcement

    And Send get Meet List request by meet_id "<meet_id>"
    And Meet List body contains date "<date>" , startTime "<start_time>" , stopTime "<stopTime>" , description "<description>"
    Examples:
      | username | meet_id | date       | start_time | stopTime  | description |
      | cramer07 | 750     | 2024-11-09 | 10:43:00   | 13:00:00   | Graduation  |

    # Date   Start Time   Stop Time   Description

  @US21_Api @Api
  Scenario Outline: US21 TC03 Get Student's Chosen Lessons

    Then Send get Lesson Program List request via lesson_program_id "<lesson_program_id>"
    And Lesson Program List body contains lessonName "<lessonName>", day "<day>", startTime "<startTime>", stopTime "<stopTime>"
    Examples:
      | student_id | username | lesson_program_id | lessonName | day       | startTime | stopTime  |
      | 1165       | cramer07 | 1222              | Java       | MONDAY    | 12:00:00   | 13:00:00   |
      | 1165       | cramer07 | 5                 | Selenium   | FRIDAY    | 10:00:00   | 12:00:00   |
      | 1165       | cramer07 | 4                 | Phyton     | THURSDAY  | 10:00:00   | 12:00:00   |
      | 1165       | cramer07 | 7                 | JavaScript | WEDNESDAY | 00:00:00   | 14:00:00   |
      | 1165       | cramer07 | 15                | English    | TUESDAY   | 08:45:00   | 10:45:00   |
      | 1165       | cramer07 | 14                | Java       | MONDAY    | 12:31:00   | 14:33:00   |
      | 1165       | cramer07 | 1709              | English    | WEDNESDAY | 08:00:00   | 09:00:00   |

    # Lesson   Day   Start Time   Stop Time

    # 1222  5   4   7   15   14   1709