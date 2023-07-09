package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.WaitUtils;

import javax.swing.*;

import static utilities.Driver.driver;

public class US_01_RegistrationStepDefs {

    HomePage homePage = new HomePage();
    RegisterPage regPage = new RegisterPage();

    /*
    @When("user clicks on Register link")
     public void user_clicks_on_register_link() {
        regPage.registerLink.click();
    }
    */

    @When("user clicks on Name box & enters a {string}")
    public void user_clicks_on_name_box_enters_a(String string) {
        regPage.nameBox.sendKeys(string);
    }

    @When("user tests the Required text under the Name box is NOT displayed")
    public void user_tests_the_required_text_under_the_name_box_is_not_displayed() {
        Assert.assertFalse(regPage.nameBoxRequiredText.isDisplayed());
    }

    @And("user leaves the Name box blank")
    public void userLeavesTheNameBoxBlank() {
        // regPage.nameBox.sendKeys("");
        regPage.outOfAnyBox.click();
    }

    @And("user clicks somewhere out of any Box")
    public void userLeavesTheNameBoxBlankAndClicksSomewhereOutOfanyBox() {
        regPage.nameBox.sendKeys("");
        regPage.outOfAnyBox.click();
    }

    @Then("the Required text under the Name box is displayed")
    public void theRequiredTextUnderTheNameBoxIsDisplayed() {
        Assert.assertTrue(regPage.nameBoxRequiredText.isDisplayed());
    }

    @And("user clicks on Name box")
    public void userClicksOnNameBox() {
        regPage.nameBox.click();
    }

    @When("user clicks on {string}")
    public void userClicksOn(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("user enters a space as a name")
    public void userEntersASpaceAsAName() {
        regPage.nameBox.sendKeys(" ");
    }

    @Then("the Required text under the Name box is NOT displayed")
    public void theRequiredTextUnderTheNameBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.nameBoxRequiredText.isDisplayed());
    }

    @And("user clicks on Surname box")
    public void userClicksOnSurnameBox() {
        regPage.surnameBox.click();
    }

    @And("user leaves the Surname box blank")
    public void userLeavesTheSurnameBoxBlank() {
        regPage.outOfAnyBox.click();
    }

    @Then("the Required text under the Birth Place box is displayed")
    public void theRequiredTextUnderTheBirthPlaceBoxIsDisplayed() {
        Assert.assertTrue(regPage.birthplaceBoxRequiredText.isDisplayed());
    }


    @Then("the Required text under the Surname box is displayed")
    public void theRequiredTextUnderTheSurnameBoxIsDisplayed() {
        Assert.assertTrue(regPage.surnameBoxRequiredText.isDisplayed());
    }

    @Then("the Required text under the Surname box is NOT displayed")
    public void theRequiredTextUnderTheSurnameBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.surnameBoxRequiredText.isDisplayed());
    }

    @And("user enters a space as a surname")
    public void userEntersASpaceAsASurname() {
        regPage.surnameBox.sendKeys(" ");
    }

    @And("user enters {string} as surname")
    public void userEntersAsSurname(String surname) {
        regPage.surnameBox.sendKeys(surname);
    }

    @And("user enters {string} as a name")
    public void userEntersAsAName(String name) {
        regPage.nameBox.sendKeys(name);
    }

    @And("user clicks on Birth Place box")
    public void userClicksOnBirthPlaceBox() {
        regPage.birthplaceBox.click();
    }

    @And("user leaves the Birth Place box blank")
    public void userLeavesTheBirthPlaceBoxBlank() {
        // regPage.birthplaceBox.sendKeys("");
        regPage.birthplaceBox.click();
    }

    @Then("the Required text under the Birth Place box is NOT displayed")
    public void theRequiredTextUnderTheBirthPlaceBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.birthplaceBoxRequiredText.isDisplayed());
    }

    @And("user enters {string}  as a birth place")
    public void userEntersAsABirthPlace(String birthplace) {
        regPage.birthplaceBox.sendKeys(birthplace);
    }

    @And("user enters a space as a birth place")
    public void userEntersASpaceAsABirthPlace() {
        regPage.birthplaceBox.sendKeys(" ");
    }

    @When("user scrolls into Gender section")
    public void user_scrolls_into_gender_section() {
        ReusableMethods.scrollDownActions();
        WaitUtils.waitFor(2);
    }
    @When("user clicks on Female Radio button and selects Female as a gender")
    public void user_clicks_on_female_radio_button_and_selects_female_as_a_gender() {
        regPage.femaleRadioButton.click();
        Assert.assertTrue(regPage.femaleRadioButton.isSelected());
    }

    @And("user clicks on Male Radio button and selects Male as a gender")
    public void userClicksOnMaleRadioButtonAndSelectsMaleAsAGender() {
        regPage.maleRadioButton.click();
        Assert.assertTrue(regPage.maleRadioButton.isSelected());
    }

    @And("user scrolls into User Name box")
    public void userScrollsIntoUserNameBox() {
        ReusableMethods.scrollIntoView(regPage.usernameBox);
    }

    @And("user enters a User Name")
    public void userEntersAUserName() {
        regPage.usernameBox.sendKeys("ibr");
    }

    @Then("the Required text under the User Name box is NOT displayed")
    public void theRequiredTextUnderTheUserNameBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.surnameBoxRequiredText.isDisplayed());
    }

    @Then("the Required text under the User Name box is displayed")
    public void theRequiredTextUnderTheUserNameBoxIsDisplayed() {
        Assert.assertTrue(regPage.passwordBoxRequiredText.isDisplayed());
    }

    @And("user enters a Password")
    public void userEntersAPassword() {
        regPage.passwordBox.sendKeys("1234567a");
    }

    @Then("the Required text under the Password box is NOT displayed")
    public void theRequiredTextUnderThePasswordBoxIsNOTDisplayed() {
        Assert.assertTrue(regPage.passwordBoxRequiredText.isDisplayed());
    }

    @And("user clicks on Password box & leaves it blank")
    public void userClicksOnPasswordBoxLeavesItBlank() {
        regPage.passwordBox.click();
    }

    @Then("the Required text under the Password box is displayed")
    public void theRequiredTextUnderThePasswordBoxIsDisplayed() {
        Assert.assertTrue(regPage.passwordBoxRequiredText.isDisplayed());
    }

    @Then("Minimum {int} character text under the Password box is displayed")
    public void minimumCharacterTextUnderThePasswordBoxIsDisplayed(int arg0) {
        Assert.assertTrue(regPage.minimum8CharacterText.isDisplayed());
    }

    @And("user clicks User Name box")
    public void userClicksUserNameBox() {
        regPage.usernameBox.click();
    }

    @And("user enters a Password with less than {int} characters")
    public void userEntersAPasswordWithLessThanCharacters(int arg0) {
        regPage.passwordBox.sendKeys("1234567");
    }

    @And("user clicks on Phone box")
    public void userClicksOnPhoneBox() {
        regPage.phoneBox.click();
    }

    @And("user enters a valid {int}-character phone number")
    public void userEntersAValidCharacterPhoneNumber(int arg0) {
        regPage.phoneBox.sendKeys("123456789012");
    }


    @Then("the Required text under the Phone box is displayed")
    public void theRequiredTextUnderThePhoneBoxIsDisplayed() {
        Assert.assertTrue(regPage.phoneBoxRequiredText.isDisplayed());
    }

    @Then("the Required text under the Phone box is NOT displayed")
    public void theRequiredTextUnderThePhoneBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.phoneBoxRequiredText.isDisplayed());
    }

    @Then("Minimum_{int}_Character text under the Phone box is NOT displayed")
    public void minimum__CharacterTextUnderThePhoneBoxIsNOTDisplayed(int arg0) {
        Assert.assertFalse(regPage.minimum12CharacterText.isDisplayed());
    }

    @And("user enters a less than {int}-character invalid phone number")
    public void userEntersALessThanCharacterInvalidPhoneNumber(int arg0) {
        regPage.phoneBox.sendKeys("12345678901");
    }

    @Then("Minimum_{int}_Character text under the Phone box is displayed")
    public void minimum__CharacterTextUnderThePhoneBoxIsDisplayed(int arg0) {
        Assert.assertTrue(regPage.minimum12CharacterText.isDisplayed());
    }

    @And("user clicks on Date of Birth box")
    public void userClicksOnDateOfBirthBox() {
        regPage.birthdayBox.click();
    }

    @And("user enters {int}-digit mmddyyyy Birth Date")
    public void userEntersDigitMmddyyyyBirthDate(int arg0) {
        regPage.birthdayBox.sendKeys("11223333");
    }

    @Then("the Required text under the Date of Birth box is NOT displayed")
    public void theRequiredTextUnderTheDateOfBirthBoxIsNOTDisplayed() {
        Assert.assertFalse(regPage.dateofbirthBoxRequiredText.isDisplayed());
    }

    @Then("the Required text under the Date of Birth box is displayed")
    public void theRequiredTextUnderTheDateOfBirthBoxIsDisplayed() {
        Assert.assertTrue(regPage.dateofbirthBoxRequiredText.isDisplayed());
    }

    @And("user enters {string}  as a birth date")
    public void userEntersAsABirthDate(String birthDate) {
        regPage.birthdayBox.sendKeys(birthDate);
    }

    @And("user scrolls down to Date of Birth box")
    public void userScrollsDownToDateOfBirthBox() {
        // ReusableMethods.scrollIntoView(regPage.birthdayBox);
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.scrollDownActions();
        ReusableMethods.waitFor(1);

    }

    @And("user clicks out of Date of Birth box \\(ssn box)")
    public void userClicksOutOfDateOfBirthBoxSsnBox() {
        regPage.ssnBox.click();
    }

    @And("user enters {string}, {string}, {string}  as a birth date")
    public void userEntersAsABirthDate(String mm, String dd, String yyyy) {
        regPage.birthdayBox.sendKeys(mm + Keys.ARROW_RIGHT + dd + Keys.ARROW_RIGHT + yyyy);
        ReusableMethods.waitFor(2);

    }
}
