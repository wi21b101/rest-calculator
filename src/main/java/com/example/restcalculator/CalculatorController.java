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
    @RequestMapping("/sum")
    public int sum (
            @RequestParam int a,
            @RequestParam int b){
        return a + b;
    }
    @RequestMapping("/difference")
    public int difference (
            @RequestParam int a,
            @RequestParam int b){
        return a - b;
    }
    @RequestMapping("/multiplication")
    public int multiply (
            @RequestParam int a,
            @RequestParam int b){
        return a * b;
    }
    @RequestMapping("/division")
    public int divide (
            @RequestParam int a,
            @RequestParam int b){
        return a/b;
    }
    @RequestMapping("/exp")
    public double exp (
            @RequestParam double a,
            @RequestParam double b){
        return Math.pow(a, b);
    }
    @RequestMapping("/absolut")
    public int absolut (
            @RequestParam int a){
        return Math.abs(a);
    }
    @RequestMapping("/sqrt")
    public double sqrt (
            @RequestParam double a){
        return Math.sqrt(a);
    }
}
