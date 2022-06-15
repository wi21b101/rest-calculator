package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void sumTest(){
        // Arrange
        int a = 5;
        int b = 6;

        int expected = 11;

        // Act
        int result = calculator.sum(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void differenceTest(){
        // Arrange
        int a = 6;
        int b = 5;

        int expected = 1;

        // Act
        int result = calculator.difference(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void divideTest(){
        // Arrange
        int a = 20;
        int b = 5;

        int expected = 4;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void multiplyTest(){
        // Arrange
        int a = 5;
        int b = 4;

        int expected = 20;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void divideTestDividedZero(){
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () ->{
            calculator.divide(a, b);
        });
    }
}