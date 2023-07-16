package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForVisibility;


public class US_03_Contact {
    public static void main(String[] args) {

    }

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ContactPage contactPage = new ContactPage();



    @Given("user goes to {string}")
    public void user_goes_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("MosUrl"));

    }


        @When("user clicks on Contact button")
        public void user_clicks_on_Contact_button() {
            contactPage.contact.click();

        }
    @When("User fill out your name {string}")
    public void user_fill_out_your_name(String string) {
        contactPage.name.sendKeys("Ahmet01*");
        WaitUtils.waitFor(3);

    }

    @When("user click on your name field")
    public void user_click_on_your_name_field() {
        contactPage.name.click();
        WaitUtils.waitFor(3);

    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
        WaitUtils.waitFor(3);

    }

    @Then("user click your email")
    public void user_click_your_email() {
        contactPage.email.click();
        WaitUtils.waitFor(3);

    }

    @When("user fill out your email fill out {string}")
    public void user_fill_out_your_email_fill_out(String string) {
        contactPage.email.sendKeys("sdkahmtshn");
        WaitUtils.waitFor(3);

    }

    @Then("User click subject")
    public void user_click_subject() {
        contactPage.subject.click();
        WaitUtils.waitFor(3);

    }

    @Then("user fill out your email {string}")
    public void user_fill_out_your_email(String string) {
        contactPage.email.sendKeys("sdkahmtshn@gmail.com");
        WaitUtils.waitFor(3);

    }

    @Then("user fill out subject {string}")
    public void user_fill_out_subject(String string) {
        contactPage.subject.sendKeys("deneme");
        WaitUtils.waitFor(3);

    }

    @When("user click subject field")
    public void user_click_subject_field() {
        contactPage.subject.click();
        WaitUtils.waitFor(3);

    }
    @When("user fill out message {string}")
    public void user_fill_out_message(String string) {
        contactPage.message.sendKeys("deneme01");
        WaitUtils.waitFor(3);

    }

    @When("user click message")
    public void user_click_message() {
        contactPage.message.click();
        WaitUtils.waitFor(3);

    }

    @When("user click message field")
    public void user_click_message_field() {
        contactPage.message.click();
        WaitUtils.waitFor(3);

    }

    @When("user click send message")
    public void user_click_send_message() {
        waitForVisibility(contactPage.send_message,10).submit();
        waitFor(2);


    }


    @Then("full-page screenshot is taken")
    public void fullPageScreenshotlsTaken()throws
            IOException {
        ReusableMethods.fullpageScreenshot();
    }


    }





