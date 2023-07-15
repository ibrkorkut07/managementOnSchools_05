package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;


public class US_08_API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;
    @Given("send the request {string}")
    public void send_the_request(String lessonName) {

        //Set the url
        //https://managementonschools.com/app/dean/getAll
        setUp();
        spec.pathParams("first","lessons","second","getLessonByName").queryParam("lessonName","Cypress");
//


        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }
    @Given("body should contains compulsory {string} , creditScore {string}")
    public void body_should_contains_compulsory_credit_score(String string, String string2) {
        response.
                then().
                statusCode(200)
                .body("object.lessonName", equalTo("Cypress"),
                "object.creditScore", equalTo(10),
                        "object.compulsory", equalTo(true));
    }

}


