@US21_DB
Feature: Students, choose lesson, grades and announcement (DB)

  Background: Given connect to the database

  Scenario Outline: Get Student's Chosen Lessons

    Then get guest_user via name "<name>"
    And the body contains birth_day "<birth_day>" , birth_place "<birth_place>" , gender "<gender>" , name "<name>", phone_number "<phone_number>", ssn "<ssn>", surname "<surname>", username "<username>"
    Examples:
      | name    | birth_day  | birth_place | gender | phone_number | ssn         | surname | username  |
      |ibr      |2011-11-11  |UK           |0       |(555)3231234  |127-65-4321  |can      |ibrcan07   |

  Scenario Outline: Get Student's Grades

    Then get student_id via username "<username>"
    Then get student_info via student_id "<student_id>"
    And body contains lesson_name "<lesson_name>", absentee "<absentee>", midterm_exam "<midterm_exam>", final_exam "<final_exam>", letter_grade "<note>", exam_average "<exam_average>", letter_grade "<letter_grade>", info_note ",info_note>",
    Examples:
      | username | midterm_exam    | final_exam  |exam_average    | letter_grade |
      | cramer07 |88               |99           |94.5999984741211|AA            |

    # Lesson Name	Absentee	Midterm Exam	Final Exam	Note	Info Note	Average

  Scenario Outline: Get Student's Grades

    Then get student_id via username "<username>"
    Then get student grades info via student_id "<student_id>"
    And body contains lesson_name "<lesson_name>", absentee "<absentee>", midterm_exam "<midterm_exam>", final_exam "<final_exam>", letter_grade "<note>", exam_average "<exam_average>", letter_grade "<letter_grade>", info_note ",info_note>",
    Examples:
      | username | lesson_name | absentee | midterm_exam | final_exam | letter_grade | info_note       | exam_average |
      | cramer07 | Java        | 11       | 88           | 99         | AA           | He really crams | 94.6         |

    # Lesson Name	Absentee	Midterm Exam	Final Exam	Note	Info Note	Average

  Scenario Outline: Get Student's Meeting Announcement

    Then get advisor_teacher_id via username "<username>"
    Then get student meeting info via advisor_teacher_id "<advisor_teacher_id>"
    And the body contains date "<date>" , start_time "<start_time>" , stop_time "<stop_time>" , description "<description>"
    Examples:
      | date                     | start_time                | stop_time               | description |
      | Nov 9, 2024, 12:00:00 AM | Jan 1, 1970, 10:43:00 AM  | Jan 1, 1970, 1:00:00 PM | Graduation  |
