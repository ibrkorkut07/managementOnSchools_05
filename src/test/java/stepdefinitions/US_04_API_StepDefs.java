package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;


public class US_04_API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;


    @Given("send the request by id")
    public void send_the_request_by_id() {

        //Set the url

        //https://managementonschools.com/app/dean/getManagerById/499
        setUp();
        spec.pathParams("first","dean","second","getManagerById" , "third",540);


        //Set the expected data


        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();


    }

    @Then("validate the body")
    public void validate_the_body() {

        //Do assertion
        assertEquals(200, response.statusCode());


    }
}
