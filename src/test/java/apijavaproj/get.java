package apijavaproj;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class get {
    @Test
    public void getreqauto1(){
        // RestAssured.baseURI="https://reqres.in/api/users";
        // Response  response=RestAssured.given().param("id", "2").when().get();
        
        // RestAssured.baseURI="https://www.youtube.com/watch";
        // Response  response=RestAssured.given().param("v", "Pn_VHSghhvM").when().get();

        RestAssured.baseURI("https://0rnym7gjvl.execute-api.us-east-1.amazonaws.com/QA/divya");
        Response  response=RestAssured.when().get();
        
        System.out.println(response.getBody().asString());

        System.out.println("status code = "+response.getStatusCode());
        System.out.println("content type = "+response.contentType());
        System.out.println("Time= "+response.getTime());
        System.out.println("Cookies = "+response.getCookies());

        // System.out.println("Pretty print = "+response.prettyPrint());
        // Example1:
        // RestAssured.given().param("param", "2")
        //     .when()
        //     .get()
        //     .then()
        //     .assertThat()
        //     .log()
        //     .all()
        //     .statusCode(200);
    }
}
