package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;


public class US_05_API_TC02_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;


    @Given("send request by {string}")
    public void send_the_request_by(String id) {

        //Set the url
        //https://managementonschools.com/app/dean/getAll
        setUp();
        spec.pathParams("first","dean","second","getManagerById" , "third",3);
//


        //Send the request and get the response
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }
    @Given("body contains birth_day {string} , birth_place {string} , gender {string} , name {string}, phone_number {string}, ssn {string}, surname {string}")
    public void body_should_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) {

        //Do assertion

        response.
                then().
                statusCode(200)
                .body("object.username", equalTo("Mbarisd"),
                        "object.name",equalTo("Mustafa"),
                        "object.surname",equalTo("Baris"),
                        "object.birthDay",equalTo("1995-01-01"),
                        "object.ssn",equalTo("111-22-3333"),
                        "object.birthPlace", equalTo("Aksaray"),
                        "object.phoneNumber", equalTo("542-123-1234"),
                        "object.gender", equalTo("MALE"));


    }
}


