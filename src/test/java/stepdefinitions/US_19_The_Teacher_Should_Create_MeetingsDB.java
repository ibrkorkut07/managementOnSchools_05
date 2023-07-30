package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.MeetMngPage;
import pages.MenuPage;
import pojos.MeetPostPojo;
import utilities.DBUtils;
import utilities.FakerUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DBUtils.getQueryResultListToStringList;

public class US_19_The_Teacher_Should_Create_MeetingsDB {
    HomePage homePage;
    MeetMngPage meetManagementPage;
    MeetPostPojo object;
    MenuPage menuPage;

    List<String> dateList = new ArrayList<>();
    List<String> descriptionList = new ArrayList<>();
    List<String> startTimeList = new ArrayList<>();
    List<String> stopTimeList = new ArrayList<>();
    List<String> studentIdsList = new ArrayList<>();


    @Then("create a meeting")
    public void create_a_meeting() {
        homePage = new HomePage();
        menuPage = new MenuPage();
        meetManagementPage = new MeetMngPage();

        ArrayList<Integer> studentId = new ArrayList<>();
        studentId.add(FakerUtils.teacherIDFaker());
        object = new MeetPostPojo(
                "2023-07-30",
                "PP", FakerUtils.startTimeFaker(),
                FakerUtils.stopTimeFaker(),
                studentId);
        System.out.println("object = " + object);
        homePage.loginHome.click();
        menuPage.meetManagement.click();
        ReusableMethods.waitFor(3);
        meetManagementPage.dateOfMeet.sendKeys(object.getDate());
        meetManagementPage.startTime.sendKeys(object.getStartTime());
        meetManagementPage.stopTime.sendKeys(object.getStopTime());
        meetManagementPage.description.sendKeys(object.getDescription());
        meetManagementPage.submit.click();

    }

    @When("connect to databasee")
    public void connectToDatabase() {
        DBUtils.createConnection();
        DBUtils.createStatement();
    }

    @Then("query for meet information")
    public void query_for_meet_information() {
        studentIdsList = getQueryResultListToStringList("select id from meet");
        dateList = getQueryResultListToStringList("select date from meet");
        descriptionList = getQueryResultListToStringList("select description from meet");
        startTimeList = getQueryResultListToStringList("select start_time from meet");
        stopTimeList = getQueryResultListToStringList("select stop_time from meet");

        System.out.println("studentIdsList = " + studentIdsList);
        System.out.println("dateList = " + dateList);


    }



    @Then("validate meeting is created")
    public void validate_meeting_is_created() {

        meetManagementPage =new MeetMngPage();
        assertTrue(dateList.toString().contains(object.getDate()));
        assertTrue(descriptionList.toString().contains(object.getDescription()));
        assertTrue(startTimeList.toString().contains(object.getStartTime()));
        assertTrue(stopTimeList.toString().contains(object.getStopTime()));
//        assertTrue(studentIdsList.toString().contains(object.getStudentid());

    }

    @Then("close connectionn")
    public void close_connection() {
        DBUtils.closeConnection();
    }
}