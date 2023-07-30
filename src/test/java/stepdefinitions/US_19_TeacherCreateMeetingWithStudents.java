package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.trace.ReadableSpan;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.*;
import utilities.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_19_TeacherCreateMeetingWithStudents {
    MenuPage menuPage;
    HomePage homePage;
    MeetMngPage meetMngPage;

    @Then("click on Menu")
    public void click_on_menu() {
        homePage = new HomePage();
        ReusableMethods.waitFor(2);
        homePage.Menubutton.click();
    }

    @Then("clicks on Meet Management")
    public void clicks_on_meet_management() {
        menuPage = new MenuPage();
        ReusableMethods.waitFor(2);
        menuPage.meetManagement.click();
    }

    @Then("choose a student")
    public void chooseAStudent() {
        meetMngPage = new MeetMngPage();
        ReusableMethods.waitFor(3);
        meetMngPage.selectStudent.click();
        ReusableMethods.waitFor(3);
        meetMngPage.selectStudent.sendKeys("Kemal ARZU" + Keys.ENTER);
        ReusableMethods.waitFor(2);


    }

    @Then("choose a day {string}")
    public void choose_a_day(String day) {
        meetMngPage = new MeetMngPage();
        meetMngPage.dateOfMeet.sendKeys("5/08/2023" + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @Then("choose start time {string} and end time {string}")
    public void choose_start_time_and_end_time(String StartTime, String StopTime) {
        meetMngPage = new MeetMngPage();
        ReusableMethods.waitFor(2);
        meetMngPage.startTime.sendKeys("14:00" + Keys.ENTER);
        ReusableMethods.waitFor(2);
        meetMngPage.stopTime.sendKeys("17:00" + Keys.ENTER);
        ReusableMethods.waitFor(2);
    }

    @Then("choose a description {string}")
    public void choose_a_description(String description) {
        meetMngPage = new MeetMngPage();
        meetMngPage.description.click();
        ReusableMethods.waitFor(1);
        meetMngPage.description.sendKeys("Demo Meeting" + Keys.ENTER);
        ReusableMethods.waitFor(3);
    }

    @Then("clicks on submit button")
    public void clicks_on_submit_button() {
        JSUtils.clickWithTimeoutByJS(meetMngPage.submit);
        ReusableMethods.waitFor(2);
    }

    @Then("validate meeting created by alert text")
    public void validate_meeting_created_by_alert_text() {

        assertTrue(meetMngPage.successAlertMessage.isDisplayed());
    }

    @Then("close driver")
    public void closeDriver() {
        Driver.closeDriver();
    }
}
