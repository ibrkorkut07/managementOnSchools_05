package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import utilities.ReusableMethods;


public class US_17UI_StepDefs {
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    ContactMessagePage contactMessagePage = new ContactMessagePage();

    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    Actions actions = new Actions(Driver.getDriver());
    Select select;

    @Given("Teacher goes to {string}")
    public void teacherGoesTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));

    }

    @When("Teacher clicks the login button")
    public void teacherClicksTheLoginButton() {
        homePage.loginHome.click();
    }


    @And("Teacher enters user name")
    public void teacherEntersUserName() {
        contactMessagePage.loginUserName.sendKeys("DrHacer");
    }

    @And("Teacher enters password")
    public void teacherEntersPassword() {
        contactMessagePage.loginPassword.sendKeys("19821990");
    }

    @And("Teacher clicks the loginBlue button")
    public void teacherClicksTheLoginBlueButton() {
        loginPage.loginButton.click();
    }


    @And("Displays the teacher Add Student Info section")
    public void DisplaysTheTeacherAddStudentInfoSection() {
        studentInfoManagementPage.addInfoManagementText.isDisplayed();
    }

    @And("Teacher selects lesson on\"Choose Lesson\"part")
    public void TeacherSelectsLessonOnChooseLessonPart() {
        studentInfoManagementPage.chooseLesson.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseLesson);
        ReusableMethods.waitFor(1);
        select.selectByVisibleText("API");
    }

    @Then("Teacher verifies select lesson")
    public void TeacherVerifiesSelectLesson() {
        studentInfoManagementPage.chooseLesson.click();
        WebElement chooseLesson = studentInfoManagementPage.chooseLesson;
        Select selectLesson = new Select(chooseLesson);
        String actualLesson = selectLesson.getFirstSelectedOption().getText();
        String expectedLesson = "API";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedLesson, actualLesson);
    }

    @And("Teacher selects student on\"Choose Student\"part")
    public void TeacherSelectsStudentOnChooseStudentPart() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseStudent);
        select.selectByVisibleText("Derya AK");
        ReusableMethods.waitFor(1);
    }

    @Then("Teacher verifies select student")
    public void TeacherVerifiesSelectStudent() {
        studentInfoManagementPage.chooseStudent.click();
        ReusableMethods.waitFor(1);
        WebElement chooseStudent = studentInfoManagementPage.chooseStudent;
        Select selectStudent = new Select(chooseStudent);
        String actualStudent = selectStudent.getFirstSelectedOption().getText();
        String expectedStudent = "Derya AK";
        Assert.assertEquals(expectedStudent, actualStudent);
    }

    @And("Teacher selects semester on\"Choose Education Term\"part")
    public void TeacherSelectsSemesterOnChooseEducationTermPart() {
        studentInfoManagementPage.chooseEducationTerm.click();
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).build().perform();
        select = new Select(studentInfoManagementPage.chooseEducationTerm);
        select.selectByVisibleText("SPRING_SEMESTER");
        ReusableMethods.waitFor(1);
    }

    @Then("Teacher verifies select semester")
    public void TeacherVerifiesSelectSemester() {
        ReusableMethods.waitFor(1);
        WebElement chooseEducation = studentInfoManagementPage.chooseEducationTerm;
        Select selectSemester = new Select(chooseEducation);
        String actualSemester = selectSemester.getFirstSelectedOption().getText();
        String expectedSemester = "SPRING_SEMESTER";
        ReusableMethods.waitFor(1);
        Assert.assertEquals(expectedSemester, actualSemester);
    }

    @And("Teacher enters absence on\"Absentee\" box")
    public void TeacherEntersAbsenceOnAbsenteeBox() {
        studentInfoManagementPage.absentee.sendKeys("2");
    }

    @Then("Teacher verifies enter absentee")
    public void TeacherVerifiesEnterAbsentee() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.absentee.isDisplayed());
    }

    @And("Teacher enters midterm grade on\"Midterm Exam\"box")
    public void TeacherEntersMidtermGradeOnMidtermExamBox() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @Then("Teacher verifies enter midterm grade")
    public void TeacherVerifiesEnterMidtermGrade() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.midtermExam.isDisplayed());
    }

    @And("Teacher enters final exam grade on\"Final Exam\"box")
    public void TeacherEntersFinalExamGradeOnFinalExamBox() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @Then("Teacher verifies enter final grade")
    public void TeacherVerifiesEnterFinalGrade() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.finalExam.isDisplayed());
    }

    @And("Teacher enters info note on\"Info Note\"box")
    public void TeacherEntersInfoNoteOnInfoNoteBox() {
        studentInfoManagementPage.infoNote.sendKeys("should try a little harder");
    }

    @Then("Teacher verifies enter info note")
    public void TeacherVerifiesEnterInfoNote() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }

    @And("User enter space on\"Info Note\"box")
    public void UserEnterSpaceOnInfoNoteBox() {
        studentInfoManagementPage.infoNote.sendKeys(" ");
    }

    @Then("User verifies enter info note")
    public void UserVerifiesEnterInfoNote() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNote.isDisplayed());
    }

    @And("Teacher not selects lesson from\"Choose Lesson\"part")
    public void TeacherNotSelectsLessonFromChooseLessonPart() {
    }

    @And("Teacher selects student from\"Choose Student\"part")
    public void TeacherSelectsStudentFromChooseStudentPart() {
        studentInfoManagementPage.absentee.sendKeys("2");
    }

    @And("Teacher enters midterm grade from\"Midterm Exam\"box")
    public void TeacherEntersmidtermGradeFromMidtermExamBox() {
        studentInfoManagementPage.midtermExam.sendKeys("55");
    }

    @And("Teacher enters final exam grade from\"Final Exam\"box")
    public void TeacherEntersFinalExamGradeFromFinalExamBox() {
        studentInfoManagementPage.finalExam.sendKeys("80");
    }

    @And("Teacher not enters info note from\"Info Note\"box")
    public void TeacherNotEntersInfoNoteFromInfoNoteBox() {
        studentInfoManagementPage.infoNote.click();
    }

    @Then("Teacher verifies Required text")
    public void TeacherVerifiesRequiredText() {
        ReusableMethods.waitFor(1);
        Assert.assertTrue(studentInfoManagementPage.infoNoteRequiredText.isDisplayed());
    }
}