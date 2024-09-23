package com.moneyseoh.automation.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("Launch the website")
    public void launch_the_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Launch the website");
    }
    @When("Enter your credentials")
    public void enter_your_credentials() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter your credentials");
    }
    @Then("Click on Login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Click on Login button");
    }
}
