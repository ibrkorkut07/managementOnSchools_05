package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LessonMngPage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_12_StepDefs {
    ViceDeanMngPage viceDeanMngPage =  new ViceDeanMngPage();

    @Given("vice dean select a lesson to assign")
    public void vice_dean_select_a_lesson_to_assign() {
     viceDeanMngPage.lessonMondayJava.click();

   //  ReusableMethods.scrollIntoView(viceDeanMngPage.chooseTeacher);
    viceDeanMngPage.chooseTeacher.click();
     WaitUtils.waitFor(5);
    // WaitUtils.waitForClickablility(viceDeanMngPage.chooseTeacher,5);

    }
    @Given("vice dean select a teacher from available teachers")
    public void vice_dean_select_a_teacher_from_available_teachers() {
    ReusableMethods.selectByValue(viceDeanMngPage.chooseTeacher,"33");
        WaitUtils.waitFor(2);
    }
    @Then("vice dean verify the lesson should be successfully assigned to the selected teacher")
    public void vice_dean_verify_the_lesson_should_be_successfully_assigned_to_the_selected_teacher() {
    ReusableMethods.verifyElementDisplayed(viceDeanMngPage.lessonAddedTeacher);
        WaitUtils.waitFor(1);
    }
    @Then("close the applications")
    public void close_the_applications() {
        Driver.closeDriver();
    }

}
