package com.eandbsolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTests {

    private Calculator calculator;


    @BeforeEach
    void setUp() {
        calculator = new Calculator();

    }

    @Test
    void add() {
        Integer result = calculator.add(1, 2);
        Assertions.assertEquals(3, result);
    }
}