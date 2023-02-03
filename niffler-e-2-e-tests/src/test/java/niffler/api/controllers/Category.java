package niffler.api.controllers;

import static io.restassured.RestAssured.given;

public class Category {

    public void addCategory(String categoryName) {
        given()
                .baseUri("http://localhost:8090")
                .when()
                .body("")
                .post("/addSpend")
                .then()
                .extract();
    }
}
