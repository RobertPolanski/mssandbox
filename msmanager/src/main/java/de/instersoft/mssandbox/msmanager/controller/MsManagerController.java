package de.instersoft.mssandbox.msmanager.controller;

import de.instersoft.mssandbox.msmanager.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsManagerController {

    private final CalculatorService calculatorService;

    public MsManagerController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/sum/{a}/{b}")
    String sum(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return calculatorService.sum(a, b);
    }


}
