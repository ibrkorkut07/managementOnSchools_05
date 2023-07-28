@US17_TC01_ApiTest


Feature: Get the student info and validate

  Scenario Outline: US17_GetStudentAdmin

    Given send the request as admin by id "<id>"
    And body should contains id "<id>",midtermEXam "<midtermExam>", finalExam "<finalExam>", absentee"<absentee>", infoNote"<infoNote>", lessonName"<lessonName>", creditScore "<creditScore>","<educationTerm>" , average "<average>", compulsory <compulsory>, note "<note>"
    Examples:
      | id  | midtermExam | finalExam | absentee | infoNote   | lessonName | creditScore | educationTerm   | average | compulsory | note |
      | 889 | 90.0        | 90.0      | 2        | successful | Java       | 10          | SPRING_SEMESTER | 90.0    | true       | AA   |