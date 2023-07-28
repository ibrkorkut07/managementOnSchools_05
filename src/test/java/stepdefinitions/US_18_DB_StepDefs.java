package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.sql.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

public class US_18_DB_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;



    @Then("body should be empty in the student info list")
    public void bodyShouldBeEmptyInTheStudentInfoList() throws SQLException {
        assertFalse(resultSet.next());

    }
}