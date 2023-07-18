package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.WaitUtils;

public class US_25_AdminCreatesStudentStepdefs {
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {

    homePage.loginHome.click();
        WaitUtils.waitFor(1);
    }

    @And("user enters username {string}")
    public void userEntersUsername(String arg0) {

 loginPage.userName.sendKeys("Project09Admin");
        WaitUtils.waitFor(1);
    }

    @And("user clicks on login button for enter")
    public void userClicksOnLoginButtonForEnter() {
  loginPage.loginButton.click();

    }







}
