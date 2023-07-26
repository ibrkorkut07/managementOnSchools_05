package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.openqa.selenium.*;
import pages.CommonCredentialsPage;
import pages.MenuPage;
import pojos.ObjectPojo;
import pojos.ResponsePersonnelPojo;
import utilities.*;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;


import static io.restassured.RestAssured.given;
import static java.lang.Integer.parseInt;
import static java.text.DateFormat.getDateInstance;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;
import static utilities.DBUtils.closeConnection;
import static utilities.DBUtils.getResultSet;
import static utilities.JSUtils.clickWithTimeoutByJS;
import static utilities.MediaUtils.*;
import static utilities.ObjectMapperUtils.convertJsonToJava;
import static utilities.ReusableMethods.*;

public class US_06_23_AddViceDeanStepDefs extends ManagementonSchoolBaseUrl {
 CommonCredentialsPage CCPage = new CommonCredentialsPage();
 MenuPage menuPage = new MenuPage();
 public static String fakeUsername ;
 public static String fakeSsn ;
 public static String fakeName ;
 public static String fakeSurname;
 public static String fakeBirthPlace ;
 public static String fakeDateOfBirth;
 public static String fakePhoneNumber;
 public static String fakePassword;

 @Given("user fills all required credentials")
 public void user_fills_all_required_credentials() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995"; //new SimpleDateFormat("MM-dd-yyyy").format(Faker.instance().date().birthday());       // "1995-07-19";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  takeScreenshotOfTheEntirePage();
 }
 @Given("user clicks on submit button")
 public void user_clicks_on_submit_button() throws IOException {
  WaitUtils.waitForVisibility(CCPage.submit, 30).submit();

 }
 @Then("verify new Vice Dean is created")
 public void verify_new_vice_dean_is_created() {
  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),30);
  clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  try{assertTrue(actual.equals(fakeUsername));}catch(Exception e){ e.printStackTrace();}
 }
 @Given("user fills all required credentials except name")
 public void user_fills_all_required_credentials_except_name() {

  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  // WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  try {
   takeScreenshotOfTheEntirePage();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }
 }
 @Then("verify new Vice Dean is not created")
 public void verify_new_vice_dean_is_not_created() {

  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),30);
  clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  try{assertFalse(actual.equals(fakeUsername));}catch(Exception e){ e.printStackTrace();}
 }
 @Given("user fills all required credentials except surname")
 public void user_fills_all_required_credentials_except_surname()  {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  //WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  try {
   takeScreenshotOfTheEntirePage();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }
 }
 @Given("user fills all required credentials except birth place")
 public void user_fills_all_required_credentials_except_birth_place()  {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  //WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  try {
   takeScreenshotOfTheEntirePage();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }
 }
 @Given("user fills all required credentials except gender")
 public void user_fills_all_required_credentials_except_gender() {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  //WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  try {
   takeScreenshotOfTheEntirePage();
  } catch (IOException e) {
   throw new RuntimeException(e);
  }
 }
 @Given("user fills all required credentials except date of birth")
 public void user_fills_all_required_credentials_except_date_of_birth() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  //WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  takeScreenshotOfTheEntirePage();
 }
 @Given("user fills all required credentials except phone number")
 public void user_fills_all_required_credentials_except_phone_number() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  //WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  takeScreenshotOfTheEntirePage();
 }
 @Given("user fills all required credentials except username")
 public void user_fills_all_required_credentials_except_username() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(fakeSsn);
  //WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys(fakePassword);
  WaitUtils.waitFor(1);
  takeScreenshotOfTheEntirePage();
 }
 @Then("verify new Vice Dean is not created without username")
 public void verify_new_vice_dean_is_not_created_without_username() {
  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),30);
  clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[4]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  try {assertFalse(actual.equals(fakeUsername));}catch(Exception e){e.printStackTrace();}
 }
 @Given("user fills all required credentials except ssn")
 public void user_fills_all_required_credentials_except_ssn() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
 //WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(fakePassword);

 }
 @Given("user enters invalid {string}")
 public void user_enters_invalid(String ssn) throws IOException {
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(ssn);
  waitFor(1);
  takeScreenshotOfTheEntirePage();

  }
 @Given("user fills all required credentials except password")
 public void user_fills_all_required_credentials_except_password() throws IOException {
  fakeUsername=Faker.instance().name().username();
  fakeName = Faker.instance().name().firstName();
  fakeSurname = Faker.instance().name().lastName();
  fakeBirthPlace = Faker.instance().address().city();
  fakeDateOfBirth = "07-19-1995";
  fakePhoneNumber = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
  fakeSsn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  fakePassword = "Qa"+Faker.instance().number().digits(6);
  waitFor(3);
  WaitUtils.waitForVisibility(CCPage.name,30).sendKeys(fakeName);
  WaitUtils.waitForVisibility(CCPage.surname,30).sendKeys(fakeSurname);
  WaitUtils.waitForVisibility(CCPage.birthPlace,30).sendKeys(fakeBirthPlace);
  WaitUtils.waitForVisibility(CCPage.genderFemale,30).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,30).sendKeys(fakeDateOfBirth);
  WaitUtils.waitForVisibility(CCPage.phoneNumber,30).sendKeys(fakePhoneNumber);
  WaitUtils.waitForVisibility(CCPage.ssn,30).sendKeys(fakeSsn);
  WaitUtils.waitForVisibility(CCPage.username,30).sendKeys(fakeUsername);
 //WaitUtils.waitForVisibility(CCPage.password,10).sendKeys(fakePassword);

 }

 @Given("user enters an invalid  {string}")
 public void user_enters_an_invalid(String password) throws IOException {
  WaitUtils.waitForVisibility(CCPage.password,30).sendKeys(password);
  waitFor(1);
  takeScreenshotOfTheEntirePage();

 }
 @And("take screenshot")
 public void takeScreenshot() throws IOException {
  waitFor(1);
  takeScreenshotOfTheEntirePage();
 }
 @Then("user clicks on vice dean management option")
 public void user_clicks_on_vice_dean_management_option() {
   waitForVisibility(menuPage.viceDeanManagement,30).click();
 }
// ************************** Database Stepdefinitions **************
static ResultSet resultSet;
 public static String strId;
 public static Integer id;

 @Given("get vice dean via username")
 public void get_vice_dean_via_username(){

  String sqlQuery = "SELECT * FROM vice_dean WHERE username ='" + fakeUsername + "'";
  resultSet = getResultSet(sqlQuery);
  System.out.println("fakeUsername from UI = " + fakeUsername);

 }

 @Given("get vice dean via  non existing username")
 public void getViceDeanViaNonExistingUsername() {
  String sqlQuery = "SELECT * FROM vice_dean WHERE username ='" + fakeUsername + "X'";
  resultSet = getResultSet(sqlQuery);
 }

 @Then("body contains birth_day, birth_place, gender, name, phone_number, ssn, surname, username")
 public void body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username() throws SQLException {
  resultSet.next();
  strId = resultSet.getString("id");
  id = parseInt(strId);
     System.out.println("id from DATABASE= " + id);
  String actualBirth_day = resultSet.getString("birth_day");
  String actualBirth_place = resultSet.getString("birth_place");
  String actualGender = resultSet.getString("gender");
  String actualName = resultSet.getString("name");
  String actualPhone_number = resultSet.getString("phone_number");
  String actualSsn = resultSet.getString("ssn");
  String actualSurname = resultSet.getString("surname");
  String actualUsername = resultSet.getString("username");
  System.out.println("actualUsername from DATABASE = " + actualUsername);

  assertEquals("1995-07-19", actualBirth_day);
  assertEquals(fakeBirthPlace, actualBirth_place);
  assertEquals("1", actualGender);
  assertEquals(fakeName, actualName);
  assertEquals(fakePhoneNumber, actualPhone_number);
  assertEquals(fakeSsn, actualSsn);
  assertEquals(fakeSurname, actualSurname);
  assertEquals(fakeUsername, actualUsername);

 }

 @Then("body should be empty")
 public void bodyShouldBeEmpty()  {

  try {
   assertFalse(resultSet.next());//Since the ResulSet is empty, next() method will return false
  } catch (SQLException e) {
   throw new RuntimeException(e);
  }
   closeConnection();
 }


 // ****************************************************  API Stepdefinitions ****************************


 Response response;
 ResponsePersonnelPojo actualData;


 @Given("user sends get request by existing id")
 public void user_sends_get_request_by_existing_id() {
  setUp();
  waitFor(5);
  spec.pathParams("1st","vicedean","2nd","getViceDeanById","3rd",id);
  response = given(spec).get("{1st}/{2nd}/{3rd}");

 }
 @Given("user sends get request by non existing id")
 public void user_sends_get_request_non_by_existing_id() {
  setUp();
  spec.pathParams("1st","vicedean","2nd","getViceDeanById","3rd",(id+1));
  response = given(spec).get("{1st}/{2nd}/{3rd}");

 }

 @Then("body should contain birth_day, birth_place, gender, name, phone_number, ssn, surname, username")
 public void body_should_contain_birth_day_birth_place_gender_name_phone_number_ssn_surname_username() {

  ObjectPojo expectedData = new ObjectPojo(id,fakeUsername,fakeName,fakeSurname,"1995-07-19",fakeSsn,fakeBirthPlace,fakePhoneNumber,"FEMALE");
  actualData = convertJsonToJava(response.asString(),ResponsePersonnelPojo.class);

  assertEquals(200, response.statusCode());
  assertEquals(expectedData.getBirthDay(),actualData.getObject().getBirthDay());
  assertEquals(expectedData.getBirthPlace(),actualData.getObject().getBirthPlace());
  assertEquals(expectedData.getSsn(),actualData.getObject().getSsn());
  assertEquals(expectedData.getName(),actualData.getObject().getName());
  assertEquals(expectedData.getGender(),actualData.getObject().getGender());
  assertEquals(expectedData.getPhoneNumber(),actualData.getObject().getPhoneNumber());
  assertEquals(expectedData.getUsername(),actualData.getObject().getUsername());


 }

 @Then("body must be empty with non existing username {string}")
 public void bodyMustBeEmptyWithNonExistingUsername(String username) {

  List<Objects> dataList = response.jsonPath().getList("content.findAll{it.username=='" + username + "'}");
  assertTrue(dataList.isEmpty());
  Driver.closeDriver();
 }



}

