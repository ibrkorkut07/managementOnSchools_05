package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonCredentialsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.TablesPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.ReusableMethods.*;

public class US_06_AddViceDeanStepDefs {
 CommonCredentialsPage CCPage = new CommonCredentialsPage();
 public static String fakeUsername;

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

}

