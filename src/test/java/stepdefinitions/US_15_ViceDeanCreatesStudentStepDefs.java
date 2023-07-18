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
    public static String username;

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

}

