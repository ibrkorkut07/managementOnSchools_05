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
import utilities.WaitUtils;

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
        guestList.guestuserlink.click();

    }

    @Then("assert the list contains guest-user")
    public void assertTheListContainsGuestUser() {
        Assert.assertTrue(guestList.guestlisttext.isDisplayed());

    }

    @And("go to second page")
    public void goToSecondPage() {
        WaitUtils.waitFor(3);
        ReusableMethods.waitForClickablility(guestList.Secondpage,5);
      //  guestList.Secondpage.click();
    }
    @Then("assert the list contains User Name")
    public void assertTheListContainsUserName() {
        Assert.assertTrue(guestList.Usernametext.isDisplayed());

    }
    @Then("close the app")
    public void close_the_app() {
        Driver.closeDriver();

    }

}
