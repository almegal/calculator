package com.aip.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorView viewer = new CalculatorView();
    public final CalculatorModel model = new CalculatorModel();
    @GetMapping
    public String calculator(){
        return viewer.welcome();
    }
    @GetMapping(path="/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b){

        int result = model.plus(a, b);
        return viewer.plus(a, b, result);
    }
    @GetMapping(path="/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b){

        int result = model.minus(a, b);
        return viewer.minus(a, b, result);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b){

        int result = model.multiply(a, b);
        return viewer.multiply(a, b, result);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b){

        if(b == 0) return viewer.error();

        int result = model.divide(a, b);
        return viewer.divide(a, b, result);
    }
}
