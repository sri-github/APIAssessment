package com.apiassessment.steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void beforeScenario() {
        // Code to run before each scenario
        System.out.println("Starting scenario...");
        // e.g., initialize test data or reset state
    }

    @After
    public void afterScenario() {
        // Code to run after each scenario
        System.out.println("Finished scenario.");
        // e.g., clean up resources or reset environment
    }
}