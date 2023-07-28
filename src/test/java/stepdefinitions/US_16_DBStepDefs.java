package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.sql.ResultSet;
import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;
public class US_16_DBStepDefs {
    ResultSet resultSet;
    String actDate;
    String actEmail;
    String actMessage;
    String actName;
    String actSubject;

    @Given("user connects to the database using appropriate credentials.")
    public void user_connects_to_the_database_using_appropriate_credentials() {
        DBUtils.createConnection();
    }
    @When("user reads the message in the database using email {string} entry")
    public void user_reads_the_message_in_the_database_using_email_entry(String email) throws SQLException {
        String query = "SELECT * FROM contact_message WHERE email='"+email+"'";

        resultSet = DBUtils.getStatement().executeQuery(query);

        resultSet.next();

        actDate = resultSet.getString("date");
        actEmail = resultSet.getString("email");
        actMessage = resultSet.getString("message");
        actName = resultSet.getString("name");
        actSubject = resultSet.getString("subject");

        System.out.println("actDate = " + actDate);
        System.out.println("actName = " + actName);
        System.out.println("actEmail = " + actEmail);
        System.out.println("actMessage = " + actMessage);
        System.out.println("actSubject = " + actSubject);
    }
    @Then("user asserts that message body contains date {string}, email {string}, message {string}, name {string} and subject {string}")
    public void user_asserts_that_message_body_contains_date_email_message_name_and_subject(String date, String email, String message, String name, String subject) throws SQLException {
        assertEquals(date, actDate);
        assertEquals(email, actEmail);
        assertEquals(message, actMessage);
        assertEquals(name, actName);
        assertEquals(subject, actSubject);
    }
   // @Then("user asserts that the message is deleted in the database")
  //  public void user_asserts_that_the_message_is_deleted_in_the_database() {
   //     assertTrue("No delete option both on the UI and on the API",false);
//}
}


