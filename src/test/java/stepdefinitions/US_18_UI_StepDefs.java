package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngPage;
import pages.DeanMngPage;
import pages.StudentInfoManagementPage;

import pages.TeacherMngPage;
import utilities.JSUtils;
import utilities.MediaUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static pages.StudentInfoManagementPage.studentNameList;


public class US_18_UI_StepDefs {

    TeacherMngPage teacherMngPage = new TeacherMngPage();
    DeanMngPage deanMngPage = new DeanMngPage();

    AdminMngPage adminMngPage = new AdminMngPage();


    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();


    @Then("user clicks on student info management")
    public void user_clicks_on_student_info_management() {

        studentInfoManagementPage.studentInfoManagementLink.click();
        ReusableMethods.scrollIntoView(studentInfoManagementPage.studentInfoList);

    }

    @And("user clicks on login button for enter as teacher")
    public void userClicksOnLoginButtonForEnterAsTeacher() {

       ReusableMethods.waitForVisibility(studentInfoManagementPage.loginButton,30).click();

    }


    @When("user clicks on edit")
    public void user_clicks_on_edit() {

       JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.editLink);
        //studentInfoManagementPage.editLink.click();

    }
    @Then("user clicks on choose lesson drop down and select")
    public void user_clicks_on_choose_lesson_drop_down_and_select() {

        studentInfoManagementPage.chooseLesson.click();
        ReusableMethods.selectByVisibleText(studentInfoManagementPage.chooseLesson , "Cypress" );
    }
    @Then("user clicks on choose education term drop down and select")
    public void user_clicks_on_choose_education_term_drop_down_and_select() {

        studentInfoManagementPage.chooseEducationTerm.click();
        ReusableMethods.selectByVisibleText(studentInfoManagementPage.chooseEducationTerm, "SPRING_SEMESTER");
    }
    @Then("user clicks on absentee and upload {string}")
    public void user_clicks_on_absentee_and_upload(String absentee) {

        studentInfoManagementPage.absenteeLink.sendKeys(absentee);

    }
    @Then("user clicks on midterm exam and upload {string}")
    public void user_clicks_on_midterm_exam_and_upload(String midterm) {

        studentInfoManagementPage.midtermExam.sendKeys(midterm);

    }
    @Then("user clicks on final exam and upload {string}")
    public void user_clicks_on_final_exam_and_upload(String finalexam) {

        studentInfoManagementPage.finalExam.sendKeys(finalexam);

    }
    @Then("user clicks on info note and upload {string}")
    public void user_clicks_on_info_note_and_upload(String InfoNote) {

        studentInfoManagementPage.infoNote.sendKeys(InfoNote);

    }
    @Then("clicks on submit button")
    public void clicks_on_submit_button() {

        studentInfoManagementPage.submitButtonForEditStudentInfo.click();

    }


    @And("users clicks on login button")
    public void usersClicksOnLoginButton() {

        studentInfoManagementPage.loginButton.click();

    }

    @Then("print entire page")
    public void printEntirePage() throws IOException {

        //       String entireTable = teacherMngPage.studentInfoTable.getText();
//
//        System.out.println("entireTable = " + entireTable);

        ReusableMethods.scrollIntoView(studentInfoManagementPage.studentInfoTable);
        MediaUtils.takeScreenshotOfTheEntirePage();

        assertFalse(studentNameList.isEmpty());
        studentNameList.stream().forEach(t-> System.out.println(t.getText()));

    }

    @Then("user clicks on the dustbin shape")
    public void userClicksOnTheDustbinShape() {

        ReusableMethods.scrollIntoView(studentInfoManagementPage.dustbin);
        JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.dustbin);

    }

    @Then("assert alert message for deleted student")
    public void assertAlertMessageForDeletedStudent() {

        WaitUtils.waitFor(1);
        String alertText = adminMngPage.alert.getText();
        assertTrue(alertText.contains("Student Info deleted Successfully"));
    }
}
