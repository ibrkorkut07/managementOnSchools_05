@US_10
Feature: Vice Dean should be able to create a lesson program

  Background: Sign in as vice dean
    Given user goes to "https://managementonschools.com"
    When user clicks on login button
    And user enters username "mrnice"
    And user enters password "12345678"
    And user clicks on login button

  @TC_01
  Scenario Outline:TC_01_adding_lesson_program_successfully
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean choose an education term "<education term>"
    And vice dean choose a day "<day>"
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify lesson program should be successfully created
    Examples:
      | lesson   | education term  | day      | start time | end time |
      | Selenium | SPRING_SEMESTER | THURSDAY | 12:07      | 12:48    |
      | Calculus | FALL_SEMESTER   | FRIDAY   | 09:10      | 11:30    |

  @TC_02
  Scenario Outline:TC_02_adding_lesson_program_without_selecting_course
    Given vice dean clicks on Lesson Program option
    When vice dean do not choose a lesson
    And vice dean choose an education term "<education term>"
    And vice dean choose a day "<day>"
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed indicating lessons must not empty message
    Examples:
      | lesson | education term  | day      | start time | end time |
      |        | SPRING_SEMESTER | THURSDAY | 12:07      | 12:48    |

#    @TC_02
#      Scenario:TC_02_adding_lesson_program_without_selecting_course
#        Given vice dean clicks on Lesson Program option
#        When vice dean do not choose a lesson
#        And vice dean choose an education term "SPRING_SEMESTER"
#        And vice dean choose a day "THURSDAY"
#        And vice dean choose the start time "09:09" and end time "11:11" for the lesson
#        And vice dean clicks on the Submit button
#        Then verify an error message should be displayed

  @TC_03
  Scenario Outline:TC_03_adding_lesson_program_without_selecting_education_term
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean do not choose an education term
    And vice dean choose a day "<day>"
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed indicating please select education term message option
    Examples:
      | lesson   | education term | day      | start time | end time |
      | Selenium |                | THURSDAY | 12:07      | 12:48    |

#    @TC_03
#    Scenario:TC_03_adding_lesson_program_without_selecting_education_term
#        Given vice dean clicks on Lesson Program option
#        When vice dean choose a lesson "Selenium"
#        And vice dean do not choose an education term
#        And vice dean choose a day "THURSDAY"
#        And vice dean choose the start time "09:09" and end time "11:11" for the lesson
#        And vice dean clicks on the Submit button
#        Then verify an error message should be displayed indicating "Please select eduacation term"

  @TC_04
  Scenario Outline:TC_04_adding_lesson_program_without_selecting_day
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean choose an education term "<education term>"
    And vice dean do not choose a day
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed indicating you have entered invalid value message
    Examples:
      | lesson   | education term  | day      | start time | end time |
      | Selenium | SPRING_SEMESTER | THURSDAY | 12:07      | 12:48    |

#    @TC_04
#      Scenario:TC_04_adding_lesson_program_without_selecting_day
#        Given vice dean clicks on Lesson Program option
#        When vice dean choose a lesson "Selenium"
#        And vice dean choose an education term "SPRING_SEMESTER"
#        And vice dean do not choose a day
#        And vice dean choose the start time "09:09" and end time "11:11" for the lesson
#        And vice dean clicks on the Submit button
#        Then verify an error message should be displayed

  @TC_05
  Scenario Outline:TC_05_adding_lesson_program_without_start_and_end_time
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean choose an education term "<education term>"
    And vice dean choose a day "<day>"
    And vice dean do not choose the start time and end time for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed indicating required message
    Examples:
      | lesson   | education term  | day      | start time | end time |
      | Selenium | SPRING_SEMESTER | THURSDAY | 12:07      | 12:48    |

#    @TC_05
#      Scenario:TC_05_adding_lesson_program_without_start_and_end_time
#        Given vice dean clicks on Lesson Program option
#        When vice dean choose a lesson "Selenium"
#        And vice dean choose an education term "SPRING_SEMESTER"
#        And vice dean choose a day "THURSDAY"
#        And vice dean do not choose the start time and end time for the lesson
#        And vice dean clicks on the Submit button
#        Then verify an error message should be displayed

  @TC_06
  Scenario Outline:TC_06_adding_same_lesson_program
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean choose an education term "<education term>"
    And vice dean choose a day "<day>"
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed
    Examples:
      | lesson   | education term  | day      | start time | end time |
      | Selenium | SPRING_SEMESTER | THURSDAY | 12:07      | 12:48    |

  @TC_07
  Scenario Outline: TC_07_adding_lesson_program_stop_time_before_start_time
    Given vice dean clicks on Lesson Program option
    When vice dean choose a lesson "<lesson>"
    And vice dean choose an education term "<education term>"
    And vice dean choose a day "<day>"
    And vice dean choose the start time "<start time>" and end time "<end time>" for the lesson
    And vice dean clicks on the Submit button
    Then verify an error message should be displayed indicating Error: start time must not be greater than or equal to stop time message
    Examples:
      | lesson   | education term  | day      | start time | end time |
      | Selenium | SPRING_SEMESTER | THURSDAY | 05:07      | 04:06    |
