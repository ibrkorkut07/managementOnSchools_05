package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import pages.us14.US14AdminHomePage;
import pages.us14.US14LoginPage;
import pages.us14.US14ViceDeanHomePage;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;

public class US_14_TC02_UI_StepDefs {
    LoginPage loginPage=new LoginPage();
    US14LoginPage us14LoginPage = new US14LoginPage();
    US14AdminHomePage us14AdminHomePage = new US14AdminHomePage();
    Faker faker = new Faker();
    US14ViceDeanHomePage us14ViceDeanHomePage = new US14ViceDeanHomePage();
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @When("user clicks on login button to inter.")
    public void userClicksOnLoginButtonToInter() {
       us14LoginPage.loginButton.click();
    }


    @And("user click the edit button")
    public void userClickTheEditButton() {
        JSUtils.scrollIntoViewJS(us14ViceDeanHomePage.nextOption);
       JSUtils.clickWithTimeoutByJS(us14ViceDeanHomePage.nextOption);
       JSUtils.scrollIntoViewJS(us14ViceDeanHomePage.edithButton);
       JSUtils.clickWithTimeoutByJS(us14ViceDeanHomePage.edithButton);
    }


    @And("vice dean choose {string}.")
    public void viceDeanChoose(String lesson) throws InterruptedException {
        viceDeanMngPage.addTeacherSelectLesson.sendKeys(lesson,Keys.ENTER);
    //    us14ViceDeanHomePage.selectlesson.click();
   // us14ViceDeanHomePage.programLesson.click();
     //     us14ViceDeanHomePage.programLesson.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WaitUtils.waitFor(1);
    }

    @When("Enters different data into {string} and {string} field in edit window")
    public void enters_different_data_into_and_field_in_edit_window(String name, String surername) throws InterruptedException {
       us14ViceDeanHomePage.edithName.click();
               us14ViceDeanHomePage.edithName.sendKeys("can");
       us14ViceDeanHomePage.edithSurName.click();
              us14ViceDeanHomePage.edithSurName.sendKeys("Jawidd");
        Thread.sleep(2000);
    }
    @When("vice dean choose {string} from edith window")
    public void vice_dean_choose_from_edith_window(String gender) throws InterruptedException {
        us14ViceDeanHomePage.femaleOption.click();
        Thread.sleep(2000);
    }
    @When("vice dean enter  {string} to edith window")
    public void vice_dean_enter_to_edith_window(String password) {
        us14ViceDeanHomePage.password2.sendKeys("12345678");
    }
    @When("user click the submit button in the edit window")
    public void user_click_the_submit_button_in_the_edit_window() throws InterruptedException {
        us14ViceDeanHomePage.submitButon2.click();
        Thread.sleep(2000);
    }
    @When("user clicks on close sign of edit window")
    public void user_clicks_on_close_sign_of_edit_window() throws InterruptedException {
      us14ViceDeanHomePage.closeSign.click();
        Thread.sleep(2000);

    }
    @Then("verify that teachers {string} and {string} has been updated")
    public void verify_that_teachers_and_has_been_updated(String name, String surename) {
    }



}
