package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Date;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.MeetMngPage;
import pages.MenuPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class US_20_UI_TeacherUpdateMeetings {
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    MeetMngPage meetMngPage = new MeetMngPage();
    Faker faker = new Faker();



    @Then("Teacher verifies the Date, Start Time, Stop Time and Description are visible created.")
    public void teacher_verifies_the_date_start_time_stop_time_and_description_are_visible_created() {
        JSUtils.scrollIntoViewJS(meetMngPage.submit);
        WaitUtils.waitFor(1);
        for (int i = 0; i < meetMngPage.allDate.size(); i++) {
            Assert.assertTrue(meetMngPage.allDate.get(i).isDisplayed());
            Assert.assertTrue(meetMngPage.allStartTime.get(i).isDisplayed());
            Assert.assertTrue(meetMngPage.allStopTime.get(i).isDisplayed());
            Assert.assertTrue(meetMngPage.allDescription.get(i).isDisplayed());
            WaitUtils.waitFor(1);
        }
    }

    @Given("Teacher adds a new meeting")
    public void teacher_adds_a_new_meeting() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(meetMngPage.selectStudent).sendKeys("Arzu Atabey").sendKeys(Keys.ENTER).perform();
        LocalDate randomDate=generateRandomDate();
        String formattedDate = formatDate(randomDate, "dd/MM/yyyy");
        meetMngPage.dateOfMeet.sendKeys(formattedDate);
        meetMngPage.startTime.click();
        meetMngPage.startTime.sendKeys("1000");
        meetMngPage.stopTime.click();
        meetMngPage.stopTime.sendKeys("1100");
        meetMngPage.description.sendKeys(faker.lorem().characters(2, 16));

    }
    @Given("Teacher is able to update the meeting")
    public void teacher_is_able_to_update_the_meeting() {
        meetMngPage.updateButton.click();
        ReusableMethods.switchToWindow("editMeet");
        Actions actions=new Actions(Driver.getDriver());
        actions.click(meetMngPage.childSelectStudent).sendKeys("Arzu Atabey").sendKeys(Keys.ENTER).perform();
        /*LocalDate randomDate=generateRandomDate();
        String formattedDate = formatDate(randomDate, "dd/MM/yyyy");
        meetMngPage.childDate.sendKeys(formattedDate);
        meetMngPage.childStartTime.click();
        meetMngPage.childStartTime.sendKeys("1100");
        meetMngPage.childStopTime.click();
        meetMngPage.childStopTime.sendKeys("1200");
        meetMngPage.childDescription.sendKeys(faker.lorem().characters(2, 16));
*/
    }


    public LocalDate generateRandomDate() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2023, 12, 31);

        long startEpochDay = startDate.toEpochDay();
        long endEpochDay = endDate.toEpochDay();

        long randomEpochDay = startEpochDay + (long) (Math.random() * (endEpochDay - startEpochDay));

        return LocalDate.ofEpochDay(randomEpochDay);
    }

    public String formatDate(LocalDate date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return date.format(formatter);
    }

}
