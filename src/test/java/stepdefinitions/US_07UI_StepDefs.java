package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ViceDeanMngPage;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US_07DeanMessagesStepDefs {
    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();
    ViceDeanMngPage viceDeanMngPage=new ViceDeanMngPage();
    @Given("Dean goes to {string}")
    public void deanGoesTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));

    }
    @When("Dean clicks the login button")
    public void deanClicksTheLoginButton() {
        homePage.loginHome.click();
    }

    @And("Dean enters {string} on login page")
    public void deanEntersOnLoginPage(String arg0) {


        loginPage.userName.sendKeys(arg0);
    }

    @And("Dean enters {string} on the login page")
    public void deanEntersOnTheLoginPage(String arg0) {
       loginPage.password.sendKeys(arg0);
    }

    @And("Dean clicks the loginBlue button")
    public void deanClicksTheLoginBlueButton() {
        loginPage.loginButton.click();
    }

    @And("Dean clicks the menu option on the page that opens")
    public void deanClicksTheMenuOptionOnThePageThatOpens() {
        viceDeanMngPage.menuButton.click();
    }

    @And("Dean clicks {string}option from main menu")
    public void deanClicksOptionFromMainMenu(String arg0) {
        viceDeanMngPage.contactGetAllLink.click();
    }

    @And("Dean comes to contact message page")
    public void deanComesToContactMessagePage() {

    }
}
