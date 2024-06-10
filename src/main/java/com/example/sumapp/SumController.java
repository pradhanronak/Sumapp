package com.example.sumapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @GetMapping("/sum")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
        return "The sum is " + result;
    }
}
