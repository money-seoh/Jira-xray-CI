package com.moneyseoh.automation.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/moneyseoh/automation/stepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports.json",
                "html:target/cucumber-html-reports.html",
                "junit:target/cucumber-junit-reports.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TestRunner {

}