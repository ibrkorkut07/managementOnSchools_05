package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.ViceDeanMngPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_13_ViceDeanCreateTeacherStepDefs {
    ViceDeanMngPage viceDeanMngPage =  new ViceDeanMngPage();


    @Given("vice dean clicks on Teacher Management Option")
    public void vice_dean_clicks_on_teacher_management_option() {

        viceDeanMngPage.menuButton.click();
        viceDeanMngPage.teacherManagementLink.click();
        WaitUtils.waitFor(1);

    }

    @When("vice dean enter {string}")
    public void viceDeanEnter(String lesson ) {
        WaitUtils.waitFor(2);

       // JSUtils.setValueByJS(viceDeanMngPage.addTeacherSelectLesson,lesson);

     // JSUtils.clickWithTimeoutByJS(viceDeanMngPage.addTeacherSelectLesson);

     //  JSUtils.scrollIntoViewJS(viceDeanMngPage.addTeacherSelectLessons);


      // viceDeanMngPage.addTeacherSelectLessons.sendKeys(lesson + Keys.ENTER);

      // viceDeanMngPage.addTeacherChooseLesson.sendKeys(lesson,Keys.ENTER);

       viceDeanMngPage.addTeacherSelectLesson.sendKeys(lesson,Keys.ENTER);

        WaitUtils.waitFor(1);

    }

    @And("vice dean enter {string},{string}")
    public void viceDeanEnter(String name, String surname ) {

        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
    }


    @When("vice dean enter {string} , {string} , {string}")
    public void vice_dean_enter(String birthplace, String email, String phonenumber) {
        WaitUtils.waitFor(1);
  viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
  viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
  viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phonenumber);

    }

    @And("vice dean choose gender")
    public void viceDeanChooseGender() {
        WaitUtils.waitFor(1);
      viceDeanMngPage.addTeacherGenderFemale.click();
    }

    @And("vice dean enter {string}, {string}, {string} and {string}")
    public void viceDeanEnterAnd(String dateofbirth, String ssn , String username , String password) {

        WaitUtils.waitFor(1);

        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }


    @When("vice dean click on the Submit button")
    public void vice_dean_click_on_the_submit_button() {

        WaitUtils.waitFor(3);
   viceDeanMngPage.addTeacherSubmitButton.click();

    }

    @Then("verify teacher saved successfully")
    public void verify_teacher_saved_successfully() {

        WaitUtils.waitFor(1);
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.SuccessfullSaving);


    }


    @Then("verify required message is displayed")
    public void verifyRequiredMessageIsDisplayed() {

    }
}



