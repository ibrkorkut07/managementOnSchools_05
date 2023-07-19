package stepdefinitions;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;
import com.mongodb.client.model.geojson.LineString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import pages.HomePage;
import pages.ViceDeanMngPage;
import utilities.*;

import java.io.IOException;
import java.util.List;

public class US_15_ViceDeanCreatesStudentStepDefs {

    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();

    @When("vice dean clicks on Menü link")
    public void vice_dean_clicks_on_menü_link() {
        WaitUtils.waitFor(1);
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        viceDeanMngPage.menuButton.click();

    }
    @Then("vice dean clicks on Student Management option")
    public void vice_dean_clicks_on_student_management_option() {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        viceDeanMngPage.studentManagementLink.click();
    }
    @Given("vice dean choose advisor teacher {string}")
    public void vice_dean_choose_advisor_teacher(String advisorTeacher) {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        WaitUtils.waitFor(1);
        advisorTeacher = "878";
//        ReusableMethods.selectRandomTextFromDropdown();
        ReusableMethods.selectByValue(viceDeanMngPage.advisorTeacherButton,advisorTeacher);
    }

    @And("vice dean enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameSurnameBirthplaceEmailPhoneDateofbirthSsnUsernameFathernameMothernamePassword(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername,String password){
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }
    @Then("vice dean clicks on Submit button")
    public void vice_dean_clicks_on_submit_button() {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        WaitUtils.waitFor(1);
        viceDeanMngPage.addStudentSubmitButton.click();
    }
    @Then("verify student is created successfully message")
    public void verify_student_is_created_successfully_message() {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
//        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.studentSavedMessage);
        viceDeanMngPage.studentSavedMessage.isDisplayed();

    }
    @Then("verify student id should automatically appear")
    public void verify_student_id_should_automatically_appear() throws IOException {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
//        ReusableMethods.scrollIntoView(viceDeanMngPage.lastPageImage);
        ReusableMethods.scrollPageEndActions();
        JSUtils.scrollIntoViewJS(viceDeanMngPage.lastPageImage);
        WaitUtils.waitFor(1);
        JSUtils.clickWithTimeoutByJS(viceDeanMngPage.lastPageImage);
        WaitUtils.waitFor(2);
        JSUtils.scrollIntoViewJS(Driver.getDriver().findElement(By.xpath("//table[@class='table table-striped table-bordered table-hover']")));
//        List<WebElement> userNameTableList = Driver.getDriver().findElements(By.xpath("//table//tbody//tr//td[5]"));
//        String lastUserName = userNameTableList.get(userNameTableList.size()-1).getText();

        List<WebElement> allRows = Driver.getDriver().findElements(By.xpath("//table[@class='table table-striped table-bordered table-hover']"));
        int rowNum = 1;
        for(WebElement eachRow : allRows){
            System.out.println(rowNum + " : "+eachRow.getText());
            rowNum++;
        }
        System.out.println("LAST ROW DATA : "+allRows.get(allRows.size()-1).getText());
        MediaUtils.takeScreenshotOfTheEntirePage();

    }
    @Then("verify required message under fields")
    public void verifyRequiredMessageUnderFields() {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.requiredMessage);
    }

    @And("vice dean do not choose advisor teacher advisor teacher")
    public void viceDeanDoNotChooseAdvisorTeacherAdvisorTeacher() {
    }
    @Then("verify an error message is displayed indicating advisor teacher error")
    public void verifyAnErrorMessageIsDisplayedIndicatingAdvisorTeacherError() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.advisorTeacherError);
    }

    @And("vice dean do not choose gender")
    public void viceDeanDoNotChooseGender() {

    }

    @Then("verify an error message is displayed indicating invalid value error")
    public void verifyAnErrorMessageIsDisplayedIndicatingInvalidValueError() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.invalidValueError);
    }

    @And("vice dean enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameSurnameBirthplaceEmailPhoneDateofbirthUsernameFathernameMothernamePassword(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username, String fathername,String mothername,String password) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enter ssn {string} with an invalid format")
    public void viceDeanEnterSsnWithAnInvalidFormat(String ssn) {
        viceDeanMngPage.ssnBox.sendKeys(ssn);
    }

    @Then("verify a student with the SSN already exists")
    public void verifyAStudentWithTheSSNAlreadyExists() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.registeredSsnError);
    }

    @And("vice dean enters duplicate {string}")
    public void viceDeanEntersDuplicate(String ssn) {
        viceDeanMngPage.ssnBox.sendKeys(ssn);
    }

    @Then("verify an error message indicating Please enter valid SSN number")
    public void verifyAnErrorMessageIndicatingPleaseEnterValidSSNNumber() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.validSsnError);

    }

    @And("vice dean enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string}")
    public void viceDeanEntersNameSurnameBirthplaceEmailPhoneDateofbirthSsnUsernameFathernameMothername(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
    }

    @And("vice dean enters a {string} doesn't meet the lowercase uppercase number requirements")
    public void viceDeanEntersADoesnTMeetTheLowercaseUppercaseNumberRequirements(String password) {
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @Then("verify password error message is displayed")
    public void verifyPasswordErrorMessageIsDisplayed() {
    }

    @And("vice dean enters a {string} doesn't at least {int} char")
    public void viceDeanEntersADoesnTAtLeastChar(String password) {
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameSurnameBirthplaceEmailPhoneDateofbirthSsnFathernameMothernamePassword(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String ssn, String fathername,String mothername,String password) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters an {string} already exist")
    public void viceDeanEntersAnAlreadyExist(String username) {
        viceDeanMngPage.usernameBox.sendKeys(username);
    }

    @Then("verify an error message is displayed indicating username is already exist message")
    public void verifyAnErrorMessageIsDisplayedIndicatingUsernameIsAlreadyExistMessage() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.existUserNameError);
    }

    @And("vice dean enters name {string},surname {string},birthplace {string},email {string},phone {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameSurnameBirthplaceEmailPhoneSsnUsernameFathernameMothernamePassword(String name, String surname, String birthplace, String email, String phone, String ssn, String username, String fathername,String mothername,String password) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters invalid date of birth {string}")
    public void viceDeanEntersInvalidDateOfBirth(String dateofbirth) {
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
    }

    @Then("verify date of birth error message is displayed")
    public void verifyDateOfBirthErrorMessageIsDisplayed() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.jsonalert);
    }

    @And("vice dean enters future date of birth {string}")
    public void viceDeanEntersFutureDateOfBirth(String futurepastdateofbirth) {
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(futurepastdateofbirth);
    }

    @Then("verify date of birth error messages is displayed")
    public void verifyDateOfBirthErrorMessagesIsDisplayed() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.futureBirthDayError);
    }

    @And("vice dean enters name {string},surname {string},birthplace {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameSurnameBirthplacePhoneDateofbirthSsnUsernameFathernameMothernamePassword(String name, String surname, String birthplace, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername,String password) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters invalid email {string}")
    public void viceDeanEntersInvalidEmail(String email) {
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
    }

    @Then("verify invalid email error message is displayed")
    public void verifyInvalidEmailErrorMessageIsDisplayed() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.validEmailError);

    }

    @And("vice dean enters surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersSurnameBirthplaceEmailPhoneDateofbirthSsnUsernameFathernameMothernamePassword(String surname, String birthplace, String email, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername,String password) {

        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters name {string} with different formats")
    public void viceDeanEntersNameWithDifferentFormats(String name) {
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
    }

    @Then("verify invalid name error message should be displayed")
    public void verifyInvalidNameErrorMessageShouldBeDisplayed() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.alertImage);
    }

    @And("vice dean enters name {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void viceDeanEntersNameBirthplaceEmailPhoneDateofbirthSsnUsernameFathernameMothernamePassword(String name, String birthplace, String email, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername,String password) {

        name =Faker.instance().name().firstName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "21.08.1996";
        ssn = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(2)+"-"+Faker.instance().number().digits(4);
        username = Faker.instance().name().username();
        fathername = Faker.instance().name().firstName();
        mothername = Faker.instance().name().firstName();
        password = "Nd"+Faker.instance().number().digits(6);
        viceDeanMngPage.addTeacherNameBox.sendKeys(name);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthPlaceBox.sendKeys(birthplace);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherEmailbox.sendKeys(email);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherPhoneNumberBox.sendKeys(phone);
        WaitUtils.waitFor(1);
        viceDeanMngPage.addTeacherBirthdayBox.sendKeys(dateofbirth);
        WaitUtils.waitFor(1);
        viceDeanMngPage.ssnBox.sendKeys(ssn);
        WaitUtils.waitFor(1);
        viceDeanMngPage.usernameBox.sendKeys(username);
        WaitUtils.waitFor(1);
        viceDeanMngPage.fatherName.sendKeys(fathername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.motherName.sendKeys(mothername);
        WaitUtils.waitFor(1);
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @And("vice dean enters username {string} with different formats")
    public void viceDeanEntersUsernameWithDifferentFormats(String username) {
        viceDeanMngPage.usernameBox.sendKeys(username);
    }

    @And("take screenshot of entire page")
    public void takeScreenshotOfEntirePage() throws IOException {
        MediaUtils.takeScreenshotOfTheEntirePage();
    }

    @And("vice dean enters a {string} doesn't at least eight char")
    public void viceDeanEntersADoesnTAtLeastEightChar(String password) {
        viceDeanMngPage.passwordBox.sendKeys(password);
    }

    @Then("verify date of birth error message is exist")
    public void verifyDateOfBirthErrorMessageIsExist() {
        ReusableMethods.verifyElementDisplayed(viceDeanMngPage.jsonParseError);
    }

    @And("vice dean enters surname {string} with different formats")
    public void viceDeanEntersSurnameWithDifferentFormats(String surname) {
        viceDeanMngPage.addTeacherSurnameBox.sendKeys(surname);
    }

    }



