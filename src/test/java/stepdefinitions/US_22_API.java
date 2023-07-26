package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;

import static base_urls.ManagementonSchoolBaseUrl.setUp;
import static base_urls.ManagementonSchoolBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class US_22_API extends ManagementonSchoolBaseUrl {

    Response response;


    @Given("send the request for admin {string}")
    public void send_the_request_for_admin(String id) {

        //Set the url
        //https://managementonschools.com/app/admin/getAll?page=0&size=100&sort=name&type=desc
        setUp();
       response = given(spec).get("https://managementonschools.com/app/admin/getAll?page=0&size=100&sort=name&type=desc");

        response.prettyPrint();


    }



    @Given("body should contains id {string}, username {string}, birth_day {string} , birth_place {string} , gender {string} , name {string}, phone_number {string}, ssn {string}, surname {string}")
    public void body_should_contains_id_username_birth_day_birth_place_gender_name_phone_number_ssn_surname_built_in_built_in(String id, String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) {

               JsonPath jsonPath = response.jsonPath();
        List<String> actUserName =  jsonPath.getList("content.findAll{it.id=="+id+"}.username".toString());
        System.out.println(actUserName);
        String actualUsername= actUserName.get(0);

       assertEquals(username,actualUsername);
    }

    }






