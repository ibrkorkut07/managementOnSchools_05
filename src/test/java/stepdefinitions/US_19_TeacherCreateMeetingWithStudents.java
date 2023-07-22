package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.*;
import utilities.*;

public class US_19_TeacherCreateMeetingWithStudents {
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    MeetMngPage meetMngPage = new MeetMngPage();
    Select select = new Select(meetMngPage.selectStudent2);

    @Then("Teacher clicks on menu button")
    public void teacher_clicks_on_menu_button() {

        menuPage.menuButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("Teacher clicks on Meet Management option")
    public void teacher_clicks_on_meet_management_option() {
        menuPage.meetManagement.click();
        WaitUtils.waitFor(1);
    }
    @Then("Teacher clicks on select students button")
    public void teacher_clicks_on_select_students_button() {
        ReusableMethods.waitFor(1);
        select.selectByIndex(0);
        meetMngPage.selectStudent.click();
        ReusableMethods.waitFor(1);

//        meetMngPage.selectStudent.sendKeys("Brad Marks");
//        WaitUtils.waitFor(1);
//        meetMngPage.selectStudent.click();

    }
    @Then("Teacher fill out the Date Of Meet")
    public void teacher_fill_out_the_date_of_meet() {

    }
    @Then("Teacher fill out the Start Time")
    public void teacher_fill_out_the_start_time() {

    }
    @Then("Teacher fill out the Stop Time")
    public void teacher_fill_out_the_stop_time() {

    }
    @Then("Teacher fill out the Description")
    public void teacher_fill_out_the_description() {

    }
    @Then("click the submit button")
    public void click_the_submit_button() {

    }
}
