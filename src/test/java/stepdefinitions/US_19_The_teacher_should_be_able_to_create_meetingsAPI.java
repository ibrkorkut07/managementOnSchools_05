package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.LessonObjectPojo;
import pojos.LessonPojo;
import pojos.MeetPostPojo;
import utilities.FakerUtils;
import utilities.JsonUtils;
import utilities.ReusableMethods;
import java.util.ArrayList;
import static base_urls.ManagementonSchoolBaseUrl.spec;
import static base_urls.ManagementonSchoolBaseUrl.teacherSetUp;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_19_The_teacher_should_be_able_to_create_meetingsAPI {

    /*
    {
      "date": "yyyy-MM-dd",
      "description": "string",
      "startTime": "HH:mm:mm",
      "stopTime": "HH",
      "studentIds": [
        0
      ]
    }
     */
    Response response;
    MeetPostPojo postData;
    LessonPojo expectedData;
    LessonObjectPojo object;

    @When("send post request for creating a meeting")
    public void send_post_request_for_creating_a_meeting() {
        //set the url
        teacherSetUp();
        spec.pathParams("first", "meet", "second", "save");
        //set expected data
        ArrayList<Integer> studentId = new ArrayList<>();
        studentId.add(FakerUtils.teacherIDFaker());
        postData = new MeetPostPojo(
                "2024-07-30",
                "PP",
                FakerUtils.startTimeFaker(),
                FakerUtils.stopTimeFaker(),
                studentId);
        System.out.println("expectedData = " + postData);
        System.out.println("JsonUtils.convertJavaObjectToJson(expectedData) = " + JsonUtils.convertJavaObjectToJson(postData));
        expectedData = new LessonPojo(object, "Meet Saved Successfully", "CREATED");

        //Send the request and get the response
        response = given(spec).body(postData).post("{first}/{second}");
        response.prettyPrint();
        ReusableMethods.waitFor(2);

    }

    //assertion
    @Then("validate the status code is \\{int}")
    public void validate_that_status_code_is(Integer statusCode) {
        response.then().statusCode(statusCode);
        LessonPojo actualData = response.as(LessonPojo.class);
        assertEquals(expectedData.getMessage(), actualData.getMessage());
        assertEquals(expectedData.getHttpStatus(), actualData.getHttpStatus());

    }

    //Negative test
    @When("send post request with bad credentials for creating a meeting")
    public void send_post_request_for_creating_a_meeting_negative() {
        //set the url
        teacherSetUp();
        spec.pathParams("first", "meet", "second", "save");
        //set expected data
        ArrayList<Integer> studentId = new ArrayList<>();
        studentId.add(FakerUtils.teacherIDFaker());
        postData = new MeetPostPojo("30-07-2000", "PP", "12:00", "10:00", studentId);
        System.out.println("expectedData = " + postData);

        System.out.println("JsonUtils.convertJavaObjectToJson(expectedData) = " + JsonUtils.convertJavaObjectToJson(postData));
        expectedData = new LessonPojo(object, "Meet Saved Successfully", "CREATED");

        //Send the request and get the response
        response = given(spec).body(postData).post("{first}/{second}");
        response.prettyPrint();

    }
    //assertion

    @Then("validate that response data include error messages")
    public void validateThatResponseDataIncludeErrorMessages() {

        LessonPojo actualData = response.as(LessonPojo.class);
        System.out.println("actualData = " + actualData);

        assertTrue(response.prettyPrint().toLowerCase().contains("error"));
        assertTrue(actualData.getMessage().toLowerCase().contains("error"));
    }
}
