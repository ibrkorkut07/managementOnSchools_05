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
public class US_16UIStepDefs {

    LoginPage loginPage=new LoginPage();
    US14LoginPage us14LoginPage = new US14LoginPage();
    US14AdminHomePage us14AdminHomePage = new US14AdminHomePage();
    Faker faker = new Faker();
    US14ViceDeanHomePage us14ViceDeanHomePage = new US14ViceDeanHomePage();


    @When("User clicks on the Contact Get All  option from Main Menu window")
    public void user_clicks_on_the_contact_get_all_option_from_main_menu_window() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User verifies that {string} title is displayed and can view messages, their authors, emails, sending date and subject information .")
    public void user_verifies_that_title_is_displayed_and_can_view_messages_their_authors_emails_sending_date_and_subject_information(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

