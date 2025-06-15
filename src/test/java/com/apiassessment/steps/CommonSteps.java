package com.apiassessment.steps;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

public class CommonSteps {

    private final TestContext context;

    public CommonSteps(TestContext context) {
        this.context = context;
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer expectedStatus) {
        Response response = context.getResponse();
        Assert.assertNotNull("Response is null.", response);
        Assert.assertEquals(expectedStatus.intValue(), response.getStatusCode());
    }
}