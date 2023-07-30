@US_19API
Feature: US_19_The_teacher_should_be_able_to_create_meetings

  Scenario: TC_01_The_teacher_should_be_able_to_create_meetings
    When send post request for creating a meeting
#    Then validate the status code is {int}
  Scenario: TC_02_The_teacher_should_be_able_to_add_meetings(Negative test)
    When send post request with bad credentials for creating a meeting
#    Then validate the status code should be 400
    Then validate that response data include error messages