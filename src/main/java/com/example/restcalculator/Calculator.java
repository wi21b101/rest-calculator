package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by Zero Exception");
        }
        return a / b;
    }

    public double exp(double a, double b) {
        return Math.pow(a, b);
    }

    public int absolut(int a) {
        return Math.abs(a);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
