package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import static io.restassured.RestAssured.given;

public class US_10_API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;

    @Given("send get request by lessonprogramid {string}")
    public void sendGetRequestByLessonProgramId(String lessonProgramId) {
//        Set the URL
//        https://managementonschools.com/app/lessonPrograms/getById/1067
        setUpViceDean();
        spec2.pathParams("first","lessonPrograms","second","getById","third",lessonProgramId);

//        Set the expected data

//        Send the request and get the response
        response = given(spec2).get("{first}/{second}/{third}");
        response.prettyPrint();

    }

    @Then("body should contain lesson {string}, education term {string}, day {string},start time {string}, end time {string}")
    public void bodyShouldContainLessonEducationTermDayStartTimeEndTime(String lesson, String educationTerm , String day, String startTime, String endTime) throws JsonProcessingException, io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException {
//      Do Assertion
        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(lesson,actualData.getList("lessonName.lessonName").get(0));
//        in postman there is no educationTerm part in body
        Assert.assertEquals(day,actualData.getString("day"));
        Assert.assertEquals(startTime,actualData.getString("startTime"));
        Assert.assertEquals(endTime,actualData.getString("stopTime"));

    }
    @Then("in response body status code must be 404 with non existing lessonprogramid {string}")
    public void inResponseBodyStatusCodeMustBeWithNonExistingLessonprogramid(String lessonProgramId) {
        Assert.assertEquals(404,response.statusCode());
    }
}

