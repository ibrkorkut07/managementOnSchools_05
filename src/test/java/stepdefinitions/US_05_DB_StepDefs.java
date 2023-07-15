package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;
import java.sql.*;
import static junit.framework.TestCase.assertEquals;

public class US_05_DB_StepDefs {

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("connectt to database")
    public void connectt_to_database() throws SQLException {

      //Create connection
        connection =  DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management", "select_user","43w5ijfso");
        //Create Statement
        statement = connection.createStatement();

    }
    @Then("gett dean via name {string}")
    public void gett_dean_via_name(String name) throws SQLException {
    //Create ResultSet
        String sqlQuery = "SELECT * FROM \"public\".dean WHERE name = '"+name+"'";
        resultSet = statement.executeQuery(sqlQuery);

    }
    @Then("bodyy contains birth_day {string} , birth_place {string} , gender {string} , name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void bodyy_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) throws SQLException {
        resultSet.next();

        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");
        assertEquals(birth_day,actBirth_day);
        assertEquals(birth_place,actBirth_place);
        assertEquals(gender,actGender);
        assertEquals(name,actName);
        assertEquals(phone_number,actPhone_number);
        assertEquals(ssn,actSsn);
        assertEquals(surname,actSurname);
        assertEquals(username,actUsername);

    }
}
