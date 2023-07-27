package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.ContactMessagePage;
import pages.ViceDeanMngPage;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.And;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReusableMethods;


public class US_07UI_StepDefs {

    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

    HomePage homePage= new HomePage();
    LoginPage loginPage= new LoginPage();
    ViceDeanMngPage viceDeanMngPage=new ViceDeanMngPage();
    ContactMessagePage contactMessagePage=new ContactMessagePage();

    public String expectedName = "Name";
    public String expectedEmail = "Email";
    public String expectedDate = "Date";
    public String expectedSubject = "Subject";
    public String expectedMessage = "Message";


    @Given("Dean goes to {string}")
    public void deanGoesTo(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));

    }
    @When("Dean clicks the login button")
    public void deanClicksTheLoginButton() {
        homePage.loginHome.click();
    }


    @And("Dean enters user name")
    public void deanEntersUserName() {
        contactMessagePage.loginUserName.sendKeys("DeanHacer");
    }
    @And("Dean enters password")
    public void deanEntersPassword() {
        contactMessagePage.loginPassword.sendKeys("12345678");
    }

    @And("Dean clicks the loginBlue button")
    public void deanClicksTheLoginBlueButton() {
        loginPage.loginButton.click();
    }

    @And("Dean clicks the menu option on the page that opens")
    public void deanClicksTheMenuOptionOnThePageThatOpens() {
        executor.executeScript("arguments[0].click();", viceDeanMngPage.menuButton);
    }

    @And("Dean clicks {string}option from main menu")
    public void deanClicksOptionFromMainMenu(String arg0) {
        viceDeanMngPage.contactGetAllLink.click();
    }

    @Then("Dean verifies that authors are displayed on the page")
    public void deanVerifiesThatAuthorsAreDisplayedOnThePage() {

        Assert.assertEquals(expectedName, contactMessagePage.name.getText());
    }

    @Then("Dean verifies emails are displayed on the page")
    public void deanVerifiesEmailsAreDisplayedOnThePage() {
        Assert.assertEquals(expectedEmail, contactMessagePage.email.getText());
    }

    @Then("Dean verifies that the date the messages were sent is displayed on the page")
    public void deanVerifiesThatTheDateTheMessagesWereSentIsDisplayedOnThePage() {
        Assert.assertEquals(expectedDate, contactMessagePage.date.getText());
    }

    @Then("Dean verifies that subject information is displayed on the page")
    public void deanVerifiesThatSubjectInformationIsDisplayedOnThePage() {
        Assert.assertEquals(expectedSubject, contactMessagePage.subject.getText());
    }

    @Then("Dean verifies that messages are displayed on the page")
    public void deanVerifiesThatMessagesAreDisplayedOnThePage() {
        Assert.assertEquals(expectedMessage, contactMessagePage.message.getText());
    }

    @And("Dean clicks delete button")
    public void deanClicksdDeleteButton() {
        contactMessagePage.deleteButton.click();
    }

    @Then("Dean verifies messages have been deleted")
    public void deanVerifiesMessageHaveBeenDeleted() {
        String nameFirst = contactMessagePage.nameFirstCreated.getText();
        Assert.assertEquals(nameFirst, contactMessagePage.nameFirstCreated.getText());
    }

    @Then("Close the application")
    public void closeTheApplication() {
        Driver.closeDriver();
    }

    @And("Wait for second")
    public void waitForSecond() {
        ReusableMethods.waitFor(15);
    }
}