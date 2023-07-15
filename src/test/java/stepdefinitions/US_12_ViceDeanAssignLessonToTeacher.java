package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ViceDeanMngPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_12_ViceDeanAssignLessonToTeacher {
    ViceDeanMngPage viceDeanMngPage =  new ViceDeanMngPage();

    @Given("vice dean select a lesson to assign")
    public void vice_dean_select_a_lesson_to_assign() {
   //  viceDeanMngPage.lessonMondayJava.click();
       // ReusableMethods.scrollIntoView(viceDeanMngPage.lessonProgramId);
        ReusableMethods.waitForClickablility(viceDeanMngPage.lessonProgramId, 5);
        JSUtils.clickWithTimeoutByJS(viceDeanMngPage.lessonProgramId);
   //  ReusableMethods.scrollIntoView(viceDeanMngPage.chooseTeacher);

     WaitUtils.waitFor(5);
    // WaitUtils.waitForClickablility(viceDeanMngPage.chooseTeacher,5);

    }
    @Given("vice dean select a teacher from available teachers")
    public void vice_dean_select_a_teacher_from_available_teachers() {
        viceDeanMngPage.chooseTeacher.click();
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

    @Given("vice dean do not select a teacher from available teachers")
    public void vice_dean_do_not_select_a_teacher_from_available_teachers() {

    }
    @Then("vice dean verify the error message should be displayed")
    public void vice_dean_verify_the_error_message_should_be_displayed() {

    }

    @Given("vice dean select a teacher is already assigned to same lesson at the same time")
    public void vice_dean_select_a_teacher_is_already_assigned_to_same_lesson_at_the_same_time() {

        }

   @Then("vice dean verify the error message should be displayed indicating {string}")
   public void vice_dean_verify_the_error_message_should_be_displayed_indicating(String string) {

        }

    @Given("vice dean select multiple lesson in different times to assign")
    public void vice_dean_select_multiple_lesson_in_different_times_to_assign() {


    }
    @Then("vice dean verify the lessons should be successfully assigned to the selected teacher")
    public void vice_dean_verify_the_lessons_should_be_successfully_assigned_to_the_selected_teacher() {


    }
    @Given("vice dean select multiple lesson in conflict times to assign")
    public void vice_dean_select_multiple_lesson_in_conflict_times_to_assign() {

    }

    @And("vice dean do not select a lesson to assign")
    public void viceDeanDoNotSelectALessonToAssign() {

    }
    // @Then("vice dean verify the error message should be displayed")
   // public void vice_dean_verify_the_error_message_should_be_displayed () {


   // }




}
