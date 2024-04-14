package com.michael.learnjava.ch07_Libraries;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(7, 5);

        Assert.assertEquals(12, result);
    }
}