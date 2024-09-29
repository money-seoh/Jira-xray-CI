package com.moneyseoh.automation.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/moneyseoh/automation/stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports.json"},
        monochrome = true
)
public class TestRunner {

}