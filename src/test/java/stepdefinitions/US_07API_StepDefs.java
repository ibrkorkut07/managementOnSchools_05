package stepdefinitions;
import base_urls.ManagementonSchoolBaseUrl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;


public class US_07API_StepDefs extends ManagementonSchoolBaseUrl {
    Response response;

    @Given("Endpoint is the prepared to see the message")
    public void EndpointIsThePreparedToSeeTheMessage() {
        setUp();
        spec.pathParams("first", "contactMessages", "second", "getAll");
    }

    @Then("Sent the get request")
    public void SentTheGetRequest() {
        response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

    }
}
