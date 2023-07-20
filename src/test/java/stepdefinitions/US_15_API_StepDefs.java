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

public class US_15_API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;

    @Given("send the get request by name {string}")
    public void send_the_get_request_by_name(String name) {
//        Set the url
//        https://managementonschools.com/app/students/getStudentByName?name=Korey
        setUpViceDean();
        spec2.pathParams("first","students","second","getStudentByName").queryParam("name",name);
//        Send the request and get the response
        response=given(spec2).get("{first}/{second}");
        response.prettyPrint();

    }


    @Then("body should contains username {string}, name {string},surname {string},birthDay {string}, birthPlace {string},phoneNumber {string},gender {string},studentNumber {string},motherName {string},fatherName {string},email {string},active {string}")
    public void bodyShouldContainsUsernameNameSurnameBirthDayBirthPlaceGenderStudentNumberMotherNameFatherNameEmailActive(String username, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String studentNumber, String motherName, String fatherName, String email, String active) {
//      Do Assertion
        JsonPath actualData = response.jsonPath();
        Assert.assertEquals(200,response.statusCode());
        Assert.assertEquals(username,actualData.getList("username").get(0));
        Assert.assertEquals(name,actualData.getList("name").get(0));
        Assert.assertEquals(surname,actualData.getList("surname").get(0));
        Assert.assertEquals(birthDay,actualData.getList("birthDay").get(0));
        Assert.assertEquals(birthPlace,actualData.getList("birthPlace").get(0));
        Assert.assertEquals(phoneNumber,actualData.getList("phoneNumber").get(0));
        Assert.assertEquals(gender,actualData.getList("gender").get(0));
        Assert.assertEquals(motherName,actualData.getList("motherName").get(0));
        Assert.assertEquals(fatherName,actualData.getList("fatherName").get(0));
        Assert.assertEquals(email,actualData.getList("email").get(0));
        Assert.assertEquals(active,actualData.getList("active").get(0).toString());

    }
    @Then("the body should be empty with non-existing name {string}")
    public void theBodyShouldBeEmptyWithNonExistingName(String name) {
        List<Objects> responseData = response.jsonPath().getList("findAll{it.name=='"+name+"'}");
        Assert.assertTrue(responseData.isEmpty());

    }
}
