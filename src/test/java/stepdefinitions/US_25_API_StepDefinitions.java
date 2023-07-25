package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class US_25_API_StepDefinitions extends ManagementonSchoolBaseUrl {
  Response response;

    @Given("user should send the get request by name {string}")
    public void userShouldSendTheGetRequestByName(String name) {
        // Set the url

        //https://managementonschools.com/app/students/getStudentByName?name=Sharmaine

        setUpAdmin();

        spec3.pathParams("first","students","second","getStudentByName").queryParam("name","Sharmaine");

        // Set the expected data ,   i already prepared in feature file my expected data for student Sharmaine.


        //    Response response = given(spec2).header("Autorization","Bearer :eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJQcm9qZWN0MDlBZG1pbiIsImlhdCI6MTY5MDI4Mzc2OCwiZXhwIjoxNjkwMjkyNDA4fQ.CcJGFvBrZyO2IdbMWqjwsz18PdoxdExpagRuXwWrcbQkxZtq7qkVYpf-kK-CesVcRHr7bTrqTOZ_Hh2Tfx39Tg").get("{first}/{second}");
        //    This is not recommended way, we have to add token to spec so i created for admin token spec3

        response = given(spec3).get("{first}/{second}");
        response.prettyPrint();
    }

    @Then("the body should be contains birth_day {string} , birth_place {string} , gender {string} , name {string}, phone_number {string}, surname {string}, username {string}")
    public void the_body_should_be_contains_birth_day_birth_place_gender_name_phone_number_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String surname, String username) {
   // Do assertion
     JsonPath actualData = response.jsonPath();

        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(birth_day,actualData.getList("birthDay").get(0));
        Assert.assertEquals(birth_place,actualData.getList("birthPlace").get(0));
        Assert.assertEquals(gender,actualData.getList("gender").get(0));
        Assert.assertEquals(name,actualData.getList("name").get(0));
        Assert.assertEquals(phone_number,actualData.getList("phoneNumber").get(0));
        Assert.assertEquals(surname,actualData.getList("surname").get(0));
        Assert.assertEquals(username,actualData.getList("username").get(0));

    }

}
