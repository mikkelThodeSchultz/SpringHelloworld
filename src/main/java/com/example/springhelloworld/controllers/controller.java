package com.example.springhelloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class controller {

    // http://localhost:8080/greetmessage
    @GetMapping("/greetmessage")
    public String endpoint() {
        return "Hello Spring";
    }

    // http://localhost:8080/echo?input=HelloWorld
    @GetMapping("/echo")
    public String echo(@RequestParam String input) {
        return input;
    }

    // http://localhost:8080/isitfriday
    @GetMapping("/isitfriday")
    public String isitfriday() {

        String yesOrNo = "";
        Date date = new Date();
        if (date.getDay() == 5) {
            yesOrNo = "YES!";
        } else yesOrNo = "no";

        return yesOrNo;
    }
}
