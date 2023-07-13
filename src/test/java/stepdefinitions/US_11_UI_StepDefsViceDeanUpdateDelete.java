package stepdefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US_11_StepDefsViceDeanUpdateDelete {

    LoginPage loginPage = new LoginPage();
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @Given("the user goes to {string}")
    public void the_user_goes_to(String string) {


    }
    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {



    }
    @When("the user enters username {string}")
    public void the_user_enters_username(String string) {
        loginPage.userName.sendKeys(ConfigReader.getProperty("ViceDeanAthena"));

    }
    @When("the user enters password {string}")
    public void the_user_enters_password(String string) {
        loginPage.password.sendKeys(ConfigReader.getProperty("12345678"));

    }
    @Then("the user click on Login button")
    public void the_user_click_on_login_button() {
        loginPage.loginButton.click();
    }
    @When("user clicks on Lesson program {string}")
    public void user_clicks_on_lesson_program(String string) {
        WaitUtils.waitFor(2);


    }
    @Then("user can view the lesson schedule for each program")
    public void userCanViewTheLessonScheduleForEachProgram() {

    }

    @Given("user in logged in as a vice dean")
    public void user_in_logged_in_as_a_vice_dean() {

    }
    @When("user goes to the program list page")
    public void user_goes_to_the_program_list_page() {

    }
    @When("user clicks the {string} button")
    public void user_clicks_the_button(String string) {

    }
    @Then("user can update the lesson schedule for each program")
    public void user_can_update_the_lesson_schedule_for_each_program() {

    }

    @Given("user logged in as a vice dean")
    public void user_logged_in_as_a_vice_dean() {

    }
    @When("user clicks the {string} button next to a program")
    public void user_clicks_the_button_next_to_a_program(String string) {

    }
    @Then("the program is deleted from the list")
    public void the_program_is_deleted_from_the_list() {

    }


}