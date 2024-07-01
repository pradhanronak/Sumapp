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
            @RequestParam(required = false, defaultValue = "add") String operation) {

        dummyMethod1();
        dummyMethod2();

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

    public void dummyMethod1() {
        System.out.println("Dummy Method 1 called");
        dummyMethod11();
    }

    public void dummyMethod2() {
        System.out.println("Dummy Method 2 called");
        dummyMethod21();
    }

    public void dummyMethod11() {
        System.out.println("Dummy Method 11 called");
    }

    public void dummyMethod21() {
        System.out.println("Dummy Method 21 called");
    }
}
