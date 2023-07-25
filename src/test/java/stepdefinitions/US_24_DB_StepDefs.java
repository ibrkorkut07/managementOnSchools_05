package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.sql.*;

public class US_24_DB_StepDefs {

    ResultSet resultSet;
    @Given("Get the teacher by name {string}")
    public void get_the_teacher_by_name(String name) throws SQLException {

        //Create Connection
        Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
        //Create Statement
        Statement statement = connection.createStatement();
        //Create ResultSet
        String sqlQuery = "SELECT * FROM \"public\".teacher where name ='"+name+"'";
        resultSet = statement.executeQuery(sqlQuery);

    }
    @Then("The Body contains birth_day {string}, birth_place {string}, gender {string}, name {string},phone_number {string},ssn {string}, surname {string}, username {string}, email {string}")
    public void the_body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username_email(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username, String email) throws SQLException {

        resultSet.next();
        String actBirthDay = resultSet.getString("birth_day");
        String actBirthPlace = resultSet.getString("birth_place");
        String actGender = resultSet.getString("gender");
        String actName = resultSet.getString("name");
        String actPhoneNumber = resultSet.getString("phone_number");
        String actSsn = resultSet.getString("ssn");
        String actSurname = resultSet.getString("surname");
        String actUsername = resultSet.getString("username");
        String actEmail = resultSet.getString("email");

        Assert.assertEquals(birth_day, actBirthDay);
        Assert.assertEquals(birth_place, actBirthPlace);
        Assert.assertEquals(gender, actGender);
        Assert.assertEquals(name,actName);
        Assert.assertEquals(phone_number,actPhoneNumber);
        Assert.assertEquals(ssn,actSsn);
        Assert.assertEquals(surname,actSurname);
        Assert.assertEquals(username,actUsername);
        Assert.assertEquals(email,actEmail);

    }
}
