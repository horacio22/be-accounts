package cz.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@QuarkusTest
class TransactionControllerTest {

    @Test
    void testGetTransactionsForAccount() {
        String testAccountNumber = "123456789"; // has to exists in the test database

        given()
                .pathParam("ownAccountNumber", testAccountNumber)
                .when()
                .get("/accounts/{ownAccountNumber}/transactions")
                .then()
                .statusCode(200)
                .body("$", not(empty()))
                .body("[0].ownAccountNumber", equalTo(testAccountNumber));
    }

}