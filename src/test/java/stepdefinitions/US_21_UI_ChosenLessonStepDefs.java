package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ChooseLessonMngPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_21_UI_ChosenLessonStepDefs {

    static LoginPage loginPage = new LoginPage();
    static HomePage homePage = new HomePage();
    static ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    static ChooseLessonMngPage chooseLessonMngPage = new ChooseLessonMngPage();
    public static class US21_StudentChosenLessonsStepDefs {
        @Given("Student signs in as a student")
        public void studentSignsInAsAStudent() {
            loginPage.userName.sendKeys("cramer07");
            loginPage.password.sendKeys("07cramer");
            chooseLessonMngPage.LoginButton.click();
        }

        @And("Clicks on Menu")
        public void clicksOnMenu() {
            homePage.Menubutton.click();
        }

        @Then("Clicks on Choose Lesson")
        public void clicksOnChooseLesson() {
            chooseLessonMngPage.StudentChooseLessonButton.click();
            ReusableMethods.waitFor(1);
        }

        @Then("Student sees Teacher")
        public void studentSeesTeacher() {
            Assert.assertTrue(chooseLessonMngPage.teacherListTitle.isDisplayed());
        }

        @Then("Student sees Day")
        public void studentSeesDay() {
            Assert.assertTrue(chooseLessonMngPage.dayListTitle.isDisplayed());
        }

        @Then("Student sees Start Time")
        public void studentSeesStartTime() {
            Assert.assertTrue(chooseLessonMngPage.starttimeListTitle.isDisplayed());
        }

        @Then("Student sees Stop Time")
        public void studentSeesStopTime() throws IOException {
            Assert.assertTrue(chooseLessonMngPage.stoptimeListTitle.isDisplayed());
            ReusableMethods.fullpageScreenshot();
        }
    }
}
