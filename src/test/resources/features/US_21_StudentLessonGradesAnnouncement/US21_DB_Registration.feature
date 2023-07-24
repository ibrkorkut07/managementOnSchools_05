@US21_DB
Feature: Students, choose lesson, grades and announcement (DB)

  Background: connect to the database
    Given connect to school database

  Scenario Outline: Get Student's Grades

    Then get student_id via username "<username>"
    Then get student_info via username "<username>"
    And body contains id "<id>", absentee "<absentee>", midterm_exam "<midterm_exam>", final_exam "<final_exam>", letter_grade "<letter_grade>", info_note "<info_note>", exam_average "<exam_average>"
    # Then see lesson_name "<lesson_name>" via id "<id>"
    Examples:
      | username | student_id | lesson_name | id   | absentee | midterm_exam | final_exam | letter_grade | info_note       | exam_average |
      | cramer07 | 1165       | Java        | 780  | 11       | 88           | 99         | AA           | He really crams | 94.6         |

    # Lesson Name	 Absentee   Midterm Exam   Final Exam   Note   Info Note   Average

  Scenario Outline: Get Student's Meeting Announcement

    # Then get meet_id "<meet_id>" via username "<username>"
    # Then get meet info by meet_id "<meet_id>"
    And get meet info by username "<username>"
    And the body contains date "<date>" , start_time "<start_time>" , stop_time "<stop_time>" , description "<description>"
    Examples:
      | username | meet_id | date       | start_time | stop_time  | description |
      | cramer07 | 750     | 2024-11-09 | 10:43:00   | 13:00:00   | Graduation  |

    # Date   Start Time   Stop Time   Description

  Scenario Outline: Get Student's Chosen Lessons

    Then Get lesson_program_id via student_id "<student_id>"
    Then get chosen lesson_program_id "<lesson_program_id>" via student_id "<student_id>"
    # Then get chosen lesson "<lesson>" via chosen lesson_program_id "<lesson_program_id>"
    And get Lesson Program List via lesson_program_id "<lesson_program_id>"
    And the body contains lesson "<lesson>", day "<day>", start_time "<start_time>", stop_time "<stop_time>"
    Examples:
      | student_id | username | lesson_program_id | lesson     | day       | start_time | stop_time  |
      | 1165       | cramer07 | 1222              | Selenium   | MONDAY    | 12:00:00   | 13:00:00   |
#      | 1165       | cramer07 | 1222              | Selenium   | FRIDAY    | 12:00:00   | 01:00:00   | # as in DB
      | 1165       | cramer07 | 5                 | Selenium   | FRIDAY    | 10:00:00   | 12:00:00   |
      | 1165       | cramer07 | 4                 | Python     | THURSDAY  | 10:00:00   | 12:00:00   |
      | 1165       | cramer07 | 7                 | JavaScript | WEDNESDAY | 00:00:00   | 14:00:00   |
#      | 1165       | cramer07 | 7                 | JavaScript | WEDNESDAY | 12:00:00   | 14:00:00   |  # as in DB
      | 1165       | cramer07 | 15                | English    | TUESDAY   | 08:45:00   | 10:45:00   |
      | 1165       | cramer07 | 14                | Java       | MONDAY    | 12:31:00   | 14:33:00   |
      | 1165       | cramer07 | 1709              | English    | WEDNESDAY | 08:00:00   | 09:00:00   |

    # Lesson   Day   Start Time   Stop Time

  # 1222  5   4   7   15   14   1709
