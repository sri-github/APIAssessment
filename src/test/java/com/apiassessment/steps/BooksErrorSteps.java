package com.apiassessment.steps;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Map;

public class BooksErrorSteps {

    private static final String BASE_URL = "http://simple-books-api.glitch.me";
    private Response response;

}