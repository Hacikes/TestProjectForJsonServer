package com.restassured.api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test02_Post {

    @Test
    public void test2() {

        JSONObject request = new JSONObject();
        request.put("name", "chaya");
        request.put("job", "BA");

        System.out.println(request);
        System.out.println(request.toString());

        Response response = (Response) given().
                body(request.toJSONString()).
                when().
                post("https://reqres.in/api/users").
                then().statusCode(201);
        response.prettyPrint();
    }

}


