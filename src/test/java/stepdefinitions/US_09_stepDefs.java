package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import pages.LessonMngPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

public class US_09_stepDefs {
    LessonMngPage lessonMngPage = new LessonMngPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("YSA navigates to homepage")
    public void ysaNavigatesToHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));


    }

    @Then("YSA verifies the Lesson Name, Compulsory and Credit Score are visible created.")
    public void ysaVerifiesTheLessonNameCompulsoryAndCreditScoreAreVisibleCreated() {
        WaitUtils.waitFor(2);
        for (int i = 0; i < lessonMngPage.allLessonNames.size(); i++) {
            Assert.assertTrue(lessonMngPage.allLessonNames.get(i).isDisplayed());
            Assert.assertTrue(lessonMngPage.allCompulsories.get(i).isDisplayed());
            Assert.assertTrue(lessonMngPage.allCreditScoreNames.get(i).isDisplayed());
            WaitUtils.waitFor(1);
        }

    }


    @Given("YSA adds a new lesson")
    public void ysaAddsANewLesson() {

        String expectedLesson = "Patates";
        WaitUtils.waitFor(5);
        lessonMngPage.lessonNameInput.sendKeys(expectedLesson);

        lessonMngPage.compulsoryCheck.click();

        lessonMngPage.creditScoreInput.sendKeys("5");

        lessonMngPage.lessonSubmitButton.click();
        System.out.println("1");
//        JSUtils.scrollIntoViewJS(lessonMngPage.nextButton);
        WaitUtils.waitFor(3);

        JSUtils.clickWithTimeoutByJS(lessonMngPage.nextButton);
        System.out.println("2");
        WaitUtils.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        WaitUtils.waitFor(2);
        Assert.assertEquals(expectedLesson, lessonMngPage.lastCreatedLesson.getText());
        System.out.println("3");
    }

    @And("YSA deletes the added lesson.")
    public void ysaDeletesTheAddedLesson() {

        WaitUtils.waitFor(4);
        lessonMngPage.deleteLastCreatedLesson.click();
        WaitUtils.waitFor(4);
        try {
            Assert.assertTrue(lessonMngPage.lastCreatedLesson.getText().equals("Patates"));

        }catch (Exception e){
            System.out.println("Last Created Lesson is Deleted");
        }


    }

    @And("YSA is able to update the lesson information")
    public void ysaIsAbleToUpdateTheLessonInformation() {

    }
}
