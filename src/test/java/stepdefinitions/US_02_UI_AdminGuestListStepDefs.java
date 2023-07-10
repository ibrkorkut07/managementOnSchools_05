package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AdminMngPage;
import pages.GuestList;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_02_UI_AdminGuestListStepDefs {

    GuestList guestList = new GuestList();
    HomePage homePage = new HomePage();

    @Given("admin click on Menu section")
    public void adminClickOnMenuSection() {
       // ReusableMethods.waitForClickablility(guestList.Menubutton,3);
        homePage.Menubutton.click();
    }

    @And("admin click Guest User on pop-up")
    public void adminClickGuestUserOnPopUp() {
        homePage.guestuserlink.click();

    }

    @Then("assert the title contains guest-user")
    public void assertTheTitleContainsGuestUser() {
        Assert.assertTrue(homePage.guestlisttext.isDisplayed());

    }

    @Then("close the app")
    public void close_the_app() {
        Driver.closeDriver();

    }


}
