package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.*;

public class US_10_AddLessonProgramStepDefs {
    LoginPage loginPage = new LoginPage();
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.password.sendKeys(password);
    }
    @Given("vice dean clicks on Lesson Program option")
    public void vice_dean_clicks_on_lesson_program_option() {
        viceDeanMngPage.lessonProgram.click();
    }
    @When("vice dean choose a lesson {string}")
    public void vice_dean_choose_a(String lesson) {
        WaitUtils.waitFor(1);
        viceDeanMngPage.chooseLessons.sendKeys(lesson, Keys.ENTER);
    }
    @When("vice dean choose an education term {string}")
    public void vice_dean_choose_an(String educationTerm) {
        WaitUtils.waitFor(1);
//        ReusableMethods.selectByVisibleText(viceDeanMngPage.eduTerm,educationTerm);
        ReusableMethods.selectByValue(viceDeanMngPage.eduTerm,"10");
    }
    @And("vice dean choose a day {string}")
    public void viceDeanChooseADay(String day) {
        WaitUtils.waitFor(1);
        ReusableMethods.selectByVisibleText(viceDeanMngPage.chooseDay,day);
    }
    @When("vice dean choose the start time {string} and end time {string} for the lesson")
    public void vice_dean_choose_the_and_for_the_lesson(String startTime, String endTime) {
        WaitUtils.waitFor(1);
        viceDeanMngPage.startTime.sendKeys(startTime);
        WaitUtils.waitFor(1);
        viceDeanMngPage.stopTime.sendKeys(endTime);
    }
    @And("vice dean clicks on the Submit button")
    public void viceDeanClicksOnTheSubmitButton() {
        WaitUtils.waitFor(1);
        viceDeanMngPage.submitButton.click();
    }

    @Then("verify lesson program should be successfully created")
    public void verify_lesson_program_should_be_successfully_created() {
        WaitUtils.waitFor(1);
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.createdLessonProgramAlert);
    }

    @Then("verify an error message should be displayed")
    public void verifyAnErrorMessageShouldBeDisplayed() {
        WaitUtils.waitFor(2);
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.fullAuthenticationErrorAlert);
    }
    @And("vice dean do not choose a day")
    public void viceDeanDoNotChooseADay() {
    }

    @And("vice dean do not choose the start time and end time for the lesson")
    public void viceDeanDoNotChooseTheStartTimeAndEndTimeForTheLesson() {
    }

    @Then("verify an error message should be displayed indicating {string}")
    public void verifyAnErrorMessageShouldBeDisplayedIndicating(String errorMessage) {

    }
    @When("vice dean do  not choose a lesson {string}")
    public void viceDeanDoNotChooseALesson(String arg0, String arg1) {
    }
    @When("vice dean do not choose a lesson")
    public void viceDeanDoNotChooseALesson() {
    }

    @And("vice dean do not choose an education term")
    public void viceDeanDoNotChooseAnEducationTerm() {
    }

    @Then("verify an error message should be displayed indicating lessons must not empty message")
    public void verifyAnErrorMessageShouldBeDisplayedIndicatingLessonsMustNotEmptyMessage() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.lessonEmptyAlert);
    }

    @Then("verify an error message should be displayed indicating please select education term message option")
    public void verifyAnErrorMessageShouldBeDisplayedIndicatingPleaseSelectEducationTermMessageOption() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.educationTermAlert);
    }

    @Then("verify an error message should be displayed indicating you have entered invalid value message")
    public void verifyAnErrorMessageShouldBeDisplayedIndicatingYouHaveEnteredInvalidValueMessage() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.dayAlert);
    }

    @Then("verify an error message should be displayed indicating required message")
    public void verifyAnErrorMessageShouldBeDisplayedIndicatingRequiredMessage() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.requiredMessage);
    }

    @Then("verify an error message should be displayed indicating Error: start time must not be greater than or equal to stop time message")
    public void verifyAnErrorMessageShouldBeDisplayedIndicatingErrorStartTimeMustNotBeGreaterThanOrEqualToStopTimeMessage() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.startTimeStopTimeAlert);
    }

    @And("user clicks on login page login button")
    public void userClicksOnLoginPageLoginButton() {
        viceDeanMngPage.loginButton.click();
    }
    @Then("logout the website")
    public void logoutTheWebsite() {
        WaitUtils.waitFor(2);
        viceDeanMngPage.menuButton.click();
        WaitUtils.waitFor(1);
        viceDeanMngPage.logOutLink.click();
        WaitUtils.waitFor(1);
        viceDeanMngPage.yesButton.click();
        WaitUtils.waitFor(1);

    }
}

