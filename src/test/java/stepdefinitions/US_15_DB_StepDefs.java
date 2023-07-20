package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;

public class US_15_DB_StepDefs {
    ResultSet resultSet;
    @Given("get student by {string}")
    public void get_student_by(String name) throws SQLException {
//        DBUtils.createConnection();
        String sqlQuery = "select * from student where name= '"+name+"'";
//        DBUtils.executeQuery(sqlQuery);
//                Create connection
        Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
//        Create statement
        Statement statement = connection.createStatement();
//        Create resultSet
        resultSet = statement.executeQuery(sqlQuery);

    }

    @Then("body must be contains birth_day {string}, birth_place {string},gender {string}, name {string},phone_number {string},ssn {string},surname {string},username {string},email {string},father_name {string},mother_name {string}")
    public void bodyMustBeContainsBirth_dayBirth_placeGenderNamePhone_numberSsnUsernameSurnameUsernameEmailFather_nameMother_name(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username, String email, String father_name, String mother_name) throws SQLException {
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
        String actFatherName = resultSet.getString("father_name");
        String actMotherName = resultSet.getString("mother_name");

        Assert.assertEquals(birth_day, actBirthDay);
        Assert.assertEquals(birth_place, actBirthPlace);
        Assert.assertEquals(gender, actGender);
        Assert.assertEquals(name,actName);
        Assert.assertEquals(phone_number,actPhoneNumber);
        Assert.assertEquals(ssn,actSsn);
        Assert.assertEquals(surname,actSurname);
        Assert.assertEquals(username,actUsername);
        Assert.assertEquals(email,actEmail);
        Assert.assertEquals(father_name,actFatherName);
        Assert.assertEquals(mother_name,actMotherName);

    }
}
