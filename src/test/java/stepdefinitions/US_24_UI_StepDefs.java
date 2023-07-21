package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.message.ReusableMessage;
import org.openqa.selenium.Keys;
import pages.HomePage;
import pages.TeacherMngPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_24_UI_StepDefs {
    TeacherMngPage teacherMngPage= new TeacherMngPage();
    HomePage homePage = new HomePage();

    @Given("admin clicks on Teacher Management Option")
    public void admin_clicks_on_teacher_management_option() {
        teacherMngPage.MyLogin.click();
        WaitUtils.waitFor(1);

        homePage.Menubutton.click();
        WaitUtils.waitFor(1);
        teacherMngPage.TeacherMng.click();
        WaitUtils.waitFor(1);
    }
    @When("admin enter {string}")
    public void admin_enter(String lesson) {
        WaitUtils.waitFor(1);
        teacherMngPage.Lesson.click();
        WaitUtils.waitFor(1);
        teacherMngPage.Lesson.sendKeys(lesson,Keys.ENTER);
        WaitUtils.waitFor(1);
        teacherMngPage.Lesson.click();

    }
    @When("admin enter {string},{string}")
    public void admin_enter(String name, String surname) {
        WaitUtils.waitFor(1);
        teacherMngPage.addTeacherName.sendKeys(name);
        WaitUtils.waitFor(1);
        teacherMngPage.addTeacherSurname.sendKeys(surname);

    }
    @When("admin enter {string} , {string} , {string}")
    public void admin_enter(String birthplace, String email, String phonenumber) {
        WaitUtils.waitFor(1);
        teacherMngPage.addTeacherBirthPlace.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        teacherMngPage.addTeacherEmail.sendKeys(email);
        WaitUtils.waitFor(1);
        teacherMngPage.addTeacherPhoneNumber.sendKeys(phonenumber);
        WaitUtils.waitFor(1);

    }
    @When("admin choose a gender")
    public void admin_choose_a_gender() {
        teacherMngPage.teacherGender.click();
        WaitUtils.waitFor(1);

    }
    @When("admin enter {string}, {string}, {string} and {string}")
    public void admin_enter_and(String dateofbirth, String ssn, String username, String password) {
        teacherMngPage.addTeacherBirthday.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        teacherMngPage.ssnNo.sendKeys(ssn);
        WaitUtils.waitFor(1);
        teacherMngPage.usernameTeacher.sendKeys(username);
        WaitUtils.waitFor(1);
        teacherMngPage.passwordTeacher.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @And("admin able to choose adviser teacher")
    public void adminAbleToChooseAdviserTeacher() {
        teacherMngPage.advisorTeacher.click();
        WaitUtils.waitFor(1);
    }

    @When("admin click on the submit button")
    public void admin_click_on_the_submit_button() {
        WaitUtils.waitFor(1);
        teacherMngPage.submitTeacher.click();
        WaitUtils.waitFor(1);
    }

    @Then("verify new teacher saved successfully")
    public void verify_new_teacher_saved_successfully() {
        teacherMngPage.teacherSavedText.isDisplayed();
        WaitUtils.waitFor(1);
    }

    @Then("close application")
    public void close_application() {

        Driver.closeDriver();
    }

    @And("admin verify the required texts displayed")
    public void adminVerifyTheRequiredTextsDisplayed() {
        teacherMngPage.RequiredTextUsername.isDisplayed();
        teacherMngPage.RequiredTextDateofBirth.isDisplayed();
        teacherMngPage.RequiredTextEmail.isDisplayed();
        teacherMngPage.RequiredTextSsn.isDisplayed();

    }
}
