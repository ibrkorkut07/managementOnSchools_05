package stepdefinitions;


import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.ObjectPojo;
import pojos.ResponsePersonnelPojo;

import java.util.List;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.US_06_DB_AddViceDeanStepDefs.id;
import static utilities.ObjectMapperUtils.convertJsonToJava;


public class US_06_API_AddViceDeanStepDefs extends ManagementonSchoolBaseUrl {


  Response response; // 10.07.2023
 ResponsePersonnelPojo actualData; // 10.07.2023


 @Given("user sends get request by existing id") // 10.07.2023
 public void user_sends_get_request_by_existing_id() {
  setUp();
  spec.pathParams("1st","dean","2nd","getManagerById","3rd",38);
  response = given(spec).get("{1st}/{2nd}/{3rd}");

  response.prettyPrint();
 } // 10.07.2023
 @Given("user sends get request by non existing id")  // 10.07.2023
 public void user_sends_get_request_non_by_existing_id() {
  setUp();
  spec.pathParams("1st","dean","2nd","getManagerById","3rd",39);
  response = given(spec).get("{1st}/{2nd}/{3rd}");

  response.prettyPrint();
 } // 10.07.2023

 @Then("body should contain birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}") // 10.07.2023
 public void body_should_contain_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) {

  ObjectPojo expectedData = new ObjectPojo(id,username,name,surname,birth_day,ssn,birth_place,phone_number,gender);
  ResponsePersonnelPojo actualData = convertJsonToJava(response.asString(),ResponsePersonnelPojo.class);

  assertEquals(200, response.statusCode());
  assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
  assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
  assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
  assertEquals(expectedData.getName(),actualData.getObject().getName());
  assertEquals(expectedData.getGender(),actualData.getObject().getGender());
  assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
  assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());


 } // 10.07.2023

 @Then("body must be empty with non existing username {string}") // 10.07.2023
 public void bodyMustBeEmptyWithNonExistingUsername(String username) {

  List<Objects> dataList = response.jsonPath().getList("content.findAll{it.username=='" + username + "'}");
  assertTrue(dataList.isEmpty());
 } // 10.07.2023


}

