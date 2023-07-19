package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ViceDeanMngPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.WaitUtils;

public class US_25_AdminCreatesStudent {
    ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
    LoginPage loginPage = new LoginPage();

    @Given("admin choose advisor teacher {string}")
    public void admin_choose_advisor_teacher(String advisorTeacher) {
        ViceDeanMngPage viceDeanMngPage = new ViceDeanMngPage();
        WaitUtils.waitFor(1);
        advisorTeacher = "878";
//        ReusableMethods.selectRandomTextFromDropdown();
        ReusableMethods.selectByValue(viceDeanMngPage.advisorTeacherButton,advisorTeacher);

    }
    @Given("admin enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},ssn {string},username {string},fathername {string},mothername {string},password {string}")
    public void admin_enters_name_surname_birthplace_email_phone_dateofbirth_ssn_username_fathername_mothername_password(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String ssn, String username, String fathername,String mothername,String password) {
        name= Faker.instance().name().firstName();
        surname = Faker.instance().name().lastName();
//        birthplace=Faker.instance().address().city();
        birthplace="USA";
        email = Faker.instance().internet().emailAddress();
        phone = Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(3)+"-"+Faker.instance().number().digits(4);
//        dateofbirth= Faker.instance().date().birthday().toString();
        dateofbirth = "15.08.1994";
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

    @And("admin choose gender")
    public void adminChooseGender() {

    viceDeanMngPage.addTeacherGenderFemale.click();

    }

    @Then("admin clicks on Submit button")
    public void adminClicksOnSubmitButton() {

        WaitUtils.waitFor(1);
     //   JSUtils.clickWithTimeoutByJS(viceDeanMngPage.addTeacherSubmitButton);
       viceDeanMngPage.addStudentSubmitButton.click();


    }

    @And("admin do not choose gender")
    public void adminDoNotChooseGender() {

   WaitUtils.waitFor(1);

    }

    @Then("verify an error message is displayed")
    public void verifyAnErrorMessageIsDisplayed() {

  //  ReusableMethods.waitForVisibility(viceDeanMngPage.errorMessageForGender,1);
   viceDeanMngPage.invalidValueError.isDisplayed();

    }

    @And("admin do not choose advisor teacher advisor teacher")
    public void adminDoNotChooseAdvisorTeacherAdvisorTeacher() {

    }

    @And("admin enters name {string},surname {string},birthplace {string},email {string},phone {string},dateofbirth {string},username {string},fathername {string},mothername {string},password {string}")
    public void adminEntersNameSurnameBirthplaceEmailPhoneDateofbirthUsernameFathernameMothernamePassword(String name, String surname, String birthplace, String email, String phone, String dateofbirth, String username, String fathername,String mothername,String password){
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

    @And("admin enter ssn {string} with an invalid format")
    public void adminEnterSsnWithAnInvalidFormat(String ssn) {
        viceDeanMngPage.ssnBox.sendKeys(ssn);

    }



}