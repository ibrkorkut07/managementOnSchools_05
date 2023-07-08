package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import pages.CommonCredentialsPage;
import utilities.*;
import java.util.List;
import static org.junit.Assert.*;
import static utilities.ReusableMethods.*;

public class US_06_UI_AddViceDeanStepDefs {
 CommonCredentialsPage CCPage = new CommonCredentialsPage();
 public static String fakeUsername;
 public static String fakeSsn;

 @Given("user fills all required credentials")
 public void user_fills_all_required_credentials() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user clicks submit button")
 public void user_clicks_submit_button() {
  WaitUtils.waitForVisibility(CCPage.submit,10).submit();

 }
 @Then("verify new Vice Dean is created")
 public void verify_new_vice_dean_is_created() {
  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),10);
  JSUtils.clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  assertEquals(fakeUsername,actual);
 }
 @Given("user fills all required credentials except name")
 public void user_fills_all_required_credentials_except_name() {
  fakeUsername=Faker.instance().name().username();
  //WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Then("verify new Vice Dean is not created")
 public void verify_new_vice_dean_is_not_created() {

  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),10);
  JSUtils.clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  assertFalse(actual.equals(fakeUsername));
  //assertEquals(fakeUsername,actual);
 }
 @Given("user fills all required credentials except surname")
 public void user_fills_all_required_credentials_except_surname() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  //WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user fills all required credentials except birth place")
 public void user_fills_all_required_credentials_except_birth_place() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  //WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user fills all required credentials except gender")
 public void user_fills_all_required_credentials_except_gender() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  //WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user fills all required credentials except date of birth")
 public void user_fills_all_required_credentials_except_date_of_birth() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  //WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user fills all required credentials except phone number")
 public void user_fills_all_required_credentials_except_phone_number() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  //WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user fills all required credentials except username")
 public void user_fills_all_required_credentials_except_username() {
  fakeSsn=Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(fakeSsn);
  //WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Then("verify new Vice Dean is not created without username")
 public void verify_new_vice_dean_is_not_created_without_username() {
  waitFor(1);
  WebElement lastPageLink=waitForVisibility(Driver.getDriver().findElement(By.xpath("(//*[@class='page-link'])[5]")),10);
  JSUtils.clickWithTimeoutByJS(lastPageLink);
  waitFor(2);
  List<WebElement> usernameList=Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[4]"));
  String actual = usernameList.get(usernameList.size()-1).getText();
  assertFalse(actual.equals(fakeSsn));
  //assertEquals(fakeSsn,actual);
 }
 @Given("user fills all required credentials except ssn")
 public void user_fills_all_required_credentials_except_ssn() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  //WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user enters invalid {string}")
 public void user_enters_invalid(String ssn) {
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(ssn);

  }
 @Given("user fills all required credentials except password")
 public void user_fills_all_required_credentials_except_password() {
  fakeUsername=Faker.instance().name().username();
  WaitUtils.waitForVisibility(CCPage.name,10).sendKeys(Faker.instance().name().firstName());
  WaitUtils.waitForVisibility(CCPage.surname,10).sendKeys(Faker.instance().name().lastName());
  WaitUtils.waitForVisibility(CCPage.birthPlace,10).sendKeys(Faker.instance().address().city());
  WaitUtils.waitForVisibility(CCPage.genderFemale,10).click();
  WaitUtils.waitForVisibility(CCPage.dateOfBirth,10).sendKeys("07/19/1995");
  WaitUtils.waitForVisibility(CCPage.phoneNumber,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.ssn,10).sendKeys(Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4));
  WaitUtils.waitForVisibility(CCPage.username,10).sendKeys(fakeUsername);
  //WaitUtils.waitForVisibility(CCPage.password,10).sendKeys("Qa"+Faker.instance().number().digits(6));
  WaitUtils.waitFor(3);
 }
 @Given("user enters an invalid  {string}")
 public void user_enters_an_invalid(String password) {
  WaitUtils.waitForVisibility(CCPage.password,10).sendKeys(password);
 }







}

