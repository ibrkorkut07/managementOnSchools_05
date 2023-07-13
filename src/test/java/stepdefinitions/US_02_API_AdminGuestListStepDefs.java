package stepdefinitions;

import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ReusableMethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class US_02_API_AdminGuestListStepDefs extends ManagementonSchoolBaseUrl {
    Response response;

    @Given("Send the request see the list")
    public void sendTheRequestSeeTheList() {
        // Set the url
        //https://managementonschools.com/app/guestUser/getAll

        setUp();
        spec.pathParams("first", "guestUser", "second", "getAll");

        // Send the request and get the response
        response = given(spec).get("/{first}/{second}");
        response.prettyPrint();
    }

    @Then("Validate the list contain Name , Phone Number , Ssn ,User Name")
    public void validateTheListContainNamePhoneNumberSsnUserName() {
        // Do Assertion


    }

    @Given(": Send delete request by id")
    public void sendDeleteRequestById() {
        //Set the url
        //https://managementonschools.com/app/guestUser/delete/1328
        setUp();
        spec.pathParams("first", "guestUser", "second", "delete", "third", 1044);

        //Send the request get the response
        response = given(spec).get("/{first}/{second}?page={third}");
        response.prettyPrint();
    }

    @Then(": Validate the Admin Delete information")
    public void validateTheAdminDeleteInformation() {
        // Do assertion
    }
}
