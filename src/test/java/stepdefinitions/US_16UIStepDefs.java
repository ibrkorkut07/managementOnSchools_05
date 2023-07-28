package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.us14.US14AdminHomePage;
import pages.us14.US14LoginPage;
import pages.us14.US14ViceDeanHomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_16UIStepDefs {

    LoginPage loginPage=new LoginPage();
    US14LoginPage us14LoginPage = new US14LoginPage();
    US14AdminHomePage us14AdminHomePage = new US14AdminHomePage();
    Faker faker = new Faker();
    US14ViceDeanHomePage us14ViceDeanHomePage = new US14ViceDeanHomePage();


    @When("User clicks on the Contact Get All  option from Main Menu window")
    public void user_clicks_on_the_contact_get_all_option_from_main_menu_window() throws InterruptedException {
        us14ViceDeanHomePage.contactGetAllOption.click();
        Thread.sleep(3000);
    }


    @Then("User verifies that {string} title is displayed and can view {string}, {string}, {string}, {string} and {string} information.")
    public void userVerifiesThatTitleIsDisplayedAndCanViewAndInformation(String expectedContactMessageTitle, String expectedAuthorName, String expectedAuthorEmail, String expectedSentEmailDate, String expectedSentSubject, String expectedSentMessage) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(expectedContactMessageTitle,us14ViceDeanHomePage.actualContactMessageTitle.getText());

        Assert.assertEquals(expectedAuthorName,us14ViceDeanHomePage.actualAuthorName.getText());
        Assert.assertEquals(expectedAuthorEmail,us14ViceDeanHomePage.actualAuthorEmail.getText());
        Assert.assertEquals(expectedSentEmailDate,us14ViceDeanHomePage.actualSentEmailDate.getText());
        Assert.assertEquals(expectedSentSubject,us14ViceDeanHomePage.actualSentSubject.getText());
        Assert.assertEquals(expectedSentMessage,us14ViceDeanHomePage.actualSentMessage.getText());
    }

   // @Then("User verifies that contact message page title {string} is displayed")
  //  public void userVerifiesThatContactMessagePageTitleIsDisplayed(String expectedContactMessageTitle) {
    //    Assert.assertEquals(expectedContactMessageTitle, us14ViceDeanHomePage.actualContactMessageTitle.getText());
   // }

   // @Then("user verifies that there is no Delete button in contact message page by getting screenshot.")
  //  public void userVerifiesThatThereIsNoDeleteButtonInContactMessagePageByGettingScreenshot() throws IOException {
       // ReusableMethods.getScreenshot("contactMessagePage");
   // }

   // @And("User close the application page.")
  //  public void userCloseTheApplicationPage() {
      //  Driver.getDriver().close();
  //  }
}

