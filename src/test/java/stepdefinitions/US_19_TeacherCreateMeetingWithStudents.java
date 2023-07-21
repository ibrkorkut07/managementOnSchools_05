package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US_19_TeacherCreateMeetingWithStudents {
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    HomePage homePage = new HomePage();
    MeetMngPage meetMngPage = new MeetMngPage();

    @Then("Teacher clicks on menu button")
    public void teacher_clicks_on_menu_button() {

        JSUtils.clickWithTimeoutByJS(menuPage.menuButton);
        WaitUtils.waitFor(1);
    }
    @Then("Teacher clicks on Meet Management option")
    public void teacher_clicks_on_meet_management_option() {
        menuPage.meetManagement.click();
        WaitUtils.waitFor(1);
    }
    @Then("Teacher clicks on select students button")
    public void teacher_clicks_on_select_students_button() {
        meetMngPage.selectStudent.click();
        WaitUtils.waitFor(1);
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
