package com.apiassessment.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;

import org.junit.Assert;
import io.cucumber.datatable.DataTable;

public class BooksSteps {

    private final TestContext context;
    private static final String BASE_URL = "http://simple-books-api.glitch.me";
    private Response response;

    public BooksSteps(TestContext context) {
        this.context = context;
    }

    @Given("I have access to the Books API")
    public void i_have_access_to_the_books_api() {
        // Optionally, you can check API health here, or leave empty if not needed
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .get(endpoint);
        context.setResponse(response);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatus) {
        Assert.assertEquals(
            "Expected status code: " + expectedStatus + ", but got: " + response.getStatusCode(),
            expectedStatus.intValue(),
            response.getStatusCode()
        );
    }

    @Then("the response time should be less than {int} seconds")
    public void the_response_time_should_be_less_than_seconds(Integer seconds) {
        long responseTimeMs = response.getTime();
        Assert.assertTrue(
            "Expected response time < " + (seconds * 1000) + " ms, but got: " + responseTimeMs + " ms",
            responseTimeMs < seconds * 1000
        );
    }

    @Then("the response body should contain book records")
    public void the_response_body_should_contain_book_records() {
        String body = response.getBody().asString();
        Assert.assertTrue(
            "Expected response body to contain book records, but got: " + body,
            body.contains("id") && body.contains("name")
        );
    }

    @Then("the response size should not be empty")
    public void the_response_size_should_not_be_empty() {
        Assert.assertTrue(
            "Expected response body to not be empty",
            response.getBody().asString().trim().length() > 0
        );
    }

    

    @When("I send a POST request to {string} with body:")
    public void i_send_a_post_request_to_with_body(String endpoint, DataTable dataTable) {
        Map<String, String> bodyMap = dataTable.asMaps().get(0);

        response = RestAssured
                .given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body(bodyMap)
                .when()
                .post(endpoint);
    }

    @Then("the response should contain {string}")
    public void the_response_should_contain(String expectedStatus) {
String actualBody = response.getBody().asString();
        Assert.assertTrue(
            "Expected response body to contain: \"" + expectedStatus + "\", but got: \"" + actualBody + "\"",
            actualBody.contains(expectedStatus)
        );
    }

    @Then("the response body should be empty")
public void the_response_body_should_be_empty() {
    Assert.assertTrue(
        "Expected response body to be empty, but got: \"" + response.getBody().asString() + "\"",
        response.getBody().asString().trim().isEmpty()
    );
}

    @Then("the response body should not be empty")
public void the_response_body_should_not_be_empty() {
    Assert.assertTrue(
        "Expected response body to be empty, but got: \"" + response.getBody().asString() + "\"",
        !response.getBody().asString().trim().isEmpty()
    );
}

@When("I send a PUT request to {string}")
    public void i_send_a_put_request_to(String endpoint) {
        response = RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .put(endpoint);
    }
}