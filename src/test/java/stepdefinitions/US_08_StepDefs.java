package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Background;
import pages.LessonMngPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08_StepDefs {
    LoginPage loginPage = new LoginPage();
    LessonMngPage lessonMngPage = new LessonMngPage();
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

    }


