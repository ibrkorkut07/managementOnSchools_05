package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;

public class Authentication {

    static String url =ConfigReader.getProperty("authenticationURL");
    public static String generateToken() {
        String stringBody = "{ \"password\": \"485424698\", \"username\": \"Admin\"}";
        Response response = given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body(stringBody).post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenViceDean() {
        Response response =  given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body("{\"password\": \"12345678\",\"username\": \"mrsnice\"}").post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }

    public static String generateTokenTeacher() {
        Map<String, Object> body = new HashMap<>();
        body.put("username", ConfigReader.getProperty("teacherUserName"));
        body.put("password", ConfigReader.getProperty("teacherPassword"));
        body.put("rememberMe",true);
        Response response = given().contentType(ContentType.JSON).body(body).post(url);
        return response.jsonPath().getString("token");
    }

}
