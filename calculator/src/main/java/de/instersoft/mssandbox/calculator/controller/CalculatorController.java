package de.instersoft.mssandbox.calculator.controller;

import de.instersoft.mssandbox.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sum/{a}/{b}")
    String sum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return String.valueOf(calculatorService.sum(a, b));
    }

}
