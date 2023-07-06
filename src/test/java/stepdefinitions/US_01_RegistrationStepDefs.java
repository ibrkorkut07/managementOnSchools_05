package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.Driver;
import utilities.WaitUtils;

public class US_01_RegistrationStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage regPage = new RegisterPage();
    @When("user clicks on Register link")
    public void user_clicks_on_register_link() {
        regPage.registerLink.click();
    }
    @When("user clicks on Name box & enters a {string}")
    public void user_clicks_on_name_box_enters_a(String string) {
        regPage.nameBox.sendKeys(string);
    }
    @When("user tests the Required text under the Name box is NOT displayed")
    public void user_tests_the_required_text_under_the_name_box_is_not_displayed() {
        Assert.assertFalse(regPage.nameBoxRequiredText.isDisplayed());
    }

    @And("user leaves the Name box blank and clicks somewhere out of Name Box")
    public void userLeavesTheNameBoxBlankAndClicksSomewhereOutOfNameBox() {
        regPage.nameBox.sendKeys("");
        regPage.outOfAnyBox.click();
    }

    @Then("user tests the Required text under the Name box is displayed")
    public void userTestsTheRequiredTextUnderTheNameBoxIsDisplayed() {
        Assert.assertTrue(regPage.nameBoxRequiredText.isDisplayed());
    }

    @And("user clicks on Name box")
    public void userClicksOnNameBox() {
        regPage.nameBox.click();
    }
}
