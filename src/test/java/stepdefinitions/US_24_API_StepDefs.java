package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_24_API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;


    @Given("Send the get request by name {string}")
    public void sendTheGetRequestByName(String name) {
        //Set the url
        //https://managementonschools.com/app/teachers/getTeacherByName?name=Fairy
        spec.pathParams("first","teachers","second","getTeacherByName").queryParam("name","Fairy");

        //Send the request and get the response
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Body must contain username {string}, name {string}, surname {string},birthDay {string}, birthPlace {string},phoneNumber {string},gender {string},email {string}")
    public void body_must_contain_username_name_surname_birth_day_birth_place_phone_number_gender_email(String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String email) {

        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(username,actualData.getList("username").get(0));
        System.out.println(actualData.getList("username"));
        Assert.assertEquals(name,actualData.getList("name").get(0));
        Assert.assertEquals(surname,actualData.getList("surname").get(0));
        Assert.assertEquals(birthDay,actualData.getList("birthDay").get(0));
        Assert.assertEquals(birthPlace,actualData.getList("birthPlace").get(0));
        Assert.assertEquals(phoneNumber,actualData.getList("phoneNumber").get(0));
        Assert.assertEquals(gender,actualData.getList("gender").get(0));
        Assert.assertEquals(email,actualData.getList("email").get(0));

    }
}
