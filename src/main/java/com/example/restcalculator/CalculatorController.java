package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    /**
     * Does sum calculation
     * @param a
     * @param b
     * @return sum
     */
    Calculator calculator = new Calculator();
    @RequestMapping("/sum")
    public int sum (
            @RequestParam int a,
            @RequestParam int b){
        return calculator.sum(a, b);
    }
    @RequestMapping("/difference")
    public int difference (
            @RequestParam int a,
            @RequestParam int b){
        return calculator.difference(a, b);
    }
    @RequestMapping("/multiplication")
    public int multiply (
            @RequestParam int a,
            @RequestParam int b){
        return calculator.multiply(a, b);
    }
    @RequestMapping("/division")
    public int divide (
            @RequestParam int a,
            @RequestParam int b){
        return calculator.divide(a, b);
    }
    @RequestMapping("/exp")
    public double exp (
            @RequestParam double a,
            @RequestParam double b){
        return calculator.exp(a, b);
    }
    @RequestMapping("/absolut")
    public int absolut (
            @RequestParam int a){
        return calculator.absolut(a);
    }
    @RequestMapping("/sqrt")
    public double sqrt (
            @RequestParam double a){
        return calculator.sqrt(a);
    }
}
