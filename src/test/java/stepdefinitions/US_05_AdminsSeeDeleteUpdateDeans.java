package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdminMngPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US_05_AdminsSeeDeleteUpdateDeans {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminMngPage adminMngPage = new AdminMngPage();







    @Then("Admin verify to see information of Dean's")
    public void adminVerifyToSeeInformationOfDeanS() {

        Asser assert tru is dis

    }

    @Then("Click on {string} button")
    public void clickOnButton(String arg0) {
        
    }

    @Then("Admin verify that Dean was deleted")
    public void adminVerifyThatDeanWasDeleted() {
        
    }

    @Then("click the {string} button")
    public void clickTheButton(String arg0) {
        
    }

    @Then("Enters different data into name field in the edit window")
    public void entersDifferentDataIntoNameFieldInTheEditWindow() {
        
    }

    @Then("click the submit button in the edit window")
    public void clickTheSubmitButtonInTheEditWindow() {
        
    }

    @Then("close the edit window")
    public void closeTheEditWindow() {
        
    }

    @Then("verify that Dean's name has been updated")
    public void verifyThatDeanSNameHasBeenUpdated() {
    }
}
