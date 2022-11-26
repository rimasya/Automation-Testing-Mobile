package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MathsStepDefinitions {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();
    CalculatorPage calculatorPage = new CalculatorPage();

    @Given("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }

    //adding
    @Given("User is already on login page")
    public void userIsAlreadyOnLoginPage() {
    }
    @When("User input a is {int}")
    public void userInputAIs(int value) {
        calculatorPage.inputNumberA(value);
    }
    @And("User click dropdown button")
    public void userClickDropdownButton() {
        calculatorPage.tapsDropdown();
    }
    @And("User select icon plus")
    public void userSelectIconPlus() {
        calculatorPage.tapsPlusButton();
    }
    @And("User input b is {int}")
    public void userInputBIs(int value) {
        calculatorPage.inputNumberB(value);
    }
    @And("User click equal button")
    public void userClickEqualButton() {
        calculatorPage.tapsEquals();
    }
    @Then("the total add should be {int}")
    public void theTotalAddShouldBe(int expected) {
        calculatorPage.getResult();
        Assert.assertEquals("Hasil : "+expected,calculatorPage.getResult());
    }
    //minus
    @And("User select icon minus")
    public void userSelectIconMinus() {
        calculatorPage.tapsMinusButton();
    }

    //divided
    @And("User select icon divided")
    public void userSelectIconDivided() {
        calculatorPage.tapsDividedButton();
    }
    //Multiply
    @And("User select icon star")
    public void userSelectIconStar() {
        calculatorPage.tapsMultiplyButton();
    }
}
