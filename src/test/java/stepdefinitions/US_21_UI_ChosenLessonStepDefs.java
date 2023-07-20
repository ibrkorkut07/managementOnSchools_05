package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ChooseLessonMngPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class US_21_UI_ChosenLessonStepDefs {

    static LoginPage loginPage = new LoginPage();
    static HomePage homePage = new HomePage();
    static ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    static ChooseLessonMngPage chooseLessonMngPage = new ChooseLessonMngPage();
    Actions actions = new Actions(Driver.getDriver());

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
        ReusableMethods.waitFor(1);
        ReusableMethods.fullpageScreenshot();
    }

    @Given("Choose two lessons")
    public void chooseTwoLessons() {
        chooseLessonMngPage.mondayJavaCheckbox.click();
        chooseLessonMngPage.thursdayPythonCheckbox.click();

    }

    @And("Clicks on Submit")
    public void clicksOnSubmit() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.END).sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP)
                .build().perform();
        ReusableMethods.waitFor(1);
        chooseLessonMngPage.chosenLessonSubmitButton.click();
    }

    @And("Sees “Lesson added to student” popup text")
    public void seesLessonAddedToStudentPopupText() {

    }

    @Then("Student sees added lesson in Lesson Program List")
    public void studentSeesAddedLessonInLessonProgramList() {

        String chosenLesson = chooseLessonMngPage.getFirstChosenLessonWebelement.getText();
        String chosenDay = chooseLessonMngPage.getFirstChosenDayWebelement.getText();
        String chosenStarttime = chooseLessonMngPage.getFirstChosenStarttimeWebelement.getText();
        String chosenStoptime = chooseLessonMngPage.getFirstChosenStoptimeWebelement.getText();

        String registeredLesson = chooseLessonMngPage.getFirstRegisteredLessonWebelement.getText();
        String registeredDay = chooseLessonMngPage.getFirstRegisteredDayWebelement.getText();
        String registeredStarttime = chooseLessonMngPage.getFirstRegisteredStarttimeWebelement.getText();
        String registeredStoptime = chooseLessonMngPage.getFirstRegisteredStoptimeWebelement.getText();

        Assert.assertTrue(chosenLesson.contains(registeredLesson));
        Assert.assertTrue(chosenDay.contains(registeredDay));
        Assert.assertTrue(chosenStarttime.contains(registeredStarttime));
        Assert.assertTrue(chosenStoptime.contains(registeredStoptime));

        Assert.assertTrue(chooseLessonMngPage.lessonProgramListTableBody.isDisplayed());
    }

    @Given("Choose two coinciding lessons")
    public void chooseTwoCoincidingLessons() {
        chooseLessonMngPage.mondayJavaCheckbox.click();
        chooseLessonMngPage.mondayCalculusCheckbox.click();

    }

    @And("Sees “Error” popup text")
    public void seesErrorPopupText() throws IOException {
        ReusableMethods.waitFor(1);
        ReusableMethods.fullpageScreenshot();
    }

    @Given("Go to first registered lesson")
    public void goToFirstRegisteredLesson() {
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.END).sendKeys(Keys.PAGE_UP).
                sendKeys(Keys.UP).sendKeys(Keys.UP).build().perform();
    }

    @And("Delete if it is selectable")
    public void deleteIfItIsClickableSelectable() throws IOException {
        ReusableMethods.waitFor(1);
        ReusableMethods.fullpageScreenshot();
        Assert.assertTrue(chooseLessonMngPage.getFirstRegisteredDayWebelement.isSelected());

    }
}
