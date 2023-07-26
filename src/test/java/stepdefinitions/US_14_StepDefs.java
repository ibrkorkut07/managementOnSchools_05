package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.us14.US14AdminHomePage;
import pages.us14.US14LoginPage;
import pages.us14.US14ViceDeanHomePage;
import utilities.Driver;

public class US_14_StepDefs {

    LoginPage loginPage=new LoginPage();
    US14LoginPage us14LoginPage = new US14LoginPage();
    US14AdminHomePage us14AdminHomePage = new US14AdminHomePage();
    Faker faker = new Faker();
    US14ViceDeanHomePage us14ViceDeanHomePage = new US14ViceDeanHomePage();


    @When("User clicks on login button")
    public void user_clicks_on_login_button()
    {
        loginPage.loginButton.click();
    }
    @When("User enters valid admin credentials Username {string} and password {string}")
    public void user_enters_valid_admin_credentials_username_and_password(String UserName, String Password) {
        loginPage.userName.sendKeys(UserName);
        loginPage.password.sendKeys(Password);
    }
    @When("User clicks on login button.")
    public void userClicksOnLoginButton() {
        us14LoginPage.loginButton.click();
    }

    @Then("User verifies that {string} title is displayed on the admin home page")
    public void user_verifies_that_title_is_displayed_on_the_admin_home_page(String expectedAdminHomeTitle) {
        Assert.assertEquals(expectedAdminHomeTitle,us14AdminHomePage.ActualAdminHomeTitle.getText());
    }

    @Then("User clicks on Menu button")
    public void user_clicks_on_menu_button() {
        us14AdminHomePage.menuButton.click();
    }
    @Then("User verifies that {string} title is displayed in new window")
    public void user_verifies_that_title_is_displayed_in_new_window(String expectedMainMenuTitle) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(expectedMainMenuTitle,us14AdminHomePage.ActualMainMenuTitle.getText());
    }
    @When("User clicks on the Vice Dean Management option from Main Menu window")
    public void user_clicks_on_the_vice_dean_management_option_from_main_menu_window() {
        us14AdminHomePage.viceDeanManagementOption.click();
    }
    @Then("User verifies that {string} title is displayed")
    public void user_verifies_that_title_is_displayed(String expectedViceDeanManagementTitle) {
        Assert.assertEquals(expectedViceDeanManagementTitle,us14AdminHomePage.actualViceDeanManagementTitle.getText());
    }
    @Then("User enters valid data {string} {string}, {string}, {string}, {string}, {string}, {string},{string} and {string} to the vice dean list")
    public void user_enters_valid_data_and_to_the_vice_dean_list(String string, String string2, String madrid, String string4, String birthDate, String phoneNumber, String ssn, String username, String password) {
        us14AdminHomePage.nameInput.sendKeys(faker.name().firstName());
        us14AdminHomePage.surnameInput.sendKeys(faker.name().lastName());
        us14AdminHomePage.birthPlaceInput.sendKeys(madrid);
        us14AdminHomePage.femaleCheckBox.click();
        us14AdminHomePage.birthDateInput.sendKeys(birthDate);
        us14AdminHomePage.phoneNumberInput.sendKeys(phoneNumber);
        us14AdminHomePage.ssnInput.sendKeys(ssn);
        us14AdminHomePage.usernameInput.sendKeys(username);
        us14AdminHomePage.passwordInput.sendKeys(password);
    }
    @Then("User clicks on Submit button")
    public void user_clicks_on_submit_button() throws InterruptedException {
        Thread.sleep(2000);
        us14AdminHomePage.submitButton.click();
    }


    @And("User clicks on Menu button.")
    public void userClicksOnMenuButton() {
        us14AdminHomePage.menuButton2.click();
    }

    @Then("User clicks on Logout option")
    public void user_clicks_on_logout_option() {
        us14AdminHomePage.logOutOption.click();
    }

    @And("user clicks on Yes button")
    public void userClicksOnYesButton() {
        us14AdminHomePage.yesButton.click();
    }

    @When("User enters valid vice dean credentials {string} and {string}")
    public void userEntersValidViceDeanCredentialsAnd(String username, String password) {
        loginPage.userName.click();
        loginPage.userName.clear();
        loginPage.userName.sendKeys(username);
        loginPage.password.click();
        loginPage.password.clear();
        loginPage.password.sendKeys(password);
    }

    @And("User clicks on Login button of vice dean home page.")
    public void userClicksOnLoginButtonOfViceDeanHomePage() {
        us14LoginPage.loginButton.click();
    }



    @Then("User verifies that {string}  page is displayed")
    public void user_verifies_that_page_is_displayed(String expectedTermManagementTitle) {
        Assert.assertEquals(expectedTermManagementTitle,us14ViceDeanHomePage.actualEducationTermManagementTitle.getText());

    }

    @And("User clicks on Menu button of education term management page.")
    public void userClicksOnMenuButtonOfEducationTermManagementPage() throws InterruptedException {
        Thread.sleep(2000);
        us14ViceDeanHomePage.menuButton3.click();
    }


    @Then("User clicks on the Teacher Management option from Main Menu window")
    public void user_clicks_on_the_teacher_management_option_from_main_menu_window() throws InterruptedException {
        Thread.sleep(3000);
        us14ViceDeanHomePage.teacherManagementOption.click();

    }
    @Then("User verifies that {string} title is displayed.")
    public void userVerifiesThatTitleIsDisplayed(String expectedTeacherManagementTitle) {
        Assert.assertEquals(expectedTeacherManagementTitle,us14ViceDeanHomePage.actualTeacherManagementTitle.getText());
    }



}

