package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.Driver;
import utilities.WaitUtils;


import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_22_DB {

        ResultSet resultSet;



        @Given("get admin via username")
        public void get_admin_via_username() throws SQLException {


                String sqlQuery = "SELECT * FROM admins WHERE username = 'YunusAhmet'";
                resultSet = DBUtils.getResultSet(sqlQuery);



        }
        @Then("id {string}, username {string}, birth_day {string} , birth_place {string} , gender {string} , name {string}, phone_number {string}, ssn {string}, surname {string}")
        public void id_username_birth_day_birth_place_gender_name_phone_number_ssn_surname(String id, String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) throws SQLException {

                resultSet.next();

                String actId=resultSet.getString("id");
                System.out.println("actId = " + actId);
                String actBirth_day = resultSet.getString("birth_day");
                String actBirth_place = resultSet.getString("birth_place");
                String actGender = resultSet.getString("gender");
                String actName = resultSet.getString("name");
                String actPhone_number = resultSet.getString("phone_number");
                String actSsn = resultSet.getString("ssn");
                String actSurname = resultSet.getString("surname");
                String actUsername = resultSet.getString("username");

                //      assertEquals(id,actId);
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