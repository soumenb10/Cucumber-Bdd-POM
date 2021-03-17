package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/FeatureFiles"},
		glue = {"com.StepDefinitions", "com.AppHooks"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline: test-output-thread/"},
		monochrome = true
		)

public class MyTestRunner {

}
