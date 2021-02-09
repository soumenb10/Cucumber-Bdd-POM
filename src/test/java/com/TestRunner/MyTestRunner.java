package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/FeatureFiles"},
		glue = {"com.StepDefinitions", "com.AppHooks"},
		plugin = {"pretty"}
		)

public class MyTestRunner {

}
