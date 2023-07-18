package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ViceDeanMngPage;

public class US_25_AdminCreatesStudent {
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    LoginPage loginPage = new LoginPage();



    @When("user clicks on the login link")
    public void userClicksOnTheLoginLink() {

        viceDeanMngPage.homeLoginLink.click();

    }

    @And("user enters username {string}")
    public void userEntersUsername(String arg0) {

        viceDeanMngPage.usernameBox.sendKeys("Project09Admin");
    }


    @And("user enters admin password {string}")
    public void userEntersAdminPassword(String arg0) {

        viceDeanMngPage.passwordBox.sendKeys("12345678");

    }

    @And("user clicks on login button to enter")
    public void userClicksOnLoginButtonToEnter() {

        viceDeanMngPage.loginButton.click();
    }

    @And("user clicks on student management link")
    public void userClicksOnStudentManagementLink() {

        viceDeanMngPage.studentManagementLink.click();


    }


}