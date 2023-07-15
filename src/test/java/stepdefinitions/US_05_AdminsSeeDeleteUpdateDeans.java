package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AdminMngPage;
import pages.DeanMngPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import static utilities.Driver.driver;


public class US_05_AdminsSeeDeleteUpdateDeans {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminMngPage adminMngPage = new AdminMngPage();



    DeanMngPage deanMngPage=new DeanMngPage();
    public CharSequence adminPasssword;

    @Then("Admin verify to see Name of Deans")
    public void admin_verify_to_see_name_of_deans() {

        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();

        Assert.assertTrue(deanMngPage.firstNameonDeanList.isDisplayed());

        }


    @Then("Admin verify to see Gender of Deans")
    public void admin_verify_to_see_gender_of_deans() {

    Assert.assertTrue(deanMngPage.firstGenderOnDeanList.isDisplayed());

    }
    @Then("Admin verify to see Phone Number of Deans")
    public void admin_verify_to_see_phone_number_of_deans() {

    Assert.assertTrue(deanMngPage.firstPhoneNumberOnDeanList.isDisplayed());
    }
    @Then("Admin verify to see SSN of Deans")
    public void admin_verify_to_see_ssn_of_deans() {
    Assert.assertTrue(deanMngPage.firstSsnOnDeanList.isDisplayed());


    }
    @Then("Admin verify to see User Name of Deans")
    public void admin_verify_to_see_user_name_of_deans() {

    Assert.assertTrue(deanMngPage.firstUserNameOnDeanList.isDisplayed());

    }
    @Then("Click on Delete button")
    public void click_on_delete_button() {

    }


    @Then("Admin verify that Dean was deleted")
    public void adminVerifyThatDeanWasDeleted() {



    }

    @Then("click the {string} button")
    public void clickTheButton(String arg0) throws InterruptedException {
        ReusableMethods.waitFor(3);


        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();


        deanMngPage.editButton.click();



    }

    @Then("Enters different data into name field in the edit window")
    public void entersDifferentDataIntoNameFieldInTheEditWindow() {

        deanMngPage.firstNameToUpdate.click();
        deanMngPage.firstNameToUpdate.sendKeys("xxxxx");






        
    }

    @Then("click the submit button in the edit window")
    public void clickTheSubmitButtonInTheEditWindow() {

        deanMngPage.maleButtonOnEditDean.click();

        WaitUtils.waitFor(3);
        deanMngPage.passwordBox.sendKeys("12345678");

        deanMngPage.submitButtonOnEditDean.click();

        WaitUtils.waitFor(3);



    }

    @Then("close the edit window")
    public void closeTheEditWindow() {

        
    }

    @Then("verify that Dean's name has been updated")
    public void verifyThatDeanSNameHasBeenUpdated() {
    }
}
