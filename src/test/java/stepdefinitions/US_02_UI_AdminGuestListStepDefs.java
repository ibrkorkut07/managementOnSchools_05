package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.GuestList;
import pages.HomePage;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_02_UI_AdminGuestListStepDefs {

    GuestList guestList = new GuestList();
    HomePage homePage = new HomePage();

    @Given("admin click on Menu section")
    public void adminClickOnMenuSection() {
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
        WaitUtils.waitFor(1);
        ReusableMethods.scrollDownActions();
      guestList.Secondpage.click();
    }

    @Then("assert the list contains User Name")
    public void assertTheListContainsUserName() {
        Assert.assertTrue(guestList.Usernametext.isDisplayed());
    }

    @And("Click the delete button")
    public void clickTheDeleteButton() {
        WaitUtils.waitFor(1);
        guestList.Deletebutton.click();
    }

    @Then("Assert the pop-up contains Guest User deleted")
    public void assertThePopUpContainsGuestUserDeleted() {
        WaitUtils.waitFor(1);
       String alertText = guestList.alert.getText();
       Assert.assertTrue(alertText.contains("Guest User deleted"));
    }
}
