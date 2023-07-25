package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.TestCase;

import java.util.List;
import java.util.Objects;

import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_21_API_RegistrationStepDefs {
    Response response;

    @Given("Send get Student Info List request by student_id {string}")
    public void sendGetStudentInfoListRequestByStudent_id(String arg0) {

        //Set the url : https://managementonschools.com/app/studentInfo/getByStudentId/1165
        spec.pathParams("first", "studentInfo", "second", "getByStudentId", "third", "1165");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        // response.prettyPrint();
    }

    @Then("Student Info List body should contain id {string}, absentee {string}, midterm_exam {string}, final_exam {string}, letter_grade {string}, info_note {string}, exam_average {string}")
    public void studentInfoListBodyShouldContainIdAbsenteeMidterm_examFinal_examLetter_gradeInfo_noteExam_average(String id, String absentee, String midterm_exam, String final_exam, String letter_grade, String info_note, String exam_average) {
        // Assert
        JsonPath jsonPath = response.jsonPath();

        String actId = jsonPath.getList("id").get(0).toString();
        String actAbsentee = jsonPath.getList("absentee").get(0).toString();
        String actMidterm_exam = jsonPath.getList("midtermExam").get(0).toString();
        String actFinal_exam = jsonPath.getList("finalExam").get(0).toString();
        String actLetter_grade = jsonPath.getList("note").get(0).toString();
        String actInfo_note = jsonPath.getList("infoNote").get(0).toString();
        String actExam_average = jsonPath.getList("average").get(0).toString();

        assertEquals(200, response.statusCode());
        assertEquals(id, actId);
        assertEquals(absentee, actAbsentee);
        assertEquals(midterm_exam, actMidterm_exam);
        assertEquals(final_exam, actFinal_exam);
        assertEquals(letter_grade, actLetter_grade);
        assertEquals(info_note, actInfo_note);
        assertEquals(exam_average, actExam_average);

        /*   [   {
        "id": 780,
        "midtermExam": 88.0,
        "finalExam": 99.0,
        "absentee": 11,
        "infoNote": "He really crams",
        "lessonName": "Java",
        "creditScore": 10,
        "educationTerm": "SPRING_SEMESTER",
        "average": 94.6,
        "studentResponse": {
            "userId": 1165,
            "username": "cramer07",
            "name": "cram",
            "surname": "cramer",
            "birthDay": "2011-11-11",
            "birthPlace": "uk",
            "phoneNumber": "555-111-7755",
            "gender": "MALE",
            "studentNumber": 2158,
            "motherName": "cramsmother",
            "fatherName": "cramsfather",
            "email": "cramer@gmail.com",
            "active": true
        },
        "compulsory": true,
        "note": "AA"   }   ]   */
    }

    @And("Send get Meet List request by meet_id {string}")
    public void sendGetMeetListRequestByMeet_id(String arg0) {
        //Set the url : https://managementonschools.com/app/meet/getMeetById/750
        spec.pathParams("first", "meet", "second", "getMeetById", "third", "750");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        // response.prettyPrint();
    }

    @And("Meet List body contains date {string} , startTime {string} , stopTime {string} , description {string}")
    public void meetListBodyContainsDateStartTimeStopTimeDescription(String date, String startTime, String stopTime, String description) {
        // Assert
        JsonPath jsonPath = response.jsonPath();

        String actDate = jsonPath.get("object.date").toString();
        String actStartTime = jsonPath.get("object.startTime").toString();
        String actStopTime = jsonPath.get("object.stopTime").toString();
        String actDescription = jsonPath.get("object.description").toString();

        assertEquals(200, response.statusCode());
        assertEquals(date, actDate);
        assertEquals(startTime, actStartTime);
        assertEquals(stopTime, actStopTime);
        assertEquals(description, actDescription);
        /*      "id": 750,
        "description": "Graduation",
        "date": "2024-11-09",
        "startTime": "10:43:00",
        "stopTime": "13:00:00",
        "advisorTeacherId": 1582,
        "teacherName": "Javan",
        "teacherSsn": "187-65-7788",
        "students":    */
    }

    @Then("Send get Lesson Program List request via lesson_program_id {string}")
    public void sendGetLessonProgramListRequestViaLesson_program_id(String lesson_program_id) {
        //Set the url : https://managementonschools.com/app/lessonPrograms/getById/1222
        spec.pathParams("first", "lessonPrograms", "second", "getById", "third", ""+lesson_program_id+"");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        // response.prettyPrint();
    }

    @And("Lesson Program List body contains lessonName {string}, day {string}, startTime {string}, stopTime {string}")
    public void lessonProgramListBodyContainsLessonNameDayStartTimeStopTime(String lessonName, String day, String startTime, String stopTime) {
        // Assert
        JsonPath jsonPath = response.jsonPath();

        String actLessonName = jsonPath.getList("lessonName.lessonName").get(0).toString();
        String actDay = jsonPath.get("day").toString();
        String actStartTime = jsonPath.get("startTime").toString();
        String actStopTime = jsonPath.get("stopTime").toString();

        assertEquals(200, response.statusCode());
        assertEquals(lessonName, actLessonName);
        assertEquals(day, actDay);
        assertEquals(startTime, actStartTime);
        assertEquals(stopTime, actStopTime);

                /*   {
                "lessonProgramId": 1222,
                "startTime": "12:00:00",
                "stopTime": "13:00:00",
                "lessonName": [
        {               "lessonId": 2,
                        "lessonName": "Java",
                        "creditScore": 10,
                        "compulsory": true   }
                ],
                "day": "WEDNESDAY"   }   */
    }

}