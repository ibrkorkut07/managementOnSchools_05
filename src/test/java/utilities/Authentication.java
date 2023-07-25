package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken() {
        String stringBody = "{ \"password\": \"485424698\", \"username\": \"Admin\"}";
        Response response = given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body(stringBody).post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenViceDean() {
        Response response =  given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body("{\"password\": \"12345678\",\"username\": \"mrsnice\"}").post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }
    public static String generateTokenAdmin()  {

     Response response = given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body("{\"password\": \"12345678\",\"username\": \"Project09Admin\"}").post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");


    }



}
