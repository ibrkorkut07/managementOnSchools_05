@US_06_API
Feature: US_06 Dean should be able to create Vice Dean


  @US_06_TC_001_API
  Scenario: TC_001 User can create Vice Dean by entering required credentials "Positive Test"
    Given  user sends post request with all required credentials
    Then   verify that new Vice Dean is created
  @US_06_TC_002_API
  Scenario: TC_002 User can NOT create Vice Dean by entering required credentials except "Name" "Negative Test"
    Given  user sends post request with all required credentials except name
    Then   verify that new Vice Dean is not created













