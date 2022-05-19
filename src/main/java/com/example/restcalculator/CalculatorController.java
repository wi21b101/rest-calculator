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
            @RequestParam(name = "x") int a,
            @RequestParam int b){
        return a + b;
    }
}
