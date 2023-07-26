package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Objects;

import static base_urls.ManagementonSchoolBaseUrl.setUp;
import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class US_18_API_StepDefs {

    Response response;

    @Given("send the request as admin by id {string}")
    public void send_the_request_as_admin_by_id(String id) {

        //Set the url
        //https://managementonschools.com/app/studentInfo/getAllForAdmin?page=1&size=30
        setUp();
        spec.pathParams("first", "studentInfo", "second", "getAllForAdmin").queryParams("page","1","size","60");


        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        //response.prettyPrint();

    }


    @And("body should contains id {string},midtermEXam {string}, finalExam {string}, absentee{string}, infoNote{string}, lessonName{string}, creditScore {string},{string} , average {}, compulsory {}, note {string}")
    public void bodyShouldContainsIdMidtermEXamFinalExamAbsenteeInfoNoteLessonNameCreditScoreAverageCompulsoryNote(String id, String midtermExam, String finalExam, String absentee, String infoNote, String lessonName, String creditScore, String educationTerm, String average, String compulsory, String note) {

        //Do assertion
        JsonPath jsonPath = response.jsonPath();
        String actMidtermExam = jsonPath.getList("content.findAll{it.id=="+id+"}.midtermExam").get(0).toString();
        String actFinalExam = jsonPath.getList("content.findAll{it.id=="+id+"}.finalExam").get(0).toString();
        String actAbsentee = jsonPath.getList("content.findAll{it.id=="+id+"}.absentee").get(0).toString();
        String actInfoNote = jsonPath.getList("content.findAll{it.id=="+id+"}.infoNote").get(0).toString();
        String actLessonName = jsonPath.getList("content.findAll{it.id=="+id+"}.lessonName").get(0).toString();
        String actCreditScore = jsonPath.getList("content.findAll{it.id=="+id+"}.creditScore").get(0).toString();
        String actEducationTerm = jsonPath.getList("content.findAll{it.id=="+id+"}.educationTerm").get(0).toString();
        String actCompulsory = jsonPath.getList("content.findAll{it.id=="+id+"}.compulsory").get(0).toString();
        String actNote = jsonPath.getList("content.findAll{it.id=="+id+"}.note").get(0).toString();

        assertEquals(200,response.statusCode());
        assertEquals(midtermExam,actMidtermExam);
        assertEquals(finalExam,actFinalExam);
        assertEquals(absentee,actAbsentee);
        assertEquals(infoNote,actInfoNote);
        assertEquals(lessonName,actLessonName);
        assertEquals(creditScore,actCreditScore);
        assertEquals(educationTerm,actEducationTerm);
        assertEquals(compulsory,actCompulsory);
        assertEquals(note,actNote);


    }


    @Then("body should be empty in the student info list with non existing {string}")
    public void bodyShouldBeEmptyInTheStudentInfoListWithNonExisting(String id) {

        List<Objects> dataList = response.jsonPath().getList("content.findAll{it.id=='"+id+"'}");
        assertEquals(0,dataList.size());
    }
}
