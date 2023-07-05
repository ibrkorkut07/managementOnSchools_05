package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.WaitUtils;

public class US_04_AddDeanStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {

        Driver.getDriver().get(url);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

        homePage.loginHome.click();

    }
    @When("user enters username {string}")
    public void user_enters_username(String adminUserName) {

        loginPage.userName.sendKeys(adminUserName);

    }
    @When("user enters admin password {string}")
    public void user_enters_admin_password(String adminPasssword) {

        loginPage.password.sendKeys(adminPasssword);

    }

    @And("user clicks on login button for enter")
    public void userClicksOnLoginButtonForEnter() {

        loginPage.loginButton.click();
    }

    @Given("user clicks on menu")
    public void user_clicks_on_menu() {

    }
    @Then("user clicks on dean management option")
    public void user_clicks_on_dean_management_option() {

    }
    @Then("user enters name {string}")
    public void user_enters_name(String string) {

    }
    @Then("user enters surname {string}")
    public void user_enters_surname(String string) {

    }
    @Then("user enters birth place {string}")
    public void user_enters_birth_place(String string) {

    }
    @Then("user clicks on gender")
    public void user_clicks_on_gender() {

    }
    @Then("user enters date of birth")
    public void user_enters_date_of_birth() {

    }
    @Then("user enters phone number {string}")
    public void user_enters_phone_number(String string) {

    }
    @Then("user enters dean password {string}")
    public void user_enters_dean_password(String string) {

    }
    @Then("assert alert message")
    public void assert_alert_message() {

    }
    @Then("close the application")
    public void close_the_application() {

        WaitUtils.waitFor(2);
        Driver.closeDriver();

    }


}

