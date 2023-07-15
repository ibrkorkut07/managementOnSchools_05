package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.sql.*;

public class US_13_DataBase_StepDefs {

    ResultSet resultSet;

    @Given("get teacher via name {string}")
    public void get_teacher_via(String name){
//        Create connection
//        Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
//        Create statement
//        Statement statement = connection.createStatement();
//        Create resultSet
//        resultSet = statement.executeQuery(sqlQuery);
        DBUtils.createConnection();
        String sqlQuery = "select * from teacher where name= '"+name+"'";
        DBUtils.executeQuery(sqlQuery);


    }
    @Then("body contains birth_day {string}, birth_place {string}, gender {string}, name {string},phone_number {string},ssn {string}, surname {string}, username {string}, email {string}")
    public void body_contains_birth_day_birth_place_gender_name_phone_number_ssn_surname_username_email(String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname, String username, String email) throws SQLException {
        resultSet.next();//To move the pointer from to the next record from header, use next() method
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

