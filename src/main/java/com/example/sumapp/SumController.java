package com.example.sumapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String sum(
            @RequestParam int num1,
            @RequestParam int num2,
            @RequestParam(required = false) String operation) {

        int result;
        switch (operation) {
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;
            case "add":
            default:
                result = num1 + num2;
                break;
        }

        System.out.println("The result of " + operation + " operation on " + num1 + " and " + num2 + " is " + result);
        return "The result is " + result;
    }
}
