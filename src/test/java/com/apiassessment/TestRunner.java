package com.apiassessment;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
    glue = {"com.apiassessment.steps", "com.apiassessment.hooks"},
    plugin = {"pretty", "html:target/cucumber-report/index.html"}
)
public class TestRunner {
}