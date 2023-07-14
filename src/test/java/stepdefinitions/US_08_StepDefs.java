package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Background;
import org.junit.Assert;
import pages.LessonMngPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US_08_StepDefs {
    LoginPage loginPage = new LoginPage();
    LessonMngPage lessonMngPage = new LessonMngPage();
    Faker faker= new Faker();
    @Given("Vice Deans navigates to LoginLink")
    public void vice_deans_navigates_to_login_link() {

        Driver.getDriver().get(ConfigReader.getProperty("LoginLink"));
    }
        @Then("Vice Deans enter user name")
        public void vice_deans_enter_user_name() {
            loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanUsername"));

        }
        @Then("Vice Deans enter password")
        public void vice_deans_enter_password() {
            loginPage.password.sendKeys(ConfigReader.getProperty("ViceDeanPassword"));
        }
    @Then("Vice Deans click on Login button")
    public void vice_deans_click_on_login_button() {
        loginPage.loginButton.click();
    }
    @Then("Vice Deans click on Lesson button")
    public void vice_deans_click_on_lesson_button() {
        lessonMngPage.lessonButton.click();
    }
    @Then("Vice Deans input lesson name")
    public void vice_deans_input_lesson_name() {
        String lesson=faker.bothify("?????-###");
        lessonMngPage.lessonNameInput.sendKeys(lesson);
    }
    @Then("Vice Deans selected Compulsory")
    public void vice_deans_selected_compulsory() {
        lessonMngPage.compulsoryCheck.click();
    }
    @Then("Vice Deans input credit score")
    public void vice_deans_input_credit_score() {
        String creditScore= faker.bothify("#");
        lessonMngPage.creditScoreInput.sendKeys(creditScore);
    }
    @Then("Vice Deans click on Submit button")
    public void vice_deans_click_on_submit_button() {
        lessonMngPage.lessonSubmitButton.click();
    }
    @Then("Verify the Lesson is created.")
    public void verify_the_lesson_is_created() {
        Assert.assertTrue(WaitUtils.waitForVisibility(lessonMngPage.createdLessonAlert,10).isDisplayed());
    }
    @Then("Verify enter the name of lesson")
    public void verify_enter_the_name_of_lesson() {
        Assert.assertEquals("Required",lessonMngPage.nullOfLessonName.getText());
    }
    @Then("Verify enter the credit score of lesson")
    public void verify_enter_the_credit_score_of_lesson() {
        String message=lessonMngPage.nullOfCreditScore.getText();
        Assert.assertEquals("Required",message);

    }
    @Then("Vice Deans input invalid {string}")
    public void vice_deans_input_invalid(String string) {
        WaitUtils.waitForVisibility(lessonMngPage.creditScoreInput,3).sendKeys(string);
    }
    @Then("Verify input invalid credit score.")
    public void verify_input_invalid_credit_score() {
        Assert.assertTrue(WaitUtils.waitForVisibility(lessonMngPage.invalidCreditScore,10).isDisplayed());
    }

    }


