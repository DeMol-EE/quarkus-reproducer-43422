package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void get() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("here it works"));
    }

    @Test
    void head() {
        given()
                .when().head("/hello")
                .then()
                .statusCode(200);
    }

    @Nested
    class X {

        @Test
        void get() {
            given()
                    .when().get("/hello/x")
                    .then()
                    .statusCode(200)
                    .body(is("x"));
        }

        @Test
        void head() {
            given()
                    .when().head("/hello/x")
                    .then()
                    .statusCode(200);
            // -> unexpected 405
        }
    }

    @Nested
    class Y {

        @Test
        void get() {
            given()
                    .when().get("/hello/y")
                    .then()
                    // we use only @HEAD, so this is expected
                    .statusCode(405);
        }

        @Test
        void head() {
            given()
                    .when().head("/hello/y")
                    .then()
                    .statusCode(204);
        }
    }

    @Nested
    class Z {

        @Test
        void get() {
            given()
                    .when().get("/hello/z")
                    .then()
                    .statusCode(200)
                    .body(is("z"));
        }

        @Test
        void head() {
            given()
                    .when().head("/hello/z")
                    .then()
                    .statusCode(204);
        }
    }

}