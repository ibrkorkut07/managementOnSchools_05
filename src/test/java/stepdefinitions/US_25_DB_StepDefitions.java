package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;


public class US_25_DB_StepDefitions {
//    ResultSet resultSet;
//
//
//    @Given("get student with {string}")
//    public void get_student_with(String name) throws SQLException {
////        DBUtils.createConnection();
//        String sqlQuery = "select * from student where username= '"+name+"'";
////       DBUtils.executeQuery(sqlQuery);
////       Create connection
//        Connection connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
////        Create statement
//        Statement statement = connection.createStatement();
////        Create resultSet
//        resultSet = statement.executeQuery(sqlQuery);
//        resultSet.next();
//    }
//
//
//    @Then("body should be contains birth_day {string}, birth_place {string},gender {string},phone_number {string},ssn {string},surname {string},username {string}, name {string}, email {string},father_name {string},mother_name {string}")
//    public void bodyShouldBeContainsBirth_dayBirth_placeGenderPhone_numberSsnSurnameUsernameNameEmailFather_nameMother_name(String birth_day, String birth_place, String gender, String phone_number, String ssn, String surname, String username, String name, String email, String father_name, String mother_name) throws SQLException {
//
//
//        String actBirthDay = resultSet.getString("birth_day");
//        String actBirthPlace = resultSet.getString("birth_place");
//        String actGender = resultSet.getString("gender");
//        // String actName = resultSet.getString("name");
//        String actPhoneNumber = resultSet.getString("phone_number");
//        String actSsn = resultSet.getString("ssn");
//        String actSurname = resultSet.getString("surname");
//        String actUsername = resultSet.getString("username");
//        String actEmail = resultSet.getString("email");
//        String actFatherName = resultSet.getString("father_name");
//        String actMotherName = resultSet.getString("mother_name");
//
//        Assert.assertEquals(birth_day, actBirthDay);
//        Assert.assertEquals(birth_place, actBirthPlace);
//        Assert.assertEquals(gender, actGender);
//        //  Assert.assertEquals(name,actName);
//        Assert.assertEquals(phone_number,actPhoneNumber);
//        Assert.assertEquals(ssn,actSsn);
//        Assert.assertEquals(surname,actSurname);
//        Assert.assertEquals(username,actUsername);
//        Assert.assertEquals(email,actEmail);
//        Assert.assertEquals(father_name,actFatherName);
//        Assert.assertEquals(mother_name,actMotherName);
//    }
}
