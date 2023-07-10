package stepdefinitions;


import io.cucumber.java.en.*;
import java.sql.*;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.*;
import static utilities.DBUtils.getResultSet;
public class US_06_DB_AddViceDeanStepDefs {
    static ResultSet resultSet;
    public static String strId;
    public static Integer id;

    @Given("get vice dean via username {string}")
    public void get_vice_dean_via_username(String username){

        String sqlQuery = "SELECT * FROM vice_dean WHERE username ='" + username + "'";
        resultSet = getResultSet(sqlQuery);


    }

    @Given("get vice dean via  non existing username {string}")
    public void getViceDeanViaNonExistingUsername(String username) {
        String sqlQuery = "SELECT * FROM vice_dean WHERE username ='" + username + "X'";
        resultSet = getResultSet(sqlQuery);
    }

    @Then("body contains birth_day {string}, birth_place {string}, gender {string}, name {string}, phone_number {string}, ssn {string}, surname {string}, username {string}")
    public void body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username) throws SQLException {
        resultSet.next();//To move the pointer to the next record from header, use next() method
        strId = resultSet.getString("id");
        id = parseInt(resultSet.getString("id"));
        String actBirth_day = resultSet.getString("birth_day");
        String actBirth_place = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhone_number = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");

        assertEquals(birth_day, actBirth_day);
        assertEquals(birth_place, actBirth_place);
        assertEquals(gender, actGender);
        //assertEquals(name, actName);
        assertEquals(phone_number, actPhone_number);
        assertEquals(ssn, actSsn);
        assertEquals(surname, actSurname);
        assertEquals(username, actUsername);

    }

    @Then("body should be empty")
    public void bodyShouldBeEmpty()  {

        try {
            assertFalse(resultSet.next());//Since the ResulSet is empty, next() method will return false
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}

