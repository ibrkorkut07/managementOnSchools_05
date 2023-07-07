package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngPage;
import pages.CommonCredentialsPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class US_04_AddDeanStepDefs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminMngPage adminMngPage = new AdminMngPage();
    CommonCredentialsPage commonCredentialsPage = new CommonCredentialsPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));

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

        adminMngPage.menuLink.click();

    }
    @Then("user clicks on dean management option")
    public void user_clicks_on_dean_management_option() {

        adminMngPage.deanManagementLink.click();
    }


    @Then("user enters name {string}")
    public void user_enters_name(String name) {


    @Then("user enters surname {string}")
    public void user_enters_surname(String surname) {


        commonCredentialsPage.surname.sendKeys(surname);

    }
    @Then("user enters birth place {string}")
    public void user_enters_birth_place(String birthPlace) {

        commonCredentialsPage.birthPlace.sendKeys(birthPlace);

    }
    @Then("user clicks on gender")
    public void user_clicks_on_gender() {

        commonCredentialsPage.genderMale.click();
    }
    @And("user enters date of birth {string}")
    public void userEntersDateOfBirth(String dateofbirth) {

        commonCredentialsPage.dateOfBirth.sendKeys(dateofbirth);

    }
    @Then("user enters phone number {string}")
    public void user_enters_phone_number(String phoneNumber) {

        commonCredentialsPage.phoneNumber.sendKeys(phoneNumber);

    }
    @Then("user enters dean password {string}")
    public void user_enters_dean_password(String password) {

        commonCredentialsPage.password.sendKeys(password);

    }
    @Then("assert alert message")
    public void assert_alert_message() {

        WaitUtils.waitFor(1);
        String alertText = adminMngPage.alert.getText();
        assertTrue(alertText.contains("Dean Saved"));

    }
    @Then("close the application")
    public void close_the_application() {

//        WaitUtils.waitFor(2);
//        Driver.closeDriver();

    }


    @And("user enters ssn number {string}")
    public void userEntersSsnNumber(String ssn) {

        commonCredentialsPage.ssn.sendKeys(ssn);

    }

    @And("user enters username for dean {string}")
    public void userEntersUsernameForDean(String userName) {

        commonCredentialsPage.username.sendKeys(userName);

    }

    @And("user clicks submit button")
    public void userClicksSubmitButton() {

        adminMngPage.submitButton.click();

    }


    @And("user enters dean name {string}")
    public void userEntersDeanName(String deanName) {

        adminMngPage.deanName.sendKeys(deanName);

    }
}

