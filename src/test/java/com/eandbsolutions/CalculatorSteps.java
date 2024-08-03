package com.eandbsolutions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorSteps {

    private int firstValue;
    private int secondValue;
    private int calculatedValue;

    @Given("I have {int} and {int}")
    public void iHaveAnd(int arg0, int arg1) {
        firstValue = arg0;
        secondValue = arg1;
    }

    @When("I add those numbers")
    public void iAddThoseNumbers() {
        calculatedValue = new Calculator().add(firstValue, secondValue);
    }

    @Then("I get {int}")
    public void iGet(int arg0) {
        Assertions.assertEquals(calculatedValue, arg0);
    }

    @Given("I have two numbers")
    public void iHaveTwoNumbers(DataTable dataTable) {
        firstValue = Integer.parseInt(dataTable.column(0).get(0));
        secondValue = Integer.parseInt(dataTable.column(1).get(0));
    }


    @Then("I get the correct result")
    public void iGetTheCorrectResult(DataTable dataTable) {
        Assertions.assertEquals(Integer.parseInt(dataTable.row(0).get(0)), calculatedValue);
    }
}
