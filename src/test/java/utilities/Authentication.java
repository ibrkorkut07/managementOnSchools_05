package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken() {
        String stringBody = "{ \"password\": \"12345678\", \"username\": \"AdminProject09\"}";
        Response response = given().contentType(ContentType.JSON).accept("application/json").accept("*/*").body(stringBody).post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }


}
