package base.api;

import io.restassured.specification.RequestSpecification;

import java.net.URI;

import static io.restassured.RestAssured.given;

public class Rapi {

    public static RequestSpecification prepareRequest(String endpoint){
        RequestSpecification rs = given().baseUri(endpoint);
        return rs;
    }


}
