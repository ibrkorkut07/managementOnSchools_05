package stepdefinitions;


import base_urls.ManagementonSchoolBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import pojos.PostRequestPersonnelPojo;
import pojos.PostResponsePersonnelPojo;
import utilities.ObjectMapperUtils;

import static io.restassured.RestAssured.*;
import static junit.framework.TestCase.*;


public class US_06_API_AddViceDeanStepDefs extends ManagementonSchoolBaseUrl {
 String birthDay;
 String birthPlace;
 String gender;
 String name;
 String password;
 String phoneNumber;
 String ssn;
 String surname;
 String username;

 Response response;
 PostRequestPersonnelPojo expectedData;
 Integer userId;
 @Given("user sends post request with all required credentials")
 public void user_sends_post_request_with_all_required_credentials() {
  setUp();
  birthDay = "1998-09-02";
  birthPlace = Faker.instance().address().city();
  gender = Faker.instance().demographic().sex();
  name = Faker.instance().name().firstName();
  password = "Qa"+Faker.instance().number().digits(6);
  phoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  surname = Faker.instance().name().lastName();
  username = Faker.instance().name().username();

  expectedData = new PostRequestPersonnelPojo(birthDay,birthPlace,gender,name,password,phoneNumber,ssn,surname,username);
  System.out.println("expectedData = " + expectedData);
  /*
  spec.pathParams("1st","dean","2nd","save");
  response = given(spec).body(expectedData).post("{1st}/{2nd}");
  */
   spec.pathParams("1st","dean","2nd","getManagerById","3rd",723);
   response = given(spec).get("{1st}/{2nd}/{3rd}");

  response.prettyPrint();
 }
 @Then("verify that new Vice Dean is created")
 public void verify_that_new_vice_dean_is_created() {
 PostResponsePersonnelPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), PostResponsePersonnelPojo.class);
 userId = actualData.getObject().getUserId();
 assertEquals(200,response.statusCode());
 assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
 assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
 assertEquals(expectedData.getGender(),actualData.getObject().getGender());
 assertEquals(expectedData.getName(),actualData.getObject().getName());
 assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
 assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
 assertEquals(expectedData.getSurname(),actualData.getObject().getSurname());
 assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());
  System.out.println("actualData = " + actualData);
  System.out.println("userId = " + userId);
 }
 @Given("user sends post request with all required credentials except name")
 public void user_sends_post_request_with_all_required_credentials_except_name() {

 }
 @Then("verify that new Vice Dean is not created")
 public void verify_that_new_vice_dean_is_not_created() {

 }


}

