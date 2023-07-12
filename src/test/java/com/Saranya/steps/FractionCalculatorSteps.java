package com.Saranya.steps;

import com.Saranya.pages.FractionCalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FractionCalculatorSteps {
    FractionCalculatorPage fraction = new FractionCalculatorPage();

    @Given("I am on Fraction Calculator page")
    public void i_am_on_fraction_calculator_page() {
    }


    @When("I enter {string} and {string}")
    public void i_enter_and(String num1, String den1) {
        fraction.i_enter_and(num1,den1);
    }

    @When("I also enter {string} and {string}")
    public void i_also_enter_and(String num2, String den2) {
        fraction.i_also_enter_and(num2,den2);

    }

    @And("I select {string}")
    public void iSelectOperator(String operator) {
        fraction.iSelectOperator(operator);
    }

    @And("I click on Calculate button")
    public void iClickOnCalculateButton() {
        fraction.iClickOnCalculateButton();
    }

    @Then("I verify the {string} displayed")
    public void i_verify_the_displayed(String expectedResult) {
        String actualResult = fraction.i_verify_the_displayed();
        //System.out.println("actualresult: "+actualResult);
        //actualResult.replace("Result in decimals:"," ");
        Assert.assertEquals("Result in decimals: "+expectedResult,actualResult);
    }
}
