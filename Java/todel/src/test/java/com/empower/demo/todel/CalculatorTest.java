package com.empower.demo.todel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    // Instantiate the Calculator object
    Calculator calculator = new Calculator();

    // Test for the add method
    @Test
    public void testAdd() {
        int result = calculator.add(2, 3); // Calls the add method
        assertEquals(5, result);  // Verifies if 2 + 3 equals 5
    }

    // Test for the subtract method
    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3); // Calls the subtract method
        assertEquals(2, result);  // Verifies if 5 - 3 equals 2
    }
}