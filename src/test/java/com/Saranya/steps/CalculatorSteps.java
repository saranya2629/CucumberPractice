package com.Saranya.steps;

import com.Saranya.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalculatorSteps {

    CalculatorPage calculatorPage;
    @Given("I am on calculator page")
    public void iAmOnCalculatorPage() {

        calculatorPage = new CalculatorPage();
        calculatorPage.iAmOnCalculatorPage();

    }

    @When("I enter number {int}")
    public void iEnterNumber(int number) {
        calculatorPage.iEnterNumber(number);

    }

    @And("I click on operator {string}")
    public void iClickOnOperator(String operator) {
        calculatorPage.iClickOnOperator(operator);

    }


    @Then("I verify the result as {int}")
    public void iVerifyTheResultAs(int expectedResult) {

        Assert.assertEquals(String.valueOf(expectedResult),calculatorPage.iVerifyTheResultAs(expectedResult));
    }


    @When("I enter {int}")
    public void i_enter(Integer num) {
        calculatorPage.iEnterNumber(num);

    }

    @And("I click on {string}")
    public void iClickOnoperator(String operator) {
        calculatorPage.iClickOnOperator(operator);

    }

    @Then("I verify the {int}")
    public void i_verify_the(Integer expectedResult) {
        Assert.assertEquals(String.valueOf(expectedResult),calculatorPage.iVerifyTheResultAs(expectedResult));

    }



}
