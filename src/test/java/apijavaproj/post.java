package apijavaproj;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

public class post {
    @Test
public void postjson(){
    //RestAssured.baseURI="https://reqres.in/api/users";

    // RestAssured.baseURI="https://reqres.in/api/users";
    
    // String json = "{\n"+
    // " \"name\":\"Divya krish\",\n"+
    // " \"job\":\"Manager\"\n"+
    // "}";

    RestAssured.baseURI="https://0rnym7gjvl.execute-api.us-east-1.amazonaws.com/QA/divya";
    
    String json = "{"+
    "\"id\":\"4\","+
    "\"name\":\"Divya Krish\","+
    "\"age\":10\","+
    "\"salary\":10000"+
    "}";


    RestAssured.given().body(json).post().then()
    .log()
    .all()
    .assertThat()
    .statusCode(201);
}

}
