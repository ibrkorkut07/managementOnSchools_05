package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String generateToken() {
        String stringBody = "{ \"password\": \"12345678\", \"username\": \"Project09Admin\"}";
        Response response = given().contentType(ContentType.JSON)
                                   .body(stringBody)
                                   .post("https://managementonschools.com/app/auth/login");
        return response.jsonPath().getString("token");
    }

}
